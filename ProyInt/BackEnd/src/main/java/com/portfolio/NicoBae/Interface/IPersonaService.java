package com.portfolio.NicoBae.Interface;

import com.portfolio.NicoBae.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona(); 
    
    //Guardar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscado por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
