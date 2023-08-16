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

import modelo.dao.EstadoDao;
import modelo.entidad.Estado;
/**
 *
 * @author Ruben Figueroa
 */

@ManagedBean
@ViewScoped
public class EstadoControl implements Serializable{
    
    private List<Estado> listaEstados;
    private Estado estado;
    
    public EstadoControl(){
    }

    public List<Estado> getListaEstados() {
        EstadoDao dd = new EstadoDao();
        listaEstados =dd.listarEstados();
        return listaEstados;
    }
    
    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void limpiarEstado(){
        estado = new Estado();
    }
    public void agregarEstado(){
        EstadoDao dd = new EstadoDao();
        dd.agregar(estado);
    }
    public void modificarEstado(){
        EstadoDao dd = new EstadoDao();
        dd.modificar(estado);
        limpiarEstado();
    }
    
    public void eliminarEstado(){
        EstadoDao dd = new EstadoDao();
        dd.eliminar(estado);
        limpiarEstado();
    }
}
