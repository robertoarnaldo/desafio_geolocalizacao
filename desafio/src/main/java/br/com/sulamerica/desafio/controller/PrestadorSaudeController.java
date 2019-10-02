package br.com.sulamerica.desafio.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sulamerica.desafio.model.PrestadorSaude;

@RestController
@RequestMapping("/obterPrestadoresSaude")
public class PrestadorSaudeController {

	@GetMapping
	@ResponseBody
	public List<PrestadorSaude> lista(@RequestParam("latitude") Double latitude,
			@RequestParam("longitude") Double longitude, @RequestParam("especialidade") String especialidade) {

		List<PrestadorSaude> prestadoresSaudes = new ArrayList<PrestadorSaude>();
		prestadoresSaudes.add(new PrestadorSaude("Roberto", "Rua Clemente Pereira, 148", "Cardiologia"));
		prestadoresSaudes.add(new PrestadorSaude("Beto", "Rua Clemente Pereira, 150", "Cardiologia"));
		prestadoresSaudes.add(new PrestadorSaude("Pedro", "Rua Cardoso, 151", "Dermatologia"));
		prestadoresSaudes.add(new PrestadorSaude("Joao", "Rua Clemente, 155", "Cardiologia Pediatrica"));
		prestadoresSaudes.add(new PrestadorSaude("Maria", "Rua São João, 154", "Cirurgia Cardiaca"));
		prestadoresSaudes.add(new PrestadorSaude("Bruna", "Rua Agostinho Gomes, 300", "Cirurgia Geral"));
		prestadoresSaudes.add(new PrestadorSaude("Caio", "Rua Silva Bueno, 165", "Infectologia Pediátrica"));
		prestadoresSaudes.add(new PrestadorSaude("Graca", "Rua Santo, 180", "Neonatologia"));
		prestadoresSaudes.add(new PrestadorSaude("Paula", "Av Henry Ford, 200", "Dermatologia"));
		prestadoresSaudes.add(new PrestadorSaude("Mara", "Av Paes de Barros, 201", "Dermatologia"));
		prestadoresSaudes.add(new PrestadorSaude("Joao", "Rua Siqueira Bueno, 202", "Dermatologia"));
		prestadoresSaudes.add(new PrestadorSaude("Marcio", "Rua Bom Pastor, 350", "Dermatologia"));
		prestadoresSaudes.add(new PrestadorSaude("Giovanna", "Rua 15 de Novembro, 450", "Cardiologia Pediatrica"));
		prestadoresSaudes.add(new PrestadorSaude("Matheus", "Rua São Pedro, 251", "Cirurgia Cardiaca"));

		prestadoresSaudes.sort(Comparator.comparing(PrestadorSaude::getNome));

		return prestadoresSaudes.stream().filter(p -> p.getEspecialidade().equals(especialidade))
				.collect(Collectors.toList());
	}

}
