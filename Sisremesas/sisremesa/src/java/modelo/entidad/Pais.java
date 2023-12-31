package modelo.entidad;
// Generated 06-nov-2022 9:39:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private Integer idPais;
     private String nombre;
     private Set<Remesa> remesas = new HashSet<Remesa>(0);

    public Pais() {
    }

    public Pais(String nombre, Set<Remesa> remesas) {
       this.nombre = nombre;
       this.remesas = remesas;
    }
   
    public Integer getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Remesa> getRemesas() {
        return this.remesas;
    }
    
    public void setRemesas(Set<Remesa> remesas) {
        this.remesas = remesas;
    }




}


