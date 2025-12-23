package br.com.alurastudy.screenmatchspring;

import br.com.alurastudy.screenmatchspring.models.DadosSerie;
import br.com.alurastudy.screenmatchspring.sevice.ConsumoApi;
import br.com.alurastudy.screenmatchspring.sevice.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchspringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchspringApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=b93bda36");
//        System.out.println(json);
//        System.out.println(json);
        System.out.println(json);
        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);


    }
}
