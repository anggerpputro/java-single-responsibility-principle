package domain.dao;
import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {

	DatabaseConnectionManager databaseConnectionManager;
	
	public EmployeeDAO() {
		this.databaseConnectionManager = new DatabaseConnectionManager();
	}
	
	
	public void saveEmployee(Employee employee) {
		this.databaseConnectionManager.connect();
		System.out.println("Saving employee: " + employee.toString());
		this.databaseConnectionManager.disconnect();
	}

	public void deleteEmployee(Employee employee) {
		this.databaseConnectionManager.connect();
		System.out.println("Deleting employee: " + employee.toString());
		this.databaseConnectionManager.disconnect();
	}
}
