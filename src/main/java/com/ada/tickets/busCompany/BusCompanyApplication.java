package com.ada.tickets.busCompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class BusCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusCompanyApplication.class, args);
	}

}
