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

@Entity
@Table(name = "CPAPESOA")
public class CpapesoaEntity {

    @Column(name = "ID_CPAPESOA", table = "CPAPESOA", nullable = false)
    @Id
    private Integer idCpapesoa;

    @Column(name = "ID_CFAESTAD", table = "CPAPESOA")
    @Basic
    private Integer idCfaestad;

    @Column(name = "US_CAD", table = "CPAPESOA", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CPAPESOA")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CPAPESOA")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CPAPESOA")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "CPAPESOA", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "PESSOA", table = "CPAPESOA")
    @Basic
    private Character pessoa;

    @Column(name = "CPF_CGC", table = "CPAPESOA", length = 18)
    @Basic
    private String cpfCgc;

    @Column(name = "TIPO_DOC", table = "CPAPESOA")
    @Basic
    private Character tipoDoc;

    @Column(name = "DOCUMENTO", table = "CPAPESOA", length = 18)
    @Basic
    private String documento;

    @Column(name = "NOME_RAZAO", table = "CPAPESOA", nullable = false, length = 60)
    @Basic(optional = false)
    private String nomeRazao;

    @Column(name = "ENDERECO", table = "CPAPESOA", length = 128)
    @Basic
    private String endereco;

    @Column(name = "NUMERO", table = "CPAPESOA", length = 6)
    @Basic
    private String numero;

    @Column(name = "BAIRRO", table = "CPAPESOA", length = 40)
    @Basic
    private String bairro;

    @Column(name = "CIDADE", table = "CPAPESOA", length = 40)
    @Basic
    private String cidade;

    @Column(name = "CEP", table = "CPAPESOA", length = 9)
    @Basic
    private String cep;

    @Column(name = "FONE", table = "CPAPESOA", length = 10)
    @Basic
    private String fone;

    @Column(name = "FAX", table = "CPAPESOA", length = 10)
    @Basic
    private String fax;

    @Column(name = "EMAIL", table = "CPAPESOA", length = 128)
    @Basic
    private String email;

    @Column(name = "WEB", table = "CPAPESOA", length = 128)
    @Basic
    private String web;

    @Column(name = "CODIGO_COMPENSACAO", table = "CPAPESOA", nullable = false)
    @Basic(optional = false)
    private int codigoCompensacao;

    public Integer getIdCpapesoa() {
        return this.idCpapesoa;
    }

    public void setIdCpapesoa(Integer idCpapesoa) {
        this.idCpapesoa = idCpapesoa;
    }

    public Integer getIdCfaestad() {
        return this.idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Character getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Character pessoa) {
        this.pessoa = pessoa;
    }

    public String getCpfCgc() {
        return this.cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public Character getTipoDoc() {
        return this.tipoDoc;
    }

    public void setTipoDoc(Character tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNomeRazao() {
        return this.nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return this.web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getCodigoCompensacao() {
        return this.codigoCompensacao;
    }

    public void setCodigoCompensacao(int codigoCompensacao) {
        this.codigoCompensacao = codigoCompensacao;
    }

}
