
package com.mdb.portfolio1.dto;

import javax.validation.constraints.NotBlank;


public class personaEstudioInter {
    
    @NotBlank
    private String personaEstudio;

    public personaEstudioInter() {
    }
    
    

    public personaEstudioInter(String personaEstudio) {
        this.personaEstudio = personaEstudio;
    }

    public String getPersonaEstudio() {
        return personaEstudio;
    }

    public void setPersonaEstudio(String personaEstudio) {
        this.personaEstudio = personaEstudio;
    }
    
    
}
