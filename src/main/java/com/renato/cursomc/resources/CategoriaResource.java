package com.renato.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renato.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="api/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1,"Nome1");
		Categoria cat2 = new Categoria(2,"Nome2");
		
		List<Categoria> lstcat = new ArrayList<>();
		
		lstcat.add(cat1);
		lstcat.add(cat2);
		
		
		return lstcat;
	}

}
