/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CBAITACE", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_CBATRANS", "SEQUENCIA"})})
public class CbaitaceEntity {

    @Column(name = "ID_CBAITACE", table = "CBAITACE", nullable = false)
    @Id
    private Integer idCbaitace;

    @Column(name = "ID_CBAPLCTA", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private int idCbaplcta;

    @Column(name = "ID_CBATRANS", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private int idCbatrans;

    @Column(name = "ID_CBAPLCTA_NUMCX", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private int idCbaplctaNumcx;

    @Column(name = "ID_CFATPDOC", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private int idCfatpdoc;

    @Column(name = "ID_CFACLIFO", table = "CBAITACE")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "ID_AEAFORMA", table = "CBAITACE")
    @Basic
    private Integer idAeaforma;

    @Column(name = "GUID", table = "CBAITACE", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CBAITACE", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBAITACE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CBAITACE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CBAITACE")
    @Basic
    private Integer ctInteg;

    @Column(name = "SEQUENCIA", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private int sequencia;

    @Column(name = "D_C", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private Character dC;

    @Column(name = "A_S", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private Character analiticoSintetico;

    @Column(name = "TIPO_DOC", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private Character tipoDoc;

    @Column(name = "VL_ACERTO", table = "CBAITACE", nullable = false)
    @Basic(optional = false)
    private double vlAcerto;

    @Column(name = "OBS", table = "CBAITACE")
    @Lob
    @Basic
    private byte[] obs;

    public Integer getIdCbaitace() {
        return this.idCbaitace;
    }

    public void setIdCbaitace(Integer idCbaitace) {
        this.idCbaitace = idCbaitace;
    }

    public int getIdCbaplcta() {
        return this.idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public int getIdCbatrans() {
        return this.idCbatrans;
    }

    public void setIdCbatrans(int idCbatrans) {
        this.idCbatrans = idCbatrans;
    }

    public int getIdCbaplctaNumcx() {
        return this.idCbaplctaNumcx;
    }

    public void setIdCbaplctaNumcx(int idCbaplctaNumcx) {
        this.idCbaplctaNumcx = idCbaplctaNumcx;
    }

    public int getIdCfatpdoc() {
        return this.idCfatpdoc;
    }

    public void setIdCfatpdoc(int idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdAeaforma() {
        return this.idAeaforma;
    }

    public void setIdAeaforma(Integer idAeaforma) {
        this.idAeaforma = idAeaforma;
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

    public int getSequencia() {
        return this.sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public Character getDC() {
        return this.dC;
    }

    public void setDC(Character dC) {
        this.dC = dC;
    }

    public Character getAnaliticoSintetico() {
        return this.analiticoSintetico;
    }

    public void setAnaliticoSintetico(Character analiticoSintetico) {
        this.analiticoSintetico = analiticoSintetico;
    }

    public Character getTipoDoc() {
        return this.tipoDoc;
    }

    public void setTipoDoc(Character tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public double getVlAcerto() {
        return this.vlAcerto;
    }

    public void setVlAcerto(double vlAcerto) {
        this.vlAcerto = vlAcerto;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}
