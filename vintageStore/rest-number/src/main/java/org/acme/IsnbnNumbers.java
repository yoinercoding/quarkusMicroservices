package org.acme;


import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "Several ISBN numbers for books")
public class IsnbnNumbers {

    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;

    @Schema(required = true)
    @JsonbProperty("isbn_10")
    public String isbn10;

    @JsonbTransient
    public Instant generationDate;

    @Override
    public String toString() {
        return "IsnbnNumbers{" +
                "isbn13='" + isbn13 + '\'' +
                ", isbn10='" + isbn10 + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}