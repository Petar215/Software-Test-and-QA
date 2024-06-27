package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactServiceClass {
	private Map<String, ContactClass> mapOfContacts = new HashMap<String, ContactClass>();
	
	// adding a new record	
	public void addContact(ContactClass contactClass) {
		if (mapOfContacts.containsKey(contactClass.getID())) {
			throw new IllegalArgumentException("Contact ID must be unique");
		}
		mapOfContacts.put(contactClass.getID(), contactClass);
	}
	
	// deleting a record	
	public void deleteContact(String ID) {
		mapOfContacts.remove(ID);
	}
	
	public ContactClass getContact(String ID) {
		ContactClass contactClass = mapOfContacts.get(ID);
		return contactClass;
	}

	public void updateContact(ContactClass contact) {
		ContactClass existingContact = getContact(contact.getID());
		if (existingContact == null) {
			return;
		}
		existingContact.setfirstName(contact.getfirstName());
		existingContact.setlastName(contact.getlastName());
		existingContact.setphoneNumber(contact.getphoneNumber());
		existingContact.setcontactAddress(contact.getcontactAddress());			
	}
}
