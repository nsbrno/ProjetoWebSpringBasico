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
@Table(name = "RPATMP01", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CHAVE_ID", "ID_CFATPDOC", "DIAS"})})
public class Rpatmp01Entity {

    @Column(name = "ID_RPATMP01", table = "RPATMP01", nullable = false)
    @Id
    private Integer idRpatmp01;

    @Column(name = "ID_CFATPDOC", table = "RPATMP01", nullable = false)
    @Basic(optional = false)
    private int idCfatpdoc;

    @Column(name = "CHAVE_ID", table = "RPATMP01", nullable = false)
    @Basic(optional = false)
    private int chaveId;

    @Column(name = "ID_AUX1", table = "RPATMP01")
    @Basic
    private Integer idAux1;

    @Column(name = "DIAS", table = "RPATMP01", nullable = false)
    @Basic(optional = false)
    private int dias;

    @Column(name = "VALOR", table = "RPATMP01", nullable = false)
    @Basic(optional = false)
    private double valor;

    @Column(name = "DATA", table = "RPATMP01")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "VALOR1", table = "RPATMP01", nullable = false)
    @Basic(optional = false)
    private double valor1;

    @Column(name = "ID_AUX2", table = "RPATMP01")
    @Basic
    private Integer idAux2;

    @Column(name = "ID_AUX3", table = "RPATMP01")
    @Basic
    private Integer idAux3;

    @Column(name = "ID_AUX4", table = "RPATMP01")
    @Basic
    private Integer idAux4;

    public Integer getIdRpatmp01() {
        return this.idRpatmp01;
    }

    public void setIdRpatmp01(Integer idRpatmp01) {
        this.idRpatmp01 = idRpatmp01;
    }

    public int getIdCfatpdoc() {
        return this.idCfatpdoc;
    }

    public void setIdCfatpdoc(int idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public int getChaveId() {
        return this.chaveId;
    }

    public void setChaveId(int chaveId) {
        this.chaveId = chaveId;
    }

    public Integer getIdAux1() {
        return this.idAux1;
    }

    public void setIdAux1(Integer idAux1) {
        this.idAux1 = idAux1;
    }

    public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor1() {
        return this.valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public Integer getIdAux2() {
        return this.idAux2;
    }

    public void setIdAux2(Integer idAux2) {
        this.idAux2 = idAux2;
    }

    public Integer getIdAux3() {
        return this.idAux3;
    }

    public void setIdAux3(Integer idAux3) {
        this.idAux3 = idAux3;
    }

    public Integer getIdAux4() {
        return this.idAux4;
    }

    public void setIdAux4(Integer idAux4) {
        this.idAux4 = idAux4;
    }

}
