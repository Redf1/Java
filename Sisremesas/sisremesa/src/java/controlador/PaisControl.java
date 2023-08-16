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

import modelo.dao.PaisDao;
import modelo.entidad.Pais;
/**
 *
 * @author Ruben Figueroa
 */

@ManagedBean
@ViewScoped
public class PaisControl implements Serializable{
    
    private List<Pais> listaPaises;
    private Pais pais;
    
    public PaisControl(){
    }

    public List<Pais> getListaPaises() {
        PaisDao dd = new PaisDao();
        listaPaises =dd.listarPaises();
        return listaPaises;
    }
    
    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public void limpiarPais(){
        pais = new Pais();
    }
    public void agregarPais(){
        PaisDao dd = new PaisDao();
        dd.agregar(pais);
    }
    public void modificarPais(){
        PaisDao dd = new PaisDao();
        dd.modificar(pais);
        limpiarPais();
    }
    
    public void eliminarPais(){
        PaisDao dd = new PaisDao();
        dd.eliminar(pais);
        limpiarPais();
    }
}
