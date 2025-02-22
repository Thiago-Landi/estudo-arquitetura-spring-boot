package com.Thiago_Landi.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

	@Autowired
	private TodoRepository repository;
	
	public void validate(TodoEntity entity) {
		if(existsTodoDescription(entity.getDescription())) {
			throw new IllegalArgumentException("This description already exists");
		}	
	}
	
	private boolean existsTodoDescription(String description) {
		return repository.existsByDescription(description);
	}
}
