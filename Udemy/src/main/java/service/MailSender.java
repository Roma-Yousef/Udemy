package service;

public interface MailSender {
	
	void send(String to, String subject, String body);

}
