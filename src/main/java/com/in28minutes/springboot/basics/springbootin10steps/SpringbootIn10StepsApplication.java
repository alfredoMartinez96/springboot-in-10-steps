package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/*1.-indica que es un archivo de notacion de contexto spring
 2.-habilita algo llamado configuracion automatica
 3.-habilita algo llamado escaneo de componentes
 */
@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
