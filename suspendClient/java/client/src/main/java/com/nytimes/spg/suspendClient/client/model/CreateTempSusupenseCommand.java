/*
 * Aristo Suspense Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.nytimes.spg.suspendClient.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.nytimes.spg.suspendClient.client.model.CreateTempSuspenseCommanData;
import com.nytimes.spg.suspendClient.client.model.RequestMetaImpl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.nytimes.spg.suspendClient.client.JSON;

/**
 * CreateTempSusupenseCommand
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T08:29:37.590010-04:00[America/New_York]")
public class CreateTempSusupenseCommand {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private RequestMetaImpl meta;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private CreateTempSuspenseCommanData data;

  public CreateTempSusupenseCommand() { 
  }

  public CreateTempSusupenseCommand meta(RequestMetaImpl meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestMetaImpl getMeta() {
    return meta;
  }


  public void setMeta(RequestMetaImpl meta) {
    this.meta = meta;
  }


  public CreateTempSusupenseCommand data(CreateTempSuspenseCommanData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateTempSuspenseCommanData getData() {
    return data;
  }


  public void setData(CreateTempSuspenseCommanData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTempSusupenseCommand createTempSusupenseCommand = (CreateTempSusupenseCommand) o;
    return Objects.equals(this.meta, createTempSusupenseCommand.meta) &&
        Objects.equals(this.data, createTempSusupenseCommand.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTempSusupenseCommand {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("meta");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateTempSusupenseCommand
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateTempSusupenseCommand.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTempSusupenseCommand is not found in the empty JSON string", CreateTempSusupenseCommand.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateTempSusupenseCommand.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTempSusupenseCommand` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `meta`
      if (jsonObj.getAsJsonObject("meta") != null) {
        RequestMetaImpl.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        CreateTempSuspenseCommanData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTempSusupenseCommand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTempSusupenseCommand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTempSusupenseCommand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTempSusupenseCommand.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTempSusupenseCommand>() {
           @Override
           public void write(JsonWriter out, CreateTempSusupenseCommand value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTempSusupenseCommand read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTempSusupenseCommand given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTempSusupenseCommand
  * @throws IOException if the JSON string is invalid with respect to CreateTempSusupenseCommand
  */
  public static CreateTempSusupenseCommand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTempSusupenseCommand.class);
  }

 /**
  * Convert an instance of CreateTempSusupenseCommand to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

