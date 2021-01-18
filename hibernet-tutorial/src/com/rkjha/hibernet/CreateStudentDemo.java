package com.rkjha.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rkjha.hibernet.entity.Student;

public class CreateStudentDemo {

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
			Student tempStudent = new Student("Rajesh", "Jha", "rkjha.it.in@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save student
			session.save(tempStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			factory.close();
		}
	}

}
