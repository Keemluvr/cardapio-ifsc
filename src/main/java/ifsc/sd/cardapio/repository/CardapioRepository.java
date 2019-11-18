package ifsc.sd.cardapio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sd.cardapio.models.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {
	
	/* Método que procura um cardápio pelo seu id. */
	Cardapio findById(long id);

	/* Método que procura um cardápio pelo dia. */
	Cardapio findByDia(long dia);

}
