package ifsc.sd.cardapio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sd.cardapio.repository.CardapioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ifsc.sd.cardapio.models.Cardapio;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Cardápio")
@CrossOrigin(origins="*")
public class CardapioResource {
	
	@Autowired
	CardapioRepository cardapioRepository;
	
	@GetMapping("/cardapios")
	@ApiOperation(value="Retorna uma lista de cardápios")
	public List<Cardapio> listaCardapios() {
		return cardapioRepository.findAll();
	}
	
	
	@GetMapping("/cardapio/dia/{dia:[0-9]+}")
	@ApiOperation(value="Retorna um cardápio daquele dia")
	public Cardapio listaCardapioDia(@PathVariable(value = "dia") long dia) {
		return cardapioRepository.findByDia(dia);
	}
	
	@GetMapping("/cardapio/id/{id:[0-9]+}")
	@ApiOperation(value="Retorna um cardápio daquele id")
	public Cardapio listaCardapioId(@PathVariable(value = "id") long id) {
		return cardapioRepository.findById(id);
	}
	
	@PostMapping("/cardapio")
	@ApiOperation(value="Salva um cardápio")
	public Cardapio salvaCardapio(@RequestBody Cardapio cardapio) {
		return cardapioRepository.save(cardapio);
	}
	
	
	@DeleteMapping("/cardapio/{id}")
	@ApiOperation(value="Deleta um cardápio")
	public void deletaCardapio(@PathVariable(value="id") long id) {
		cardapioRepository.deleteById(id);
	}
	
	
	@PutMapping("/cardapio")
	@ApiOperation(value="Atualiza um cardápio")
	public Cardapio atualizaCardapio(@RequestBody Cardapio cardapio) {
		return cardapioRepository.save(cardapio);
	}

}
