package br.com.pedrobelmino.leitor.builder;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ASLCToQueueRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        System.out.println("/files mapped ");
		String exchange = System.getenv("RABBITMQ_DEFAULT_EXCHANGE");
        from("file:/files/")
                .log("Transferindo arquivo ${header:CamelFileNameOnly} para exchange "+exchange)
                .to("rabbitmq:"+exchange);
    }
}