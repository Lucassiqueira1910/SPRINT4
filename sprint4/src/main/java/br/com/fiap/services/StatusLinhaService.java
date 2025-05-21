package br.com.fiap.services;

import br.com.fiap.model.StatusLinha;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StatusLinhaService {
    public List<StatusLinha> getStatusLinha() throws IOException {
        List<StatusLinha> statuslinhas = new ArrayList<>();

        // request
        HttpGet request = new HttpGet("https://www.diretodostrens.com.br/api/status");

        //client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        //response
        CloseableHttpResponse response = httpClient.execute(request);

        //entity
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();
            Type listType = new TypeToken<List<StatusLinha>>(){}.getType();
            statuslinhas = gson.fromJson(result, listType);
        }
        return statuslinhas;
    }

}