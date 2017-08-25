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
@Table(name = "CBACTCUS")
public class CbactcusEntity {

    @Column(name = "ID_CBACTCUS", table = "CBACTCUS", nullable = false)
    @Id
    private Integer idCbactcus;

    @Column(name = "ID_CTAGRUPO", table = "CBACTCUS")
    @Basic
    private Integer idCtagrupo;

    @Column(name = "ID_CBACTCUS_ANT", table = "CBACTCUS")
    @Basic
    private Integer idCbactcusAnt;

    @Column(name = "US_CAD", table = "CBACTCUS", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBACTCUS")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CBACTCUS")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CBACTCUS")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "CBACTCUS", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "COD_REDUZ", table = "CBACTCUS")
    @Basic
    private Integer codReduz;

    @Column(name = "COD_ESTRUTURAL", table = "CBACTCUS", length = 26)
    @Basic
    private String codEstrutural;

    @Column(name = "DESCRICAO", table = "CBACTCUS", length = 40)
    @Basic
    private String descricao;

    @Column(name = "DG", table = "CBACTCUS")
    @Basic
    private Character dg;

    @Column(name = "NIVEL", table = "CBACTCUS", nullable = false)
    @Basic(optional = false)
    private int nivel;

    @Column(name = "A_S", table = "CBACTCUS")
    @Basic
    private Character analiticoSintetico;

    @Column(name = "D_C", table = "CBACTCUS")
    @Basic
    private Character dC;

    public Integer getIdCbactcus() {
        return this.idCbactcus;
    }

    public void setIdCbactcus(Integer idCbactcus) {
        this.idCbactcus = idCbactcus;
    }

    public Integer getIdCtagrupo() {
        return this.idCtagrupo;
    }

    public void setIdCtagrupo(Integer idCtagrupo) {
        this.idCtagrupo = idCtagrupo;
    }

    public Integer getIdCbactcusAnt() {
        return this.idCbactcusAnt;
    }

    public void setIdCbactcusAnt(Integer idCbactcusAnt) {
        this.idCbactcusAnt = idCbactcusAnt;
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

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getCodReduz() {
        return this.codReduz;
    }

    public void setCodReduz(Integer codReduz) {
        this.codReduz = codReduz;
    }

    public String getCodEstrutural() {
        return this.codEstrutural;
    }

    public void setCodEstrutural(String codEstrutural) {
        this.codEstrutural = codEstrutural;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getDg() {
        return this.dg;
    }

    public void setDg(Character dg) {
        this.dg = dg;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Character getAnaliticoSintetico() {
        return this.analiticoSintetico;
    }

    public void setAnaliticoSintetico(Character analiticoSintetico) {
        this.analiticoSintetico = analiticoSintetico;
    }

    public Character getDC() {
        return this.dC;
    }

    public void setDC(Character dC) {
        this.dC = dC;
    }

}
