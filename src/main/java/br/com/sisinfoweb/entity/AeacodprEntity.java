/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AEACODPR")
public class AeacodprEntity {

    @Column(name = "ID_AEACODPR", table = "AEACODPR", nullable = false)
    @Id
    private Integer idAeacodpr;

    @Column(name = "ID_AEAPRODU", table = "AEACODPR", nullable = false)
    @Basic(optional = false)
    private int idAeaprodu;

    @Column(name = "GUID", table = "AEACODPR", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEACODPR", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEACODPR")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEACODPR")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEACODPR")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESCRICAO", table = "AEACODPR", length = 40)
    @Basic
    private String descricao;

    @Column(name = "REFERENCIA", table = "AEACODPR", length = 20)
    @Basic
    private String referencia;

    @Column(name = "CODIGO_BARRAS", table = "AEACODPR", length = 20)
    @Basic
    private String codigoBarras;

    public Integer getIdAeacodpr() {
        return this.idAeacodpr;
    }

    public void setIdAeacodpr(Integer idAeacodpr) {
        this.idAeacodpr = idAeacodpr;
    }

    public int getIdAeaprodu() {
        return this.idAeaprodu;
    }

    public void setIdAeaprodu(int idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
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

    public String getDtCad() {
        return this.dtCad;
    }

    public void setDtCad(String dtCad) {
        this.dtCad = dtCad;
    }

    public String getDtAlt() {
        return this.dtAlt;
    }

    public void setDtAlt(String dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return this.ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

}
