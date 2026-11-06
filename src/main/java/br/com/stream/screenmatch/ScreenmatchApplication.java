package br.com.stream.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.stream.screenmatch.model.DadosSerie;
import br.com.stream.screenmatch.service.ConsumoApi;
import br.com.stream.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner { // Implementação da interface CommandLineRunner para executar código após a inicialização do Spring Boot

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var  consumoApi = new ConsumoApi(); // Criação de uma instância da classe ConsumoApi
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=c503be04"); // Chamada do método obterDados para obter dados da API OMDB
		System.out.println(json); // Impressão do JSON obtido no console
		
		ConverteDados conversor = new ConverteDados(); // Criação de uma instância da classe ConverteDados
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class); // Conversão do JSON para um objeto do tipo DadosSerie
		System.out.println(dados); // Impressão dos dados obtidos no console
	}


}
