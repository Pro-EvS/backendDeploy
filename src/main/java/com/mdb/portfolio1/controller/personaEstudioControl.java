
package com.mdb.portfolio1.controller;

 
import com.mdb.portfolio1.entity.personaEstudio;
import com.mdb.portfolio1.service.personaEstudioSer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="https://portfolio-evelyn.web.app/")
public class personaEstudioControl {
    
    @Autowired
    personaEstudioSer service;
    
    @GetMapping("/edicion")
    List<personaEstudio> getEstudios(){
        return service.gEstudios();
    }
    
    @PostMapping("edicion/crear/educacion")
    public String createEstudio(@RequestBody personaEstudio p){
 
        return "Haz creado un nuevo archivo de tus Estudios";
    }
   
      @DeleteMapping("edicion/borrar/{id}/educacion")
    public String deletePersona(@PathVariable personaEstudio p){
        return "Los estudios fueron borrados con exito";
    }
    

    @PutMapping("edicion/editar/{id}/educacion")
     public personaEstudio editpEstudio(@PathVariable int id,
             @RequestParam("estudios") String nuevoEstudio){
        personaEstudio perEstudio= service.findAll(nuevoEstudio);
            perEstudio.setEducacion(nuevoEstudio);
            service.add(perEstudio);
            return perEstudio;
    }
    
}