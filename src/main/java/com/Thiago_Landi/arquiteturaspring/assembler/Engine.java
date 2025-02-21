package com.Thiago_Landi.arquiteturaspring.assembler;

public class Engine {

	 	private String model;
	    private Integer horse;
	    private Integer cylinders;
	    private Double litre;
	    private TypeEngine type;
		
	    public String getModel() {
			return model;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public Integer getHorse() {
			return horse;
		}
		
		public void setHorse(Integer horse) {
			this.horse = horse;
		}
		
		public Integer getCylinders() {
			return cylinders;
		}
		
		public void setCylinders(Integer cylinders) {
			this.cylinders = cylinders;
		}
		
		public Double getLitre() {
			return litre;
		}
		
		public void setLitre(Double litre) {
			this.litre = litre;
		}
		
		public TypeEngine getType() {
			return type;
		}
		
		public void setType(TypeEngine type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "Engine [model=" + model + ", horse=" + horse + ", cylinders=" + cylinders + ", litre=" + litre
					+ ", type=" + type + "]";
		}    
}
