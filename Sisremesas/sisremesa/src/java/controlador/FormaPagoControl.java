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

import modelo.dao.FormaPagoDao;
import modelo.entidad.FormaPago;
/**
 *
 * @author Ruben Figueroa
 */

@ManagedBean
@ViewScoped
public class FormaPagoControl implements Serializable{
    
    private List<FormaPago> listaFormasPago;
    private FormaPago formaPago;
    
    public FormaPagoControl(){
    }

    public List<FormaPago> getListaFormasPago() {
        FormaPagoDao dd = new FormaPagoDao();
        listaFormasPago =dd.listarFormaPagos();
        return listaFormasPago;
    }
    
    public void setListaFormasPago(List<FormaPago> listaFormasPago) {
        this.listaFormasPago = listaFormasPago;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    
    public void limpiarFormaPago(){
        formaPago = new FormaPago();
    }
    public void agregarFormaPago(){
        FormaPagoDao dd = new FormaPagoDao();
        dd.agregar(formaPago);
    }
    public void modificarFormaPago(){
        FormaPagoDao dd = new FormaPagoDao();
        dd.modificar(formaPago);
        limpiarFormaPago();
    }
    
    public void eliminarFormaPago(){
        FormaPagoDao dd = new FormaPagoDao();
        dd.eliminar(formaPago);
        limpiarFormaPago();
    }
}
