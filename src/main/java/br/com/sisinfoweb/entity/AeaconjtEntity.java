/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AEACONJT")
public class AeaconjtEntity {

    @Column(name = "ID_AEACONJT", table = "AEACONJT", nullable = false)
    @Id
    private Integer idAeaconjt;

    @Column(name = "ID_AEAPRODU", table = "AEACONJT", nullable = false)
    @Basic(optional = false)
    private int idAeaprodu;

    @Column(name = "ID_AEAPRODU_ITEM", table = "AEACONJT", nullable = false)
    @Basic(optional = false)
    private int idAeaproduItem;

    @Column(name = "ID_AEAUNVEN", table = "AEACONJT", nullable = false)
    @Basic(optional = false)
    private int idAeaunven;

    @Column(name = "GUID", table = "AEACONJT", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEACONJT", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEACONJT")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEACONJT")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEACONJT")
    @Basic
    private Integer ctInteg;

    @Column(name = "TIPO", table = "AEACONJT", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "SEQUENCIA", table = "AEACONJT", nullable = false)
    @Basic(optional = false)
    private int sequencia;

    @Column(name = "QUANTIDADE", table = "AEACONJT", nullable = false)
    @Basic(optional = false)
    private double quantidade;

    public Integer getIdAeaconjt() {
        return this.idAeaconjt;
    }

    public void setIdAeaconjt(Integer idAeaconjt) {
        this.idAeaconjt = idAeaconjt;
    }

    public int getIdAeaprodu() {
        return this.idAeaprodu;
    }

    public void setIdAeaprodu(int idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public int getIdAeaproduItem() {
        return this.idAeaproduItem;
    }

    public void setIdAeaproduItem(int idAeaproduItem) {
        this.idAeaproduItem = idAeaproduItem;
    }

    public int getIdAeaunven() {
        return this.idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
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

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public int getSequencia() {
        return this.sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}
