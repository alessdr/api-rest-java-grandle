package br.com.ctrlabs.apirestgrandle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ctrlabs.apirestgrandle.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

}
