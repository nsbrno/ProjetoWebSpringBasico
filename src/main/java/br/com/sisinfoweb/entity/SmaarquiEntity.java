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
@Table(name = "SMAARQUI", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ARQUIVO"})})
public class SmaarquiEntity {

    @Column(name = "ID_SMAARQUI", table = "SMAARQUI", nullable = false)
    @Id
    private Integer idSmaarqui;

    @Column(name = "ID_SMADEPTO", table = "SMAARQUI")
    @Basic
    private Integer idSmadepto;

    @Column(name = "ID_SMAMODUL", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private int idSmamodul;

    @Column(name = "ID_SMAGRUPO", table = "SMAARQUI")
    @Basic
    private Integer idSmagrupo;

    @Column(name = "GUID", table = "SMAARQUI", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "SMAARQUI", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "SMAARQUI")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "SMAARQUI")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "SMAARQUI")
    @Basic
    private Integer ctInteg;

    @Column(name = "ARQUIVO", table = "SMAARQUI", nullable = false, length = 12)
    @Basic(optional = false)
    private String arquivo;

    @Column(name = "DESCRICAO", table = "SMAARQUI", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "TIPO", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "LOG_ALTERACAO", table = "SMAARQUI")
    @Basic
    private Character logAlteracao;

    @Column(name = "LOG_EXCLUSAO", table = "SMAARQUI")
    @Basic
    private Character logExclusao;

    @Column(name = "LOG_IMPRESSAO", table = "SMAARQUI")
    @Basic
    private Character logImpressao;

    @Column(name = "SALVA_TELA", table = "SMAARQUI")
    @Basic
    private Character salvaTela;

    @Column(name = "SALVA_ID_EXCLUIDO", table = "SMAARQUI")
    @Basic
    private Character salvaIdExcluido;

    @Column(name = "ACESSA_COM_SENHA", table = "SMAARQUI")
    @Basic
    private Character acessaComSenha;

    @Column(name = "COMANDO_IMPRESSAO", table = "SMAARQUI", length = 40)
    @Basic
    private String comandoImpressao;

    @Column(name = "PATH_IMPRESSAO", table = "SMAARQUI", length = 128)
    @Basic
    private String pathImpressao;

    @Column(name = "USUARIO_CONFIGURA", table = "SMAARQUI")
    @Basic
    private Character usuarioConfigura;

    @Column(name = "COPIAS", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private int copias;

    @Column(name = "PEDE_SAIDA", table = "SMAARQUI")
    @Basic
    private Character pedeSaida;

    @Column(name = "PATH_LOGOMARCA", table = "SMAARQUI", length = 128)
    @Basic
    private String pathLogomarca;

    @Column(name = "IMPRIME_SELECAO", table = "SMAARQUI")
    @Basic
    private Character imprimeSelecao;

    @Column(name = "IMPRIME_LOGOMARCA", table = "SMAARQUI")
    @Basic
    private Character imprimeLogomarca;

    @Column(name = "MARGEM_SUPERIOR", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private double margemSuperior;

    @Column(name = "MARGEM_INFERIOR", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private double margemInferior;

    @Column(name = "MARGEM_ESQUERDA", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private double margemEsquerda;

    @Column(name = "MARGEM_DIREITA", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private double margemDireita;

    @Column(name = "ALTURA_PAPEL", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private double alturaPapel;

    @Column(name = "LARGURA_PAPEL", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private double larguraPapel;

    @Column(name = "SERVIDOR", table = "SMAARQUI", length = 40)
    @Basic
    private String servidor;

    @Column(name = "IMPRESSORA", table = "SMAARQUI", length = 128)
    @Basic
    private String impressora;

    @Column(name = "IMPRIME_MATRICIAL", table = "SMAARQUI")
    @Basic
    private Character imprimeMatricial;

    @Column(name = "OBS", table = "SMAARQUI")
    @Lob
    @Basic
    private byte[] obs;

    @Column(name = "ORIENTACAO", table = "SMAARQUI")
    @Basic
    private Character orientacao;

    @Column(name = "FONTE_RELAT_NOME", table = "SMAARQUI", length = 20)
    @Basic
    private String fonteRelatNome;

    @Column(name = "FONTE_RELAT_SIZE", table = "SMAARQUI", nullable = false)
    @Basic(optional = false)
    private int fonteRelatSize;

    @Column(name = "ESCOLHE_RELATORIO", table = "SMAARQUI")
    @Basic
    private Character escolheRelatorio;

    @Column(name = "NAO_AJUSTA_FONTE", table = "SMAARQUI")
    @Basic
    private Character naoAjustaFonte;

    @Column(name = "NAO_AJUSTA_SIZE", table = "SMAARQUI")
    @Basic
    private Character naoAjustaSize;

    @Column(name = "NAO_AJUSTA_ALTURA", table = "SMAARQUI")
    @Basic
    private Character naoAjustaAltura;

    @Column(name = "REPLICA", table = "SMAARQUI")
    @Basic
    private Character replica;

    public Integer getIdSmaarqui() {
        return this.idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
    }

    public Integer getIdSmadepto() {
        return this.idSmadepto;
    }

    public void setIdSmadepto(Integer idSmadepto) {
        this.idSmadepto = idSmadepto;
    }

    public int getIdSmamodul() {
        return this.idSmamodul;
    }

    public void setIdSmamodul(int idSmamodul) {
        this.idSmamodul = idSmamodul;
    }

    public Integer getIdSmagrupo() {
        return this.idSmagrupo;
    }

    public void setIdSmagrupo(Integer idSmagrupo) {
        this.idSmagrupo = idSmagrupo;
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

    public String getArquivo() {
        return this.arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Character getLogAlteracao() {
        return this.logAlteracao;
    }

    public void setLogAlteracao(Character logAlteracao) {
        this.logAlteracao = logAlteracao;
    }

    public Character getLogExclusao() {
        return this.logExclusao;
    }

    public void setLogExclusao(Character logExclusao) {
        this.logExclusao = logExclusao;
    }

    public Character getLogImpressao() {
        return this.logImpressao;
    }

    public void setLogImpressao(Character logImpressao) {
        this.logImpressao = logImpressao;
    }

    public Character getSalvaTela() {
        return this.salvaTela;
    }

    public void setSalvaTela(Character salvaTela) {
        this.salvaTela = salvaTela;
    }

    public Character getSalvaIdExcluido() {
        return this.salvaIdExcluido;
    }

    public void setSalvaIdExcluido(Character salvaIdExcluido) {
        this.salvaIdExcluido = salvaIdExcluido;
    }

    public Character getAcessaComSenha() {
        return this.acessaComSenha;
    }

    public void setAcessaComSenha(Character acessaComSenha) {
        this.acessaComSenha = acessaComSenha;
    }

    public String getComandoImpressao() {
        return this.comandoImpressao;
    }

    public void setComandoImpressao(String comandoImpressao) {
        this.comandoImpressao = comandoImpressao;
    }

    public String getPathImpressao() {
        return this.pathImpressao;
    }

    public void setPathImpressao(String pathImpressao) {
        this.pathImpressao = pathImpressao;
    }

    public Character getUsuarioConfigura() {
        return this.usuarioConfigura;
    }

    public void setUsuarioConfigura(Character usuarioConfigura) {
        this.usuarioConfigura = usuarioConfigura;
    }

    public int getCopias() {
        return this.copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public Character getPedeSaida() {
        return this.pedeSaida;
    }

    public void setPedeSaida(Character pedeSaida) {
        this.pedeSaida = pedeSaida;
    }

    public String getPathLogomarca() {
        return this.pathLogomarca;
    }

    public void setPathLogomarca(String pathLogomarca) {
        this.pathLogomarca = pathLogomarca;
    }

    public Character getImprimeSelecao() {
        return this.imprimeSelecao;
    }

    public void setImprimeSelecao(Character imprimeSelecao) {
        this.imprimeSelecao = imprimeSelecao;
    }

    public Character getImprimeLogomarca() {
        return this.imprimeLogomarca;
    }

    public void setImprimeLogomarca(Character imprimeLogomarca) {
        this.imprimeLogomarca = imprimeLogomarca;
    }

    public double getMargemSuperior() {
        return this.margemSuperior;
    }

    public void setMargemSuperior(double margemSuperior) {
        this.margemSuperior = margemSuperior;
    }

    public double getMargemInferior() {
        return this.margemInferior;
    }

    public void setMargemInferior(double margemInferior) {
        this.margemInferior = margemInferior;
    }

    public double getMargemEsquerda() {
        return this.margemEsquerda;
    }

    public void setMargemEsquerda(double margemEsquerda) {
        this.margemEsquerda = margemEsquerda;
    }

    public double getMargemDireita() {
        return this.margemDireita;
    }

    public void setMargemDireita(double margemDireita) {
        this.margemDireita = margemDireita;
    }

    public double getAlturaPapel() {
        return this.alturaPapel;
    }

    public void setAlturaPapel(double alturaPapel) {
        this.alturaPapel = alturaPapel;
    }

    public double getLarguraPapel() {
        return this.larguraPapel;
    }

    public void setLarguraPapel(double larguraPapel) {
        this.larguraPapel = larguraPapel;
    }

    public String getServidor() {
        return this.servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getImpressora() {
        return this.impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public Character getImprimeMatricial() {
        return this.imprimeMatricial;
    }

    public void setImprimeMatricial(Character imprimeMatricial) {
        this.imprimeMatricial = imprimeMatricial;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public Character getOrientacao() {
        return this.orientacao;
    }

    public void setOrientacao(Character orientacao) {
        this.orientacao = orientacao;
    }

    public String getFonteRelatNome() {
        return this.fonteRelatNome;
    }

    public void setFonteRelatNome(String fonteRelatNome) {
        this.fonteRelatNome = fonteRelatNome;
    }

    public int getFonteRelatSize() {
        return this.fonteRelatSize;
    }

    public void setFonteRelatSize(int fonteRelatSize) {
        this.fonteRelatSize = fonteRelatSize;
    }

    public Character getEscolheRelatorio() {
        return this.escolheRelatorio;
    }

    public void setEscolheRelatorio(Character escolheRelatorio) {
        this.escolheRelatorio = escolheRelatorio;
    }

    public Character getNaoAjustaFonte() {
        return this.naoAjustaFonte;
    }

    public void setNaoAjustaFonte(Character naoAjustaFonte) {
        this.naoAjustaFonte = naoAjustaFonte;
    }

    public Character getNaoAjustaSize() {
        return this.naoAjustaSize;
    }

    public void setNaoAjustaSize(Character naoAjustaSize) {
        this.naoAjustaSize = naoAjustaSize;
    }

    public Character getNaoAjustaAltura() {
        return this.naoAjustaAltura;
    }

    public void setNaoAjustaAltura(Character naoAjustaAltura) {
        this.naoAjustaAltura = naoAjustaAltura;
    }

    public Character getReplica() {
        return this.replica;
    }

    public void setReplica(Character replica) {
        this.replica = replica;
    }

}
