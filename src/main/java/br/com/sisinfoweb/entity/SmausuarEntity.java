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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "SMAUSUAR", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_CFACLIFO"})})
public class SmausuarEntity {

    @Column(name = "ID_SMAUSUAR", table = "SMAUSUAR", nullable = false)
    @Id
    private Integer idSmausuar;

    @Column(name = "ID_SMAEMPRE", table = "SMAUSUAR")
    @Basic
    private Integer idSmaempre;

    @Column(name = "ID_CFACLIFO", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int idCfaclifo;

    @Column(name = "ID_CBANUMCX", table = "SMAUSUAR")
    @Basic
    private Integer idCbanumcx;

    @Column(name = "GUID", table = "SMAUSUAR", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "SMAUSUAR", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "SMAUSUAR")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "SMAUSUAR")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "SMAUSUAR")
    @Basic
    private Integer ctInteg;

    @Column(name = "NOME", table = "SMAUSUAR", nullable = false, length = 60)
    @Basic(optional = false)
    private String nome;

    @Column(name = "COR_CAMPO_COM_FOCU", table = "SMAUSUAR", length = 20)
    @Basic
    private String corCampoComFocu;

    @Column(name = "COR_CAMPO_SEM_FOCU", table = "SMAUSUAR", length = 20)
    @Basic
    private String corCampoSemFocu;

    @Column(name = "COR_BOX_COM_FOCU", table = "SMAUSUAR", length = 20)
    @Basic
    private String corBoxComFocu;

    @Column(name = "COR_BOX_SEM_FOCU", table = "SMAUSUAR", length = 20)
    @Basic
    private String corBoxSemFocu;

    @Column(name = "COR_LINHA_SEL_GRID", table = "SMAUSUAR", length = 20)
    @Basic
    private String corLinhaSelGrid;

    @Column(name = "COR_COLUNA_SEL_GRID", table = "SMAUSUAR", length = 20)
    @Basic
    private String corColunaSelGrid;

    @Column(name = "COR_CAMPO_SEL_GRID", table = "SMAUSUAR", length = 20)
    @Basic
    private String corCampoSelGrid;

    @Column(name = "COR_LINHA_IMPAR_GRID", table = "SMAUSUAR", length = 20)
    @Basic
    private String corLinhaImparGrid;

    @Column(name = "COR_LINHA_PAR_GRID", table = "SMAUSUAR", length = 20)
    @Basic
    private String corLinhaParGrid;

    @Column(name = "COR_HEADER_GRID_COM_FOCU", table = "SMAUSUAR", length = 20)
    @Basic
    private String corHeaderGridComFocu;

    @Column(name = "COR_HEADER_GRID_SEM_FOCU", table = "SMAUSUAR", length = 20)
    @Basic
    private String corHeaderGridSemFocu;

    @Column(name = "COR_LINHA", table = "SMAUSUAR", length = 20)
    @Basic
    private String corLinha;

    @Column(name = "COR_FORM", table = "SMAUSUAR", length = 20)
    @Basic
    private String corForm;

    @Column(name = "FONTE_LCF_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLcfNome;

    @Column(name = "FONTE_LSF_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLsfNome;

    @Column(name = "FONTE_CCF_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteCcfNome;

    @Column(name = "FONTE_CSF_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteCsfNome;

    @Column(name = "FONTE_LSG_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLsgNome;

    @Column(name = "FONTE_COLSG_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteColsgNome;

    @Column(name = "FONTE_CPOSG_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteCposgNome;

    @Column(name = "FONTE_LIG_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLigNome;

    @Column(name = "FONTE_LPG_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLpgNome;

    @Column(name = "FONTE_HGCF_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteHgcfNome;

    @Column(name = "FONTE_HGSF_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteHgsfNome;

    @Column(name = "FONTE_MENU_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteMenuNome;

    @Column(name = "FONTE_RELAT_NOME", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteRelatNome;

    @Column(name = "FONTE_LCF_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLcfCor;

    @Column(name = "FONTE_LSF_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLsfCor;

    @Column(name = "FONTE_CCF_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteCcfCor;

    @Column(name = "FONTE_CSF_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteCsfCor;

    @Column(name = "FONTE_LSG_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLsgCor;

    @Column(name = "FONTE_COLSG_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteColsgCor;

    @Column(name = "FONTE_CPOSG_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteCposgCor;

    @Column(name = "FONTE_LIG_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLigCor;

    @Column(name = "FONTE_LPG_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteLpgCor;

    @Column(name = "FONTE_HGCF_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteHgcfCor;

    @Column(name = "FONTE_HGSF_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteHgsfCor;

    @Column(name = "FONTE_MENU_COR", table = "SMAUSUAR", length = 20)
    @Basic
    private String fonteMenuCor;

    @Column(name = "FONTE_LCF_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteLcfSize;

    @Column(name = "FONTE_LSF_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteLsfSize;

    @Column(name = "FONTE_CCF_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteCcfSize;

    @Column(name = "FONTE_CSF_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteCsfSize;

    @Column(name = "FONTE_LSG_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteLsgSize;

    @Column(name = "FONTE_CPOSG_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteCposgSize;

    @Column(name = "FONTE_LIG_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteLigSize;

    @Column(name = "FONTE_LPG_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteLpgSize;

    @Column(name = "FONTE_HGCF_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteHgcfSize;

    @Column(name = "FONTE_COLSG_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteColsgSize;

    @Column(name = "FONTE_HGSF_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteHgsfSize;

    @Column(name = "FONTE_MENU_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteMenuSize;

    @Column(name = "FONTE_RELAT_SIZE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int fonteRelatSize;

    @Column(name = "FONTE_LCF_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteLcfEstilo;

    @Column(name = "FONTE_LSF_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteLsfEstilo;

    @Column(name = "FONTE_CCF_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteCcfEstilo;

    @Column(name = "FONTE_CSF_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteCsfEstilo;

    @Column(name = "FONTE_LSG_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteLsgEstilo;

    @Column(name = "FONTE_COLSG_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteColsgEstilo;

    @Column(name = "FONTE_CPOSG_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteCposgEstilo;

    @Column(name = "FONTE_LIG_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteLigEstilo;

    @Column(name = "FONTE_LPG_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteLpgEstilo;

    @Column(name = "FONTE_HGCF_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteHgcfEstilo;

    @Column(name = "FONTE_HGSF_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteHgsfEstilo;

    @Column(name = "FONTE_MENU_ESTILO", table = "SMAUSUAR", length = 5)
    @Basic
    private String fonteMenuEstilo;

    @Column(name = "BOX_ENVOLVATOR", table = "SMAUSUAR")
    @Basic
    private Character boxEnvolvator;

    @Column(name = "BOTAO_RELEVO", table = "SMAUSUAR")
    @Basic
    private Character botaoRelevo;

    @Column(name = "EDICAO_2D", table = "SMAUSUAR")
    @Basic
    private Character edicao2d;

    @Column(name = "SELECIONA_EDICAO", table = "SMAUSUAR")
    @Basic
    private Character selecionaEdicao;

    @Column(name = "PISCA_NOME_CAMPO", table = "SMAUSUAR")
    @Basic
    private Character piscaNomeCampo;

    @Column(name = "TELA_CHAMADORA", table = "SMAUSUAR")
    @Basic
    private Character telaChamadora;

    @Column(name = "ACESSO_TOTAL", table = "SMAUSUAR")
    @Basic
    private Character acessoTotal;

    @Column(name = "DEFAULT_ROW_HEIGHT", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int defaultRowHeight;

    @Column(name = "DEFAULT_ROW_HEIGHT_C", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int defaultRowHeightC;

    @Column(name = "MASCARA_DATA_HORA", table = "SMAUSUAR", length = 40)
    @Basic
    private String mascaraDataHora;

    @Column(name = "MASCARA_DATA", table = "SMAUSUAR", length = 40)
    @Basic
    private String mascaraData;

    @Column(name = "MASCARA_HORA", table = "SMAUSUAR", length = 40)
    @Basic
    private String mascaraHora;

    @Column(name = "MASCARA_PERCENTUAL", table = "SMAUSUAR", length = 40)
    @Basic
    private String mascaraPercentual;

    @Column(name = "MASCARA_QTDE", table = "SMAUSUAR", length = 40)
    @Basic
    private String mascaraQtde;

    @Column(name = "MASCARA_MONETARIA", table = "SMAUSUAR", length = 40)
    @Basic
    private String mascaraMonetaria;

    @Column(name = "TAMANHO_PERC", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int tamanhoPerc;

    @Column(name = "TAMANHO_QTDE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int tamanhoQtde;

    @Column(name = "DECIMAIS_PERC", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int decimaisPerc;

    @Column(name = "DECIMAIS_QTDE", table = "SMAUSUAR", nullable = false)
    @Basic(optional = false)
    private int decimaisQtde;

    @Column(name = "GERENCIA_CORES", table = "SMAUSUAR")
    @Basic
    private Character gerenciaCores;

    @Column(name = "ACESSA_CADASTRO", table = "SMAUSUAR")
    @Basic
    private Character acessaCadastro;

    @Column(name = "ESCOLHE_RELATORIO", table = "SMAUSUAR")
    @Basic
    private Character escolheRelatorio;

    @Column(name = "BMP_BROWSE", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpBrowse;

    @Column(name = "BMP_SELECAO", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpSelecao;

    @Column(name = "BMP_EDIT", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpEdit;

    @Column(name = "BMP_INSERT", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpInsert;

    @Column(name = "BMP_FIRST", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpFirst;

    @Column(name = "BMP_PRIOR", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpPrior;

    @Column(name = "BMP_NEXT", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpNext;

    @Column(name = "BMP_LAST", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpLast;

    @Column(name = "BMP_CLEAR", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpClear;

    @Column(name = "BMP_GRAVA", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpGrava;

    @Column(name = "BMP_EXCLUI", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpExclui;

    @Column(name = "BMP_CONSULTA", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpConsulta;

    @Column(name = "BMP_CADASTRA", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpCadastra;

    @Column(name = "BMP_CALEND", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpCalend;

    @Column(name = "BMP_CALC", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpCalc;

    @Column(name = "BMP_SAIR", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpSair;

    @Column(name = "BMP_OK", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpOk;

    @Column(name = "BMP_CANCEL", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpCancel;

    @Column(name = "BMP_IMPRIMIR", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpImprimir;

    @Column(name = "BMP_OPCAO_TELA", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpOpcaoTela;

    @Column(name = "BMP_REFRESH_RECORD", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpRefreshRecord;

    @Column(name = "BMP_FUNDO_TELA", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpFundoTela;

    @Column(name = "BMP_VISUALIZAR", table = "SMAUSUAR")
    @Lob
    @Basic
    private byte[] bmpVisualizar;

    @Column(name = "TIPO_FUNDO", table = "SMAUSUAR")
    @Basic
    private Character tipoFundo;

    @Column(name = "SKIN", table = "SMAUSUAR", length = 12)
    @Basic
    private String skin;

    @Column(name = "MODELO_CALCULADORA", table = "SMAUSUAR")
    @Basic
    private Character modeloCalculadora;

    @Column(name = "SENHA", table = "SMAUSUAR", length = 20)
    @Basic
    private String senha;

    public Integer getIdSmausuar() {
        return this.idSmausuar;
    }

    public void setIdSmausuar(Integer idSmausuar) {
        this.idSmausuar = idSmausuar;
    }

    public Integer getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public int getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCbanumcx() {
        return this.idCbanumcx;
    }

    public void setIdCbanumcx(Integer idCbanumcx) {
        this.idCbanumcx = idCbanumcx;
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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorCampoComFocu() {
        return this.corCampoComFocu;
    }

    public void setCorCampoComFocu(String corCampoComFocu) {
        this.corCampoComFocu = corCampoComFocu;
    }

    public String getCorCampoSemFocu() {
        return this.corCampoSemFocu;
    }

    public void setCorCampoSemFocu(String corCampoSemFocu) {
        this.corCampoSemFocu = corCampoSemFocu;
    }

    public String getCorBoxComFocu() {
        return this.corBoxComFocu;
    }

    public void setCorBoxComFocu(String corBoxComFocu) {
        this.corBoxComFocu = corBoxComFocu;
    }

    public String getCorBoxSemFocu() {
        return this.corBoxSemFocu;
    }

    public void setCorBoxSemFocu(String corBoxSemFocu) {
        this.corBoxSemFocu = corBoxSemFocu;
    }

    public String getCorLinhaSelGrid() {
        return this.corLinhaSelGrid;
    }

    public void setCorLinhaSelGrid(String corLinhaSelGrid) {
        this.corLinhaSelGrid = corLinhaSelGrid;
    }

    public String getCorColunaSelGrid() {
        return this.corColunaSelGrid;
    }

    public void setCorColunaSelGrid(String corColunaSelGrid) {
        this.corColunaSelGrid = corColunaSelGrid;
    }

    public String getCorCampoSelGrid() {
        return this.corCampoSelGrid;
    }

    public void setCorCampoSelGrid(String corCampoSelGrid) {
        this.corCampoSelGrid = corCampoSelGrid;
    }

    public String getCorLinhaImparGrid() {
        return this.corLinhaImparGrid;
    }

    public void setCorLinhaImparGrid(String corLinhaImparGrid) {
        this.corLinhaImparGrid = corLinhaImparGrid;
    }

    public String getCorLinhaParGrid() {
        return this.corLinhaParGrid;
    }

    public void setCorLinhaParGrid(String corLinhaParGrid) {
        this.corLinhaParGrid = corLinhaParGrid;
    }

    public String getCorHeaderGridComFocu() {
        return this.corHeaderGridComFocu;
    }

    public void setCorHeaderGridComFocu(String corHeaderGridComFocu) {
        this.corHeaderGridComFocu = corHeaderGridComFocu;
    }

    public String getCorHeaderGridSemFocu() {
        return this.corHeaderGridSemFocu;
    }

    public void setCorHeaderGridSemFocu(String corHeaderGridSemFocu) {
        this.corHeaderGridSemFocu = corHeaderGridSemFocu;
    }

    public String getCorLinha() {
        return this.corLinha;
    }

    public void setCorLinha(String corLinha) {
        this.corLinha = corLinha;
    }

    public String getCorForm() {
        return this.corForm;
    }

    public void setCorForm(String corForm) {
        this.corForm = corForm;
    }

    public String getFonteLcfNome() {
        return this.fonteLcfNome;
    }

    public void setFonteLcfNome(String fonteLcfNome) {
        this.fonteLcfNome = fonteLcfNome;
    }

    public String getFonteLsfNome() {
        return this.fonteLsfNome;
    }

    public void setFonteLsfNome(String fonteLsfNome) {
        this.fonteLsfNome = fonteLsfNome;
    }

    public String getFonteCcfNome() {
        return this.fonteCcfNome;
    }

    public void setFonteCcfNome(String fonteCcfNome) {
        this.fonteCcfNome = fonteCcfNome;
    }

    public String getFonteCsfNome() {
        return this.fonteCsfNome;
    }

    public void setFonteCsfNome(String fonteCsfNome) {
        this.fonteCsfNome = fonteCsfNome;
    }

    public String getFonteLsgNome() {
        return this.fonteLsgNome;
    }

    public void setFonteLsgNome(String fonteLsgNome) {
        this.fonteLsgNome = fonteLsgNome;
    }

    public String getFonteColsgNome() {
        return this.fonteColsgNome;
    }

    public void setFonteColsgNome(String fonteColsgNome) {
        this.fonteColsgNome = fonteColsgNome;
    }

    public String getFonteCposgNome() {
        return this.fonteCposgNome;
    }

    public void setFonteCposgNome(String fonteCposgNome) {
        this.fonteCposgNome = fonteCposgNome;
    }

    public String getFonteLigNome() {
        return this.fonteLigNome;
    }

    public void setFonteLigNome(String fonteLigNome) {
        this.fonteLigNome = fonteLigNome;
    }

    public String getFonteLpgNome() {
        return this.fonteLpgNome;
    }

    public void setFonteLpgNome(String fonteLpgNome) {
        this.fonteLpgNome = fonteLpgNome;
    }

    public String getFonteHgcfNome() {
        return this.fonteHgcfNome;
    }

    public void setFonteHgcfNome(String fonteHgcfNome) {
        this.fonteHgcfNome = fonteHgcfNome;
    }

    public String getFonteHgsfNome() {
        return this.fonteHgsfNome;
    }

    public void setFonteHgsfNome(String fonteHgsfNome) {
        this.fonteHgsfNome = fonteHgsfNome;
    }

    public String getFonteMenuNome() {
        return this.fonteMenuNome;
    }

    public void setFonteMenuNome(String fonteMenuNome) {
        this.fonteMenuNome = fonteMenuNome;
    }

    public String getFonteRelatNome() {
        return this.fonteRelatNome;
    }

    public void setFonteRelatNome(String fonteRelatNome) {
        this.fonteRelatNome = fonteRelatNome;
    }

    public String getFonteLcfCor() {
        return this.fonteLcfCor;
    }

    public void setFonteLcfCor(String fonteLcfCor) {
        this.fonteLcfCor = fonteLcfCor;
    }

    public String getFonteLsfCor() {
        return this.fonteLsfCor;
    }

    public void setFonteLsfCor(String fonteLsfCor) {
        this.fonteLsfCor = fonteLsfCor;
    }

    public String getFonteCcfCor() {
        return this.fonteCcfCor;
    }

    public void setFonteCcfCor(String fonteCcfCor) {
        this.fonteCcfCor = fonteCcfCor;
    }

    public String getFonteCsfCor() {
        return this.fonteCsfCor;
    }

    public void setFonteCsfCor(String fonteCsfCor) {
        this.fonteCsfCor = fonteCsfCor;
    }

    public String getFonteLsgCor() {
        return this.fonteLsgCor;
    }

    public void setFonteLsgCor(String fonteLsgCor) {
        this.fonteLsgCor = fonteLsgCor;
    }

    public String getFonteColsgCor() {
        return this.fonteColsgCor;
    }

    public void setFonteColsgCor(String fonteColsgCor) {
        this.fonteColsgCor = fonteColsgCor;
    }

    public String getFonteCposgCor() {
        return this.fonteCposgCor;
    }

    public void setFonteCposgCor(String fonteCposgCor) {
        this.fonteCposgCor = fonteCposgCor;
    }

    public String getFonteLigCor() {
        return this.fonteLigCor;
    }

    public void setFonteLigCor(String fonteLigCor) {
        this.fonteLigCor = fonteLigCor;
    }

    public String getFonteLpgCor() {
        return this.fonteLpgCor;
    }

    public void setFonteLpgCor(String fonteLpgCor) {
        this.fonteLpgCor = fonteLpgCor;
    }

    public String getFonteHgcfCor() {
        return this.fonteHgcfCor;
    }

    public void setFonteHgcfCor(String fonteHgcfCor) {
        this.fonteHgcfCor = fonteHgcfCor;
    }

    public String getFonteHgsfCor() {
        return this.fonteHgsfCor;
    }

    public void setFonteHgsfCor(String fonteHgsfCor) {
        this.fonteHgsfCor = fonteHgsfCor;
    }

    public String getFonteMenuCor() {
        return this.fonteMenuCor;
    }

    public void setFonteMenuCor(String fonteMenuCor) {
        this.fonteMenuCor = fonteMenuCor;
    }

    public int getFonteLcfSize() {
        return this.fonteLcfSize;
    }

    public void setFonteLcfSize(int fonteLcfSize) {
        this.fonteLcfSize = fonteLcfSize;
    }

    public int getFonteLsfSize() {
        return this.fonteLsfSize;
    }

    public void setFonteLsfSize(int fonteLsfSize) {
        this.fonteLsfSize = fonteLsfSize;
    }

    public int getFonteCcfSize() {
        return this.fonteCcfSize;
    }

    public void setFonteCcfSize(int fonteCcfSize) {
        this.fonteCcfSize = fonteCcfSize;
    }

    public int getFonteCsfSize() {
        return this.fonteCsfSize;
    }

    public void setFonteCsfSize(int fonteCsfSize) {
        this.fonteCsfSize = fonteCsfSize;
    }

    public int getFonteLsgSize() {
        return this.fonteLsgSize;
    }

    public void setFonteLsgSize(int fonteLsgSize) {
        this.fonteLsgSize = fonteLsgSize;
    }

    public int getFonteCposgSize() {
        return this.fonteCposgSize;
    }

    public void setFonteCposgSize(int fonteCposgSize) {
        this.fonteCposgSize = fonteCposgSize;
    }

    public int getFonteLigSize() {
        return this.fonteLigSize;
    }

    public void setFonteLigSize(int fonteLigSize) {
        this.fonteLigSize = fonteLigSize;
    }

    public int getFonteLpgSize() {
        return this.fonteLpgSize;
    }

    public void setFonteLpgSize(int fonteLpgSize) {
        this.fonteLpgSize = fonteLpgSize;
    }

    public int getFonteHgcfSize() {
        return this.fonteHgcfSize;
    }

    public void setFonteHgcfSize(int fonteHgcfSize) {
        this.fonteHgcfSize = fonteHgcfSize;
    }

    public int getFonteColsgSize() {
        return this.fonteColsgSize;
    }

    public void setFonteColsgSize(int fonteColsgSize) {
        this.fonteColsgSize = fonteColsgSize;
    }

    public int getFonteHgsfSize() {
        return this.fonteHgsfSize;
    }

    public void setFonteHgsfSize(int fonteHgsfSize) {
        this.fonteHgsfSize = fonteHgsfSize;
    }

    public int getFonteMenuSize() {
        return this.fonteMenuSize;
    }

    public void setFonteMenuSize(int fonteMenuSize) {
        this.fonteMenuSize = fonteMenuSize;
    }

    public int getFonteRelatSize() {
        return this.fonteRelatSize;
    }

    public void setFonteRelatSize(int fonteRelatSize) {
        this.fonteRelatSize = fonteRelatSize;
    }

    public String getFonteLcfEstilo() {
        return this.fonteLcfEstilo;
    }

    public void setFonteLcfEstilo(String fonteLcfEstilo) {
        this.fonteLcfEstilo = fonteLcfEstilo;
    }

    public String getFonteLsfEstilo() {
        return this.fonteLsfEstilo;
    }

    public void setFonteLsfEstilo(String fonteLsfEstilo) {
        this.fonteLsfEstilo = fonteLsfEstilo;
    }

    public String getFonteCcfEstilo() {
        return this.fonteCcfEstilo;
    }

    public void setFonteCcfEstilo(String fonteCcfEstilo) {
        this.fonteCcfEstilo = fonteCcfEstilo;
    }

    public String getFonteCsfEstilo() {
        return this.fonteCsfEstilo;
    }

    public void setFonteCsfEstilo(String fonteCsfEstilo) {
        this.fonteCsfEstilo = fonteCsfEstilo;
    }

    public String getFonteLsgEstilo() {
        return this.fonteLsgEstilo;
    }

    public void setFonteLsgEstilo(String fonteLsgEstilo) {
        this.fonteLsgEstilo = fonteLsgEstilo;
    }

    public String getFonteColsgEstilo() {
        return this.fonteColsgEstilo;
    }

    public void setFonteColsgEstilo(String fonteColsgEstilo) {
        this.fonteColsgEstilo = fonteColsgEstilo;
    }

    public String getFonteCposgEstilo() {
        return this.fonteCposgEstilo;
    }

    public void setFonteCposgEstilo(String fonteCposgEstilo) {
        this.fonteCposgEstilo = fonteCposgEstilo;
    }

    public String getFonteLigEstilo() {
        return this.fonteLigEstilo;
    }

    public void setFonteLigEstilo(String fonteLigEstilo) {
        this.fonteLigEstilo = fonteLigEstilo;
    }

    public String getFonteLpgEstilo() {
        return this.fonteLpgEstilo;
    }

    public void setFonteLpgEstilo(String fonteLpgEstilo) {
        this.fonteLpgEstilo = fonteLpgEstilo;
    }

    public String getFonteHgcfEstilo() {
        return this.fonteHgcfEstilo;
    }

    public void setFonteHgcfEstilo(String fonteHgcfEstilo) {
        this.fonteHgcfEstilo = fonteHgcfEstilo;
    }

    public String getFonteHgsfEstilo() {
        return this.fonteHgsfEstilo;
    }

    public void setFonteHgsfEstilo(String fonteHgsfEstilo) {
        this.fonteHgsfEstilo = fonteHgsfEstilo;
    }

    public String getFonteMenuEstilo() {
        return this.fonteMenuEstilo;
    }

    public void setFonteMenuEstilo(String fonteMenuEstilo) {
        this.fonteMenuEstilo = fonteMenuEstilo;
    }

    public Character getBoxEnvolvator() {
        return this.boxEnvolvator;
    }

    public void setBoxEnvolvator(Character boxEnvolvator) {
        this.boxEnvolvator = boxEnvolvator;
    }

    public Character getBotaoRelevo() {
        return this.botaoRelevo;
    }

    public void setBotaoRelevo(Character botaoRelevo) {
        this.botaoRelevo = botaoRelevo;
    }

    public Character getEdicao2d() {
        return this.edicao2d;
    }

    public void setEdicao2d(Character edicao2d) {
        this.edicao2d = edicao2d;
    }

    public Character getSelecionaEdicao() {
        return this.selecionaEdicao;
    }

    public void setSelecionaEdicao(Character selecionaEdicao) {
        this.selecionaEdicao = selecionaEdicao;
    }

    public Character getPiscaNomeCampo() {
        return this.piscaNomeCampo;
    }

    public void setPiscaNomeCampo(Character piscaNomeCampo) {
        this.piscaNomeCampo = piscaNomeCampo;
    }

    public Character getTelaChamadora() {
        return this.telaChamadora;
    }

    public void setTelaChamadora(Character telaChamadora) {
        this.telaChamadora = telaChamadora;
    }

    public Character getAcessoTotal() {
        return this.acessoTotal;
    }

    public void setAcessoTotal(Character acessoTotal) {
        this.acessoTotal = acessoTotal;
    }

    public int getDefaultRowHeight() {
        return this.defaultRowHeight;
    }

    public void setDefaultRowHeight(int defaultRowHeight) {
        this.defaultRowHeight = defaultRowHeight;
    }

    public int getDefaultRowHeightC() {
        return this.defaultRowHeightC;
    }

    public void setDefaultRowHeightC(int defaultRowHeightC) {
        this.defaultRowHeightC = defaultRowHeightC;
    }

    public String getMascaraDataHora() {
        return this.mascaraDataHora;
    }

    public void setMascaraDataHora(String mascaraDataHora) {
        this.mascaraDataHora = mascaraDataHora;
    }

    public String getMascaraData() {
        return this.mascaraData;
    }

    public void setMascaraData(String mascaraData) {
        this.mascaraData = mascaraData;
    }

    public String getMascaraHora() {
        return this.mascaraHora;
    }

    public void setMascaraHora(String mascaraHora) {
        this.mascaraHora = mascaraHora;
    }

    public String getMascaraPercentual() {
        return this.mascaraPercentual;
    }

    public void setMascaraPercentual(String mascaraPercentual) {
        this.mascaraPercentual = mascaraPercentual;
    }

    public String getMascaraQtde() {
        return this.mascaraQtde;
    }

    public void setMascaraQtde(String mascaraQtde) {
        this.mascaraQtde = mascaraQtde;
    }

    public String getMascaraMonetaria() {
        return this.mascaraMonetaria;
    }

    public void setMascaraMonetaria(String mascaraMonetaria) {
        this.mascaraMonetaria = mascaraMonetaria;
    }

    public int getTamanhoPerc() {
        return this.tamanhoPerc;
    }

    public void setTamanhoPerc(int tamanhoPerc) {
        this.tamanhoPerc = tamanhoPerc;
    }

    public int getTamanhoQtde() {
        return this.tamanhoQtde;
    }

    public void setTamanhoQtde(int tamanhoQtde) {
        this.tamanhoQtde = tamanhoQtde;
    }

    public int getDecimaisPerc() {
        return this.decimaisPerc;
    }

    public void setDecimaisPerc(int decimaisPerc) {
        this.decimaisPerc = decimaisPerc;
    }

    public int getDecimaisQtde() {
        return this.decimaisQtde;
    }

    public void setDecimaisQtde(int decimaisQtde) {
        this.decimaisQtde = decimaisQtde;
    }

    public Character getGerenciaCores() {
        return this.gerenciaCores;
    }

    public void setGerenciaCores(Character gerenciaCores) {
        this.gerenciaCores = gerenciaCores;
    }

    public Character getAcessaCadastro() {
        return this.acessaCadastro;
    }

    public void setAcessaCadastro(Character acessaCadastro) {
        this.acessaCadastro = acessaCadastro;
    }

    public Character getEscolheRelatorio() {
        return this.escolheRelatorio;
    }

    public void setEscolheRelatorio(Character escolheRelatorio) {
        this.escolheRelatorio = escolheRelatorio;
    }

    public byte[] getBmpBrowse() {
        return this.bmpBrowse;
    }

    public void setBmpBrowse(byte[] bmpBrowse) {
        this.bmpBrowse = bmpBrowse;
    }

    public byte[] getBmpSelecao() {
        return this.bmpSelecao;
    }

    public void setBmpSelecao(byte[] bmpSelecao) {
        this.bmpSelecao = bmpSelecao;
    }

    public byte[] getBmpEdit() {
        return this.bmpEdit;
    }

    public void setBmpEdit(byte[] bmpEdit) {
        this.bmpEdit = bmpEdit;
    }

    public byte[] getBmpInsert() {
        return this.bmpInsert;
    }

    public void setBmpInsert(byte[] bmpInsert) {
        this.bmpInsert = bmpInsert;
    }

    public byte[] getBmpFirst() {
        return this.bmpFirst;
    }

    public void setBmpFirst(byte[] bmpFirst) {
        this.bmpFirst = bmpFirst;
    }

    public byte[] getBmpPrior() {
        return this.bmpPrior;
    }

    public void setBmpPrior(byte[] bmpPrior) {
        this.bmpPrior = bmpPrior;
    }

    public byte[] getBmpNext() {
        return this.bmpNext;
    }

    public void setBmpNext(byte[] bmpNext) {
        this.bmpNext = bmpNext;
    }

    public byte[] getBmpLast() {
        return this.bmpLast;
    }

    public void setBmpLast(byte[] bmpLast) {
        this.bmpLast = bmpLast;
    }

    public byte[] getBmpClear() {
        return this.bmpClear;
    }

    public void setBmpClear(byte[] bmpClear) {
        this.bmpClear = bmpClear;
    }

    public byte[] getBmpGrava() {
        return this.bmpGrava;
    }

    public void setBmpGrava(byte[] bmpGrava) {
        this.bmpGrava = bmpGrava;
    }

    public byte[] getBmpExclui() {
        return this.bmpExclui;
    }

    public void setBmpExclui(byte[] bmpExclui) {
        this.bmpExclui = bmpExclui;
    }

    public byte[] getBmpConsulta() {
        return this.bmpConsulta;
    }

    public void setBmpConsulta(byte[] bmpConsulta) {
        this.bmpConsulta = bmpConsulta;
    }

    public byte[] getBmpCadastra() {
        return this.bmpCadastra;
    }

    public void setBmpCadastra(byte[] bmpCadastra) {
        this.bmpCadastra = bmpCadastra;
    }

    public byte[] getBmpCalend() {
        return this.bmpCalend;
    }

    public void setBmpCalend(byte[] bmpCalend) {
        this.bmpCalend = bmpCalend;
    }

    public byte[] getBmpCalc() {
        return this.bmpCalc;
    }

    public void setBmpCalc(byte[] bmpCalc) {
        this.bmpCalc = bmpCalc;
    }

    public byte[] getBmpSair() {
        return this.bmpSair;
    }

    public void setBmpSair(byte[] bmpSair) {
        this.bmpSair = bmpSair;
    }

    public byte[] getBmpOk() {
        return this.bmpOk;
    }

    public void setBmpOk(byte[] bmpOk) {
        this.bmpOk = bmpOk;
    }

    public byte[] getBmpCancel() {
        return this.bmpCancel;
    }

    public void setBmpCancel(byte[] bmpCancel) {
        this.bmpCancel = bmpCancel;
    }

    public byte[] getBmpImprimir() {
        return this.bmpImprimir;
    }

    public void setBmpImprimir(byte[] bmpImprimir) {
        this.bmpImprimir = bmpImprimir;
    }

    public byte[] getBmpOpcaoTela() {
        return this.bmpOpcaoTela;
    }

    public void setBmpOpcaoTela(byte[] bmpOpcaoTela) {
        this.bmpOpcaoTela = bmpOpcaoTela;
    }

    public byte[] getBmpRefreshRecord() {
        return this.bmpRefreshRecord;
    }

    public void setBmpRefreshRecord(byte[] bmpRefreshRecord) {
        this.bmpRefreshRecord = bmpRefreshRecord;
    }

    public byte[] getBmpFundoTela() {
        return this.bmpFundoTela;
    }

    public void setBmpFundoTela(byte[] bmpFundoTela) {
        this.bmpFundoTela = bmpFundoTela;
    }

    public byte[] getBmpVisualizar() {
        return this.bmpVisualizar;
    }

    public void setBmpVisualizar(byte[] bmpVisualizar) {
        this.bmpVisualizar = bmpVisualizar;
    }

    public Character getTipoFundo() {
        return this.tipoFundo;
    }

    public void setTipoFundo(Character tipoFundo) {
        this.tipoFundo = tipoFundo;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Character getModeloCalculadora() {
        return this.modeloCalculadora;
    }

    public void setModeloCalculadora(Character modeloCalculadora) {
        this.modeloCalculadora = modeloCalculadora;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
