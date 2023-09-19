package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Usuario;

	public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
		List<Usuario> findAllByNomeIgnoreCase(String nome);
}
