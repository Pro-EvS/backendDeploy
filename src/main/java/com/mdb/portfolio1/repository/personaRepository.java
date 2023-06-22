
package com.mdb.portfolio1.repository;


import com.mdb.portfolio1.entity.personaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface personaRepository extends Repository<personaEntity, Integer>{
    List<personaEntity>findAll();
    personaEntity findOne(int id);
    personaEntity save(personaEntity p);
    void add(personaEntity p);
    void edit(personaEntity p);
    void delete(personaEntity p);

    public personaEntity savePersona(personaEntity p);

    public void add();
}
