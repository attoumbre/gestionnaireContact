package com.example.gestioncontact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestioncontact.dto.UsersDTO;
import com.example.gestioncontact.model.Users;
import com.example.gestioncontact.repository.UsersRepository;

@Service
public class UserService {

	@Autowired
	private UsersRepository repository;

	public Users ajouter(UsersDTO user) {
		Users us = null;

		if (user != null) {
			us = new Users(user.getNomUser(), user.getPrenomUser());
			us = repository.save(us);
		}
		return us;

	}

	public Users getOne(Integer id) {

		Users u = null;
		if (id != null) {
			u = repository.getById(id);
			return u;
		}
		return null;
	}

	public List<Users> getAll() {

		return repository.findAll();
	}
}
