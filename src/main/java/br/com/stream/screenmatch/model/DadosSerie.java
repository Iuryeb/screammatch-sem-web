package br.com.stream.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true) // Ignora propriedades desconhecidas no JSON durante a desserialização
public record DadosSerie(@JsonAlias("Title") String titulo, // @JsonAlias é usado para apelido
                        @JsonAlias("totalSeasons") Integer totalTemporadas,
                        @JsonAlias("imdbRating") String avaliacao) {



}
