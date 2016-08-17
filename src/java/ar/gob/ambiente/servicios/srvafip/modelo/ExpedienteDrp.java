

package ar.gob.ambiente.servicios.srvafip.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos correspondientes al expediente mediante el cual tramita el Establecimiento en el MAyDS a través de la DRP
 * @author rincostante
 */
@Entity
@Table(name = "establecimientos")
@XmlRootElement
public class ExpedienteDrp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;   
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usuario")
    private String usuario;   
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private int tipo; 
    
    @Size(max = 20)
    @Column(name = "caa_numero")
    private String caNumero;        
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "expediente_numero")
    private int expNumero;     
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "expediente_anio")
    private int expAnio;     
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "descripcion")
    private String descripcion; 
    
    @Column(name = "caa_vencimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date caVencimiento;
    
    
    /****************
     * Constructor **
     ****************/
    
    public ExpedienteDrp(){
    }
    
    public ExpedienteDrp(Long id){
        this.id = id;
    }    
    
    public ExpedienteDrp(Long id, String nombre, String usuario, int tipo, String caNumero, int expNumero, int expAnio, String descripcion, Date caVencimiento){
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.tipo = tipo;
        this.caNumero = caNumero;
        this.expNumero = expNumero;
        this.expAnio = expAnio;
        this.descripcion = descripcion;
        this.caVencimiento = caVencimiento;
    }

    /**********************
     * Métodos de acceso **
     **********************/
   
    public Date getCaVencimiento() {
        return caVencimiento;
    }

    public void setCaVencimiento(Date caVencimiento) {
        this.caVencimiento = caVencimiento;
    }
   
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getExpNumero() {
        return expNumero;
    }

    public void setExpNumero(int expNumero) {
        this.expNumero = expNumero;
    }

    public int getExpAnio() {
        return expAnio;
    }

    public void setExpAnio(int expAnio) {
        this.expAnio = expAnio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaNumero() {
        return caNumero;
    }

    public void setCaNumero(String caNumero) {
        this.caNumero = caNumero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    /**************************
     * Métodos sobreescritos **
     **************************/
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExpedienteDrp)) {
            return false;
        }
        ExpedienteDrp other = (ExpedienteDrp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.servicios.srvafip.modelo.ExpedienteDrp[ id=" + id + " ]";
    }
    
}
