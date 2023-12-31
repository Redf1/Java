package modelo.entidad;
// Generated 06-nov-2022 9:39:55 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Remesa generated by hbm2java
 */
public class Remesa  implements java.io.Serializable {


     private Integer idRemesa;
     private Estado estado;
     private FormaPago formaPago;
     private Pais pais;
     private PersonaEnvia personaEnvia;
     private PersonaRecibe personaRecibe;
     private Usuario usuario;
     private Double monto;
     private String clave;
     private Date fechaEnvio;
     private Date fechaRetiro;

    public Remesa() {
        estado = new Estado();
        formaPago = new FormaPago();
        pais = new Pais();
        personaEnvia = new PersonaEnvia();
        personaRecibe = new PersonaRecibe();  
        usuario = new Usuario();  
    }

    public Remesa(Estado estado, FormaPago formaPago, Pais pais, PersonaEnvia personaEnvia, PersonaRecibe personaRecibe, Usuario usuario, Double monto, String clave, Date fechaEnvio, Date fechaRetiro) {
       this.estado = estado;
       this.formaPago = formaPago;
       this.pais = pais;
       this.personaEnvia = personaEnvia;
       this.personaRecibe = personaRecibe;
       this.usuario = usuario;
       this.monto = monto;
       this.clave = clave;
       this.fechaEnvio = fechaEnvio;
       this.fechaRetiro = fechaRetiro;
    }
   
    public Integer getIdRemesa() {
        return this.idRemesa;
    }
    
    public void setIdRemesa(Integer idRemesa) {
        this.idRemesa = idRemesa;
    }
    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public FormaPago getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public PersonaEnvia getPersonaEnvia() {
        return this.personaEnvia;
    }
    
    public void setPersonaEnvia(PersonaEnvia personaEnvia) {
        this.personaEnvia = personaEnvia;
    }
    public PersonaRecibe getPersonaRecibe() {
        return this.personaRecibe;
    }
    
    public void setPersonaRecibe(PersonaRecibe personaRecibe) {
        this.personaRecibe = personaRecibe;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Double getMonto() {
        return this.monto;
    }
    
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Date getFechaEnvio() {
        return this.fechaEnvio;
    }
    
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    public Date getFechaRetiro() {
        return this.fechaRetiro;
    }
    
    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }




}


