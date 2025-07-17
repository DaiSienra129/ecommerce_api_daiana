package com.ecommerce.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityRequirement;


/***
 * Clase de configuración para la documentación de la API
 * permite la generación de la documentación de la API en formato OpenAPI
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            // 1. Definimos el securityScheme llamado "bearerAuth"
            .components(new Components()
                .addSecuritySchemes("bearerAuth",
                    new SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT")
                        .description("Introduce el token JWT con el prefijo 'Bearer '")
                )
            )
            // 2. Aplicamos ese esquema a todos los endpoints
            .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
            // 3. (Opcional) Info base de tu API
            .info(new Info()
                .title("API de Ecommerce")
                .version("1.0")
            );
    }

    // … (cualquier otra configuración que tuvieras)
}
