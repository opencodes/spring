package com.rkjha.hibernet;

import com.rkjha.hibernet.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateQueryDemo {
    public static void main(String[] args) {
        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        // Create Session
        Session session = factory.getCurrentSession();

        try {
            // Use the session object to save java object

            // start a transaction
            session.beginTransaction();
            Student tempStudent = session.get(Student.class, 1);

            System.out.printf(tempStudent.getEmail());
            session.createQuery("update Student set email='me@newmail.com'").executeUpdate();

            // commit transaction
            session.getTransaction().commit();

        } catch (Exception e) {
            // TODO: handle exception
            factory.close();
        }
    }
}
