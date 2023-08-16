/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;
import modelo.entidad.Estudiante;
/**
 *
 * @author Ruben Figueroa
 */
@ManagedBean
@ViewScoped

public class EstudianteControl implements Serializable{
    private List<Estudiante> listaEstudiantes;
    private Estudiante estudiante;

    public EstudianteControl() {
    }
    
    public List<Estudiante> getListaEstudiantes() {         
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    
    
}
