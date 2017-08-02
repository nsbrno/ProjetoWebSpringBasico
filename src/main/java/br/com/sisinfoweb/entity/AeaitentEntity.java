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
@Table(name = "AEAITENT", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEAENTRA", "SEQUENCIA"})})
public class AeaitentEntity {

    @Column(name = "ID_AEAITENT", table = "AEAITENT", nullable = false)
    @Id
    private Integer idAeaitent;

    @Column(name = "ID_AEAENTRA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private int idAeaentra;

    @Column(name = "ID_AEAUNVEN", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private int idAeaunven;

    @Column(name = "ID_AEAESTOQ", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private int idAeaestoq;

    @Column(name = "ID_AEAITNFS", table = "AEAITENT")
    @Basic
    private Integer idAeaitnfs;

    @Column(name = "ID_AEAITSAI", table = "AEAITENT")
    @Basic
    private Integer idAeaitsai;

    @Column(name = "ID_CFANATOP", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private int idCfanatop;

    @Column(name = "ID_AEAITPED", table = "AEAITENT")
    @Basic
    private Integer idAeaitped;

    @Column(name = "ID_AEACODOM", table = "AEAITENT")
    @Basic
    private Integer idAeacodom;

    @Column(name = "ID_AEACODST", table = "AEAITENT")
    @Basic
    private Integer idAeacodst;

    @Column(name = "ID_AEACODST_IPI", table = "AEAITENT")
    @Basic
    private Integer idAeacodstIpi;

    @Column(name = "ID_AEACODST_PIS", table = "AEAITENT")
    @Basic
    private Integer idAeacodstPis;

    @Column(name = "ID_AEACODST_COFINS", table = "AEAITENT")
    @Basic
    private Integer idAeacodstCofins;

    @Column(name = "GUID", table = "AEAITENT", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAITENT", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAITENT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEAITENT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEAITENT")
    @Basic
    private Integer ctInteg;

    @Column(name = "DT_ENTRADA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;

    @Column(name = "SEQUENCIA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private int sequencia;

    @Column(name = "QUANTIDADE", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double quantidade;

    @Column(name = "QTDE_DAT_VAL", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double qtdeDatVal;

    @Column(name = "QTDE_CONFERIDO", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double qtdeConferido;

    @Column(name = "VL_MERCADORIA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlMercadoria;

    @Column(name = "VL_DESCONTO", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlDesconto;

    @Column(name = "VL_FRETE", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlFrete;

    @Column(name = "VL_SEGURO", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlSeguro;

    @Column(name = "VL_OUTROS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlOutros;

    @Column(name = "VL_BASE_ICMS_FRETE", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseIcmsFrete;

    @Column(name = "VL_BASE_ICMS_MERC", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseIcmsMerc;

    @Column(name = "VL_BASE_ICMS_SUBST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseIcmsSubst;

    @Column(name = "VL_BASE_IPI", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseIpi;

    @Column(name = "VL_BASE_PIS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBasePis;

    @Column(name = "VL_BASE_PIS_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBasePisSt;

    @Column(name = "VL_BASE_COFINS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseCofins;

    @Column(name = "VL_BASE_COFINS_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseCofinsSt;

    @Column(name = "VL_BASE_ST_RET", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseStRet;

    @Column(name = "VL_BASE_ST_DEST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseStDest;

    @Column(name = "VL_BASE_II", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseIi;

    @Column(name = "VL_ICMS_FRETE", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsFrete;

    @Column(name = "VL_ICMS_MERC", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsMerc;

    @Column(name = "VL_ICMS_SUBST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsSubst;

    @Column(name = "VL_ICMS_ST_RET", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsStRet;

    @Column(name = "VL_ICMS_ST_DEST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsStDest;

    @Column(name = "VL_CRED_ICMS_SN", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlCredIcmsSn;

    @Column(name = "VL_IPI", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIpi;

    @Column(name = "VL_IPI_EXTRA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIpiExtra;

    @Column(name = "VL_FRETE_EXTRA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlFreteExtra;

    @Column(name = "VL_ICMS_EXTRA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsExtra;

    @Column(name = "VL_ISENTO_ICMS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIsentoIcms;

    @Column(name = "VL_ISENTO_IPI", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIsentoIpi;

    @Column(name = "VL_PIS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlPis;

    @Column(name = "VL_PIS_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlPisSt;

    @Column(name = "VL_COFINS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlCofins;

    @Column(name = "VL_COFINS_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlCofinsSt;

    @Column(name = "VL_SUFRAMA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlSuframa;

    @Column(name = "VL_II", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIi;

    @Column(name = "VL_IOF_II", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIofIi;

    @Column(name = "VL_DESP_ADU_II", table = "AEAITENT")
    @Basic
    private Integer vlDespAduIi;

    @Column(name = "JUROS_DESCONTO", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double jurosDesconto;

    @Column(name = "P_RED_BC_ICMS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double pRedBcIcms;

    @Column(name = "P_RED_BC_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double pRedBcSt;

    @Column(name = "ALIQUOTA_ICMS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaIcms;

    @Column(name = "ALIQUOTA_IPI", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaIpi;

    @Column(name = "ALIQUOTA_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaSt;

    @Column(name = "ALIQUOTA_PIS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaPis;

    @Column(name = "ALIQUOTA_COFINS", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaCofins;

    @Column(name = "ALIQUOTA_PIS_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaPisSt;

    @Column(name = "ALIQUOTA_COFINS_ST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaCofinsSt;

    @Column(name = "ALIQUOTA_BCOP", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaBcop;

    @Column(name = "ALIQUOTA_CRED_SN", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaCredSn;

    @Column(name = "ALIQUOTA_MVAST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaMvast;

    @Column(name = "ALIQUOTA_FCP_UF_DEST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaFcpUfDest;

    @Column(name = "ALIQUOTA_ICMS_UF_DEST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaIcmsUfDest;

    @Column(name = "ALIQUOTA_ICMS_INTER", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaIcmsInter;

    @Column(name = "ALIQUOTA_ICMS_INTER_PART", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaIcmsInterPart;

    @Column(name = "ALIQUOTA_FCP", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double aliquotaFcp;

    @Column(name = "TIPO", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "TIPO_PRODUTO", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private Character tipoProduto;

    @Column(name = "TIPO_BAIXA", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private Character tipoBaixa;

    @Column(name = "OBS", table = "AEAITENT")
    @Lob
    @Basic
    private byte[] obs;

    @Column(name = "MODALIDADE", table = "AEAITENT")
    @Basic
    private Character modalidade;

    @Column(name = "MODALIDADE_ST", table = "AEAITENT")
    @Basic
    private Character modalidadeSt;

    @Column(name = "MOTDESICMS", table = "AEAITENT")
    @Basic
    private Character motdesicms;

    @Column(name = "NAT_BC_CRED", table = "AEAITENT", length = 2)
    @Basic
    private String natBcCred;

    @Column(name = "CSOSN", table = "AEAITENT", length = 3)
    @Basic
    private String csosn;

    @Column(name = "FC_MERCADORIA_UN", table = "AEAITENT", precision = 15)
    @Basic
    private Double fcMercadoriaUn;

    @Column(name = "FC_DESCONTO_UN", table = "AEAITENT", precision = 15)
    @Basic
    private Double fcDescontoUn;

    @Column(name = "FC_CT_REP", table = "AEAITENT", precision = 15)
    @Basic
    private Double fcCtRep;

    @Column(name = "FC_CT_REP_D", table = "AEAITENT", precision = 15)
    @Basic
    private Double fcCtRepD;

    @Column(name = "FC_CT_REAL", table = "AEAITENT", precision = 15)
    @Basic
    private Double fcCtReal;

    @Column(name = "FC_CT_COMP", table = "AEAITENT", precision = 15)
    @Basic
    private Double fcCtComp;

    @Column(name = "FC_CT_REAL_D", table = "AEAITENT", precision = 15)
    @Basic
    private Double fcCtRealD;

    @Column(name = "VL_TOT_TRIB", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlTotTrib;

    @Column(name = "VL_BASE_ICMS_UF_DEST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlBaseIcmsUfDest;

    @Column(name = "VL_FCP_UF_DEST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlFcpUfDest;

    @Column(name = "VL_ICMS_UF_DEST", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsUfDest;

    @Column(name = "VL_ICMS_UF_REMET", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsUfRemet;

    @Column(name = "VL_FCP", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlFcp;

    @Column(name = "VL_ICMS_DESON", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIcmsDeson;

    @Column(name = "VL_IPI_DESON", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlIpiDeson;

    @Column(name = "VL_PIS_DESON", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlPisDeson;

    @Column(name = "VL_COFINS_DESON", table = "AEAITENT", nullable = false)
    @Basic(optional = false)
    private double vlCofinsDeson;

    public Integer getIdAeaitent() {
        return this.idAeaitent;
    }

    public void setIdAeaitent(Integer idAeaitent) {
        this.idAeaitent = idAeaitent;
    }

    public int getIdAeaentra() {
        return this.idAeaentra;
    }

    public void setIdAeaentra(int idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public int getIdAeaunven() {
        return this.idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public int getIdAeaestoq() {
        return this.idAeaestoq;
    }

    public void setIdAeaestoq(int idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public Integer getIdAeaitnfs() {
        return this.idAeaitnfs;
    }

    public void setIdAeaitnfs(Integer idAeaitnfs) {
        this.idAeaitnfs = idAeaitnfs;
    }

    public Integer getIdAeaitsai() {
        return this.idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public int getIdCfanatop() {
        return this.idCfanatop;
    }

    public void setIdCfanatop(int idCfanatop) {
        this.idCfanatop = idCfanatop;
    }

    public Integer getIdAeaitped() {
        return this.idAeaitped;
    }

    public void setIdAeaitped(Integer idAeaitped) {
        this.idAeaitped = idAeaitped;
    }

    public Integer getIdAeacodom() {
        return this.idAeacodom;
    }

    public void setIdAeacodom(Integer idAeacodom) {
        this.idAeacodom = idAeacodom;
    }

    public Integer getIdAeacodst() {
        return this.idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdAeacodstIpi() {
        return this.idAeacodstIpi;
    }

    public void setIdAeacodstIpi(Integer idAeacodstIpi) {
        this.idAeacodstIpi = idAeacodstIpi;
    }

    public Integer getIdAeacodstPis() {
        return this.idAeacodstPis;
    }

    public void setIdAeacodstPis(Integer idAeacodstPis) {
        this.idAeacodstPis = idAeacodstPis;
    }

    public Integer getIdAeacodstCofins() {
        return this.idAeacodstCofins;
    }

    public void setIdAeacodstCofins(Integer idAeacodstCofins) {
        this.idAeacodstCofins = idAeacodstCofins;
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

    public Date getDtEntrada() {
        return this.dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public int getSequencia() {
        return this.sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeDatVal() {
        return this.qtdeDatVal;
    }

    public void setQtdeDatVal(double qtdeDatVal) {
        this.qtdeDatVal = qtdeDatVal;
    }

    public double getQtdeConferido() {
        return this.qtdeConferido;
    }

    public void setQtdeConferido(double qtdeConferido) {
        this.qtdeConferido = qtdeConferido;
    }

    public double getVlMercadoria() {
        return this.vlMercadoria;
    }

    public void setVlMercadoria(double vlMercadoria) {
        this.vlMercadoria = vlMercadoria;
    }

    public double getVlDesconto() {
        return this.vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
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

    public double getVlBaseIcmsFrete() {
        return this.vlBaseIcmsFrete;
    }

    public void setVlBaseIcmsFrete(double vlBaseIcmsFrete) {
        this.vlBaseIcmsFrete = vlBaseIcmsFrete;
    }

    public double getVlBaseIcmsMerc() {
        return this.vlBaseIcmsMerc;
    }

    public void setVlBaseIcmsMerc(double vlBaseIcmsMerc) {
        this.vlBaseIcmsMerc = vlBaseIcmsMerc;
    }

    public double getVlBaseIcmsSubst() {
        return this.vlBaseIcmsSubst;
    }

    public void setVlBaseIcmsSubst(double vlBaseIcmsSubst) {
        this.vlBaseIcmsSubst = vlBaseIcmsSubst;
    }

    public double getVlBaseIpi() {
        return this.vlBaseIpi;
    }

    public void setVlBaseIpi(double vlBaseIpi) {
        this.vlBaseIpi = vlBaseIpi;
    }

    public double getVlBasePis() {
        return this.vlBasePis;
    }

    public void setVlBasePis(double vlBasePis) {
        this.vlBasePis = vlBasePis;
    }

    public double getVlBasePisSt() {
        return this.vlBasePisSt;
    }

    public void setVlBasePisSt(double vlBasePisSt) {
        this.vlBasePisSt = vlBasePisSt;
    }

    public double getVlBaseCofins() {
        return this.vlBaseCofins;
    }

    public void setVlBaseCofins(double vlBaseCofins) {
        this.vlBaseCofins = vlBaseCofins;
    }

    public double getVlBaseCofinsSt() {
        return this.vlBaseCofinsSt;
    }

    public void setVlBaseCofinsSt(double vlBaseCofinsSt) {
        this.vlBaseCofinsSt = vlBaseCofinsSt;
    }

    public double getVlBaseStRet() {
        return this.vlBaseStRet;
    }

    public void setVlBaseStRet(double vlBaseStRet) {
        this.vlBaseStRet = vlBaseStRet;
    }

    public double getVlBaseStDest() {
        return this.vlBaseStDest;
    }

    public void setVlBaseStDest(double vlBaseStDest) {
        this.vlBaseStDest = vlBaseStDest;
    }

    public double getVlBaseIi() {
        return this.vlBaseIi;
    }

    public void setVlBaseIi(double vlBaseIi) {
        this.vlBaseIi = vlBaseIi;
    }

    public double getVlIcmsFrete() {
        return this.vlIcmsFrete;
    }

    public void setVlIcmsFrete(double vlIcmsFrete) {
        this.vlIcmsFrete = vlIcmsFrete;
    }

    public double getVlIcmsMerc() {
        return this.vlIcmsMerc;
    }

    public void setVlIcmsMerc(double vlIcmsMerc) {
        this.vlIcmsMerc = vlIcmsMerc;
    }

    public double getVlIcmsSubst() {
        return this.vlIcmsSubst;
    }

    public void setVlIcmsSubst(double vlIcmsSubst) {
        this.vlIcmsSubst = vlIcmsSubst;
    }

    public double getVlIcmsStRet() {
        return this.vlIcmsStRet;
    }

    public void setVlIcmsStRet(double vlIcmsStRet) {
        this.vlIcmsStRet = vlIcmsStRet;
    }

    public double getVlIcmsStDest() {
        return this.vlIcmsStDest;
    }

    public void setVlIcmsStDest(double vlIcmsStDest) {
        this.vlIcmsStDest = vlIcmsStDest;
    }

    public double getVlCredIcmsSn() {
        return this.vlCredIcmsSn;
    }

    public void setVlCredIcmsSn(double vlCredIcmsSn) {
        this.vlCredIcmsSn = vlCredIcmsSn;
    }

    public double getVlIpi() {
        return this.vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlIpiExtra() {
        return this.vlIpiExtra;
    }

    public void setVlIpiExtra(double vlIpiExtra) {
        this.vlIpiExtra = vlIpiExtra;
    }

    public double getVlFreteExtra() {
        return this.vlFreteExtra;
    }

    public void setVlFreteExtra(double vlFreteExtra) {
        this.vlFreteExtra = vlFreteExtra;
    }

    public double getVlIcmsExtra() {
        return this.vlIcmsExtra;
    }

    public void setVlIcmsExtra(double vlIcmsExtra) {
        this.vlIcmsExtra = vlIcmsExtra;
    }

    public double getVlIsentoIcms() {
        return this.vlIsentoIcms;
    }

    public void setVlIsentoIcms(double vlIsentoIcms) {
        this.vlIsentoIcms = vlIsentoIcms;
    }

    public double getVlIsentoIpi() {
        return this.vlIsentoIpi;
    }

    public void setVlIsentoIpi(double vlIsentoIpi) {
        this.vlIsentoIpi = vlIsentoIpi;
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

    public double getVlSuframa() {
        return this.vlSuframa;
    }

    public void setVlSuframa(double vlSuframa) {
        this.vlSuframa = vlSuframa;
    }

    public double getVlIi() {
        return this.vlIi;
    }

    public void setVlIi(double vlIi) {
        this.vlIi = vlIi;
    }

    public double getVlIofIi() {
        return this.vlIofIi;
    }

    public void setVlIofIi(double vlIofIi) {
        this.vlIofIi = vlIofIi;
    }

    public Integer getVlDespAduIi() {
        return this.vlDespAduIi;
    }

    public void setVlDespAduIi(Integer vlDespAduIi) {
        this.vlDespAduIi = vlDespAduIi;
    }

    public double getJurosDesconto() {
        return this.jurosDesconto;
    }

    public void setJurosDesconto(double jurosDesconto) {
        this.jurosDesconto = jurosDesconto;
    }

    public double getPRedBcIcms() {
        return this.pRedBcIcms;
    }

    public void setPRedBcIcms(double pRedBcIcms) {
        this.pRedBcIcms = pRedBcIcms;
    }

    public double getPRedBcSt() {
        return this.pRedBcSt;
    }

    public void setPRedBcSt(double pRedBcSt) {
        this.pRedBcSt = pRedBcSt;
    }

    public double getAliquotaIcms() {
        return this.aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getAliquotaIpi() {
        return this.aliquotaIpi;
    }

    public void setAliquotaIpi(double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public double getAliquotaSt() {
        return this.aliquotaSt;
    }

    public void setAliquotaSt(double aliquotaSt) {
        this.aliquotaSt = aliquotaSt;
    }

    public double getAliquotaPis() {
        return this.aliquotaPis;
    }

    public void setAliquotaPis(double aliquotaPis) {
        this.aliquotaPis = aliquotaPis;
    }

    public double getAliquotaCofins() {
        return this.aliquotaCofins;
    }

    public void setAliquotaCofins(double aliquotaCofins) {
        this.aliquotaCofins = aliquotaCofins;
    }

    public double getAliquotaPisSt() {
        return this.aliquotaPisSt;
    }

    public void setAliquotaPisSt(double aliquotaPisSt) {
        this.aliquotaPisSt = aliquotaPisSt;
    }

    public double getAliquotaCofinsSt() {
        return this.aliquotaCofinsSt;
    }

    public void setAliquotaCofinsSt(double aliquotaCofinsSt) {
        this.aliquotaCofinsSt = aliquotaCofinsSt;
    }

    public double getAliquotaBcop() {
        return this.aliquotaBcop;
    }

    public void setAliquotaBcop(double aliquotaBcop) {
        this.aliquotaBcop = aliquotaBcop;
    }

    public double getAliquotaCredSn() {
        return this.aliquotaCredSn;
    }

    public void setAliquotaCredSn(double aliquotaCredSn) {
        this.aliquotaCredSn = aliquotaCredSn;
    }

    public double getAliquotaMvast() {
        return this.aliquotaMvast;
    }

    public void setAliquotaMvast(double aliquotaMvast) {
        this.aliquotaMvast = aliquotaMvast;
    }

    public double getAliquotaFcpUfDest() {
        return this.aliquotaFcpUfDest;
    }

    public void setAliquotaFcpUfDest(double aliquotaFcpUfDest) {
        this.aliquotaFcpUfDest = aliquotaFcpUfDest;
    }

    public double getAliquotaIcmsUfDest() {
        return this.aliquotaIcmsUfDest;
    }

    public void setAliquotaIcmsUfDest(double aliquotaIcmsUfDest) {
        this.aliquotaIcmsUfDest = aliquotaIcmsUfDest;
    }

    public double getAliquotaIcmsInter() {
        return this.aliquotaIcmsInter;
    }

    public void setAliquotaIcmsInter(double aliquotaIcmsInter) {
        this.aliquotaIcmsInter = aliquotaIcmsInter;
    }

    public double getAliquotaIcmsInterPart() {
        return this.aliquotaIcmsInterPart;
    }

    public void setAliquotaIcmsInterPart(double aliquotaIcmsInterPart) {
        this.aliquotaIcmsInterPart = aliquotaIcmsInterPart;
    }

    public double getAliquotaFcp() {
        return this.aliquotaFcp;
    }

    public void setAliquotaFcp(double aliquotaFcp) {
        this.aliquotaFcp = aliquotaFcp;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Character getTipoProduto() {
        return this.tipoProduto;
    }

    public void setTipoProduto(Character tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Character getTipoBaixa() {
        return this.tipoBaixa;
    }

    public void setTipoBaixa(Character tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public Character getModalidade() {
        return this.modalidade;
    }

    public void setModalidade(Character modalidade) {
        this.modalidade = modalidade;
    }

    public Character getModalidadeSt() {
        return this.modalidadeSt;
    }

    public void setModalidadeSt(Character modalidadeSt) {
        this.modalidadeSt = modalidadeSt;
    }

    public Character getMotdesicms() {
        return this.motdesicms;
    }

    public void setMotdesicms(Character motdesicms) {
        this.motdesicms = motdesicms;
    }

    public String getNatBcCred() {
        return this.natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public String getCsosn() {
        return this.csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public Double getFcMercadoriaUn() {
        return this.fcMercadoriaUn;
    }

    public void setFcMercadoriaUn(Double fcMercadoriaUn) {
        this.fcMercadoriaUn = fcMercadoriaUn;
    }

    public Double getFcDescontoUn() {
        return this.fcDescontoUn;
    }

    public void setFcDescontoUn(Double fcDescontoUn) {
        this.fcDescontoUn = fcDescontoUn;
    }

    public Double getFcCtRep() {
        return this.fcCtRep;
    }

    public void setFcCtRep(Double fcCtRep) {
        this.fcCtRep = fcCtRep;
    }

    public Double getFcCtRepD() {
        return this.fcCtRepD;
    }

    public void setFcCtRepD(Double fcCtRepD) {
        this.fcCtRepD = fcCtRepD;
    }

    public Double getFcCtReal() {
        return this.fcCtReal;
    }

    public void setFcCtReal(Double fcCtReal) {
        this.fcCtReal = fcCtReal;
    }

    public Double getFcCtComp() {
        return this.fcCtComp;
    }

    public void setFcCtComp(Double fcCtComp) {
        this.fcCtComp = fcCtComp;
    }

    public Double getFcCtRealD() {
        return this.fcCtRealD;
    }

    public void setFcCtRealD(Double fcCtRealD) {
        this.fcCtRealD = fcCtRealD;
    }

    public double getVlTotTrib() {
        return this.vlTotTrib;
    }

    public void setVlTotTrib(double vlTotTrib) {
        this.vlTotTrib = vlTotTrib;
    }

    public double getVlBaseIcmsUfDest() {
        return this.vlBaseIcmsUfDest;
    }

    public void setVlBaseIcmsUfDest(double vlBaseIcmsUfDest) {
        this.vlBaseIcmsUfDest = vlBaseIcmsUfDest;
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

    public double getVlFcp() {
        return this.vlFcp;
    }

    public void setVlFcp(double vlFcp) {
        this.vlFcp = vlFcp;
    }

    public double getVlIcmsDeson() {
        return this.vlIcmsDeson;
    }

    public void setVlIcmsDeson(double vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }

    public double getVlIpiDeson() {
        return this.vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
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

}
