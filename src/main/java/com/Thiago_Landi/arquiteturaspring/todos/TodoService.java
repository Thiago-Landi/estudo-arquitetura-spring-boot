package com.Thiago_Landi.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;
	
	@Autowired
	private TodoValidator validator;
	
	@Autowired
	private MailSender sender;
	
	public TodoEntity save(TodoEntity entity) {
		validator.validate(entity);
		return repository.save(entity);
	}
	
	public void updateStatus(TodoEntity entity) {
		repository.save(entity);
		String status = entity.getCompleted() == Boolean.TRUE ? "Completed" : "Not completed";
		sender.toSend("Todo " + entity.getDescription() + " has been updated to " + status);
	}
	
	 public TodoEntity findById(Integer id){
	        return repository.findById(id).orElse(null);
	    }
}


