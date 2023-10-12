package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Endereco;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class EnderecoService {

    private final String FONTE = "http://www.viacep.com.br/ws/";
    public Endereco findByCEP(String cep) {

        Endereco endereco = null;

        URI uri = null;

        HttpResponse<String> response = null;

        try{
            uri = new URI(this.FONTE + cep + "/json");

            var cliente = HttpClient.newHttpClient();

            var request = HttpRequest.newBuilder(uri).GET().build();

            response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200){
                return null;
            }



            var body = response.body();

            endereco = new Gson().fromJson(body, Endereco.class);


        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return endereco;
    }

    public List<Endereco> findByLogradouro(String uf, String cidade, String logradouro){
        List<Endereco> enderecos = null;

        URI uri = null;

        HttpResponse<String> response = null;

        var value = this.FONTE + uf + "/" + cidade + "/" + logradouro + "/json";

        try {
            uri = new URI(value);

            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder(URI.create(uri.toASCIIString())).GET().build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() != 200){
                return null;
            }

            var body = response.body();

            Type tipo = new TypeToken<List<Endereco>>(){}.getType();

            enderecos = new Gson().fromJson(body, tipo);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return enderecos;
    }

    public static String encode(String value){
        return value.replace(" ", "%20").replace()
    }

}
