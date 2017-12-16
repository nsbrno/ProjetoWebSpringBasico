/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "AEASAIDA", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEASERIE", "NUMERO"})})
public class AeasaidaEntity {

    @Column(name = "ID_AEASAIDA", table = "AEASAIDA", nullable = false)
    @Id
    private Integer idAeasaida;

    @Column(name = "ID_SMAEMPRE", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_AEASERIE", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private int idAeaserie;

    @Column(name = "ID_CFAMOEDA", table = "AEASAIDA")
    @Basic
    private Integer idCfamoeda;

    @Column(name = "ID_CFACLIFO", table = "AEASAIDA")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "ID_CFACLIFO_INDICOU", table = "AEASAIDA")
    @Basic
    private Integer idCfaclifoIndicou;

    @Column(name = "ID_CFACLIFO_VENDEDOR_INI", table = "AEASAIDA")
    @Basic
    private Integer idCfaclifoVendedorIni;

    @Column(name = "ID_CFAESTAD", table = "AEASAIDA")
    @Basic
    private Integer idCfaestad;

    @Column(name = "ID_CFACIDAD", table = "AEASAIDA")
    @Basic
    private Integer idCfacidad;

    @Column(name = "ID_AEANATUR", table = "AEASAIDA")
    @Basic
    private Integer idAeanatur;

    @Column(name = "ID_CFACLIFO_DESC_GER", table = "AEASAIDA")
    @Basic
    private Integer idCfaclifoDescGer;

    @Column(name = "ID_CFAEQUIP", table = "AEASAIDA")
    @Basic
    private Integer idCfaequip;

    @Column(name = "ID_CFATPDOC", table = "AEASAIDA")
    @Basic
    private Integer idCfatpdoc;

    @Column(name = "GUID", table = "AEASAIDA", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEASAIDA", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEASAIDA")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEASAIDA")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEASAIDA")
    @Basic
    private Integer ctInteg;

    @Column(name = "NUMERO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private int numero;

    @Column(name = "DT_VENDA", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private String dtVenda;

    @Column(name = "DT_EMISSAO", table = "AEASAIDA")
    @Basic
    private String dtEmissao;

    @Column(name = "DT_SAIDA", table = "AEASAIDA")
    @Basic
    private String dtSaida;

    @Column(name = "DT_CANCEL", table = "AEASAIDA")
    @Basic
    private String dtCancel;

    @Column(name = "DT_CRIACAO_PALM", table = "AEASAIDA")
    @Basic
    private String dtCriacaoPalm;

    @Column(name = "COMISSAO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double comissao;

    @Column(name = "ATAC_VAREJO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private Character atacVarejo;

    @Column(name = "VL_MERC_CUSTO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlMercCusto;

    @Column(name = "VL_MERC_VISTA", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlMercVista;

    @Column(name = "VL_MERC_TABELA", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlMercTabela;

    @Column(name = "VL_MERC_BRUTO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlMercBruto;

    @Column(name = "VL_SERV_CUSTO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlServCusto;

    @Column(name = "VL_SERV_VISTA", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlServVista;

    @Column(name = "VL_SERV_TABELA", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlServTabela;

    @Column(name = "VL_SERV_BRUTO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlServBruto;

    @Column(name = "VL_MERC_DESCONTO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlMercDesconto;

    @Column(name = "VL_SERV_DESCONTO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlServDesconto;

    @Column(name = "VL_RESIDUAL", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlResidual;

    @Column(name = "VL_FRETE", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlFrete;

    @Column(name = "VL_SEGURO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlSeguro;

    @Column(name = "VL_OUTROS", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlOutros;

    @Column(name = "VL_ENCARGOS_FINANCEIROS", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlEncargosFinanceiros;

    @Column(name = "VL_RETORNO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlRetorno;

    @Column(name = "VL_ICMS_DESON", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlIcmsDeson;

    @Column(name = "VL_PIS_DESON", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlPisDeson;

    @Column(name = "VL_COFINS_DESON", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlCofinsDeson;

    @Column(name = "VL_IPI_DESON", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlIpiDeson;

    @Column(name = "FC_VL_OUTROS", table = "AEASAIDA", precision = 15)
    @Basic
    private Double fcVlOutros;

    @Column(name = "FC_VL_TOTAL", table = "AEASAIDA", precision = 15)
    @Basic
    private Double fcVlTotal;

    @Column(name = "VL_CONFIRMADO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double vlConfirmado;

    @Column(name = "FC_VL_FATURAR", table = "AEASAIDA", precision = 15)
    @Basic
    private Double fcVlFaturar;

    @Column(name = "PERC_DESC_GERENCIA", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double percDescGerencia;

    @Column(name = "NUM_EMISSOES", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private int numEmissoes;

    @Column(name = "SITUACAO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private short situacao;

    @Column(name = "OBS", table = "AEASAIDA")
    @Basic
    private String obs;

    @Column(name = "PESSOA_CLIENTE", table = "AEASAIDA")
    @Basic
    private Character pessoaCliente;

    @Column(name = "NOME_CLIENTE", table = "AEASAIDA", length = 60)
    @Basic
    private String nomeCliente;

    @Column(name = "CPF_CGC_CLIENTE", table = "AEASAIDA", length = 18)
    @Basic
    private String cpfCgcCliente;

    @Column(name = "IE_RG_CLIENTE", table = "AEASAIDA", length = 18)
    @Basic
    private String ieRgCliente;

    @Column(name = "ENDERECO_CLIENTE", table = "AEASAIDA", length = 128)
    @Basic
    private String enderecoCliente;

    @Column(name = "BAIRRO_CLIENTE", table = "AEASAIDA", length = 40)
    @Basic
    private String bairroCliente;

    @Column(name = "CEP_CLIENTE", table = "AEASAIDA", length = 9)
    @Basic
    private String cepCliente;

    @Column(name = "FONE_CLIENTE", table = "AEASAIDA", length = 18)
    @Basic
    private String foneCliente;

    @Column(name = "TIPO_BAIXA", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private Character tipoBaixa;

    @Column(name = "TIPO_SAIDA", table = "AEASAIDA")
    @Basic
    private Character tipoSaida;

    @Column(name = "GERANDO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private Character gerando;

    @Column(name = "REGISTRADO", table = "AEASAIDA")
    @Basic
    private Character registrado;

    @Column(name = "QUANTIDADE", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double quantidade;

    @Column(name = "QTDE_DEVOL", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double qtdeDevol;

    @Column(name = "QTDE_RETORNO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double qtdeRetorno;

    @Column(name = "QTDE_CONFERIDO", table = "AEASAIDA", nullable = false)
    @Basic(optional = false)
    private double qtdeConferido;

    @Column(name = "TIPO_ENTREGA", table = "AEASAIDA")
    @Basic
    private Character tipoEntrega;

    @Column(name = "SERIE_ORC", table = "AEASAIDA", length = 3)
    @Basic
    private String serieOrc;

    @Column(name = "NUMERO_ORC", table = "AEASAIDA")
    @Basic
    private Integer numeroOrc;

    @Column(name = "COD", table = "AEASAIDA", length = 40)
    @Basic
    private String cod;

    public Integer getIdAeasaida() {
        return this.idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
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

    public Integer getIdCfamoeda() {
        return this.idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoIndicou() {
        return this.idCfaclifoIndicou;
    }

    public void setIdCfaclifoIndicou(Integer idCfaclifoIndicou) {
        this.idCfaclifoIndicou = idCfaclifoIndicou;
    }

    public Integer getIdCfaclifoVendedorIni() {
        return this.idCfaclifoVendedorIni;
    }

    public void setIdCfaclifoVendedorIni(Integer idCfaclifoVendedorIni) {
        this.idCfaclifoVendedorIni = idCfaclifoVendedorIni;
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

    public Integer getIdAeanatur() {
        return this.idAeanatur;
    }

    public void setIdAeanatur(Integer idAeanatur) {
        this.idAeanatur = idAeanatur;
    }

    public Integer getIdCfaclifoDescGer() {
        return this.idCfaclifoDescGer;
    }

    public void setIdCfaclifoDescGer(Integer idCfaclifoDescGer) {
        this.idCfaclifoDescGer = idCfaclifoDescGer;
    }

    public Integer getIdCfaequip() {
        return this.idCfaequip;
    }

    public void setIdCfaequip(Integer idCfaequip) {
        this.idCfaequip = idCfaequip;
    }

    public Integer getIdCfatpdoc() {
        return this.idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
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

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDtVenda() {
        return this.dtVenda;
    }

    public void setDtVenda(String dtVenda) {
        this.dtVenda = dtVenda;
    }

    public String getDtEmissao() {
        return this.dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public String getDtSaida() {
        return this.dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public String getDtCancel() {
        return this.dtCancel;
    }

    public void setDtCancel(String dtCancel) {
        this.dtCancel = dtCancel;
    }

    public String getDtCriacaoPalm() {
        return this.dtCriacaoPalm;
    }

    public void setDtCriacaoPalm(String dtCriacaoPalm) {
        this.dtCriacaoPalm = dtCriacaoPalm;
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

    public double getVlResidual() {
        return this.vlResidual;
    }

    public void setVlResidual(double vlResidual) {
        this.vlResidual = vlResidual;
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

    public double getVlRetorno() {
        return this.vlRetorno;
    }

    public void setVlRetorno(double vlRetorno) {
        this.vlRetorno = vlRetorno;
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

    public Double getFcVlOutros() {
        return this.fcVlOutros;
    }

    public void setFcVlOutros(Double fcVlOutros) {
        this.fcVlOutros = fcVlOutros;
    }

    public Double getFcVlTotal() {
        return this.fcVlTotal;
    }

    public void setFcVlTotal(Double fcVlTotal) {
        this.fcVlTotal = fcVlTotal;
    }

    public double getVlConfirmado() {
        return this.vlConfirmado;
    }

    public void setVlConfirmado(double vlConfirmado) {
        this.vlConfirmado = vlConfirmado;
    }

    public Double getFcVlFaturar() {
        return this.fcVlFaturar;
    }

    public void setFcVlFaturar(Double fcVlFaturar) {
        this.fcVlFaturar = fcVlFaturar;
    }

    public double getPercDescGerencia() {
        return this.percDescGerencia;
    }

    public void setPercDescGerencia(double percDescGerencia) {
        this.percDescGerencia = percDescGerencia;
    }

    public int getNumEmissoes() {
        return this.numEmissoes;
    }

    public void setNumEmissoes(int numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public short getSituacao() {
        return this.situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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

    public Character getTipoBaixa() {
        return this.tipoBaixa;
    }

    public void setTipoBaixa(Character tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public Character getTipoSaida() {
        return this.tipoSaida;
    }

    public void setTipoSaida(Character tipoSaida) {
        this.tipoSaida = tipoSaida;
    }

    public Character getGerando() {
        return this.gerando;
    }

    public void setGerando(Character gerando) {
        this.gerando = gerando;
    }

    public Character getRegistrado() {
        return this.registrado;
    }

    public void setRegistrado(Character registrado) {
        this.registrado = registrado;
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

    public double getQtdeRetorno() {
        return this.qtdeRetorno;
    }

    public void setQtdeRetorno(double qtdeRetorno) {
        this.qtdeRetorno = qtdeRetorno;
    }

    public double getQtdeConferido() {
        return this.qtdeConferido;
    }

    public void setQtdeConferido(double qtdeConferido) {
        this.qtdeConferido = qtdeConferido;
    }

    public Character getTipoEntrega() {
        return this.tipoEntrega;
    }

    public void setTipoEntrega(Character tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getSerieOrc() {
        return this.serieOrc;
    }

    public void setSerieOrc(String serieOrc) {
        this.serieOrc = serieOrc;
    }

    public Integer getNumeroOrc() {
        return this.numeroOrc;
    }

    public void setNumeroOrc(Integer numeroOrc) {
        this.numeroOrc = numeroOrc;
    }

    public String getCod() {
        return this.cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

}
