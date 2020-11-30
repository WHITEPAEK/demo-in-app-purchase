package com.whitepaek.demoinapppurchase.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

public class HttpClientUtils {

    private static Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String doPost(String url, Map<String, String> param) {
        String result = null;
        CloseableHttpClient httpclient = null;
        CloseableHttpResponse response = null;
        Integer statusCode = null;
        String reasonPhrase = null;
        try {
            httpclient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json");
            String json = objectMapper.writeValueAsString(param);
            StringEntity formEntity = new StringEntity(json);
            httpPost.setEntity(formEntity);
            response = httpclient.execute(httpPost);
            statusCode = response.getStatusLine().getStatusCode();
            reasonPhrase = response.getStatusLine().getReasonPhrase();
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity, "UTF-8");

            if (statusCode != 200) {
                logger.error(String.format("[doPost]post url(%s) failed. status code:%s. reason:%s. param:%s. result:%s", url, statusCode, reasonPhrase, objectMapper.writeValueAsString(param), result));
            }
            EntityUtils.consume(entity);
        } catch (Throwable t) {
            try {
                logger.error(String.format("[doPost]post url(%s) failed. status code:%s. reason:%s. param:%s.", url, statusCode, reasonPhrase, objectMapper.writeValueAsString(param)), t);
            } catch (JsonProcessingException e) {
            }
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                if (httpclient != null) {
                    httpclient.close();
                }
            } catch (IOException e) {
                try {
                    logger.error(String.format("[doPost]release http post resource failed. url(%s). reason:%s, param:%s.", url, e.getMessage(), objectMapper.writeValueAsString(param)));
                } catch (JsonProcessingException ex) {
                }
            }
        }
        return result;
    }

}
