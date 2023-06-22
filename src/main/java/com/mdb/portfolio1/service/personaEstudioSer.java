
package com.mdb.portfolio1.service;

import com.mdb.portfolio1.dto.personaEstudioInter;
import com.mdb.portfolio1.entity.personaEstudio;
import com.mdb.portfolio1.repository.personaEstudioRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class personaEstudioSer extends personaEstudioInter{

    @Autowired
    private personaEstudioRepo EstudioRepo;
            
    public List<personaEstudio> gEstudios() {
    return EstudioRepo.findAll();
    }

    public personaEstudio gEstudioId(int id) {
            return EstudioRepo.findOne(id);
    }

    public personaEstudio edit(personaEstudio p) {
        return EstudioRepo.save(p);
    }

    public personaEstudio add(personaEstudio p) {
       return EstudioRepo.save(p);
    }

    public personaEstudio delete(int id) {
        personaEstudio p=EstudioRepo.findOne(id);
        if (p!=null){
      EstudioRepo.delete(p);
    }
        return p;
    }

    public personaEstudio findAll(String nuevoEstudio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  
