package contact;

public class ContactClass {
	private String ID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String contactAddress;
	
	public ContactClass(String ID, String firstName, String lastName, String phoneNumber, String contactAddress) {
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(contactAddress == null || contactAddress.length()>30) {
			throw new IllegalArgumentException("Invalid contact address");
		}
		
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.contactAddress = contactAddress;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public String getcontactAddress() {
		return contactAddress;
	}
	
	public void setfirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}		
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}		
		this.lastName = lastName;
	}
	
	public void setphoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid phone number");
		}		
		this.phoneNumber = phoneNumber;
	}
	
	public void setcontactAddress(String contactAddress) {
		if(contactAddress == null || contactAddress.length()>30) {
			throw new IllegalArgumentException("Invalid contact address");
		}		
		this.contactAddress = contactAddress;
	}	
}
