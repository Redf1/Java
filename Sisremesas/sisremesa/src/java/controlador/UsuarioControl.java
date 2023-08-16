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

import modelo.dao.UsuarioDao;
import modelo.entidad.Usuario;
/**
 *
 * @author Ruben Figueroa
 */

@ManagedBean
@ViewScoped
public class UsuarioControl implements Serializable{
    
    private List<Usuario> listaUsuarios;
    private Usuario usuario;
    
    public UsuarioControl(){
    }

    public List<Usuario> getListaUsuarios() {
        UsuarioDao dd = new UsuarioDao();
        listaUsuarios =dd.listarUsuarios();
        return listaUsuarios;
    }
    
    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void limpiarUsuario(){
        usuario = new Usuario();
    }
    public void agregarUsuario(){
        UsuarioDao dd = new UsuarioDao();
        dd.agregar(usuario);
    }
    public void modificarUsuario(){
        UsuarioDao dd = new UsuarioDao();
        dd.modificar(usuario);
        limpiarUsuario();
    }
    
    public void eliminarUsuario(){
        UsuarioDao dd = new UsuarioDao();
        dd.eliminar(usuario);
        limpiarUsuario();
    }
}
