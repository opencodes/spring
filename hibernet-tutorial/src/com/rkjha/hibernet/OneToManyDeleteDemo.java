package com.rkjha.hibernet;

import com.rkjha.hibernet.entity.Course;
import com.rkjha.hibernet.entity.Instructor;
import com.rkjha.hibernet.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyDeleteDemo {
    public static void main(String[] args) {
        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate-one-to-one.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        // Create Session
        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            Course course = session.get(Course.class, 10);
            session.delete(course);
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println("Some Error ");
            session.close();
            factory.close();
        }
    }
}
