package PkTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import PkAdmin.AdminManagement;
import PkCustomer.CustomerPanel;
import PkCustomer.CustomerRecord;
import PkDelivery.DeliveryStaffDetails;

class AdminManagementTest {
	
	AdminManagement admin = new AdminManagement();
	CustomerRecord customer = new CustomerRecord();
	DeliveryStaffDetails courier = new DeliveryStaffDetails();
	CustomerPanel cPanel = new CustomerPanel();

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
	void testareCustomerPanel() {
		assertEquals(2, cPanel.indext = 2);
	}
	
	@Test
	void testareCustomerPanel2() {
		assertEquals(1, cPanel.indext = 2);
	}
	
	@Test
	void testareCustomerPanel3() {
		assertEquals("", cPanel.indext = 2);
	}
	
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
	
	@Test
	void testareGetUserName3()
	{
		assertEquals(null, customer.getUsername());
	}
	
	@Test
	void testareGetPassword() {
		assertEquals(null, customer.getPassword());
	}
	
	@Test
	void testareGetEmail() {
		assertEquals(null, customer.getEmail());
	}
	
	@Test
	void testareGetId() {
		assertEquals(null, customer.getId());
	}
	
	@Test
	void testareGetPhoneNo() {
		assertEquals(null, customer.getPhonNO());
	}
	
	@Test
	void testareCustomerLoginNull() {
		assertEquals(-1, customer.Customerlogin(null, null));
	}
	
	@Test
	void testareCustomerLogin() {
		assertEquals(1, customer.Customerlogin("", ""));
	}
	
	@Test
	void testareSearchCustomer() {
		assertEquals(false, customer.search("2"));
	}
	
	@Test
	void testareSearchCustomerNull(){
		assertEquals(false, customer.search(null));
	}
	
	@Test
	void testareCustomerSearch2() {
		assertEquals(false, customer.search2("Madalin"));
	}
	
	@Test
	void testareCustomerSearch3() {
		assertEquals(true, customer.search2(""));
	}
	
	// testare pentru staff 
	
	@Test
	void testareLoginStaff(){
		assertEquals(-1,courier.Stafflogin(null, null));
	}
	
	@Test 
	void testareLoginStaff2() {
		assertEquals(1, courier.Stafflogin("Madalin", ""));
	}

	@Test 
	void testareLoginStaff3() {
		assertEquals(-1, courier.Stafflogin("Madalin", ""));
	}
	
	@Test 
	void testareLoginStaff4() {
		assertEquals(-1, courier.Stafflogin("", ""));
	}
	
	// testare delivery staffdetails
	
	@Test
	void testareSearch() {
		assertEquals(false, courier.search(""));
	}
	@Test
	void testareSearch2() {
		assertEquals(true, courier.search(""));
	}
	
	@Test
	void testareSearch3() {
		assertEquals(false, courier.search2(""));
	}
	
	@Test
	void testareSearch4() {
		assertEquals(true, courier.search2("Madalin"));
	}

}
