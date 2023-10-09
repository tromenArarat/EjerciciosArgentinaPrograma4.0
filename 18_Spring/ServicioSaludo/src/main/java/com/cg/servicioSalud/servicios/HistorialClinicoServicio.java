/*

 */

package com.cg.servicioSalud.servicios;

import com.cg.servicioSalud.entidades.HistorialClinico;
import com.cg.servicioSalud.entidades.Paciente;
import com.cg.servicioSalud.entidades.Turno;
import com.cg.servicioSalud.repositorios.HistorialClinicoRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialClinicoServicio {
    @Autowired
    private HistorialClinicoRepositorio historiaRepositorio;

     @Transactional
     public HistorialClinico crearHistorial(Turno turno){
         HistorialClinico historial = new HistorialClinico();
         
         historial.setTurno(turno);
         historial.setAlgo("vacio");
         
         historiaRepositorio.save(historial);
         
         return historial;
         
     }
     
     public HistorialClinico getOne(String id){
        return historiaRepositorio.getOne(id);
    }
     
     public HistorialClinico traePorTurno(String id){
        return historiaRepositorio.buscarPorTurno(id);
    }
     
     @Transactional
     public void borrarRegistro(String id){
         historiaRepositorio.deleteById(id);
     }
     
    @Transactional
    public HistorialClinico registrarAlgo(String id, String algo)throws Exception{
        HistorialClinico historial = getOne(id);    
        historial.setAlgo(algo);
            historiaRepositorio.save(historial);
            return historial;
    }
     
     public List<HistorialClinico> listarHistorialPorPaciente(String idPaciente){
         List<HistorialClinico> historietas = historiaRepositorio.findAll();
         List<HistorialClinico> historias = new ArrayList();
         
         for (HistorialClinico historieta : historietas) {
             if(historieta.getTurno().getPaciente().getId().equals(idPaciente)){
                 historias.add(historieta);
             }
         }
         
         return historias;
     }
    
}
