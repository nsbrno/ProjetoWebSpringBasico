/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "APARECIB")
public class AparecibEntity {

    @Column(name = "ID_APARECIB", table = "APARECIB", nullable = false)
    @Id
    private Integer idAparecib;

    @Column(name = "US_CAD", table = "APARECIB", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "APARECIB")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "APARECIB")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "APARECIB")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "APARECIB", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "NUMERO_ENT", table = "APARECIB")
    @Basic
    private Integer numeroEnt;

    @Column(name = "NUMERO_SAI", table = "APARECIB")
    @Basic
    private Integer numeroSai;

    @Column(name = "DATA", table = "APARECIB")
    @Basic
        private String data;

    @Column(name = "VALOR", table = "APARECIB", nullable = false)
    @Basic(optional = false)
    private double valor;

    @Column(name = "PROVENIENTE", table = "APARECIB", length = 128)
    @Basic
    private String proveniente;

    @Column(name = "SACADO", table = "APARECIB", length = 60)
    @Basic
    private String sacado;

    @Column(name = "ENDERECO_SACADO", table = "APARECIB", length = 128)
    @Basic
    private String enderecoSacado;

    @Column(name = "CREDOR", table = "APARECIB", length = 60)
    @Basic
    private String credor;

    @Column(name = "ENDERECO_CREDOR", table = "APARECIB", length = 128)
    @Basic
    private String enderecoCredor;

    @Column(name = "CPF_CNPJ_CREDOR", table = "APARECIB", length = 18)
    @Basic
    private String cpfCnpjCredor;

    @Column(name = "RG_IE_CREDOR", table = "APARECIB", length = 18)
    @Basic
    private String rgIeCredor;

    @Column(name = "MENSAGEM", table = "APARECIB", length = 128)
    @Basic
    private String mensagem;

    @Column(name = "ORIGEM", table = "APARECIB")
    @Lob
    @Basic
    private byte[] origem;

    @Column(name = "NUM_EMISSOES", table = "APARECIB", nullable = false)
    @Basic(optional = false)
    private int numEmissoes;

    @Column(name = "DT_CANCELAMENTO", table = "APARECIB")
    @Basic
        private String dtCancelamento;

    public Integer getIdAparecib() {
        return this.idAparecib;
    }

    public void setIdAparecib(Integer idAparecib) {
        this.idAparecib = idAparecib;
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

    public Integer getNumeroEnt() {
        return this.numeroEnt;
    }

    public void setNumeroEnt(Integer numeroEnt) {
        this.numeroEnt = numeroEnt;
    }

    public Integer getNumeroSai() {
        return this.numeroSai;
    }

    public void setNumeroSai(Integer numeroSai) {
        this.numeroSai = numeroSai;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProveniente() {
        return this.proveniente;
    }

    public void setProveniente(String proveniente) {
        this.proveniente = proveniente;
    }

    public String getSacado() {
        return this.sacado;
    }

    public void setSacado(String sacado) {
        this.sacado = sacado;
    }

    public String getEnderecoSacado() {
        return this.enderecoSacado;
    }

    public void setEnderecoSacado(String enderecoSacado) {
        this.enderecoSacado = enderecoSacado;
    }

    public String getCredor() {
        return this.credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getEnderecoCredor() {
        return this.enderecoCredor;
    }

    public void setEnderecoCredor(String enderecoCredor) {
        this.enderecoCredor = enderecoCredor;
    }

    public String getCpfCnpjCredor() {
        return this.cpfCnpjCredor;
    }

    public void setCpfCnpjCredor(String cpfCnpjCredor) {
        this.cpfCnpjCredor = cpfCnpjCredor;
    }

    public String getRgIeCredor() {
        return this.rgIeCredor;
    }

    public void setRgIeCredor(String rgIeCredor) {
        this.rgIeCredor = rgIeCredor;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public byte[] getOrigem() {
        return this.origem;
    }

    public void setOrigem(byte[] origem) {
        this.origem = origem;
    }

    public int getNumEmissoes() {
        return this.numEmissoes;
    }

    public void setNumEmissoes(int numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public String getDtCancelamento() {
        return this.dtCancelamento;
    }

    public void setDtCancelamento(String dtCancelamento) {
        this.dtCancelamento = dtCancelamento;
    }

}
