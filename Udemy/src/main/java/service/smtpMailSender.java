package service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class smtpMailSender implements MailSender{
	
	private static Log log = LogFactory.getLog(smtpMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending SMTP mail to" + to);
		log.info("with subject" + subject);
		log.info("and body" + body);
	}

}
