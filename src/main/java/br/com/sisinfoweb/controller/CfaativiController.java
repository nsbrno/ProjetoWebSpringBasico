/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisinfoweb.controller;

import br.com.sisinfoweb.banco.beans.RetornoWebServiceBeans;
import br.com.sisinfoweb.banco.beans.StatusRetornoWebServiceBeans;
import br.com.sisinfoweb.banco.values.MensagemPadrao;
import static br.com.sisinfoweb.controller.BaseMyController.logger;
import br.com.sisinfoweb.entity.CfaativiEntity;
import br.com.sisinfoweb.entity.SmadispoEntity;
import br.com.sisinfoweb.service.CfaativiService;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.net.HttpURLConnection;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bruno
 */
@Controller
public class CfaativiController extends BaseMyController{
    
    @Autowired
    private CfaativiService cfaativiService;
    
    @RequestMapping(value = {"/Cfaativi"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    @Override
    public String initJson( Model model, 
                            @RequestHeader() HttpHeaders httpHeaders, 
                            HttpServletResponse response, 
                            @RequestParam(name = "dispositivo", required = true) String dispositivo,
                            @RequestParam(name = "columnSelected", required = false) String columnSelected,
                            @RequestParam(name = "where", required = false) String where,
                            @RequestParam(name = "resume", required = false, defaultValue = "false") Boolean resume,
                            @RequestParam(name = "sqlQuery", required = false) String sqlQuery) {
        
        StatusRetornoWebServiceBeans statusRetorno = new StatusRetornoWebServiceBeans();
        RetornoWebServiceBeans retornoWebService = new RetornoWebServiceBeans();
        try{
            // Coverte o dispositivo passado no formato json em uma entidade
            SmadispoEntity smadispoEntity = new Gson().fromJson(dispositivo, SmadispoEntity.class);
            cfaativiService.setSmadispoEntity(smadispoEntity);
            
            List<CfaativiEntity> lista;
            // Checa se foi passado alqum parametro para filtrar
            if ( ((sqlQuery != null) && (!sqlQuery.isEmpty())) || 
                    ((columnSelected != null) && (!columnSelected.isEmpty())) || 
                    ((where != null) && (!where.isEmpty())) ){
                // Pesquisa de acordo com o sql passado
                lista = cfaativiService.findCustomNativeQueryClient(resume, sqlQuery, columnSelected, where);
            
            } else {
                lista = cfaativiService.findAllClient();
            }
            // Cria uma vareavel para retorna o status
            statusRetorno.setCodigoRetorno(HttpURLConnection.HTTP_OK);
            statusRetorno.setMensagemRetorno(String.valueOf(HttpStatus.OK));
            
            // Adiciona o status
            retornoWebService.statusRetorno = statusRetorno;
            // Adiciona os dados que eh pra ser retornado
            retornoWebService.object = lista;
            
            return new Gson().toJson(retornoWebService);
        } catch(JsonSyntaxException e){
            logger.error(getClass().getSimpleName() + " - " + e.getMessage());
            
            // Cria uma vareavel para retorna o status
            statusRetorno.setCodigoRetorno(HttpURLConnection.HTTP_INTERNAL_ERROR);
            statusRetorno.setMensagemRetorno(MensagemPadrao.ERROR_STRUCT_JSON + " | " + e.getMessage());
            statusRetorno.setExtra(e.toString());
            
            // Adiciona o status
            retornoWebService.statusRetorno = statusRetorno;
            
            return new Gson().toJson(retornoWebService);
        } catch(Exception e){
            logger.error(getClass().getSimpleName() + " - " + e.getMessage());
            
            // Cria uma vareavel para retorna o status
            statusRetorno.setCodigoRetorno(HttpURLConnection.HTTP_INTERNAL_ERROR);
            statusRetorno.setMensagemRetorno(MensagemPadrao.ERROR_FIND + " | " + e.getMessage());
            statusRetorno.setExtra(e.toString());
            
            // Adiciona o status
            retornoWebService.statusRetorno = statusRetorno;
            
            return new Gson().toJson(retornoWebService);
        } finally{
            cfaativiService.closeEntityManager();
        }
    }
        
}
