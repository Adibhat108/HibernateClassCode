package edu.jspider.hibernateop.util;

import edu.jspider.hibernateop.dao.EmployeeDAO;
import edu.jspider.hibernateop.dto.EmployeeDTO;

public class InsertUtil 
{
	public static void main(String[] args) {
		EmployeeDTO dto = new EmployeeDTO();
		EmployeeDAO dao = new EmployeeDAO();
		
		dto.setEmpid(3);
		dto.setName("Trinity");
		dto.setGender("Female");
		dto.setDesignation("Hacker");
		dto.setSalary(15);
		dao.create(dto);
	}
}
