package com.proyectoweb.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyectoweb.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Usuario> obtenerUsuarios() {
		/* forma larga de codigo
		String query="from Usuario";
		List<Usuario> resultado=entityManager.createQuery(query).getResultList();
		
		return resultado;*/
		//forma de simplificar mas el codigo, de buenas practicas de programacion//
		String query="from Usuario";
		
		return entityManager.createQuery(query).getResultList();
	}

	
}
