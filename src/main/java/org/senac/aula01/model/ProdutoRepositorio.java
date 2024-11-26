package org.senac.aula01.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio 
 extends JpaRepository<Produto,Integer>{

    
}
