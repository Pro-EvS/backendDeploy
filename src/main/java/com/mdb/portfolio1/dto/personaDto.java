
package com.mdb.portfolio1.dto;

import com.mdb.portfolio1.entity.personaEntity;
import java.util.List;

public interface personaDto {
    List<personaEntity> getPersona();
   personaEntity getPersonaId(int id);
   personaEntity nombre(personaEntity p);
   personaEntity edit(personaEntity p);
   personaEntity add(personaEntity p);
   personaEntity delete(int id);
}
