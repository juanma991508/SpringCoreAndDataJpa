package com.openwebinars.beans.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.openwebinars.beans.modelo.PeliculaService;

public class App {

	public static void main(String[] args) {
ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		PeliculaService peliculaService = appContext.getBean(PeliculaService.class);
		
		peliculaService.pelisPorGenero("Ciencia ficci�n").forEach(System.out::println);
		
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
