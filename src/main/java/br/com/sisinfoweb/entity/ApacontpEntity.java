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
@Table(name = "APACONTP")
public class ApacontpEntity {

    @Column(name = "ID_APACONTP", table = "APACONTP", nullable = false)
    @Id
    private Integer idApacontp;

    @Column(name = "US_CAD", table = "APACONTP", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "APACONTP")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "APACONTP")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "APACONTP")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "APACONTP", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "CODIGO", table = "APACONTP")
    @Basic
    private Integer codigo;

    @Column(name = "DESCRICAO", table = "APACONTP", length = 40)
    @Basic
    private String descricao;

    public Integer getIdApacontp() {
        return this.idApacontp;
    }

    public void setIdApacontp(Integer idApacontp) {
        this.idApacontp = idApacontp;
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

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
