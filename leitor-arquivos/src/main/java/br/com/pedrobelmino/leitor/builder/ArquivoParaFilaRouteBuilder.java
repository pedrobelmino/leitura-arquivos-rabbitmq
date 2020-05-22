package br.com.pedrobelmino.leitor.builder;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ArquivoParaFilaRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
		String exchange = System.getenv("RABBITMQ_DEFAULT_EXCHANGE");


        from("rabbitmq:"+exchange)
                .log("Recebendo arquivo ${header:CamelFileNameOnly}");
    }
}