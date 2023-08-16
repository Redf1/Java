/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import modelo.dao.PersonaEnviaDao;
import modelo.entidad.PersonaEnvia;
/**
 *
 * @author Ruben Figueroa
 */

@ManagedBean
@ViewScoped
public class PersonaEnviaControl implements Serializable{
    
    private List<PersonaEnvia> listaPersonasEnvia;
    private PersonaEnvia personaEnvia;
    
    public PersonaEnviaControl(){
    }

    public List<PersonaEnvia> getListaPersonasEnvia() {
        PersonaEnviaDao dd = new PersonaEnviaDao();
        listaPersonasEnvia =dd.listarPersonasEnvia();
        return listaPersonasEnvia;
    }
    
    public void setListaPersonasEnvia(List<PersonaEnvia> listaPersonasEnvia) {
        this.listaPersonasEnvia = listaPersonasEnvia;
    }

    public PersonaEnvia getPersonaEnvia() {
        return personaEnvia;
    }

    public void setPersonaEnvia(PersonaEnvia personaEnvia) {
        this.personaEnvia = personaEnvia;
    }
    
    public void limpiarPersonaEnvia(){
        personaEnvia = new PersonaEnvia();
    }
    public void agregarPersonaEnvia(){
        PersonaEnviaDao dd = new PersonaEnviaDao();
        dd.agregar(personaEnvia);
    }
    public void modificarPersonaEnvia(){
        PersonaEnviaDao dd = new PersonaEnviaDao();
        dd.modificar(personaEnvia);
        limpiarPersonaEnvia();
    }
    
    public void eliminarPersonaEnvia(){
        PersonaEnviaDao dd = new PersonaEnviaDao();
        dd.eliminar(personaEnvia);
        limpiarPersonaEnvia();
    }
}
