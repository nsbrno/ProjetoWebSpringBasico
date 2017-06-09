/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisinfoweb.service;

import br.com.sisinfoweb.entity.CfaclifoEntity;
import br.com.sisinfoweb.repository.CfaclifoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */
@Service
@Transactional
public class CfaclifoService extends BaseMyService<CfaclifoRepository, CfaclifoEntity>{
 
    
    public CfaclifoService(CfaclifoRepository smaempreRepository) {
        super(smaempreRepository);
    }
}
