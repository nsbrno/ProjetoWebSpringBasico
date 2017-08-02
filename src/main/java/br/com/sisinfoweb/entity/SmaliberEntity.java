/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SMALIBER")
public class SmaliberEntity {

    @Column(name = "ID_SMALIBER", table = "SMALIBER", nullable = false)
    @Id
    private Integer idSmaliber;

    @Column(name = "GUID", table = "SMALIBER", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "SMALIBER", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "SMALIBER")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "SMALIBER")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "SMALIBER")
    @Basic
    private Integer ctInteg;

    @Column(name = "ARQUIVO", table = "SMALIBER", length = 12)
    @Basic
    private String arquivo;

    @Column(name = "ID_ARQUIVO", table = "SMALIBER", nullable = false)
    @Basic(optional = false)
    private int idArquivo;

    @Column(name = "LIBERADO", table = "SMALIBER")
    @Basic
    private Character liberado;

    @Column(name = "BLOQUEADO", table = "SMALIBER")
    @Basic
    private Character bloqueado;

    @Column(name = "GERADO_AUTOMATICO", table = "SMALIBER")
    @Basic
    private Character geradoAutomatico;

    @Column(name = "OBS", table = "SMALIBER", length = 128)
    @Basic
    private String obs;

    public Integer getIdSmaliber() {
        return this.idSmaliber;
    }

    public void setIdSmaliber(Integer idSmaliber) {
        this.idSmaliber = idSmaliber;
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsCad() {
        return this.usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public Date getDtCad() {
        return this.dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Date getDtAlt() {
        return this.dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return this.ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public String getArquivo() {
        return this.arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public int getIdArquivo() {
        return this.idArquivo;
    }

    public void setIdArquivo(int idArquivo) {
        this.idArquivo = idArquivo;
    }

    public Character getLiberado() {
        return this.liberado;
    }

    public void setLiberado(Character liberado) {
        this.liberado = liberado;
    }

    public Character getBloqueado() {
        return this.bloqueado;
    }

    public void setBloqueado(Character bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Character getGeradoAutomatico() {
        return this.geradoAutomatico;
    }

    public void setGeradoAutomatico(Character geradoAutomatico) {
        this.geradoAutomatico = geradoAutomatico;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}
