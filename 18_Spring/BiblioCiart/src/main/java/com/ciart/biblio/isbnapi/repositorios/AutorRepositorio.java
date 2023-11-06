/*

 */
package com.ciart.biblio.isbnapi.repositorios;

import com.ciart.biblio.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepositorio extends JpaRepository<Autor, String>{
    
}
