package edu.jspider.hibernateop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspider.hibernateop.dto.EmployeeDTO;

public class EmployeeDAO {

public void create(EmployeeDTO emp)
{
	Configuration config = new Configuration();
	
	config.configure().addAnnotatedClass(EmployeeDTO.class);
	
	SessionFactory factory = config.buildSessionFactory();//creates a pool of conn. objects based on configuration object.
	
	Session session = factory.openSession();//session is representation of connection
	
	session.save(emp);
	
	Transaction tx = session.beginTransaction();
	
	tx.commit();
	
	session.close();
	
	factory.close();
	
}
public EmployeeDTO read(int empID)
{
	Configuration config = new Configuration();
	
	config.configure().addAnnotatedClass(EmployeeDTO.class);
	
	SessionFactory factory = config.buildSessionFactory();
	
	Session session = factory.openSession();
	
	EmployeeDTO emp = session.get(EmployeeDTO.class, empID);
	
	Transaction tx = session.beginTransaction();
	
	tx.commit();
	
	session.close();
	
	factory.close();
	
	return emp;
}

public EmployeeDTO updateSal(int empID, int sal) {
	Configuration config = new Configuration();
	
	config.configure().addAnnotatedClass(EmployeeDTO.class);
	
	SessionFactory factory = config.buildSessionFactory();
	
	Session session = factory.openSession();
	
	EmployeeDTO emp = session.get(EmployeeDTO.class, empID);
	
	

	if(emp != null) {
		
		emp.setSalary(sal);
		session.update(emp);
		
	}
	else {
		System.out.println("Employee with Id "+ empID +" does not exist");
	}
	
	Transaction tx = session.beginTransaction();
	
	tx.commit();
	
	session.close();
	
	factory.close();
	
	return emp;
	}

	public EmployeeDTO delete(int empID) {
		Configuration config = new Configuration();
		
		config.configure().addAnnotatedClass(EmployeeDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		EmployeeDTO emp = session.get(EmployeeDTO.class, empID);
		
		
		if(emp != null) {
			session.delete(emp);
		}
		else {
			System.out.println("Employee with Id "+ empID +"does not exist");
		}
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
		
		factory.close();
		
		return emp;
	}
}
