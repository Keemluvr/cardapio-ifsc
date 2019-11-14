package ifsc.sd.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sd.cardapio.models.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {
	
	/* Método que procura um cardápio pelo seu id. */
	Cardapio findById(long id);

}
