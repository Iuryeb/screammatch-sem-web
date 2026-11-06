package br.com.stream.screenmatch.service;


import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        // Utiliza o ObjectMapper para converter a String JSON em um objeto do tipo especificado pela classe fornecida.
        // No Jackson 3 as exceções (JacksonException) são unchecked, então não é preciso try/catch.
        return mapper.readValue(json, classe);
    }

    

}
