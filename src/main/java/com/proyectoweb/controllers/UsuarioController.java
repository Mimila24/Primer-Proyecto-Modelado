package com.proyectoweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoweb.dao.UsuarioDao;
import com.proyectoweb.models.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	/*
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "hola";
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		
		return List.of("Diego","Juan","Jose");
	}
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios() {
		
		Usuario usuario=new Usuario();
		usuario.setNombre("Diego");
		usuario.setApellido("Vargas");
		usuario.setEmail("dvargasgodoy@gmail.com");
		usuario.setTelefono("155619965");
		
		return usuario;
	}
	
	@RequestMapping(value="usuario/{id}" )
	public Usuario getUsuario(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Diego");
		usuario.setApellido("Vargas");
		usuario.setEmail("dvargasgodoy@gmail.com");
		usuario.setTelefono("155619965");
		
		return usuario;
	}*/
	
	@RequestMapping(value="usuario/lista_user" )
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>(); 
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Diego");
		usuario1.setApellido("Vargas");
		usuario1.setEmail("dvargasgodoy@gmail.com");
		usuario1.setTelefono("155619965");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Jose");
		usuario2.setApellido("Puentes");
		usuario2.setEmail("joseeeey@gmail.com");
		usuario2.setTelefono("155655565");
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Juan");
		usuario3.setApellido("Vargas");
		usuario3.setEmail("juancitoo@gmail.com");
		usuario3.setTelefono("155619965");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		return usuarios;
	}
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}
	

}
