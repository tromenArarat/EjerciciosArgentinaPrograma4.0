/*

 */
package com.ciart.biblio.isbnapi.repositorios;

import com.ciart.biblio.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorialRepositorio extends JpaRepository<Editorial, String>{
    
}
