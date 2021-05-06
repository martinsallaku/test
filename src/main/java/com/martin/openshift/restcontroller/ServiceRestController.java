package com.martin.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martin.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario","Rossi","mario"));
		lista.add(new Contatto("Anna","Verdi","anna"));
		lista.add(new Contatto("Paolo","Bianchi","paolo"));
		lista.add(new Contatto("Luca","RossiDue","ludu"));
		return lista;
	}
}
