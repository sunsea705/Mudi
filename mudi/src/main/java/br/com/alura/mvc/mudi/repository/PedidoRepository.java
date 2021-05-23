package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	@Cacheable("pedidos")
	List<Pedido> findByStatus(StatusPedido status, Pageable paginacao);
	
	@Query(value = "SELECT * FROM pedido WHERE user_username = :username", nativeQuery = true)
	List<Pedido> findAllByUser(String username);
	
	@Query(value = "SELECT * FROM pedido WHERE user_username = :username AND status = :status", nativeQuery = true)
	List<Pedido> findAllByUserAndStatus(String username, String status);

}
