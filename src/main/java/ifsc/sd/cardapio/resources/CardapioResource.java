package ifsc.sd.cardapio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sd.cardapio.repository.CardapioRepository;
import ifsc.sd.cardapio.models.Cardapio;

@RestController
@RequestMapping(value="/api")
public class CardapioResource {
	
	@Autowired
	CardapioRepository cardapioRepository;
	
	@GetMapping("/cardapios")
	public List<Cardapio> listaCardapios() {
		return cardapioRepository.findAll();
	}
	
	@GetMapping("/cardapio/{id}")
	public Cardapio listaCardapio(@PathVariable(value="id") long id) {
		return cardapioRepository.findById(id);
	}

}
