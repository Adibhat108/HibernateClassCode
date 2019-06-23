package edu.jspider.hibernateop.util;

import edu.jspider.hibernateop.dao.EmployeeDAO;
import edu.jspider.hibernateop.dto.EmployeeDTO;

public class GetUtil {

	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAO();
		
		EmployeeDTO dto = dao.read(2);
		
		String empName = dto.getName();
		System.out.println(dto);
		System.out.println(dto.getDesignation());
		System.out.println(empName);
		System.out.println(dto.getSalary());

		
	}

}
