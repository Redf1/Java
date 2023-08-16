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

import modelo.dao.PersonaRecibeDao;
import modelo.entidad.PersonaRecibe;
/**
 *
 * @author Ruben Figueroa
 */

@ManagedBean
@ViewScoped
public class PersonaRecibeControl implements Serializable{
    
    private List<PersonaRecibe> listaPersonasRecibe;
    private PersonaRecibe personaRecibe;
    
    public PersonaRecibeControl(){
    }

    public List<PersonaRecibe> getListaPersonasRecibe() {
        PersonaRecibeDao dd = new PersonaRecibeDao();
        listaPersonasRecibe =dd.listarPersonasRecibe();
        return listaPersonasRecibe;
    }
    
    public void setListaPersonasRecibe(List<PersonaRecibe> listaPersonasRecibe) {
        this.listaPersonasRecibe = listaPersonasRecibe;
    }

    public PersonaRecibe getPersonaRecibe() {
        return personaRecibe;
    }

    public void setPersonaRecibe(PersonaRecibe personaRecibe) {
        this.personaRecibe = personaRecibe;
    }
    
    public void limpiarPersonaRecibe(){
        personaRecibe = new PersonaRecibe();
    }
    public void agregarPersonaRecibe(){
        PersonaRecibeDao dd = new PersonaRecibeDao();
        dd.agregar(personaRecibe);
    }
    public void modificarPersonaRecibe(){
        PersonaRecibeDao dd = new PersonaRecibeDao();
        dd.modificar(personaRecibe);
        limpiarPersonaRecibe();
    }
    
    public void eliminarPersonaRecibe(){
        PersonaRecibeDao dd = new PersonaRecibeDao();
        dd.eliminar(personaRecibe);
        limpiarPersonaRecibe();
    }
}
