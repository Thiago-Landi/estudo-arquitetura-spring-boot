package com.Thiago_Landi.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

	public void toSend(String msg) {
		System.out.println("sent email: " + msg);
	}
}
