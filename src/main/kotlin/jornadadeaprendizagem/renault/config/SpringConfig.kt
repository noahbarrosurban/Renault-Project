package io.redspark.sistemaVeterinario.Config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.servers.Server
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.context.annotation.Configuration


@Configuration
@OpenAPIDefinition(
        info = Info(
                title = "API Renault Project",
                version = "1.0.0",
                description = "API de gerenciamento de riscos"
        ),
        servers = [Server(url = "/")])

class SpringConfig