/*

 */
package com.ciart.biblio.isbnapi.repositorios;

import com.ciart.biblio.entidades.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepositorio extends JpaRepository<Imagen, String>{
    
}
