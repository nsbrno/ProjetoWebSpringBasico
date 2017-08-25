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
@Table(name = "AEAITTBP")
public class AeaittbpEntity {

    @Column(name = "ID_AEAITTBP", table = "AEAITTBP", nullable = false)
    @Id
    private Integer idAeaittbp;

    @Column(name = "ID_AEATBPRO", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private int idAeatbpro;

    @Column(name = "ID_AEAAGPPR", table = "AEAITTBP")
    @Basic
    private Integer idAeaagppr;

    @Column(name = "ID_AEAMARCA", table = "AEAITTBP")
    @Basic
    private Integer idAeamarca;

    @Column(name = "ID_AEAFAMIL", table = "AEAITTBP")
    @Basic
    private Integer idAeafamil;

    @Column(name = "ID_AEACLASE", table = "AEAITTBP")
    @Basic
    private Integer idAeaclase;

    @Column(name = "ID_AEAGRUPO", table = "AEAITTBP")
    @Basic
    private Integer idAeagrupo;

    @Column(name = "ID_AEASGRUP", table = "AEAITTBP")
    @Basic
    private Integer idAeasgrup;

    @Column(name = "ID_AEAPRODU", table = "AEAITTBP")
    @Basic
    private Integer idAeaprodu;

    @Column(name = "GUID", table = "AEAITTBP", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAITTBP", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAITTBP")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEAITTBP")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEAITTBP")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESC_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMercVistaVare;

    @Column(name = "DESC_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMercVistaAtac;

    @Column(name = "DESC_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMercPrazoVare;

    @Column(name = "DESC_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMercPrazoAtac;

    @Column(name = "DESC_SERV_VISTA", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descServVista;

    @Column(name = "DESC_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descServPrazo;

    @Column(name = "COM_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comMercVistaVare;

    @Column(name = "COM_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comMercVistaAtac;

    @Column(name = "COM_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comMercPrazoVare;

    @Column(name = "COM_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comMercPrazoAtac;

    @Column(name = "COM_SERV_VISTA", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comServVista;

    @Column(name = "COM_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comServPrazo;

    @Column(name = "COM_EXT_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comExtMercVistaVare;

    @Column(name = "COM_EXT_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comExtMercVistaAtac;

    @Column(name = "COM_EXT_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comExtMercPrazoVare;

    @Column(name = "COM_EXT_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comExtMercPrazoAtac;

    @Column(name = "COM_EXT_SERV_VISTA", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comExtServVista;

    @Column(name = "COM_EXT_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double comExtServPrazo;

    @Column(name = "PRECO_VISTA_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double precoVistaVare;

    @Column(name = "PRECO_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double precoVistaAtac;

    @Column(name = "PRECO_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double precoPrazoVare;

    @Column(name = "PRECO_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double precoPrazoAtac;

    @Column(name = "PRECO_VISTA_SERV", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double precoVistaServ;

    @Column(name = "PRECO_PRAZO_SERV", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double precoPrazoServ;

    @Column(name = "DESC_MAX_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMaxMercVistaVare;

    @Column(name = "DESC_MAX_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMaxMercVistaAtac;

    @Column(name = "DESC_MAX_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMaxMercPrazoVare;

    @Column(name = "DESC_MAX_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMaxMercPrazoAtac;

    @Column(name = "DESC_MAX_SERV_VISTA", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMaxServVista;

    @Column(name = "DESC_MAX_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    @Basic(optional = false)
    private double descMaxServPrazo;

    public Integer getIdAeaittbp() {
        return this.idAeaittbp;
    }

    public void setIdAeaittbp(Integer idAeaittbp) {
        this.idAeaittbp = idAeaittbp;
    }

    public int getIdAeatbpro() {
        return this.idAeatbpro;
    }

    public void setIdAeatbpro(int idAeatbpro) {
        this.idAeatbpro = idAeatbpro;
    }

    public Integer getIdAeaagppr() {
        return this.idAeaagppr;
    }

    public void setIdAeaagppr(Integer idAeaagppr) {
        this.idAeaagppr = idAeaagppr;
    }

    public Integer getIdAeamarca() {
        return this.idAeamarca;
    }

    public void setIdAeamarca(Integer idAeamarca) {
        this.idAeamarca = idAeamarca;
    }

    public Integer getIdAeafamil() {
        return this.idAeafamil;
    }

    public void setIdAeafamil(Integer idAeafamil) {
        this.idAeafamil = idAeafamil;
    }

    public Integer getIdAeaclase() {
        return this.idAeaclase;
    }

    public void setIdAeaclase(Integer idAeaclase) {
        this.idAeaclase = idAeaclase;
    }

    public Integer getIdAeagrupo() {
        return this.idAeagrupo;
    }

    public void setIdAeagrupo(Integer idAeagrupo) {
        this.idAeagrupo = idAeagrupo;
    }

    public Integer getIdAeasgrup() {
        return this.idAeasgrup;
    }

    public void setIdAeasgrup(Integer idAeasgrup) {
        this.idAeasgrup = idAeasgrup;
    }

    public Integer getIdAeaprodu() {
        return this.idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
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

    public double getDescMercVistaVare() {
        return this.descMercVistaVare;
    }

    public void setDescMercVistaVare(double descMercVistaVare) {
        this.descMercVistaVare = descMercVistaVare;
    }

    public double getDescMercVistaAtac() {
        return this.descMercVistaAtac;
    }

    public void setDescMercVistaAtac(double descMercVistaAtac) {
        this.descMercVistaAtac = descMercVistaAtac;
    }

    public double getDescMercPrazoVare() {
        return this.descMercPrazoVare;
    }

    public void setDescMercPrazoVare(double descMercPrazoVare) {
        this.descMercPrazoVare = descMercPrazoVare;
    }

    public double getDescMercPrazoAtac() {
        return this.descMercPrazoAtac;
    }

    public void setDescMercPrazoAtac(double descMercPrazoAtac) {
        this.descMercPrazoAtac = descMercPrazoAtac;
    }

    public double getDescServVista() {
        return this.descServVista;
    }

    public void setDescServVista(double descServVista) {
        this.descServVista = descServVista;
    }

    public double getDescServPrazo() {
        return this.descServPrazo;
    }

    public void setDescServPrazo(double descServPrazo) {
        this.descServPrazo = descServPrazo;
    }

    public double getComMercVistaVare() {
        return this.comMercVistaVare;
    }

    public void setComMercVistaVare(double comMercVistaVare) {
        this.comMercVistaVare = comMercVistaVare;
    }

    public double getComMercVistaAtac() {
        return this.comMercVistaAtac;
    }

    public void setComMercVistaAtac(double comMercVistaAtac) {
        this.comMercVistaAtac = comMercVistaAtac;
    }

    public double getComMercPrazoVare() {
        return this.comMercPrazoVare;
    }

    public void setComMercPrazoVare(double comMercPrazoVare) {
        this.comMercPrazoVare = comMercPrazoVare;
    }

    public double getComMercPrazoAtac() {
        return this.comMercPrazoAtac;
    }

    public void setComMercPrazoAtac(double comMercPrazoAtac) {
        this.comMercPrazoAtac = comMercPrazoAtac;
    }

    public double getComServVista() {
        return this.comServVista;
    }

    public void setComServVista(double comServVista) {
        this.comServVista = comServVista;
    }

    public double getComServPrazo() {
        return this.comServPrazo;
    }

    public void setComServPrazo(double comServPrazo) {
        this.comServPrazo = comServPrazo;
    }

    public double getComExtMercVistaVare() {
        return this.comExtMercVistaVare;
    }

    public void setComExtMercVistaVare(double comExtMercVistaVare) {
        this.comExtMercVistaVare = comExtMercVistaVare;
    }

    public double getComExtMercVistaAtac() {
        return this.comExtMercVistaAtac;
    }

    public void setComExtMercVistaAtac(double comExtMercVistaAtac) {
        this.comExtMercVistaAtac = comExtMercVistaAtac;
    }

    public double getComExtMercPrazoVare() {
        return this.comExtMercPrazoVare;
    }

    public void setComExtMercPrazoVare(double comExtMercPrazoVare) {
        this.comExtMercPrazoVare = comExtMercPrazoVare;
    }

    public double getComExtMercPrazoAtac() {
        return this.comExtMercPrazoAtac;
    }

    public void setComExtMercPrazoAtac(double comExtMercPrazoAtac) {
        this.comExtMercPrazoAtac = comExtMercPrazoAtac;
    }

    public double getComExtServVista() {
        return this.comExtServVista;
    }

    public void setComExtServVista(double comExtServVista) {
        this.comExtServVista = comExtServVista;
    }

    public double getComExtServPrazo() {
        return this.comExtServPrazo;
    }

    public void setComExtServPrazo(double comExtServPrazo) {
        this.comExtServPrazo = comExtServPrazo;
    }

    public double getPrecoVistaVare() {
        return this.precoVistaVare;
    }

    public void setPrecoVistaVare(double precoVistaVare) {
        this.precoVistaVare = precoVistaVare;
    }

    public double getPrecoVistaAtac() {
        return this.precoVistaAtac;
    }

    public void setPrecoVistaAtac(double precoVistaAtac) {
        this.precoVistaAtac = precoVistaAtac;
    }

    public double getPrecoPrazoVare() {
        return this.precoPrazoVare;
    }

    public void setPrecoPrazoVare(double precoPrazoVare) {
        this.precoPrazoVare = precoPrazoVare;
    }

    public double getPrecoPrazoAtac() {
        return this.precoPrazoAtac;
    }

    public void setPrecoPrazoAtac(double precoPrazoAtac) {
        this.precoPrazoAtac = precoPrazoAtac;
    }

    public double getPrecoVistaServ() {
        return this.precoVistaServ;
    }

    public void setPrecoVistaServ(double precoVistaServ) {
        this.precoVistaServ = precoVistaServ;
    }

    public double getPrecoPrazoServ() {
        return this.precoPrazoServ;
    }

    public void setPrecoPrazoServ(double precoPrazoServ) {
        this.precoPrazoServ = precoPrazoServ;
    }

    public double getDescMaxMercVistaVare() {
        return this.descMaxMercVistaVare;
    }

    public void setDescMaxMercVistaVare(double descMaxMercVistaVare) {
        this.descMaxMercVistaVare = descMaxMercVistaVare;
    }

    public double getDescMaxMercVistaAtac() {
        return this.descMaxMercVistaAtac;
    }

    public void setDescMaxMercVistaAtac(double descMaxMercVistaAtac) {
        this.descMaxMercVistaAtac = descMaxMercVistaAtac;
    }

    public double getDescMaxMercPrazoVare() {
        return this.descMaxMercPrazoVare;
    }

    public void setDescMaxMercPrazoVare(double descMaxMercPrazoVare) {
        this.descMaxMercPrazoVare = descMaxMercPrazoVare;
    }

    public double getDescMaxMercPrazoAtac() {
        return this.descMaxMercPrazoAtac;
    }

    public void setDescMaxMercPrazoAtac(double descMaxMercPrazoAtac) {
        this.descMaxMercPrazoAtac = descMaxMercPrazoAtac;
    }

    public double getDescMaxServVista() {
        return this.descMaxServVista;
    }

    public void setDescMaxServVista(double descMaxServVista) {
        this.descMaxServVista = descMaxServVista;
    }

    public double getDescMaxServPrazo() {
        return this.descMaxServPrazo;
    }

    public void setDescMaxServPrazo(double descMaxServPrazo) {
        this.descMaxServPrazo = descMaxServPrazo;
    }

}
