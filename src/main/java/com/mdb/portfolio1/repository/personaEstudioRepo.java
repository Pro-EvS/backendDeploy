
package com.mdb.portfolio1.repository;


import com.mdb.portfolio1.entity.personaEstudio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface personaEstudioRepo extends JpaRepository<personaEstudio, Integer>{
    @Override
    List<personaEstudio>findAll();
    personaEstudio findOne(int id);
    void add(personaEstudio p);
    void edit(personaEstudio p);
    @Override
    void delete(personaEstudio p);

    public personaEstudio savePersonaEstudio(personaEstudio p);

    public void add();
}

