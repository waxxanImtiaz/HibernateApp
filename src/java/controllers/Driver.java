/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.EmployeeLogin;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Eureka
 */
public class Driver {
    public static void main(String[] args) {
        Configuration c = new Configuration();
        c.configure("xml/hibernate.cfg.xml");
        
        SessionFactory sf = c.buildSessionFactory();
        Session ses = sf.openSession();
        
        EmployeeLogin e = new EmployeeLogin();
        
        e.setId(3);
        e.setUsername("Ghulam Ali");
        e.setPassword("xyz");
        
        Transaction t = ses.beginTransaction();
        
        ses.save(e);
        
        t.commit();
        ses.evict(e);
        
        ses.close();
        sf.close();
    }
   
}
