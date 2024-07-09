package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.util.Random;

@Path("/api/numbers")
@Tag(name = "Mi main controller")
@ApplicationScoped
public class NumberResource {

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Generates book numbers",
            description = "ISBN 13 and ISBN 10 numbers"
    )
    public IsnbnNumbers generateIsbnNumbers() {
        IsnbnNumbers isnbnNumbers = new IsnbnNumbers();
        isnbnNumbers.isbn13 = "13-" + new Random().nextInt(100_000_000);
        isnbnNumbers.isbn10 = "10-" + new Random().nextInt(100_000);
        isnbnNumbers.generationDate = Instant.now();
        logger.info("Numbers generated + " + isnbnNumbers);
        return isnbnNumbers;
    }
}
