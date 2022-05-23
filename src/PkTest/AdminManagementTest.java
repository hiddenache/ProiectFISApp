package PkTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import PkAdmin.AdminManagement;
import PkCustomer.CustomerRecord;
import PkDelivery.DeliveryStaffDetails;

class AdminManagementTest {
	
	AdminManagement admin = new AdminManagement();
	CustomerRecord customer = new CustomerRecord();
	DeliveryStaffDetails courier = new DeliveryStaffDetails();

	//testare pentru admin
	@Test
	void testAddStaff() throws IOException {
		//admin.AddStaff("Madalin", "2", "admin", "12345", "email", "0767343");
		assertTrue(courier.getName().equals("Madalin") &&
				courier.getId().equals("2") &&
				courier.getUsername().equals("admin") &&
				courier.getPassword().equals("12345") &&
				courier.getEmail().equals("email") &&
				courier.getPhonNO().equals("0767343"));
	}
	@Test
	void testSearchCustomer() {
		assertEquals("1", admin.searchCustomer("1"));
	}
	
	@Test
	void testSearchCustomer2() {
		assertEquals(-1, admin.searchCustomer(""));
	}

	@Test
	void testSearchOrderFirst1() {
		assertEquals("1", admin.searchOrder("1"));
	}
	
	@Test
	void testSearchOrderFirst2() {
		assertEquals(-1, admin.searchOrder(""));
	}

	@Test
	void testSearchOrder2() {
		assertEquals(-1, admin.searchOrder2(" "," "));
	}
	
	@Test
	void testSearchOrder3() {
		assertEquals(2, admin.searchOrder2(" "," "));
	}
	
	//testare pentru customer
	
	@Test
	void testareGetNume() {
		assertEquals(null, customer.getName());
	}
	@Test
	void testareGetNume2() {
		customer.setName("Madalin");		
		assertTrue(customer.getName().equals("Madalin")); // verifica daca relatia este adevarata
	}
	@Test
	void testareGetNume3() {
		customer.setName(null);
		assertTrue(customer.getName().equals(null));
	}
	@Test
	void testareGetUsername() {
		customer.setUsername("username");
		assertTrue(customer.getName().equals("username"));
	}
	@Test
	void testareGetUsername2() {
		customer.setUsername(null);
		assertTrue(customer.getName().equals(null));
	}
	
	// testare pentru staff 
	
	@Test
	void testareLoginStaff(){
		assertEquals(-1,courier.Stafflogin(null, null));
	}

}
