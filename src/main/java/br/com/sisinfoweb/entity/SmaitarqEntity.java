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
@Table(name = "SMAITARQ", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAARQUI", "CAMPO"})})
public class SmaitarqEntity {

    @Column(name = "ID_SMAITARQ", table = "SMAITARQ", nullable = false)
    @Id
    private Integer idSmaitarq;

    @Column(name = "ID_SMAARQUI", table = "SMAITARQ", nullable = false)
    @Basic(optional = false)
    private int idSmaarqui;

    @Column(name = "GUID", table = "SMAITARQ", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "SMAITARQ", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "SMAITARQ")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "SMAITARQ")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "SMAITARQ")
    @Basic
    private Integer ctInteg;

    @Column(name = "CAMPO", table = "SMAITARQ", nullable = false, length = 40)
    @Basic(optional = false)
    private String campo;

    @Column(name = "INDICE", table = "SMAITARQ")
    @Lob
    @Basic
    private byte[] indice;

    @Column(name = "DATATYPE", table = "SMAITARQ", length = 2)
    @Basic
    private String datatype;

    @Column(name = "AUTOFIND", table = "SMAITARQ")
    @Basic
    private Character autofind;

    @Column(name = "CAPSLOCK", table = "SMAITARQ")
    @Basic
    private Character capslock;

    @Column(name = "REQUERIDO", table = "SMAITARQ")
    @Basic
    private Character requerido;

    @Column(name = "TAMANHO", table = "SMAITARQ", nullable = false)
    @Basic(optional = false)
    private int tamanho;

    @Column(name = "DECIMAIS", table = "SMAITARQ", nullable = false)
    @Basic(optional = false)
    private int decimais;

    @Column(name = "MSGERRO", table = "SMAITARQ")
    @Lob
    @Basic
    private byte[] msgerro;

    @Column(name = "MSGEXPLICATIVA", table = "SMAITARQ")
    @Lob
    @Basic
    private byte[] msgexplicativa;

    @Column(name = "VALORDEFAULT", table = "SMAITARQ")
    @Lob
    @Basic
    private byte[] valordefault;

    @Column(name = "OPCAOTELA", table = "SMAITARQ")
    @Lob
    @Basic
    private byte[] opcaotela;

    @Column(name = "OPCAOBASE", table = "SMAITARQ")
    @Lob
    @Basic
    private byte[] opcaobase;

    @Column(name = "FOUNDREQUERIDO", table = "SMAITARQ")
    @Basic
    private Character foundrequerido;

    @Column(name = "NOMECAMPO", table = "SMAITARQ")
    @Lob
    @Basic
    private byte[] nomecampo;

    @Column(name = "MASCARA", table = "SMAITARQ")
    @Basic
    private String mascara;

    @Column(name = "INDICENATIVO", table = "SMAITARQ")
    @Basic
    private Character indicenativo;

    public Integer getIdSmaitarq() {
        return this.idSmaitarq;
    }

    public void setIdSmaitarq(Integer idSmaitarq) {
        this.idSmaitarq = idSmaitarq;
    }

    public int getIdSmaarqui() {
        return this.idSmaarqui;
    }

    public void setIdSmaarqui(int idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
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

    public String getCampo() {
        return this.campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public byte[] getIndice() {
        return this.indice;
    }

    public void setIndice(byte[] indice) {
        this.indice = indice;
    }

    public String getDatatype() {
        return this.datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public Character getAutofind() {
        return this.autofind;
    }

    public void setAutofind(Character autofind) {
        this.autofind = autofind;
    }

    public Character getCapslock() {
        return this.capslock;
    }

    public void setCapslock(Character capslock) {
        this.capslock = capslock;
    }

    public Character getRequerido() {
        return this.requerido;
    }

    public void setRequerido(Character requerido) {
        this.requerido = requerido;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getDecimais() {
        return this.decimais;
    }

    public void setDecimais(int decimais) {
        this.decimais = decimais;
    }

    public byte[] getMsgerro() {
        return this.msgerro;
    }

    public void setMsgerro(byte[] msgerro) {
        this.msgerro = msgerro;
    }

    public byte[] getMsgexplicativa() {
        return this.msgexplicativa;
    }

    public void setMsgexplicativa(byte[] msgexplicativa) {
        this.msgexplicativa = msgexplicativa;
    }

    public byte[] getValordefault() {
        return this.valordefault;
    }

    public void setValordefault(byte[] valordefault) {
        this.valordefault = valordefault;
    }

    public byte[] getOpcaotela() {
        return this.opcaotela;
    }

    public void setOpcaotela(byte[] opcaotela) {
        this.opcaotela = opcaotela;
    }

    public byte[] getOpcaobase() {
        return this.opcaobase;
    }

    public void setOpcaobase(byte[] opcaobase) {
        this.opcaobase = opcaobase;
    }

    public Character getFoundrequerido() {
        return this.foundrequerido;
    }

    public void setFoundrequerido(Character foundrequerido) {
        this.foundrequerido = foundrequerido;
    }

    public byte[] getNomecampo() {
        return this.nomecampo;
    }

    public void setNomecampo(byte[] nomecampo) {
        this.nomecampo = nomecampo;
    }

    public String getMascara() {
        return this.mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Character getIndicenativo() {
        return this.indicenativo;
    }

    public void setIndicenativo(Character indicenativo) {
        this.indicenativo = indicenativo;
    }

}
