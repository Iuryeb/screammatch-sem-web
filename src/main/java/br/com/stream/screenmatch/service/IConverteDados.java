package br.com.stream.screenmatch.service;

public interface IConverteDados {
    // <T> indica que o método é genérico e pode retornar qualquer tipo de objeto, dependendo do tipo especificado na chamada do método.
    <T> T obterDados(String json, Class<T> classe); // Método que recebe uma String JSON e a classe do tipo desejado, e retorna um objeto do tipo especificado.

}
