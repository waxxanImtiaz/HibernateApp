/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.EmployeeLogin;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;
import org.hibernate.criterion.Restrictions;

public class ValueGetterFromDatabase {

    public static void main(String[] args) {
        Configuration c = new Configuration();
        c.configure("xml/hibernate.cfg.xml");

        SessionFactory sf = c.buildSessionFactory();
        Session ses = sf.openSession();

        Criteria cr = ses.createCriteria(EmployeeLogin.class);
        cr.add(Restrictions.eq("id", 2));
        List<EmployeeLogin> results = cr.list();

        EmployeeLogin l = results.get(0);
        System.out.println(l.getUsername());

        ses.close();
        sf.close();
    }

}
