/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelo.entidad.Usuario;
import modelo.dao.UsuarioDao;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Ruben Figueroa
 */
@ManagedBean
@SessionScoped
public class LoginControl implements Serializable {

    private Usuario usuario;

    public LoginControl() {
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String login() {
        FacesMessage mensaje = null;
        UsuarioDao ud = new UsuarioDao();
        // para encriptar clave
        usuario.setClave(DigestUtils.md5Hex(usuario.getClave()));
        usuario = ud.login(usuario);
        if (usuario != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
            mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@ ", this.usuario.getNombre());
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
            return "/vista/inicio.xhtml";
        } else {
            mensaje = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de Acceso", "Usuario o Clave incorrecta");
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
            usuario = new Usuario();
            return "";
        }
    }

    public String cerrarSession() {
        HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        httpSession.invalidate();
        return "/login";
    }
}