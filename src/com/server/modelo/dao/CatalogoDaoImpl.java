/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.modelo.dao;

import com.controlador.HibernateUtil;
import com.server.modelo.Catalogo;
import java.util.List;
import org.hibernate.HibernateError;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author javier
 */
public class CatalogoDaoImpl implements CatalogoDao{
    
    

    @Override
    public void save(Catalogo cat) {
        
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        try{
            
            tx.begin();
            session.save(cat);
            tx.commit();
            
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
        
    }

    @Override
    public void update(Catalogo cat) throws Exception {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.saveOrUpdate(cat);
            tx.commit();
//            session.close();
           
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }

    @Override
    public void delete(Catalogo cat) throws Exception {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.delete(cat);
            tx.commit();
//            session.close();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }

    @Override
    public Catalogo load(Catalogo cat) throws Exception {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            cat = (Catalogo)session.get(Catalogo.class, cat.getId());
            tx.commit();
//           session.close();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
         return cat;
    }

    @Override
    public List loadAll() throws Exception {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        List list = null; 
        
        try{
            tx.begin();
            Query q = session.createQuery("from Catalogo"); 
            list=q.list();
            tx.commit();
//            session.close();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
        return list;
    }
    
    
}
