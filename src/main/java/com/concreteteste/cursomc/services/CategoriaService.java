package com.concreteteste.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concreteteste.cursomc.domain.Categoria;
import com.concreteteste.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) throws Exception {
		Optional<Categoria> obj = repo.findById(id);
		if (!obj.isPresent()) {
			throw new Exception();
		}
		return obj.get();

	}
}