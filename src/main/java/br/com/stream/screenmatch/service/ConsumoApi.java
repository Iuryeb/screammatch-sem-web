package br.com.stream.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    
    public String obterDados(String endereco) {
        HttpClient client = HttpClient.newHttpClient(); // Criação de um cliente HTTP para enviar solicitações e receber respostas
        HttpRequest request = HttpRequest.newBuilder() // Criação de uma solicitação HTTP com o endereço fornecido
                .uri(URI.create(endereco)) // Definição do URI da solicitação
                .build();
        HttpResponse<String> response = null; // Inicialização da variável de resposta como nula
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString()); // Envio da solicitação e obtenção da resposta como uma string
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String json = response.body(); // Obtenção do corpo da resposta como uma string JSON
        return json; // Retorno da string JSON obtida da resposta
    }
}

// A classe ConsumoApi é responsável por consumir uma API externa, enviando uma solicitação HTTP para um endereço específico e retornando a resposta como uma string JSON.
//  Ela utiliza a biblioteca HttpClient do Java para criar e enviar a solicitação, e trata possíveis exceções que possam ocorrer durante o processo.