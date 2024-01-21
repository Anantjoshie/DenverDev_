package com.CloudTech.DenverDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class DenverDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenverDevApplication.class, args);
		System.out.println("Hello Guys");
	}

}
