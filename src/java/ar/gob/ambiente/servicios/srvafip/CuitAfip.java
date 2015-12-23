/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.servicios.srvafip;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rincostante
 */
@Entity
@Table(name = "personas_juridicas")
@XmlRootElement
public class CuitAfip implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pejID")
    private Long pejID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "pejRazonSocial")
    private String pejRazonSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "pejGA")
    private String pejGA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "pejIVA")
    private String pejIVA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "pejMO")
    private String pejMO;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "pejIS")
    private String pejIS;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "pejEM")
    private String pejEM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "pejAM")
    private String pejAM;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pejFecReg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pejFecReg;

    public CuitAfip() {
    }

    public CuitAfip(Long pejID) {
        this.pejID = pejID;
    }

    public CuitAfip(Long pejID, String pejRazonSocial, String pejGA, String pejIVA, String pejMO, String pejIS, String pejEM, String pejAM, Date pejFecReg) {
        this.pejID = pejID;
        this.pejRazonSocial = pejRazonSocial;
        this.pejGA = pejGA;
        this.pejIVA = pejIVA;
        this.pejMO = pejMO;
        this.pejIS = pejIS;
        this.pejEM = pejEM;
        this.pejAM = pejAM;
        this.pejFecReg = pejFecReg;
    }

    public Long getPejID() {
        return pejID;
    }

    public void setPejID(Long pejID) {
        this.pejID = pejID;
    }

    public String getPejRazonSocial() {
        return pejRazonSocial;
    }

    public void setPejRazonSocial(String pejRazonSocial) {
        this.pejRazonSocial = pejRazonSocial;
    }

    public String getPejGA() {
        return pejGA;
    }

    public void setPejGA(String pejGA) {
        this.pejGA = pejGA;
    }

    public String getPejIVA() {
        return pejIVA;
    }

    public void setPejIVA(String pejIVA) {
        this.pejIVA = pejIVA;
    }

    public String getPejMO() {
        return pejMO;
    }

    public void setPejMO(String pejMO) {
        this.pejMO = pejMO;
    }

    public String getPejIS() {
        return pejIS;
    }

    public void setPejIS(String pejIS) {
        this.pejIS = pejIS;
    }

    public String getPejEM() {
        return pejEM;
    }

    public void setPejEM(String pejEM) {
        this.pejEM = pejEM;
    }

    public String getPejAM() {
        return pejAM;
    }

    public void setPejAM(String pejAM) {
        this.pejAM = pejAM;
    }

    public Date getPejFecReg() {
        return pejFecReg;
    }

    public void setPejFecReg(Date pejFecReg) {
        this.pejFecReg = pejFecReg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pejID != null ? pejID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuitAfip)) {
            return false;
        }
        CuitAfip other = (CuitAfip) object;
        if ((this.pejID == null && other.pejID != null) || (this.pejID != null && !this.pejID.equals(other.pejID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.servicios.srvafip.CuitAfip[ pejID=" + pejID + " ]";
    }
    
}
