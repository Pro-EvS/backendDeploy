
package com.mdb.portfolio1.service;
        
import com.mdb.portfolio1.dto.personaDto;
import com.mdb.portfolio1.entity.personaEntity;
import com.mdb.portfolio1.repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements personaDto{
   
    @Autowired
    private personaRepository repositorio;

    @Override
    public List<personaEntity> getPersona() {
    return repositorio.findAll();
    }
    

    @Override
    public personaEntity getPersonaId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public personaEntity nombre(personaEntity p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public personaEntity edit(personaEntity p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public personaEntity add(personaEntity p) {
        return repositorio.save(p);
    }

    @Override
    public personaEntity delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public personaEntity findAll(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

