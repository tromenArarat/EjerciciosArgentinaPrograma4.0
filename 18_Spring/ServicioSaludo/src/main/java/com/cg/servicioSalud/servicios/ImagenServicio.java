/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.Imagen;
import com.cg.servicioSalud.repositorios.ImagenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenServicio {
    @Autowired
    private ImagenRepositorio imagenRepositorio;
public Imagen guardar(MultipartFile archivo) throws Exception{
        if(archivo != null){
            try{
                Imagen imagen = new Imagen();
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                return imagenRepositorio.save(imagen);
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }
    return null;
}
}
