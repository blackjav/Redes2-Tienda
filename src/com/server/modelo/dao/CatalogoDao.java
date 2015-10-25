/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.modelo.dao;

import com.server.modelo.Catalogo;
import java.util.List;

/**
 *
 * @author javier
 */
public interface CatalogoDao {
    
    public void save(Catalogo cat)throws  Exception;
    public void update(Catalogo cat) throws Exception;
    public void delete(Catalogo cat) throws Exception;
    public Catalogo load(Catalogo cat) throws Exception;
    public List loadAll() throws Exception;



    
    
}
