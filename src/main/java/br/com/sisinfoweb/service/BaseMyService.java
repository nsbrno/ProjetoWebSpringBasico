/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisinfoweb.service;

import br.com.sisinfoweb.funcoes.FuncoesPersonalizadas;
import br.com.sisinfoweb.repository.BaseMyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Bruno
 * @param <R>
 * @param <E>
 */
public class BaseMyService<R extends BaseMyRepository, E> {
    
    public String COLUMNS_RESUME = null;
    
    @Autowired
    private final R baseMyRepository;

    public BaseMyService(R smaempreRepository) {
        this.baseMyRepository = smaempreRepository;
    }

    
    public List<E> findAll() {
        return baseMyRepository.findAll();
    }

    public List<E> findCustomNativeQuery(Boolean resume, String sqlCustomParam, String columns, String where) {
        // Cria um sql nativo se nao for passado um sqlCustom por parametro
        String sqlQuery;
        
        if((sqlCustomParam != null) && (!sqlCustomParam.isEmpty())){
            sqlQuery = sqlCustomParam;
        
        } else {
            // Checa se eh uma pesquisa com colunas resumidas
            if (resume) {
                sqlQuery = new FuncoesPersonalizadas().construirSelectFromParamJson(this.getClass().getSimpleName().toUpperCase().replace("SERVICE", ""), COLUMNS_RESUME, where);
            
            } else {
                sqlQuery = new FuncoesPersonalizadas().construirSelectFromParamJson(this.getClass().getSimpleName().toUpperCase().replace("SERVICE", ""), columns, where);
            }
        }
        return baseMyRepository.findCustomNativeQuery(sqlQuery);
    }
}
