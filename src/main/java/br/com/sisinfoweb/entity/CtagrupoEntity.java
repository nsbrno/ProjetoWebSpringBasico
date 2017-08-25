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
@Table(name = "CTAGRUPO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"COD_REDUZ"})})
public class CtagrupoEntity {

    @Column(name = "ID_CTAGRUPO", table = "CTAGRUPO", nullable = false)
    @Id
    private Integer idCtagrupo;

    @Column(name = "GUID", table = "CTAGRUPO", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CTAGRUPO", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CTAGRUPO")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CTAGRUPO")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CTAGRUPO")
    @Basic
    private Integer ctInteg;

    @Column(name = "COD_REDUZ", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int codReduz;

    @Column(name = "DESCRICAO", table = "CTAGRUPO", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "MASCARA", table = "CTAGRUPO", nullable = false, length = 26)
    @Basic(optional = false)
    private String mascara;

    @Column(name = "TAM_NIVEL1", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel1;

    @Column(name = "TAM_NIVEL2", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel2;

    @Column(name = "TAM_NIVEL3", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel3;

    @Column(name = "TAM_NIVEL4", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel4;

    @Column(name = "TAM_NIVEL5", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel5;

    @Column(name = "TAM_NIVEL6", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel6;

    @Column(name = "TAM_NIVEL7", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel7;

    @Column(name = "TAM_NIVEL8", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel8;

    @Column(name = "TAM_NIVEL9", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int tamNivel9;

    @Column(name = "ULT_NIVEL", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int ultNivel;

    @Column(name = "TOT_DIGITOS", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private int totDigitos;

    @Column(name = "CHEIO", table = "CTAGRUPO", nullable = false)
    @Basic(optional = false)
    private Character cheio;

    public Integer getIdCtagrupo() {
        return this.idCtagrupo;
    }

    public void setIdCtagrupo(Integer idCtagrupo) {
        this.idCtagrupo = idCtagrupo;
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

    public int getCodReduz() {
        return this.codReduz;
    }

    public void setCodReduz(int codReduz) {
        this.codReduz = codReduz;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMascara() {
        return this.mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public int getTamNivel1() {
        return this.tamNivel1;
    }

    public void setTamNivel1(int tamNivel1) {
        this.tamNivel1 = tamNivel1;
    }

    public int getTamNivel2() {
        return this.tamNivel2;
    }

    public void setTamNivel2(int tamNivel2) {
        this.tamNivel2 = tamNivel2;
    }

    public int getTamNivel3() {
        return this.tamNivel3;
    }

    public void setTamNivel3(int tamNivel3) {
        this.tamNivel3 = tamNivel3;
    }

    public int getTamNivel4() {
        return this.tamNivel4;
    }

    public void setTamNivel4(int tamNivel4) {
        this.tamNivel4 = tamNivel4;
    }

    public int getTamNivel5() {
        return this.tamNivel5;
    }

    public void setTamNivel5(int tamNivel5) {
        this.tamNivel5 = tamNivel5;
    }

    public int getTamNivel6() {
        return this.tamNivel6;
    }

    public void setTamNivel6(int tamNivel6) {
        this.tamNivel6 = tamNivel6;
    }

    public int getTamNivel7() {
        return this.tamNivel7;
    }

    public void setTamNivel7(int tamNivel7) {
        this.tamNivel7 = tamNivel7;
    }

    public int getTamNivel8() {
        return this.tamNivel8;
    }

    public void setTamNivel8(int tamNivel8) {
        this.tamNivel8 = tamNivel8;
    }

    public int getTamNivel9() {
        return this.tamNivel9;
    }

    public void setTamNivel9(int tamNivel9) {
        this.tamNivel9 = tamNivel9;
    }

    public int getUltNivel() {
        return this.ultNivel;
    }

    public void setUltNivel(int ultNivel) {
        this.ultNivel = ultNivel;
    }

    public int getTotDigitos() {
        return this.totDigitos;
    }

    public void setTotDigitos(int totDigitos) {
        this.totDigitos = totDigitos;
    }

    public Character getCheio() {
        return this.cheio;
    }

    public void setCheio(Character cheio) {
        this.cheio = cheio;
    }

}
