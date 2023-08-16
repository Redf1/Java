package modelo.entidad;
// Generated 06-nov-2022 9:39:55 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario Ruben Figueroa
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String usuario;
     private String clave;
     private String nombre;
     private String apellido;
     private String telefono;
     private String email;
     private Date fechaCreacion;
     private Boolean activo;
     private Set<Remesa> remesas = new HashSet<Remesa>(0);

    public Usuario() {
    }

    public Usuario(String usuario, String clave, String nombre, String apellido, String telefono, String email, Date fechaCreacion, Boolean activo, Set<Remesa> remesas) {
       this.usuario = usuario;
       this.clave = clave;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.email = email;
       this.fechaCreacion = fechaCreacion;
       this.activo = activo;
       this.remesas = remesas;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public Set<Remesa> getRemesas() {
        return this.remesas;
    }
    
    public void setRemesas(Set<Remesa> remesas) {
        this.remesas = remesas;
    }




}


