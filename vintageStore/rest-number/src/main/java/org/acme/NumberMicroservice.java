package org.acme;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number microservice",
                description = "This microservice generated book numbers",
                version = "0.0.1",
                contact = @Contact(name = "@belloyoiner", url = "https://x.com/BelloYoiner")
        ),
        externalDocs = @ExternalDocumentation(url = "https://github.com/yoinercoding/quarkusMicroservices", description = "repository"),
        tags = {
                @Tag(name = "api", description = "Public API"),
                @Tag(name = "numbers", description = "Numbers")
        }

)
public class NumberMicroservice extends Application {
}
