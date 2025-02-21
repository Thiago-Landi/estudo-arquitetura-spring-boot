package com.Thiago_Landi.arquiteturaspring.assembler;

import java.awt.Color;

public class Car {
	 
		private String model;
	    private Color color;
	    private Engine engine;
	    private Mark mark;
	
	    public Car(Engine engine) {
	    	this.engine = engine;
	    }
	    
	    public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
		public Engine getEngine() {
			return engine;
		}
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		public Mark getMark() {
			return mark;
		}
		public void setMark(Mark mark) {
			this.mark = mark;
		}
	
	    public CarStatus ignite(Key key) {
	    	if(key.getMark() != this.mark) {
	    		return new CarStatus("Cannot start the car with this key!");
	    	}
	    	return new CarStatus("Car on. Running with the engine " + engine);
	    }
	    
}
