package com.netplus.app.services;

import org.springframework.mail.SimpleMailMessage;

import com.netplus.app.domain.Cliente;
import com.netplus.app.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
