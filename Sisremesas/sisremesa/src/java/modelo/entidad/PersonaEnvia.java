package modelo.entidad;
// Generated 06-nov-2022 9:39:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PersonaEnvia generated by hbm2java
 */
public class PersonaEnvia  implements java.io.Serializable {


     private Integer idPersonaEnvia;
     private String NDocumento;
     private String nombre;
     private String apellido;
     private String telefono;
     private String direccion;
     private Set<Remesa> remesas = new HashSet<Remesa>(0);

    public PersonaEnvia() {
    }

    public PersonaEnvia(String NDocumento, String nombre, String apellido, String telefono, String direccion, Set<Remesa> remesas) {
       this.NDocumento = NDocumento;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.direccion = direccion;
       this.remesas = remesas;
    }
   
    public Integer getIdPersonaEnvia() {
        return this.idPersonaEnvia;
    }
    
    public void setIdPersonaEnvia(Integer idPersonaEnvia) {
        this.idPersonaEnvia = idPersonaEnvia;
    }
    public String getNDocumento() {
        return this.NDocumento;
    }
    
    public void setNDocumento(String NDocumento) {
        this.NDocumento = NDocumento;
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
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Set<Remesa> getRemesas() {
        return this.remesas;
    }
    
    public void setRemesas(Set<Remesa> remesas) {
        this.remesas = remesas;
    }




}


