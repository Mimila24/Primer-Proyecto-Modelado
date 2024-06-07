package com.proyectoweb.dao;

import java.util.List;

import com.proyectoweb.models.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {

	List<Usuario> obtenerUsuarios();
	
}
