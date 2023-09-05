package ITEmployee;

public interface MyCredentials {
	
	public String generatePassword (EmployeeCredentials employee);
	
	public String generateEmail(String fname, String lname, String department,EmployeeCredentials employee);
	
	public void showCredentials(EmployeeCredentials employee);
	
}
