package com.soft;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Employee;

public class App {
    public static void main(String[] args) {
        
    	
    Configuration confg = new Configuration();
    confg.configure("com/soft/cnfg/hibernate.cfg.xml");
    
    SessionFactory factory = confg.buildSessionFactory();
    Session session = factory.openSession();
    Employee emp = new Employee();
    
    
    emp.setEmpName("vaibhav");
    emp.setAddress("Nanded");
    emp.setSalary(50000);
    
    Transaction tx = session.beginTransaction();
    
    session.persist(emp);
    
    tx.commit();
    
    }
}
