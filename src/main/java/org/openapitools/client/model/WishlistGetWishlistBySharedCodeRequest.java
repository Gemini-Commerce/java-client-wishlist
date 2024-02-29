/*
 * Wishlist Service
 * API for managing wishlists
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Wishlist.JSON;

/**
 * WishlistGetWishlistBySharedCodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:50:13.759631386Z[Etc/UTC]")
public class WishlistGetWishlistBySharedCodeRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_SHARED_CODE = "sharedCode";
  @SerializedName(SERIALIZED_NAME_SHARED_CODE)
  private String sharedCode;

  public static final String SERIALIZED_NAME_CUSTOMER_GRN = "customerGrn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GRN)
  private String customerGrn;

  public WishlistGetWishlistBySharedCodeRequest() {
  }

  public WishlistGetWishlistBySharedCodeRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public WishlistGetWishlistBySharedCodeRequest sharedCode(String sharedCode) {
    this.sharedCode = sharedCode;
    return this;
  }

   /**
   * Get sharedCode
   * @return sharedCode
  **/
  @javax.annotation.Nonnull
  public String getSharedCode() {
    return sharedCode;
  }

  public void setSharedCode(String sharedCode) {
    this.sharedCode = sharedCode;
  }


  public WishlistGetWishlistBySharedCodeRequest customerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
    return this;
  }

   /**
   * If the customer GRN is set on JWT, it will be used as default. Otherwise, it will be used the customer_grn field.
   * @return customerGrn
  **/
  @javax.annotation.Nullable
  public String getCustomerGrn() {
    return customerGrn;
  }

  public void setCustomerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishlistGetWishlistBySharedCodeRequest wishlistGetWishlistBySharedCodeRequest = (WishlistGetWishlistBySharedCodeRequest) o;
    return Objects.equals(this.tenantId, wishlistGetWishlistBySharedCodeRequest.tenantId) &&
        Objects.equals(this.sharedCode, wishlistGetWishlistBySharedCodeRequest.sharedCode) &&
        Objects.equals(this.customerGrn, wishlistGetWishlistBySharedCodeRequest.customerGrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, sharedCode, customerGrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishlistGetWishlistBySharedCodeRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    sharedCode: ").append(toIndentedString(sharedCode)).append("\n");
    sb.append("    customerGrn: ").append(toIndentedString(customerGrn)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("sharedCode");
    openapiFields.add("customerGrn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("sharedCode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WishlistGetWishlistBySharedCodeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WishlistGetWishlistBySharedCodeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WishlistGetWishlistBySharedCodeRequest is not found in the empty JSON string", WishlistGetWishlistBySharedCodeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WishlistGetWishlistBySharedCodeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WishlistGetWishlistBySharedCodeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WishlistGetWishlistBySharedCodeRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("sharedCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharedCode").toString()));
      }
      if ((jsonObj.get("customerGrn") != null && !jsonObj.get("customerGrn").isJsonNull()) && !jsonObj.get("customerGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerGrn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WishlistGetWishlistBySharedCodeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WishlistGetWishlistBySharedCodeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WishlistGetWishlistBySharedCodeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WishlistGetWishlistBySharedCodeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WishlistGetWishlistBySharedCodeRequest>() {
           @Override
           public void write(JsonWriter out, WishlistGetWishlistBySharedCodeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WishlistGetWishlistBySharedCodeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WishlistGetWishlistBySharedCodeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WishlistGetWishlistBySharedCodeRequest
  * @throws IOException if the JSON string is invalid with respect to WishlistGetWishlistBySharedCodeRequest
  */
  public static WishlistGetWishlistBySharedCodeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WishlistGetWishlistBySharedCodeRequest.class);
  }

 /**
  * Convert an instance of WishlistGetWishlistBySharedCodeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
