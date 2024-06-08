package com.dhathika.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dhathika")
public class AppConfig {
	
//	@Bean
//	public Customer customer() {
//		Customer customer = new Customer();
//		customer.setCustomerId(1023);
//		customer.setCustomerName("Sohel");
//		customer.setCustomerContact(89703);
////		customer.setCustomerAddress(address1());
//		return customer;
//	}
//     @Bean
//	public Address address() {
//		Address address = new Address();
//		address.setDoorNo(307);
//		address.setStreetName("BhagathStreet");
//		address.setCity("Tirupathi");
//		address.setState("AP");
//		address.setPin(515571);
//		return address;
//	}
//     
//     @Bean
// 	public Address address1() {
// 		Address address = new Address();
// 		address.setDoorNo(307);
// 		address.setStreetName("Azadstreet");
// 		address.setCity("Bangalore");
// 		address.setState("ka");
// 		address.setPin(515571);
// 		return address;
// 	}
//	@Bean
//	public Landmark landmark() {
//		Landmark landmark = new Landmark();
//		landmark.setLandmarkname("opposite to police station");
//		landmark.setLandmarkdistance(50);
//		return landmark;
//	}
}
