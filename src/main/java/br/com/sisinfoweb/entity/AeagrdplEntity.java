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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "AEAGRDPL", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEAPLOJA", "ID_AEAGRDPR"})})
public class AeagrdplEntity {

    @Column(name = "ID_AEAGRDPL", table = "AEAGRDPL", nullable = false)
    @Id
    private Integer idAeagrdpl;

    @Column(name = "ID_AEAPLOJA", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private int idAeaploja;

    @Column(name = "ID_AEAGRDPR", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private int idAeagrdpr;

    @Column(name = "GUID", table = "AEAGRDPL", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAGRDPL", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEAGRDPL")
    @Basic
    private Integer ctInteg;

    @Column(name = "ESTOQUE_F", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double estoqueF;

    @Column(name = "ESTOQUE_C", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double estoqueC;

    @Column(name = "PEDIDO", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double pedido;

    @Column(name = "RETIDO", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double retido;

    @Column(name = "DT_VENDA_VARE_D", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaVareD;

    @Column(name = "DT_VENDA_ATAC_D", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaAtacD;

    @Column(name = "DT_COMPRA", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtCompra;

    @Column(name = "DT_VENDA_VARE_N", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaVareN;

    @Column(name = "DT_VENDA_ATAC_N", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaAtacN;

    @Column(name = "DT_VENDA_PROMO_VARE_D", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoVareD;

    @Column(name = "DT_VENDA_PROMO_ATAC_D", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoAtacD;

    @Column(name = "DT_VENDA_PROMO_VARE_N", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoVareN;

    @Column(name = "DT_VENDA_PROMO_ATAC_N", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoAtacN;

    @Column(name = "DT_ENTRADA_D", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtEntradaD;

    @Column(name = "DT_ENTRADA_N", table = "AEAGRDPL")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtEntradaN;

    @Column(name = "MINIMO", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double minimo;

    @Column(name = "MEDIO", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double medio;

    @Column(name = "MAXIMO", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double maximo;

    @Column(name = "NUM_COMPRAS", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private int numCompras;

    @Column(name = "TEMPO_PED_ENTREGA", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private double tempoPedEntrega;

    @Column(name = "ATIVO", table = "AEAGRDPL", nullable = false)
    @Basic(optional = false)
    private Character ativo;

    public Integer getIdAeagrdpl() {
        return this.idAeagrdpl;
    }

    public void setIdAeagrdpl(Integer idAeagrdpl) {
        this.idAeagrdpl = idAeagrdpl;
    }

    public int getIdAeaploja() {
        return this.idAeaploja;
    }

    public void setIdAeaploja(int idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public int getIdAeagrdpr() {
        return this.idAeagrdpr;
    }

    public void setIdAeagrdpr(int idAeagrdpr) {
        this.idAeagrdpr = idAeagrdpr;
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

    public double getEstoqueF() {
        return this.estoqueF;
    }

    public void setEstoqueF(double estoqueF) {
        this.estoqueF = estoqueF;
    }

    public double getEstoqueC() {
        return this.estoqueC;
    }

    public void setEstoqueC(double estoqueC) {
        this.estoqueC = estoqueC;
    }

    public double getPedido() {
        return this.pedido;
    }

    public void setPedido(double pedido) {
        this.pedido = pedido;
    }

    public double getRetido() {
        return this.retido;
    }

    public void setRetido(double retido) {
        this.retido = retido;
    }

    public Date getDtVendaVareD() {
        return this.dtVendaVareD;
    }

    public void setDtVendaVareD(Date dtVendaVareD) {
        this.dtVendaVareD = dtVendaVareD;
    }

    public Date getDtVendaAtacD() {
        return this.dtVendaAtacD;
    }

    public void setDtVendaAtacD(Date dtVendaAtacD) {
        this.dtVendaAtacD = dtVendaAtacD;
    }

    public Date getDtCompra() {
        return this.dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public Date getDtVendaVareN() {
        return this.dtVendaVareN;
    }

    public void setDtVendaVareN(Date dtVendaVareN) {
        this.dtVendaVareN = dtVendaVareN;
    }

    public Date getDtVendaAtacN() {
        return this.dtVendaAtacN;
    }

    public void setDtVendaAtacN(Date dtVendaAtacN) {
        this.dtVendaAtacN = dtVendaAtacN;
    }

    public Date getDtVendaPromoVareD() {
        return this.dtVendaPromoVareD;
    }

    public void setDtVendaPromoVareD(Date dtVendaPromoVareD) {
        this.dtVendaPromoVareD = dtVendaPromoVareD;
    }

    public Date getDtVendaPromoAtacD() {
        return this.dtVendaPromoAtacD;
    }

    public void setDtVendaPromoAtacD(Date dtVendaPromoAtacD) {
        this.dtVendaPromoAtacD = dtVendaPromoAtacD;
    }

    public Date getDtVendaPromoVareN() {
        return this.dtVendaPromoVareN;
    }

    public void setDtVendaPromoVareN(Date dtVendaPromoVareN) {
        this.dtVendaPromoVareN = dtVendaPromoVareN;
    }

    public Date getDtVendaPromoAtacN() {
        return this.dtVendaPromoAtacN;
    }

    public void setDtVendaPromoAtacN(Date dtVendaPromoAtacN) {
        this.dtVendaPromoAtacN = dtVendaPromoAtacN;
    }

    public Date getDtEntradaD() {
        return this.dtEntradaD;
    }

    public void setDtEntradaD(Date dtEntradaD) {
        this.dtEntradaD = dtEntradaD;
    }

    public Date getDtEntradaN() {
        return this.dtEntradaN;
    }

    public void setDtEntradaN(Date dtEntradaN) {
        this.dtEntradaN = dtEntradaN;
    }

    public double getMinimo() {
        return this.minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    public double getMedio() {
        return this.medio;
    }

    public void setMedio(double medio) {
        this.medio = medio;
    }

    public double getMaximo() {
        return this.maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    public int getNumCompras() {
        return this.numCompras;
    }

    public void setNumCompras(int numCompras) {
        this.numCompras = numCompras;
    }

    public double getTempoPedEntrega() {
        return this.tempoPedEntrega;
    }

    public void setTempoPedEntrega(double tempoPedEntrega) {
        this.tempoPedEntrega = tempoPedEntrega;
    }

    public Character getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

}
