package com.fiap.digital.cp2.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI gerarDocumentacao() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");
        devServer.description("Desenvolvimento local");

        Contact contact = new Contact();
        contact.setEmail("leoglmarques@gmail.com");
        contact.setName("Leonardo");
        Info  info = new Info().title("CP2")
                .version("0.1")
                .contact(contact)
                .description("Documentação de API");
        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}
