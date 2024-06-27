package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.ContactClass;


class ContactClassTest {

	@Test
	void testContactClass() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		assertTrue(contactClass.getID().equals("12345"));
		assertTrue(contactClass.getfirstName().equals("John"));
		assertTrue(contactClass.getlastName().equals("Smith"));
		assertTrue(contactClass.getphoneNumber().equals("1234567890"));
		assertTrue(contactClass.getcontactAddress().equals("Beautiful St, World 12345"));		
	}
	
	@Test
	void testContactClassIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345678901", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		});		}

	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "Johnny Morris", "Smith", "1234567890", "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "John", "Smithsonian", "1234567890", "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactClassPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "John", "Smith", "12345678901", "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactClassPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "John", "Smith", "123456789", "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "John", "Smith", "1234567890", "Maybe is Beautiful Maybe is not St, World 12345");
		});		}
	
	@Test
	void testContactClassIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass(null, "John", "Smith", "1234567890", "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", null, "Smith", "1234567890", "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "John", null, "1234567890", "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactClassPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "John", "Smith", null, "Beautiful St, World 12345");
		});		}
	
	@Test
	void testContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345", "John", "Smith", "1234567890", null);
		});		}
	
	@Test
	void testSetFirstName() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactClass.setfirstName("Jack");
		assertEquals(contactClass.getfirstName(),"Jack");
	}
	
	@Test
	void testSetFirstNameTooLong() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setfirstName("Jack Jackolson");
		});	
	}
	
	@Test
	void testSetFirstNameNull() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setfirstName(null);
		});	
	}
	
	@Test
	void testSetLastName() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactClass.setlastName("Sparrow");
		assertEquals(contactClass.getlastName(),"Sparrow");
	}
	
	@Test
	void testSetLastNameTooLong() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setlastName("Sparrow Sparrowson");
		});	
	}
	
	@Test
	void testSetLastNameNull() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setlastName(null);
		});	
	}
	
	@Test
	void testSetPhoneNumber() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactClass.setphoneNumber("9876543210");
		assertEquals(contactClass.getphoneNumber(),"9876543210");
	}
	
	@Test
	void testSetPhoneNumberTooLong() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setphoneNumber("12345678909");
		});	
	}
	
	@Test
	void testSetPhoneNumberTooShort() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setphoneNumber("123456789");
		});	
	}
	
	@Test
	void testSetPhoneNumberNull() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setphoneNumber(null);
		});	
	}
	
	@Test
	void testSetContactAddress() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		contactClass.setcontactAddress("Wonderful St, World 12345");
		assertEquals(contactClass.getcontactAddress(),"Wonderful St, World 12345");
	}
	
	@Test
	void testSetContactAddressTooLong() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setcontactAddress("Wonderful St, World 12345 Wonderful St, World 12345 Wonderful St, World 12345");
		});	
	}
	
	@Test
	void testSetContactAddressNull() {
		ContactClass contactClass = new ContactClass("12345", "John", "Smith", "1234567890", "Beautiful St, World 12345");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactClass.setcontactAddress(null);
		});	
	}
}
