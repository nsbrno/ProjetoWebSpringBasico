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
@Table(name = "APAPRMAT")
public class ApaprmatEntity {

    @Column(name = "ID_APAPRMAT", table = "APAPRMAT", nullable = false)
    @Id
    private Integer idApaprmat;

    @Column(name = "ID_APAPAROQ", table = "APAPRMAT")
    @Basic
    private Integer idApaparoq;

    @Column(name = "ID_APACOMUN", table = "APAPRMAT")
    @Basic
    private Integer idApacomun;

    @Column(name = "ID_CFACIDAD_NOIVO", table = "APAPRMAT")
    @Basic
    private Integer idCfacidadNoivo;

    @Column(name = "ID_CFAESTAD_NOIVO", table = "APAPRMAT")
    @Basic
    private Integer idCfaestadNoivo;

    @Column(name = "ID_CFACIDAD_NOIVA", table = "APAPRMAT")
    @Basic
    private Integer idCfacidadNoiva;

    @Column(name = "ID_CFAESTAD_NOIVA", table = "APAPRMAT")
    @Basic
    private Integer idCfaestadNoiva;

    @Column(name = "ID_CFACIDAD_MORAR", table = "APAPRMAT")
    @Basic
    private Integer idCfacidadMorar;

    @Column(name = "ID_CFAESTAD_MORAR", table = "APAPRMAT")
    @Basic
    private Integer idCfaestadMorar;

    @Column(name = "US_CAD", table = "APAPRMAT", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "APAPRMAT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "APAPRMAT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "APAPRMAT")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "APAPRMAT", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "NOIVO_NOME", table = "APAPRMAT", length = 60)
    @Basic
    private String noivoNome;

    @Column(name = "NOIVA_NOME", table = "APAPRMAT", length = 60)
    @Basic
    private String noivaNome;

    @Column(name = "NOIVO_PAI", table = "APAPRMAT", length = 60)
    @Basic
    private String noivoPai;

    @Column(name = "NOIVO_MAE", table = "APAPRMAT", length = 60)
    @Basic
    private String noivoMae;

    @Column(name = "NOIVO_DT_NASCIMENTO", table = "APAPRMAT")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date noivoDtNascimento;

    @Column(name = "NOIVO_NATURAL", table = "APAPRMAT", length = 40)
    @Basic
    private String noivoNatural;

    @Column(name = "NOIVO_BATIZ_PAROQ", table = "APAPRMAT", length = 40)
    @Basic
    private String noivoBatizParoq;

    @Column(name = "NOIVO_BATIZ_DIOCESE", table = "APAPRMAT", length = 40)
    @Basic
    private String noivoBatizDiocese;

    @Column(name = "NOIVO_ENDERECO", table = "APAPRMAT", length = 40)
    @Basic
    private String noivoEndereco;

    @Column(name = "NOIVO_BAIRRO", table = "APAPRMAT", length = 40)
    @Basic
    private String noivoBairro;

    @Column(name = "NOIVO_BATIZADO", table = "APAPRMAT")
    @Basic
    private Character noivoBatizado;

    @Column(name = "NOIVO_BATIZ_LIVRO", table = "APAPRMAT")
    @Basic
    private Integer noivoBatizLivro;

    @Column(name = "NOIVO_BATIZ_FOLHA", table = "APAPRMAT")
    @Basic
    private Integer noivoBatizFolha;

    @Column(name = "NOIVO_BATIZ_TERMO", table = "APAPRMAT")
    @Basic
    private Integer noivoBatizTermo;

    @Column(name = "NOIVA_PAI", table = "APAPRMAT", length = 60)
    @Basic
    private String noivaPai;

    @Column(name = "NOIVA_MAE", table = "APAPRMAT", length = 60)
    @Basic
    private String noivaMae;

    @Column(name = "NOIVA_DT_NASCIMENTO", table = "APAPRMAT")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date noivaDtNascimento;

    @Column(name = "NOIVA_NATURAL", table = "APAPRMAT", length = 40)
    @Basic
    private String noivaNatural;

    @Column(name = "NOIVA_BATIZ_PAROQ", table = "APAPRMAT", length = 40)
    @Basic
    private String noivaBatizParoq;

    @Column(name = "NOIVA_BATIZ_DIOCESE", table = "APAPRMAT", length = 40)
    @Basic
    private String noivaBatizDiocese;

    @Column(name = "NOIVA_ENDERECO", table = "APAPRMAT", length = 40)
    @Basic
    private String noivaEndereco;

    @Column(name = "NOIVA_BAIRRO", table = "APAPRMAT", length = 40)
    @Basic
    private String noivaBairro;

    @Column(name = "NOIVO_PERGUNTA1", table = "APAPRMAT", length = 128)
    @Basic
    private String noivoPergunta1;

    @Column(name = "NOIVO_PERGUNTA2", table = "APAPRMAT", length = 128)
    @Basic
    private String noivoPergunta2;

    @Column(name = "NOIVO_PERGUNTA3", table = "APAPRMAT", length = 128)
    @Basic
    private String noivoPergunta3;

    @Column(name = "NOIVO_PERGUNTA4", table = "APAPRMAT", length = 128)
    @Basic
    private String noivoPergunta4;

    @Column(name = "NOIVO_PERGUNTA5", table = "APAPRMAT", length = 128)
    @Basic
    private String noivoPergunta5;

    @Column(name = "NOIVO_PERGUNTA6", table = "APAPRMAT", length = 128)
    @Basic
    private String noivoPergunta6;

    @Column(name = "NOIVA_PERGUNTA1", table = "APAPRMAT", length = 128)
    @Basic
    private String noivaPergunta1;

    @Column(name = "NOIVA_PERGUNTA2", table = "APAPRMAT", length = 128)
    @Basic
    private String noivaPergunta2;

    @Column(name = "NOIVA_PERGUNTA3", table = "APAPRMAT", length = 128)
    @Basic
    private String noivaPergunta3;

    @Column(name = "NOIVA_PERGUNTA4", table = "APAPRMAT", length = 128)
    @Basic
    private String noivaPergunta4;

    @Column(name = "NOIVA_PERGUNTA5", table = "APAPRMAT", length = 128)
    @Basic
    private String noivaPergunta5;

    @Column(name = "NOIVA_PERGUNTA6", table = "APAPRMAT", length = 128)
    @Basic
    private String noivaPergunta6;

    @Column(name = "NOIVA_BATIZADA", table = "APAPRMAT")
    @Basic
    private Character noivaBatizada;

    @Column(name = "NOIVA_BATIZ_LIVRO", table = "APAPRMAT")
    @Basic
    private Integer noivaBatizLivro;

    @Column(name = "NOIVA_BATIZ_FOLHA", table = "APAPRMAT")
    @Basic
    private Integer noivaBatizFolha;

    @Column(name = "NOIVA_BATIZ_TERMO", table = "APAPRMAT")
    @Basic
    private Integer noivaBatizTermo;

    @Column(name = "DT_DIALOGO", table = "APAPRMAT")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtDialogo;

    @Column(name = "COMUNIDADE_MORAR", table = "APAPRMAT", length = 40)
    @Basic
    private String comunidadeMorar;

    @Column(name = "PADRE_NOME", table = "APAPRMAT", length = 60)
    @Basic
    private String padreNome;

    @Column(name = "BISPO_NOME", table = "APAPRMAT", length = 60)
    @Basic
    private String bispoNome;

    @Column(name = "DT_HR_CASAMENTO", table = "APAPRMAT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtHrCasamento;

    @Column(name = "SITUACAO", table = "APAPRMAT")
    @Basic
    private Character situacao;

    @Column(name = "PAROQUIATRANSFERIDA", table = "APAPRMAT", length = 40)
    @Basic
    private String paroquiatransferida;

    @Column(name = "PAROCO", table = "APAPRMAT", length = 60)
    @Basic
    private String paroco;

    public Integer getIdApaprmat() {
        return this.idApaprmat;
    }

    public void setIdApaprmat(Integer idApaprmat) {
        this.idApaprmat = idApaprmat;
    }

    public Integer getIdApaparoq() {
        return this.idApaparoq;
    }

    public void setIdApaparoq(Integer idApaparoq) {
        this.idApaparoq = idApaparoq;
    }

    public Integer getIdApacomun() {
        return this.idApacomun;
    }

    public void setIdApacomun(Integer idApacomun) {
        this.idApacomun = idApacomun;
    }

    public Integer getIdCfacidadNoivo() {
        return this.idCfacidadNoivo;
    }

    public void setIdCfacidadNoivo(Integer idCfacidadNoivo) {
        this.idCfacidadNoivo = idCfacidadNoivo;
    }

    public Integer getIdCfaestadNoivo() {
        return this.idCfaestadNoivo;
    }

    public void setIdCfaestadNoivo(Integer idCfaestadNoivo) {
        this.idCfaestadNoivo = idCfaestadNoivo;
    }

    public Integer getIdCfacidadNoiva() {
        return this.idCfacidadNoiva;
    }

    public void setIdCfacidadNoiva(Integer idCfacidadNoiva) {
        this.idCfacidadNoiva = idCfacidadNoiva;
    }

    public Integer getIdCfaestadNoiva() {
        return this.idCfaestadNoiva;
    }

    public void setIdCfaestadNoiva(Integer idCfaestadNoiva) {
        this.idCfaestadNoiva = idCfaestadNoiva;
    }

    public Integer getIdCfacidadMorar() {
        return this.idCfacidadMorar;
    }

    public void setIdCfacidadMorar(Integer idCfacidadMorar) {
        this.idCfacidadMorar = idCfacidadMorar;
    }

    public Integer getIdCfaestadMorar() {
        return this.idCfaestadMorar;
    }

    public void setIdCfaestadMorar(Integer idCfaestadMorar) {
        this.idCfaestadMorar = idCfaestadMorar;
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

    public String getNoivoNome() {
        return this.noivoNome;
    }

    public void setNoivoNome(String noivoNome) {
        this.noivoNome = noivoNome;
    }

    public String getNoivaNome() {
        return this.noivaNome;
    }

    public void setNoivaNome(String noivaNome) {
        this.noivaNome = noivaNome;
    }

    public String getNoivoPai() {
        return this.noivoPai;
    }

    public void setNoivoPai(String noivoPai) {
        this.noivoPai = noivoPai;
    }

    public String getNoivoMae() {
        return this.noivoMae;
    }

    public void setNoivoMae(String noivoMae) {
        this.noivoMae = noivoMae;
    }

    public Date getNoivoDtNascimento() {
        return this.noivoDtNascimento;
    }

    public void setNoivoDtNascimento(Date noivoDtNascimento) {
        this.noivoDtNascimento = noivoDtNascimento;
    }

    public String getNoivoNatural() {
        return this.noivoNatural;
    }

    public void setNoivoNatural(String noivoNatural) {
        this.noivoNatural = noivoNatural;
    }

    public String getNoivoBatizParoq() {
        return this.noivoBatizParoq;
    }

    public void setNoivoBatizParoq(String noivoBatizParoq) {
        this.noivoBatizParoq = noivoBatizParoq;
    }

    public String getNoivoBatizDiocese() {
        return this.noivoBatizDiocese;
    }

    public void setNoivoBatizDiocese(String noivoBatizDiocese) {
        this.noivoBatizDiocese = noivoBatizDiocese;
    }

    public String getNoivoEndereco() {
        return this.noivoEndereco;
    }

    public void setNoivoEndereco(String noivoEndereco) {
        this.noivoEndereco = noivoEndereco;
    }

    public String getNoivoBairro() {
        return this.noivoBairro;
    }

    public void setNoivoBairro(String noivoBairro) {
        this.noivoBairro = noivoBairro;
    }

    public Character getNoivoBatizado() {
        return this.noivoBatizado;
    }

    public void setNoivoBatizado(Character noivoBatizado) {
        this.noivoBatizado = noivoBatizado;
    }

    public Integer getNoivoBatizLivro() {
        return this.noivoBatizLivro;
    }

    public void setNoivoBatizLivro(Integer noivoBatizLivro) {
        this.noivoBatizLivro = noivoBatizLivro;
    }

    public Integer getNoivoBatizFolha() {
        return this.noivoBatizFolha;
    }

    public void setNoivoBatizFolha(Integer noivoBatizFolha) {
        this.noivoBatizFolha = noivoBatizFolha;
    }

    public Integer getNoivoBatizTermo() {
        return this.noivoBatizTermo;
    }

    public void setNoivoBatizTermo(Integer noivoBatizTermo) {
        this.noivoBatizTermo = noivoBatizTermo;
    }

    public String getNoivaPai() {
        return this.noivaPai;
    }

    public void setNoivaPai(String noivaPai) {
        this.noivaPai = noivaPai;
    }

    public String getNoivaMae() {
        return this.noivaMae;
    }

    public void setNoivaMae(String noivaMae) {
        this.noivaMae = noivaMae;
    }

    public Date getNoivaDtNascimento() {
        return this.noivaDtNascimento;
    }

    public void setNoivaDtNascimento(Date noivaDtNascimento) {
        this.noivaDtNascimento = noivaDtNascimento;
    }

    public String getNoivaNatural() {
        return this.noivaNatural;
    }

    public void setNoivaNatural(String noivaNatural) {
        this.noivaNatural = noivaNatural;
    }

    public String getNoivaBatizParoq() {
        return this.noivaBatizParoq;
    }

    public void setNoivaBatizParoq(String noivaBatizParoq) {
        this.noivaBatizParoq = noivaBatizParoq;
    }

    public String getNoivaBatizDiocese() {
        return this.noivaBatizDiocese;
    }

    public void setNoivaBatizDiocese(String noivaBatizDiocese) {
        this.noivaBatizDiocese = noivaBatizDiocese;
    }

    public String getNoivaEndereco() {
        return this.noivaEndereco;
    }

    public void setNoivaEndereco(String noivaEndereco) {
        this.noivaEndereco = noivaEndereco;
    }

    public String getNoivaBairro() {
        return this.noivaBairro;
    }

    public void setNoivaBairro(String noivaBairro) {
        this.noivaBairro = noivaBairro;
    }

    public String getNoivoPergunta1() {
        return this.noivoPergunta1;
    }

    public void setNoivoPergunta1(String noivoPergunta1) {
        this.noivoPergunta1 = noivoPergunta1;
    }

    public String getNoivoPergunta2() {
        return this.noivoPergunta2;
    }

    public void setNoivoPergunta2(String noivoPergunta2) {
        this.noivoPergunta2 = noivoPergunta2;
    }

    public String getNoivoPergunta3() {
        return this.noivoPergunta3;
    }

    public void setNoivoPergunta3(String noivoPergunta3) {
        this.noivoPergunta3 = noivoPergunta3;
    }

    public String getNoivoPergunta4() {
        return this.noivoPergunta4;
    }

    public void setNoivoPergunta4(String noivoPergunta4) {
        this.noivoPergunta4 = noivoPergunta4;
    }

    public String getNoivoPergunta5() {
        return this.noivoPergunta5;
    }

    public void setNoivoPergunta5(String noivoPergunta5) {
        this.noivoPergunta5 = noivoPergunta5;
    }

    public String getNoivoPergunta6() {
        return this.noivoPergunta6;
    }

    public void setNoivoPergunta6(String noivoPergunta6) {
        this.noivoPergunta6 = noivoPergunta6;
    }

    public String getNoivaPergunta1() {
        return this.noivaPergunta1;
    }

    public void setNoivaPergunta1(String noivaPergunta1) {
        this.noivaPergunta1 = noivaPergunta1;
    }

    public String getNoivaPergunta2() {
        return this.noivaPergunta2;
    }

    public void setNoivaPergunta2(String noivaPergunta2) {
        this.noivaPergunta2 = noivaPergunta2;
    }

    public String getNoivaPergunta3() {
        return this.noivaPergunta3;
    }

    public void setNoivaPergunta3(String noivaPergunta3) {
        this.noivaPergunta3 = noivaPergunta3;
    }

    public String getNoivaPergunta4() {
        return this.noivaPergunta4;
    }

    public void setNoivaPergunta4(String noivaPergunta4) {
        this.noivaPergunta4 = noivaPergunta4;
    }

    public String getNoivaPergunta5() {
        return this.noivaPergunta5;
    }

    public void setNoivaPergunta5(String noivaPergunta5) {
        this.noivaPergunta5 = noivaPergunta5;
    }

    public String getNoivaPergunta6() {
        return this.noivaPergunta6;
    }

    public void setNoivaPergunta6(String noivaPergunta6) {
        this.noivaPergunta6 = noivaPergunta6;
    }

    public Character getNoivaBatizada() {
        return this.noivaBatizada;
    }

    public void setNoivaBatizada(Character noivaBatizada) {
        this.noivaBatizada = noivaBatizada;
    }

    public Integer getNoivaBatizLivro() {
        return this.noivaBatizLivro;
    }

    public void setNoivaBatizLivro(Integer noivaBatizLivro) {
        this.noivaBatizLivro = noivaBatizLivro;
    }

    public Integer getNoivaBatizFolha() {
        return this.noivaBatizFolha;
    }

    public void setNoivaBatizFolha(Integer noivaBatizFolha) {
        this.noivaBatizFolha = noivaBatizFolha;
    }

    public Integer getNoivaBatizTermo() {
        return this.noivaBatizTermo;
    }

    public void setNoivaBatizTermo(Integer noivaBatizTermo) {
        this.noivaBatizTermo = noivaBatizTermo;
    }

    public Date getDtDialogo() {
        return this.dtDialogo;
    }

    public void setDtDialogo(Date dtDialogo) {
        this.dtDialogo = dtDialogo;
    }

    public String getComunidadeMorar() {
        return this.comunidadeMorar;
    }

    public void setComunidadeMorar(String comunidadeMorar) {
        this.comunidadeMorar = comunidadeMorar;
    }

    public String getPadreNome() {
        return this.padreNome;
    }

    public void setPadreNome(String padreNome) {
        this.padreNome = padreNome;
    }

    public String getBispoNome() {
        return this.bispoNome;
    }

    public void setBispoNome(String bispoNome) {
        this.bispoNome = bispoNome;
    }

    public Date getDtHrCasamento() {
        return this.dtHrCasamento;
    }

    public void setDtHrCasamento(Date dtHrCasamento) {
        this.dtHrCasamento = dtHrCasamento;
    }

    public Character getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public String getParoquiatransferida() {
        return this.paroquiatransferida;
    }

    public void setParoquiatransferida(String paroquiatransferida) {
        this.paroquiatransferida = paroquiatransferida;
    }

    public String getParoco() {
        return this.paroco;
    }

    public void setParoco(String paroco) {
        this.paroco = paroco;
    }

}