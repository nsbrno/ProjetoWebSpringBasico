/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisinfoweb.service;

import br.com.sisinfoweb.repository.SmaempreRepository;
import br.com.sisinfoweb.repository.SmausuarRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */
@Transactional
@Service
public class InicializacaoBancoDadosService {
    
    @Autowired
    private SmaempreRepository smaempreRepository;
    
}
