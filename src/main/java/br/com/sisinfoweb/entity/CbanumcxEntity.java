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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CBANUMCX", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "CODIGO"})})
public class CbanumcxEntity {

    @Column(name = "ID_CBANUMCX", table = "CBANUMCX", nullable = false)
    @Id
    private Integer idCbanumcx;

    @Column(name = "ID_SMAEMPRE", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_CBAPLCTA", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private int idCbaplcta;

    @Column(name = "ID_CBAPLCTA_SALDO", table = "CBANUMCX")
    @Basic
    private Integer idCbaplctaSaldo;

    @Column(name = "ID_CBAPLCTA_JUROS_DISP", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private int idCbaplctaJurosDisp;

    @Column(name = "ID_CBAPLCTA_TROCO", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private int idCbaplctaTroco;

    @Column(name = "ID_AEASERIE", table = "CBANUMCX")
    @Basic
    private Integer idAeaserie;

    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "CBANUMCX")
    @Basic
    private Integer idCfaclifoVendedor;

    @Column(name = "GUID", table = "CBANUMCX", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CBANUMCX", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBANUMCX")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CBANUMCX")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CBANUMCX")
    @Basic
    private Integer ctInteg;

    @Column(name = "CODIGO", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private int codigo;

    @Column(name = "DESCRICAO", table = "CBANUMCX", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "SENHA", table = "CBANUMCX", length = 20)
    @Basic
    private String senha;

    @Column(name = "ATIVO", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private Character ativo;

    @Column(name = "BAIXA_CT_REC", table = "CBANUMCX")
    @Basic
    private Character baixaCtRec;

    @Column(name = "BAIXA_CT_PAG", table = "CBANUMCX")
    @Basic
    private Character baixaCtPag;

    @Column(name = "BAIXA_VALE", table = "CBANUMCX")
    @Basic
    private Character baixaVale;

    @Column(name = "ESTORNA_CT_REC", table = "CBANUMCX")
    @Basic
    private Character estornaCtRec;

    @Column(name = "ESTORNA_CT_PAG", table = "CBANUMCX")
    @Basic
    private Character estornaCtPag;

    @Column(name = "BLOQUEIA_CONTAS", table = "CBANUMCX")
    @Basic
    private Character bloqueiaContas;

    @Column(name = "OUTRAS_DATAS", table = "CBANUMCX")
    @Basic
    private Character outrasDatas;

    @Column(name = "FILTRA_PEDIDOS_EMITIDOS", table = "CBANUMCX")
    @Basic
    private Character filtraPedidosEmitidos;

    @Column(name = "TRANSACAO_UNICA_DIA", table = "CBANUMCX")
    @Basic
    private Character transacaoUnicaDia;

    @Column(name = "ESPELHO_CUPOM", table = "CBANUMCX")
    @Basic
    private Character espelhoCupom;

    @Column(name = "EXIGE_AUTENTICACAO", table = "CBANUMCX")
    @Basic
    private Character exigeAutenticacao;

    @Column(name = "BAIXA_OUTRAS_DATAS", table = "CBANUMCX")
    @Basic
    private Character baixaOutrasDatas;

    @Column(name = "ACESSA_JUROS", table = "CBANUMCX")
    @Basic
    private Character acessaJuros;

    @Column(name = "PERC_DESC_JUROS", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private double percDescJuros;

    @Column(name = "PERC_DESC_CAPITAL", table = "CBANUMCX", nullable = false)
    @Basic(optional = false)
    private double percDescCapital;

    public Integer getIdCbanumcx() {
        return this.idCbanumcx;
    }

    public void setIdCbanumcx(Integer idCbanumcx) {
        this.idCbanumcx = idCbanumcx;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public int getIdCbaplcta() {
        return this.idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdCbaplctaSaldo() {
        return this.idCbaplctaSaldo;
    }

    public void setIdCbaplctaSaldo(Integer idCbaplctaSaldo) {
        this.idCbaplctaSaldo = idCbaplctaSaldo;
    }

    public int getIdCbaplctaJurosDisp() {
        return this.idCbaplctaJurosDisp;
    }

    public void setIdCbaplctaJurosDisp(int idCbaplctaJurosDisp) {
        this.idCbaplctaJurosDisp = idCbaplctaJurosDisp;
    }

    public int getIdCbaplctaTroco() {
        return this.idCbaplctaTroco;
    }

    public void setIdCbaplctaTroco(int idCbaplctaTroco) {
        this.idCbaplctaTroco = idCbaplctaTroco;
    }

    public Integer getIdAeaserie() {
        return this.idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdCfaclifoVendedor() {
        return this.idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(Integer idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
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

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Character getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    public Character getBaixaCtRec() {
        return this.baixaCtRec;
    }

    public void setBaixaCtRec(Character baixaCtRec) {
        this.baixaCtRec = baixaCtRec;
    }

    public Character getBaixaCtPag() {
        return this.baixaCtPag;
    }

    public void setBaixaCtPag(Character baixaCtPag) {
        this.baixaCtPag = baixaCtPag;
    }

    public Character getBaixaVale() {
        return this.baixaVale;
    }

    public void setBaixaVale(Character baixaVale) {
        this.baixaVale = baixaVale;
    }

    public Character getEstornaCtRec() {
        return this.estornaCtRec;
    }

    public void setEstornaCtRec(Character estornaCtRec) {
        this.estornaCtRec = estornaCtRec;
    }

    public Character getEstornaCtPag() {
        return this.estornaCtPag;
    }

    public void setEstornaCtPag(Character estornaCtPag) {
        this.estornaCtPag = estornaCtPag;
    }

    public Character getBloqueiaContas() {
        return this.bloqueiaContas;
    }

    public void setBloqueiaContas(Character bloqueiaContas) {
        this.bloqueiaContas = bloqueiaContas;
    }

    public Character getOutrasDatas() {
        return this.outrasDatas;
    }

    public void setOutrasDatas(Character outrasDatas) {
        this.outrasDatas = outrasDatas;
    }

    public Character getFiltraPedidosEmitidos() {
        return this.filtraPedidosEmitidos;
    }

    public void setFiltraPedidosEmitidos(Character filtraPedidosEmitidos) {
        this.filtraPedidosEmitidos = filtraPedidosEmitidos;
    }

    public Character getTransacaoUnicaDia() {
        return this.transacaoUnicaDia;
    }

    public void setTransacaoUnicaDia(Character transacaoUnicaDia) {
        this.transacaoUnicaDia = transacaoUnicaDia;
    }

    public Character getEspelhoCupom() {
        return this.espelhoCupom;
    }

    public void setEspelhoCupom(Character espelhoCupom) {
        this.espelhoCupom = espelhoCupom;
    }

    public Character getExigeAutenticacao() {
        return this.exigeAutenticacao;
    }

    public void setExigeAutenticacao(Character exigeAutenticacao) {
        this.exigeAutenticacao = exigeAutenticacao;
    }

    public Character getBaixaOutrasDatas() {
        return this.baixaOutrasDatas;
    }

    public void setBaixaOutrasDatas(Character baixaOutrasDatas) {
        this.baixaOutrasDatas = baixaOutrasDatas;
    }

    public Character getAcessaJuros() {
        return this.acessaJuros;
    }

    public void setAcessaJuros(Character acessaJuros) {
        this.acessaJuros = acessaJuros;
    }

    public double getPercDescJuros() {
        return this.percDescJuros;
    }

    public void setPercDescJuros(double percDescJuros) {
        this.percDescJuros = percDescJuros;
    }

    public double getPercDescCapital() {
        return this.percDescCapital;
    }

    public void setPercDescCapital(double percDescCapital) {
        this.percDescCapital = percDescCapital;
    }

}
