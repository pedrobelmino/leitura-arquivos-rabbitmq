package br.com.pedrobelmino.leitor;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LeitorAslcApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx = SpringApplication.run(LeitorAslcApplication.class, args);
	}

    @Bean
    public ConnectionFactory rabbitConnectionFactory() {
        ConnectionFactory cf = new ConnectionFactory();
        cf.setHost(System.getenv("RABBITMQ_DEFAULT_HOST"));
        cf.setPort(Integer.parseInt(System.getenv("RABBITMQ_DEFAULT_PORT")));
        cf.setUsername(System.getenv("RABBITMQ_DEFAULT_USER"));
        cf.setPassword(System.getenv("RABBITMQ_DEFAULT_PASS"));
        return cf;
    }
}
