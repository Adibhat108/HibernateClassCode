package edu.jspider.hibernateop.util;

import edu.jspider.hibernateop.dao.EmployeeDAO;
import edu.jspider.hibernateop.dto.EmployeeDTO;

public class UpdateUtil {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		
		dao.updateSal(3, 12);
		
		
	}

}
