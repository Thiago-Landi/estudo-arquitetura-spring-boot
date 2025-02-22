package com.Thiago_Landi.arquiteturaspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer>{
	
	boolean existsByDescription(String description);
}
