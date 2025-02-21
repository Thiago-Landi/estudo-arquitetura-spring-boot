package com.Thiago_Landi.arquiteturaspring.assembler;

import java.awt.Color;

public class HondaHRV extends Car {

	public HondaHRV(Engine engine) {
		super(engine);
		setModel("HRV");
		setColor(Color.BLACK);
		setMark(Mark.HONDA);
	}
}
