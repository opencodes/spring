package com.rkjha.hibernet;

import com.rkjha.hibernet.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {
    public static void main(String[] args) {
        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate-one-to-one.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .buildSessionFactory();
        // Create Session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();
        }catch (Exception e){
            System.out.println("Some Error ");
        }
    }
}
