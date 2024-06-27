package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.ContactClass;
import contact.ContactServiceClass;

class ContactServiceClassTest {

	@Test
	void testAddContact() {
		ContactServiceClass contactServiceClass = new ContactServiceClass();
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactServiceClass.addContact(contactClass);
		assertNotNull(contactServiceClass.getContact("12345"));
	}
	
	@Test
	void testAddContactExistingID() {
		ContactServiceClass contactServiceClass = new ContactServiceClass();
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactServiceClass.addContact(contactClass);
		assertNotNull(contactServiceClass.getContact("12345"));
		ContactClass contactClass2 = new ContactClass("12345", "Jack", "Sparrow", "0987654321", "Wonderful St, World 54321");		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		contactServiceClass.addContact(contactClass2);	
		});
	}
	
	@Test
	void testDeleteContact() {
		ContactServiceClass contactServiceClass = new ContactServiceClass();
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactServiceClass.addContact(contactClass);
		contactServiceClass.deleteContact("12345");
		assertNull(contactServiceClass.getContact("12345"));
	}
	
	@Test
	void testUpdateContact() {
		ContactServiceClass contactServiceClass = new ContactServiceClass();
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactServiceClass.addContact(contactClass);
		assertNotNull(contactServiceClass.getContact("12345"));
		ContactClass contactClass2 = new ContactClass("12345", "Jack", "Sparrow", "0987654321", "Wonderful St, World 54321");
		contactServiceClass.updateContact(contactClass2);
		ContactClass actualContact = contactServiceClass.getContact("12345");
		assertNotNull (actualContact);
		assertEquals (contactClass2.getfirstName(), actualContact.getfirstName());
		assertEquals (contactClass2.getlastName(), actualContact.getlastName());
		assertEquals (contactClass2.getphoneNumber(), actualContact.getphoneNumber());
		assertEquals (contactClass2.getcontactAddress(), actualContact.getcontactAddress());
	}
	
	@Test
	void testUpdateContactNonExistingContact() {
		ContactServiceClass contactServiceClass = new ContactServiceClass();
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactServiceClass.addContact(contactClass);
		assertNotNull(contactServiceClass.getContact("12345"));
		ContactClass contactClass2 = new ContactClass("54321", "Jack", "Sparrow", "0987654321", "Wonderful St, World 54321");
		contactServiceClass.updateContact(contactClass2);
		ContactClass actualContact = contactServiceClass.getContact("54321");
		assertNull (actualContact);
	}	
}
