 
package com.uca.capas.tarea2Ncapas.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uca.capas.tarea2Ncapas.domain.date.date;

@Controller
 class MainController {

	@GetMapping("/information")
	public @ResponseBody String information() {
		String info = "Nombre: Alexis Rafael" + " Apellido: Bolaños Mejia" + " Carnet: 00090718" + " Carrera: Ingeniera en Informatica" + " Año cursado: 3ro";
		return info;
	}
	
	String[] weekDays = {"Lunes", "Martes","Miercoles","Jueves", "Viernes", "Sabado", "Domingo"};
	@GetMapping("/weekDay")
	public @ResponseBody String weekDay(date d) {
		String day="";
		Calendar saveDay = Calendar.getInstance();
		
		saveDay.set(d.getMonth(),d.getDay(), d.getYear());
		
		day= weekDays[saveDay.get(Calendar.DAY_OF_WEEK)-1];
		
		return day;
		
	}
}