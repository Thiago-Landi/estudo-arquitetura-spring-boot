package com.Thiago_Landi.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {

	@Autowired
	private TodoService service;
	
	@PostMapping
	public TodoEntity save(@RequestBody TodoEntity entity) {
		try {
            return this.service.save(entity);
        }catch (IllegalArgumentException e){
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagemErro);
        }
	}
	
	@PutMapping("{id}")
	public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity entity) {
		entity.setId(id);// tem que ser feito isso, para quando for salvar a atualização o save não crie um novo id, um novo todo
		service.updateStatus(entity);
	}
	
	@GetMapping("{id}")
	public TodoEntity search(@PathVariable("id") Integer id) {
		return service.findById(id);
	}
	
}
