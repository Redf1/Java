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

import modelo.dao.DepartamentoDao;
import modelo.entidad.Departamento;
/**
 *
 * @author Ruben Figueroa
 */

@ManagedBean
@ViewScoped
public class DepartamentoControl implements Serializable{
    
    private List<Departamento> listaDepartamentos;
    private Departamento departamento;
    
    public DepartamentoControl(){
    }

    public List<Departamento> getListaDepartamentos() {
        DepartamentoDao dd = new DepartamentoDao();
        listaDepartamentos =dd.listarDepartamentos();
        return listaDepartamentos;
    }
    
    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void limpiarDepartamento(){
        departamento = new Departamento();
    }
    public void agregarDepartamento(){
        DepartamentoDao dd = new DepartamentoDao();
        dd.agregar(departamento);
    }
    public void modificarDepartamento(){
        DepartamentoDao dd = new DepartamentoDao();
        dd.modificar(departamento);
        limpiarDepartamento();
    }
    
    public void eliminarDepartamento(){
        DepartamentoDao dd = new DepartamentoDao();
        dd.eliminar(departamento);
        limpiarDepartamento();
    }
}
