package edu.jspider.hibernateop.util;

import edu.jspider.hibernateop.dao.EmployeeDAO;

public class DeleteUtil {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();


		dao.delete(10);
	
	}

}
