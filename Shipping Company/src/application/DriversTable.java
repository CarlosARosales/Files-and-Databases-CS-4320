package application;

public class DriversTable {
	
	String driverID, firstName, lastName;

	public DriversTable(String driverID, String firstName, String lastName) {
		this.driverID = driverID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
