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
@Table(name = "AEASERIE", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "TIPO", "CODIGO"})})
public class AeaserieEntity {

    @Column(name = "ID_AEASERIE", table = "AEASERIE", nullable = false)
    @Id
    private Integer idAeaserie;

    @Column(name = "ID_AEAECFTB", table = "AEASERIE")
    @Basic
    private Integer idAeaecftb;

    @Column(name = "ID_AEASERIE_GRANDE", table = "AEASERIE")
    @Basic
    private Integer idAeaserieGrande;

    @Column(name = "ID_AEAMODDF", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private int idAeamoddf;

    @Column(name = "ID_SMAEMPRE", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_AEALOCES", table = "AEASERIE")
    @Basic
    private Integer idAealoces;

    @Column(name = "ID_SMAARQUI_ENTRADA", table = "AEASERIE")
    @Basic
    private Integer idSmaarquiEntrada;

    @Column(name = "ID_SMAARQUI_SAIDA", table = "AEASERIE")
    @Basic
    private Integer idSmaarquiSaida;

    @Column(name = "ID_SMAARQUI_SEPAR", table = "AEASERIE")
    @Basic
    private Integer idSmaarquiSepar;

    @Column(name = "ID_SMARELAT_ENTRADA", table = "AEASERIE")
    @Basic
    private Integer idSmarelatEntrada;

    @Column(name = "ID_SMARELAT_SAIDA", table = "AEASERIE")
    @Basic
    private Integer idSmarelatSaida;

    @Column(name = "ID_SMARELAT_SEPAR", table = "AEASERIE")
    @Basic
    private Integer idSmarelatSepar;

    @Column(name = "ID_CFANATOP_CF_NF_INT", table = "AEASERIE")
    @Basic
    private Integer idCfanatopCfNfInt;

    @Column(name = "ID_CFANATOP_CF_NF_EXT", table = "AEASERIE")
    @Basic
    private Integer idCfanatopCfNfExt;

    @Column(name = "GUID", table = "AEASERIE", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEASERIE", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEASERIE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEASERIE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEASERIE")
    @Basic
    private Integer ctInteg;

    @Column(name = "TIPO", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "SERIE", table = "AEASERIE", nullable = false, length = 3)
    @Basic(optional = false)
    private String serie;

    @Column(name = "SUBSERIE", table = "AEASERIE", length = 2)
    @Basic
    private String subserie;

    @Column(name = "CODIGO", table = "AEASERIE", nullable = false, length = 3)
    @Basic(optional = false)
    private String codigo;

    @Column(name = "NUMERO", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private int numero;

    @Column(name = "ATIVO", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private Character ativo;

    @Column(name = "TIPO_BAIXA", table = "AEASERIE")
    @Basic
    private Character tipoBaixa;

    @Column(name = "VISTA_PRAZO", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private Character vistaPrazo;

    @Column(name = "ATACADO_VAREJO", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private Character atacadoVarejo;

    @Column(name = "PESSOA", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private Character pessoa;

    @Column(name = "ECF", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private Character ecf;

    @Column(name = "LINHAS_ANTES_BODY", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private int linhasAntesBody;

    @Column(name = "LINHAS_BODY", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private int linhasBody;

    @Column(name = "LINHAS_DEPOIS_BODY", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private int linhasDepoisBody;

    @Column(name = "DISPOSITIVO", table = "AEASERIE", length = 128)
    @Basic
    private String dispositivo;

    @Column(name = "GERA_DOCUMENTO", table = "AEASERIE", length = 5)
    @Basic
    private String geraDocumento;

    @Column(name = "TIPO_EXCESSAO", table = "AEASERIE")
    @Basic
    private Character tipoExcessao;

    @Column(name = "QTDE_EXCESSOES", table = "AEASERIE", nullable = false)
    @Basic(optional = false)
    private int qtdeExcessoes;

    @Column(name = "MODELO_ECF", table = "AEASERIE", length = 20)
    @Basic
    private String modeloEcf;

    @Column(name = "GERA_IMPRIME", table = "AEASERIE")
    @Basic
    private Character geraImprime;

    @Column(name = "CHECA_LINHAS", table = "AEASERIE")
    @Basic
    private Character checaLinhas;

    @Column(name = "TRAVA_ESTOQUE", table = "AEASERIE")
    @Basic
    private Character travaEstoque;

    @Column(name = "PATHDBF", table = "AEASERIE", length = 128)
    @Basic
    private String pathdbf;

    @Column(name = "SOMENTE_UF_LOCAL", table = "AEASERIE")
    @Basic
    private Character somenteUfLocal;

    @Column(name = "ULTIMONSU", table = "AEASERIE", length = 20)
    @Basic
    private String ultimonsu;

    @Column(name = "AJUSTA_CENTAVOS", table = "AEASERIE")
    @Basic
    private Character ajustaCentavos;

    @Column(name = "TIPO_SAIDA", table = "AEASERIE")
    @Basic
    private Character tipoSaida;

    @Column(name = "REPOE_PERDAS_IND", table = "AEASERIE")
    @Basic
    private Character repoePerdasInd;

    @Column(name = "SEM_VALIDACAO", table = "AEASERIE")
    @Basic
    private Character semValidacao;

    public Integer getIdAeaserie() {
        return this.idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdAeaecftb() {
        return this.idAeaecftb;
    }

    public void setIdAeaecftb(Integer idAeaecftb) {
        this.idAeaecftb = idAeaecftb;
    }

    public Integer getIdAeaserieGrande() {
        return this.idAeaserieGrande;
    }

    public void setIdAeaserieGrande(Integer idAeaserieGrande) {
        this.idAeaserieGrande = idAeaserieGrande;
    }

    public int getIdAeamoddf() {
        return this.idAeamoddf;
    }

    public void setIdAeamoddf(int idAeamoddf) {
        this.idAeamoddf = idAeamoddf;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAealoces() {
        return this.idAealoces;
    }

    public void setIdAealoces(Integer idAealoces) {
        this.idAealoces = idAealoces;
    }

    public Integer getIdSmaarquiEntrada() {
        return this.idSmaarquiEntrada;
    }

    public void setIdSmaarquiEntrada(Integer idSmaarquiEntrada) {
        this.idSmaarquiEntrada = idSmaarquiEntrada;
    }

    public Integer getIdSmaarquiSaida() {
        return this.idSmaarquiSaida;
    }

    public void setIdSmaarquiSaida(Integer idSmaarquiSaida) {
        this.idSmaarquiSaida = idSmaarquiSaida;
    }

    public Integer getIdSmaarquiSepar() {
        return this.idSmaarquiSepar;
    }

    public void setIdSmaarquiSepar(Integer idSmaarquiSepar) {
        this.idSmaarquiSepar = idSmaarquiSepar;
    }

    public Integer getIdSmarelatEntrada() {
        return this.idSmarelatEntrada;
    }

    public void setIdSmarelatEntrada(Integer idSmarelatEntrada) {
        this.idSmarelatEntrada = idSmarelatEntrada;
    }

    public Integer getIdSmarelatSaida() {
        return this.idSmarelatSaida;
    }

    public void setIdSmarelatSaida(Integer idSmarelatSaida) {
        this.idSmarelatSaida = idSmarelatSaida;
    }

    public Integer getIdSmarelatSepar() {
        return this.idSmarelatSepar;
    }

    public void setIdSmarelatSepar(Integer idSmarelatSepar) {
        this.idSmarelatSepar = idSmarelatSepar;
    }

    public Integer getIdCfanatopCfNfInt() {
        return this.idCfanatopCfNfInt;
    }

    public void setIdCfanatopCfNfInt(Integer idCfanatopCfNfInt) {
        this.idCfanatopCfNfInt = idCfanatopCfNfInt;
    }

    public Integer getIdCfanatopCfNfExt() {
        return this.idCfanatopCfNfExt;
    }

    public void setIdCfanatopCfNfExt(Integer idCfanatopCfNfExt) {
        this.idCfanatopCfNfExt = idCfanatopCfNfExt;
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

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSubserie() {
        return this.subserie;
    }

    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Character getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    public Character getTipoBaixa() {
        return this.tipoBaixa;
    }

    public void setTipoBaixa(Character tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public Character getVistaPrazo() {
        return this.vistaPrazo;
    }

    public void setVistaPrazo(Character vistaPrazo) {
        this.vistaPrazo = vistaPrazo;
    }

    public Character getAtacadoVarejo() {
        return this.atacadoVarejo;
    }

    public void setAtacadoVarejo(Character atacadoVarejo) {
        this.atacadoVarejo = atacadoVarejo;
    }

    public Character getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Character pessoa) {
        this.pessoa = pessoa;
    }

    public Character getEcf() {
        return this.ecf;
    }

    public void setEcf(Character ecf) {
        this.ecf = ecf;
    }

    public int getLinhasAntesBody() {
        return this.linhasAntesBody;
    }

    public void setLinhasAntesBody(int linhasAntesBody) {
        this.linhasAntesBody = linhasAntesBody;
    }

    public int getLinhasBody() {
        return this.linhasBody;
    }

    public void setLinhasBody(int linhasBody) {
        this.linhasBody = linhasBody;
    }

    public int getLinhasDepoisBody() {
        return this.linhasDepoisBody;
    }

    public void setLinhasDepoisBody(int linhasDepoisBody) {
        this.linhasDepoisBody = linhasDepoisBody;
    }

    public String getDispositivo() {
        return this.dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getGeraDocumento() {
        return this.geraDocumento;
    }

    public void setGeraDocumento(String geraDocumento) {
        this.geraDocumento = geraDocumento;
    }

    public Character getTipoExcessao() {
        return this.tipoExcessao;
    }

    public void setTipoExcessao(Character tipoExcessao) {
        this.tipoExcessao = tipoExcessao;
    }

    public int getQtdeExcessoes() {
        return this.qtdeExcessoes;
    }

    public void setQtdeExcessoes(int qtdeExcessoes) {
        this.qtdeExcessoes = qtdeExcessoes;
    }

    public String getModeloEcf() {
        return this.modeloEcf;
    }

    public void setModeloEcf(String modeloEcf) {
        this.modeloEcf = modeloEcf;
    }

    public Character getGeraImprime() {
        return this.geraImprime;
    }

    public void setGeraImprime(Character geraImprime) {
        this.geraImprime = geraImprime;
    }

    public Character getChecaLinhas() {
        return this.checaLinhas;
    }

    public void setChecaLinhas(Character checaLinhas) {
        this.checaLinhas = checaLinhas;
    }

    public Character getTravaEstoque() {
        return this.travaEstoque;
    }

    public void setTravaEstoque(Character travaEstoque) {
        this.travaEstoque = travaEstoque;
    }

    public String getPathdbf() {
        return this.pathdbf;
    }

    public void setPathdbf(String pathdbf) {
        this.pathdbf = pathdbf;
    }

    public Character getSomenteUfLocal() {
        return this.somenteUfLocal;
    }

    public void setSomenteUfLocal(Character somenteUfLocal) {
        this.somenteUfLocal = somenteUfLocal;
    }

    public String getUltimonsu() {
        return this.ultimonsu;
    }

    public void setUltimonsu(String ultimonsu) {
        this.ultimonsu = ultimonsu;
    }

    public Character getAjustaCentavos() {
        return this.ajustaCentavos;
    }

    public void setAjustaCentavos(Character ajustaCentavos) {
        this.ajustaCentavos = ajustaCentavos;
    }

    public Character getTipoSaida() {
        return this.tipoSaida;
    }

    public void setTipoSaida(Character tipoSaida) {
        this.tipoSaida = tipoSaida;
    }

    public Character getRepoePerdasInd() {
        return this.repoePerdasInd;
    }

    public void setRepoePerdasInd(Character repoePerdasInd) {
        this.repoePerdasInd = repoePerdasInd;
    }

    public Character getSemValidacao() {
        return this.semValidacao;
    }

    public void setSemValidacao(Character semValidacao) {
        this.semValidacao = semValidacao;
    }

}
