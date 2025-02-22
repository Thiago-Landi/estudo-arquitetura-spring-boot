package com.Thiago_Landi.arquiteturaspring.assembler.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Thiago_Landi.arquiteturaspring.assembler.CarStatus;
import com.Thiago_Landi.arquiteturaspring.assembler.Engine;
import com.Thiago_Landi.arquiteturaspring.assembler.HondaHRV;
import com.Thiago_Landi.arquiteturaspring.assembler.Key;

@RestController
@RequestMapping("/cars")
public class TestFactoryController {

	@Autowired
	//@Qualifier("engineElectric")
	@Aspirated
	private Engine engine;
	
	@PostMapping
    public CarStatus ligarCarro(@RequestBody Key key){
        var car = new HondaHRV(engine);
        return car.ignite(key);
    }
}
