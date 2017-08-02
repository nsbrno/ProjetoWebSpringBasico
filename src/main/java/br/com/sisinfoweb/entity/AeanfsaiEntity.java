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
@Table(name = "AEANFSAI", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEASERIE", "NUMERO"})})
public class AeanfsaiEntity {

    @Column(name = "ID_AEANFSAI", table = "AEANFSAI", nullable = false)
    @Id
    private Integer idAeanfsai;

    @Column(name = "ID_SMAEMPRE", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_AEASERIE", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private int idAeaserie;

    @Column(name = "ID_AEASERIE_NF", table = "AEANFSAI")
    @Basic
    private Integer idAeaserieNf;

    @Column(name = "ID_AEASAIDA", table = "AEANFSAI")
    @Basic
    private Integer idAeasaida;

    @Column(name = "ID_CFAESTAD", table = "AEANFSAI")
    @Basic
    private Integer idCfaestad;

    @Column(name = "ID_CFACIDAD", table = "AEANFSAI")
    @Basic
    private Integer idCfacidad;

    @Column(name = "ID_CFACLIFO", table = "AEANFSAI")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "ID_RPAFATUR", table = "AEANFSAI")
    @Basic
    private Integer idRpafatur;

    @Column(name = "ID_AEANATUR", table = "AEANFSAI")
    @Basic
    private Integer idAeanatur;

    @Column(name = "ID_GCACONTR", table = "AEANFSAI")
    @Basic
    private Integer idGcacontr;

    @Column(name = "ID_AEATRANS", table = "AEANFSAI")
    @Basic
    private Integer idAeatrans;

    @Column(name = "ID_CFANATOP_CF_NF", table = "AEANFSAI")
    @Basic
    private Integer idCfanatopCfNf;

    @Column(name = "GUID", table = "AEANFSAI", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEANFSAI", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEANFSAI")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEANFSAI")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEANFSAI")
    @Basic
    private Integer ctInteg;

    @Column(name = "DT_NF", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date dtNf;

    @Column(name = "DT_EMISSAO", table = "AEANFSAI")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Column(name = "DT_SAIDA", table = "AEANFSAI")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtSaida;

    @Column(name = "DT_SAIDA_VAZIO", table = "AEANFSAI")
    @Basic
    private Character dtSaidaVazio;

    @Column(name = "DT_CANCEL", table = "AEANFSAI")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtCancel;

    @Column(name = "NUMERO_NF", table = "AEANFSAI")
    @Basic
    private Integer numeroNf;

    @Column(name = "NUMERO", table = "AEANFSAI")
    @Basic
    private Integer numero;

    @Column(name = "COMISSAO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double comissao;

    @Column(name = "ATAC_VAREJO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private Character atacVarejo;

    @Column(name = "VL_MERC_CUSTO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlMercCusto;

    @Column(name = "VL_MERC_CUSTO_FIS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlMercCustoFis;

    @Column(name = "VL_MERC_VISTA", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlMercVista;

    @Column(name = "VL_MERC_TABELA", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlMercTabela;

    @Column(name = "VL_MERC_BRUTO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlMercBruto;

    @Column(name = "VL_SERV_CUSTO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlServCusto;

    @Column(name = "VL_SERV_CUSTO_FIS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlServCustoFis;

    @Column(name = "VL_SERV_VISTA", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlServVista;

    @Column(name = "VL_SERV_TABELA", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlServTabela;

    @Column(name = "VL_SERV_BRUTO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlServBruto;

    @Column(name = "VL_MERC_DESCONTO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlMercDesconto;

    @Column(name = "VL_SERV_DESCONTO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlServDesconto;

    @Column(name = "VL_BASE_ICMS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlBaseIcms;

    @Column(name = "VL_BASE_ICMS_SUB", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlBaseIcmsSub;

    @Column(name = "VL_BASE_ISS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlBaseIss;

    @Column(name = "VL_BASE_IPI", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlBaseIpi;

    @Column(name = "VL_ISENTO_IPI", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIsentoIpi;

    @Column(name = "VL_ISENTO_ICMS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIsentoIcms;

    @Column(name = "VL_ICMS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIcms;

    @Column(name = "VL_ICMS_SUB", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIcmsSub;

    @Column(name = "VL_IPI", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIpi;

    @Column(name = "VL_ISS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIss;

    @Column(name = "VL_PIS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlPis;

    @Column(name = "VL_PIS_ST", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlPisSt;

    @Column(name = "VL_COFINS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlCofins;

    @Column(name = "VL_COFINS_ST", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlCofinsSt;

    @Column(name = "VL_FRETE", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlFrete;

    @Column(name = "VL_SEGURO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlSeguro;

    @Column(name = "VL_OUTROS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlOutros;

    @Column(name = "VL_ENCARGOS_FINANCEIROS", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlEncargosFinanceiros;

    @Column(name = "VL_RESIDUAL", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlResidual;

    @Column(name = "VL_ICMS_DESON", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIcmsDeson;

    @Column(name = "VL_PIS_DESON", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlPisDeson;

    @Column(name = "VL_COFINS_DESON", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlCofinsDeson;

    @Column(name = "VL_IPI_DESON", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIpiDeson;

    @Column(name = "VL_TOT_TRIB", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlTotTrib;

    @Column(name = "VL_FCP_UF_DEST", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlFcpUfDest;

    @Column(name = "VL_ICMS_UF_DEST", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIcmsUfDest;

    @Column(name = "VL_ICMS_UF_REMET", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double vlIcmsUfRemet;

    @Column(name = "FC_VL_TOTAL", table = "AEANFSAI", precision = 15)
    @Basic
    private Double fcVlTotal;

    @Column(name = "SITUACAO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private short situacao;

    @Column(name = "PESSOA_CLIENTE", table = "AEANFSAI")
    @Basic
    private Character pessoaCliente;

    @Column(name = "NOME_CLIENTE", table = "AEANFSAI", length = 60)
    @Basic
    private String nomeCliente;

    @Column(name = "CPF_CGC_CLIENTE", table = "AEANFSAI", length = 18)
    @Basic
    private String cpfCgcCliente;

    @Column(name = "IE_RG_CLIENTE", table = "AEANFSAI", length = 18)
    @Basic
    private String ieRgCliente;

    @Column(name = "ENDERECO_CLIENTE", table = "AEANFSAI", length = 128)
    @Basic
    private String enderecoCliente;

    @Column(name = "BAIRRO_CLIENTE", table = "AEANFSAI", length = 40)
    @Basic
    private String bairroCliente;

    @Column(name = "CEP_CLIENTE", table = "AEANFSAI", length = 9)
    @Basic
    private String cepCliente;

    @Column(name = "FONE_CLIENTE", table = "AEANFSAI", length = 18)
    @Basic
    private String foneCliente;

    @Column(name = "OBS", table = "AEANFSAI")
    @Lob
    @Basic
    private byte[] obs;

    @Column(name = "TIPO_BAIXA", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private Character tipoBaixa;

    @Column(name = "NUM_EMISSOES", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private int numEmissoes;

    @Column(name = "GERANDO", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private Character gerando;

    @Column(name = "QUANTIDADE", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double quantidade;

    @Column(name = "QTDE_DEVOL", table = "AEANFSAI", nullable = false)
    @Basic(optional = false)
    private double qtdeDevol;

    @Column(name = "TIPO_TRANSACAO", table = "AEANFSAI")
    @Basic
    private Character tipoTransacao;

    @Column(name = "TIPO_MERCADORIA", table = "AEANFSAI")
    @Basic
    private Character tipoMercadoria;

    @Column(name = "COD_SIT", table = "AEANFSAI")
    @Basic
    private Character codSit;

    @Column(name = "CHV_NFE", table = "AEANFSAI", length = 50)
    @Basic
    private String chvNfe;

    @Column(name = "NUMPROT", table = "AEANFSAI", length = 18)
    @Basic
    private String numprot;

    @Column(name = "DHNPROT", table = "AEANFSAI")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dhnprot;

    @Column(name = "FINALIDADE", table = "AEANFSAI")
    @Basic
    private Character finalidade;

    @Column(name = "NFE_SERVER", table = "AEANFSAI")
    @Basic
    private Character nfeServer;

    @Column(name = "CRT", table = "AEANFSAI")
    @Basic
    private Character crt;

    @Column(name = "NUMERO_RPS", table = "AEANFSAI")
    @Basic
    private Integer numeroRps;

    @Column(name = "ISS_RESP_RETENCAO", table = "AEANFSAI")
    @Basic
    private Character issRespRetencao;

    @Column(name = "CONSUMIDOR_FINAL", table = "AEANFSAI")
    @Basic
    private Character consumidorFinal;

    public Integer getIdAeanfsai() {
        return this.idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public int getIdAeaserie() {
        return this.idAeaserie;
    }

    public void setIdAeaserie(int idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdAeaserieNf() {
        return this.idAeaserieNf;
    }

    public void setIdAeaserieNf(Integer idAeaserieNf) {
        this.idAeaserieNf = idAeaserieNf;
    }

    public Integer getIdAeasaida() {
        return this.idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdCfaestad() {
        return this.idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdCfacidad() {
        return this.idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdRpafatur() {
        return this.idRpafatur;
    }

    public void setIdRpafatur(Integer idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public Integer getIdAeanatur() {
        return this.idAeanatur;
    }

    public void setIdAeanatur(Integer idAeanatur) {
        this.idAeanatur = idAeanatur;
    }

    public Integer getIdGcacontr() {
        return this.idGcacontr;
    }

    public void setIdGcacontr(Integer idGcacontr) {
        this.idGcacontr = idGcacontr;
    }

    public Integer getIdAeatrans() {
        return this.idAeatrans;
    }

    public void setIdAeatrans(Integer idAeatrans) {
        this.idAeatrans = idAeatrans;
    }

    public Integer getIdCfanatopCfNf() {
        return this.idCfanatopCfNf;
    }

    public void setIdCfanatopCfNf(Integer idCfanatopCfNf) {
        this.idCfanatopCfNf = idCfanatopCfNf;
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

    public Date getDtNf() {
        return this.dtNf;
    }

    public void setDtNf(Date dtNf) {
        this.dtNf = dtNf;
    }

    public Date getDtEmissao() {
        return this.dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtSaida() {
        return this.dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Character getDtSaidaVazio() {
        return this.dtSaidaVazio;
    }

    public void setDtSaidaVazio(Character dtSaidaVazio) {
        this.dtSaidaVazio = dtSaidaVazio;
    }

    public Date getDtCancel() {
        return this.dtCancel;
    }

    public void setDtCancel(Date dtCancel) {
        this.dtCancel = dtCancel;
    }

    public Integer getNumeroNf() {
        return this.numeroNf;
    }

    public void setNumeroNf(Integer numeroNf) {
        this.numeroNf = numeroNf;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Character getAtacVarejo() {
        return this.atacVarejo;
    }

    public void setAtacVarejo(Character atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public double getVlMercCusto() {
        return this.vlMercCusto;
    }

    public void setVlMercCusto(double vlMercCusto) {
        this.vlMercCusto = vlMercCusto;
    }

    public double getVlMercCustoFis() {
        return this.vlMercCustoFis;
    }

    public void setVlMercCustoFis(double vlMercCustoFis) {
        this.vlMercCustoFis = vlMercCustoFis;
    }

    public double getVlMercVista() {
        return this.vlMercVista;
    }

    public void setVlMercVista(double vlMercVista) {
        this.vlMercVista = vlMercVista;
    }

    public double getVlMercTabela() {
        return this.vlMercTabela;
    }

    public void setVlMercTabela(double vlMercTabela) {
        this.vlMercTabela = vlMercTabela;
    }

    public double getVlMercBruto() {
        return this.vlMercBruto;
    }

    public void setVlMercBruto(double vlMercBruto) {
        this.vlMercBruto = vlMercBruto;
    }

    public double getVlServCusto() {
        return this.vlServCusto;
    }

    public void setVlServCusto(double vlServCusto) {
        this.vlServCusto = vlServCusto;
    }

    public double getVlServCustoFis() {
        return this.vlServCustoFis;
    }

    public void setVlServCustoFis(double vlServCustoFis) {
        this.vlServCustoFis = vlServCustoFis;
    }

    public double getVlServVista() {
        return this.vlServVista;
    }

    public void setVlServVista(double vlServVista) {
        this.vlServVista = vlServVista;
    }

    public double getVlServTabela() {
        return this.vlServTabela;
    }

    public void setVlServTabela(double vlServTabela) {
        this.vlServTabela = vlServTabela;
    }

    public double getVlServBruto() {
        return this.vlServBruto;
    }

    public void setVlServBruto(double vlServBruto) {
        this.vlServBruto = vlServBruto;
    }

    public double getVlMercDesconto() {
        return this.vlMercDesconto;
    }

    public void setVlMercDesconto(double vlMercDesconto) {
        this.vlMercDesconto = vlMercDesconto;
    }

    public double getVlServDesconto() {
        return this.vlServDesconto;
    }

    public void setVlServDesconto(double vlServDesconto) {
        this.vlServDesconto = vlServDesconto;
    }

    public double getVlBaseIcms() {
        return this.vlBaseIcms;
    }

    public void setVlBaseIcms(double vlBaseIcms) {
        this.vlBaseIcms = vlBaseIcms;
    }

    public double getVlBaseIcmsSub() {
        return this.vlBaseIcmsSub;
    }

    public void setVlBaseIcmsSub(double vlBaseIcmsSub) {
        this.vlBaseIcmsSub = vlBaseIcmsSub;
    }

    public double getVlBaseIss() {
        return this.vlBaseIss;
    }

    public void setVlBaseIss(double vlBaseIss) {
        this.vlBaseIss = vlBaseIss;
    }

    public double getVlBaseIpi() {
        return this.vlBaseIpi;
    }

    public void setVlBaseIpi(double vlBaseIpi) {
        this.vlBaseIpi = vlBaseIpi;
    }

    public double getVlIsentoIpi() {
        return this.vlIsentoIpi;
    }

    public void setVlIsentoIpi(double vlIsentoIpi) {
        this.vlIsentoIpi = vlIsentoIpi;
    }

    public double getVlIsentoIcms() {
        return this.vlIsentoIcms;
    }

    public void setVlIsentoIcms(double vlIsentoIcms) {
        this.vlIsentoIcms = vlIsentoIcms;
    }

    public double getVlIcms() {
        return this.vlIcms;
    }

    public void setVlIcms(double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public double getVlIcmsSub() {
        return this.vlIcmsSub;
    }

    public void setVlIcmsSub(double vlIcmsSub) {
        this.vlIcmsSub = vlIcmsSub;
    }

    public double getVlIpi() {
        return this.vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlIss() {
        return this.vlIss;
    }

    public void setVlIss(double vlIss) {
        this.vlIss = vlIss;
    }

    public double getVlPis() {
        return this.vlPis;
    }

    public void setVlPis(double vlPis) {
        this.vlPis = vlPis;
    }

    public double getVlPisSt() {
        return this.vlPisSt;
    }

    public void setVlPisSt(double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public double getVlCofins() {
        return this.vlCofins;
    }

    public void setVlCofins(double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public double getVlCofinsSt() {
        return this.vlCofinsSt;
    }

    public void setVlCofinsSt(double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public double getVlFrete() {
        return this.vlFrete;
    }

    public void setVlFrete(double vlFrete) {
        this.vlFrete = vlFrete;
    }

    public double getVlSeguro() {
        return this.vlSeguro;
    }

    public void setVlSeguro(double vlSeguro) {
        this.vlSeguro = vlSeguro;
    }

    public double getVlOutros() {
        return this.vlOutros;
    }

    public void setVlOutros(double vlOutros) {
        this.vlOutros = vlOutros;
    }

    public double getVlEncargosFinanceiros() {
        return this.vlEncargosFinanceiros;
    }

    public void setVlEncargosFinanceiros(double vlEncargosFinanceiros) {
        this.vlEncargosFinanceiros = vlEncargosFinanceiros;
    }

    public double getVlResidual() {
        return this.vlResidual;
    }

    public void setVlResidual(double vlResidual) {
        this.vlResidual = vlResidual;
    }

    public double getVlIcmsDeson() {
        return this.vlIcmsDeson;
    }

    public void setVlIcmsDeson(double vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }

    public double getVlPisDeson() {
        return this.vlPisDeson;
    }

    public void setVlPisDeson(double vlPisDeson) {
        this.vlPisDeson = vlPisDeson;
    }

    public double getVlCofinsDeson() {
        return this.vlCofinsDeson;
    }

    public void setVlCofinsDeson(double vlCofinsDeson) {
        this.vlCofinsDeson = vlCofinsDeson;
    }

    public double getVlIpiDeson() {
        return this.vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
    }

    public double getVlTotTrib() {
        return this.vlTotTrib;
    }

    public void setVlTotTrib(double vlTotTrib) {
        this.vlTotTrib = vlTotTrib;
    }

    public double getVlFcpUfDest() {
        return this.vlFcpUfDest;
    }

    public void setVlFcpUfDest(double vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public double getVlIcmsUfDest() {
        return this.vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(double vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public double getVlIcmsUfRemet() {
        return this.vlIcmsUfRemet;
    }

    public void setVlIcmsUfRemet(double vlIcmsUfRemet) {
        this.vlIcmsUfRemet = vlIcmsUfRemet;
    }

    public Double getFcVlTotal() {
        return this.fcVlTotal;
    }

    public void setFcVlTotal(Double fcVlTotal) {
        this.fcVlTotal = fcVlTotal;
    }

    public short getSituacao() {
        return this.situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public Character getPessoaCliente() {
        return this.pessoaCliente;
    }

    public void setPessoaCliente(Character pessoaCliente) {
        this.pessoaCliente = pessoaCliente;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCgcCliente() {
        return this.cpfCgcCliente;
    }

    public void setCpfCgcCliente(String cpfCgcCliente) {
        this.cpfCgcCliente = cpfCgcCliente;
    }

    public String getIeRgCliente() {
        return this.ieRgCliente;
    }

    public void setIeRgCliente(String ieRgCliente) {
        this.ieRgCliente = ieRgCliente;
    }

    public String getEnderecoCliente() {
        return this.enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return this.bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCepCliente() {
        return this.cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getFoneCliente() {
        return this.foneCliente;
    }

    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public Character getTipoBaixa() {
        return this.tipoBaixa;
    }

    public void setTipoBaixa(Character tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public int getNumEmissoes() {
        return this.numEmissoes;
    }

    public void setNumEmissoes(int numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public Character getGerando() {
        return this.gerando;
    }

    public void setGerando(Character gerando) {
        this.gerando = gerando;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeDevol() {
        return this.qtdeDevol;
    }

    public void setQtdeDevol(double qtdeDevol) {
        this.qtdeDevol = qtdeDevol;
    }

    public Character getTipoTransacao() {
        return this.tipoTransacao;
    }

    public void setTipoTransacao(Character tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Character getTipoMercadoria() {
        return this.tipoMercadoria;
    }

    public void setTipoMercadoria(Character tipoMercadoria) {
        this.tipoMercadoria = tipoMercadoria;
    }

    public Character getCodSit() {
        return this.codSit;
    }

    public void setCodSit(Character codSit) {
        this.codSit = codSit;
    }

    public String getChvNfe() {
        return this.chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public String getNumprot() {
        return this.numprot;
    }

    public void setNumprot(String numprot) {
        this.numprot = numprot;
    }

    public Date getDhnprot() {
        return this.dhnprot;
    }

    public void setDhnprot(Date dhnprot) {
        this.dhnprot = dhnprot;
    }

    public Character getFinalidade() {
        return this.finalidade;
    }

    public void setFinalidade(Character finalidade) {
        this.finalidade = finalidade;
    }

    public Character getNfeServer() {
        return this.nfeServer;
    }

    public void setNfeServer(Character nfeServer) {
        this.nfeServer = nfeServer;
    }

    public Character getCrt() {
        return this.crt;
    }

    public void setCrt(Character crt) {
        this.crt = crt;
    }

    public Integer getNumeroRps() {
        return this.numeroRps;
    }

    public void setNumeroRps(Integer numeroRps) {
        this.numeroRps = numeroRps;
    }

    public Character getIssRespRetencao() {
        return this.issRespRetencao;
    }

    public void setIssRespRetencao(Character issRespRetencao) {
        this.issRespRetencao = issRespRetencao;
    }

    public Character getConsumidorFinal() {
        return this.consumidorFinal;
    }

    public void setConsumidorFinal(Character consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

}
