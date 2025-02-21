package com.Thiago_Landi.arquiteturaspring.assembler.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Thiago_Landi.arquiteturaspring.assembler.Engine;
import com.Thiago_Landi.arquiteturaspring.assembler.TypeEngine;

@Configuration
public class AssemblerConfiguration {

	 @Bean(name = "engineAspirated")
	    public Engine EngineAspirated(){
	        var engine = new Engine();
	        engine.setHorse(120);
	        engine.setCylinders(4);
	        engine.setModel("XPTO-0");
	        engine.setLitre(2.0);
	        engine.setType(TypeEngine.ASPIRATED);
	        return engine;
	    }

	    @Bean(name = "engineElectric")
	    public Engine EngineElectric(){
	        var engine = new Engine();
	        engine.setHorse(110);
	        engine.setCylinders(3);
	        engine.setModel("TH-40");
	        engine.setLitre(1.4);
	        engine.setType(TypeEngine.ELECTRIC);
	        return engine;
	    }

	    @Bean(name = "engineTurbo")
	    public Engine EngineTurbo(){
	        var engine = new Engine();
	        engine.setHorse(180);
	        engine.setCylinders(4);
	        engine.setModel("XPTO-01");
	        engine.setLitre(1.5);
	        engine.setType(TypeEngine.TURBO);
	        return engine;
	    }
}
