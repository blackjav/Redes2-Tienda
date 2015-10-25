/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author javier
 */
public class HibernateUtil {


    private static SessionFactory sessionFactory;

   static {
        try {
//             Create the SessionFactory from hibernate.cfg.xml
//           sessionFactory = new Configuration().configure("confiHibernate/hibernate.cfg.xml")
//                   .buildSessionFactory(new StandardServiceRegistryBuilder().build());
        	
        	 Configuration configuration = new Configuration();
        	 configuration.configure();
        	 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        	 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        	 
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
