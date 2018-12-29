package clients;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

	public static void main(String args[]) {
		
		Employee employee1 = new Employee(1, "Angger Priyardhan Putro", "IT", true);
		
		ClientModule.hireNewEmployee(employee1);
		
		ClientModule.terminateEmployee(employee1);
		
		ClientModule.printEmployeeReport(employee1);
	}
	
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO ed = new EmployeeDAO();
		ed.saveEmployee(employee);
	}

	public static void terminateEmployee(Employee employee) {
		EmployeeDAO ed = new EmployeeDAO();
		ed.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee) {
		EmployeeReportFormatter erf = new EmployeeReportFormatter(employee, FormatType.XML);
		System.out.println(erf.getFormattedEmployee());
	}
}
