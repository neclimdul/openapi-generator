/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.Pig;
import org.openapitools.client.model.Whale;
import org.openapitools.client.model.Zebra;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


@JsonDeserialize(using=Mammal.MammalDeserializer.class)
public class Mammal extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Mammal.class.getName());

    public static class MammalDeserializer extends StdDeserializer<Mammal> {
        public MammalDeserializer() {
            this(Mammal.class);
        }

        public MammalDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Mammal deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            int match = 0;
            Object deserialized = null;
            // deserialize Pig
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Pig.class);
                match++;
                log.log(Level.FINER, "Input data matches schema 'Pig'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Pig'", e);
            }

            // deserialize Whale
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Whale.class);
                match++;
                log.log(Level.FINER, "Input data matches schema 'Whale'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Whale'", e);
            }

            // deserialize Zebra
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Zebra.class);
                match++;
                log.log(Level.FINER, "Input data matches schema 'Zebra'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Zebra'", e);
            }

            if (match == 1) {
                Mammal ret = new Mammal();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Mammal: %d classes match result, expected 1", match));
        }
    }

    // store a list of schema names defined in oneOf
    public final static Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Mammal() {
        super("oneOf", Boolean.FALSE);
    }

    public Mammal(Pig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Mammal(Whale o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Mammal(Zebra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Pig", new GenericType<Pig>() {
        });
        schemas.put("Whale", new GenericType<Whale>() {
        });
        schemas.put("Zebra", new GenericType<Zebra>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Mammal.schemas;
    }

    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Pig) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Whale) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Zebra) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Pig, Whale, Zebra");
    }



}

