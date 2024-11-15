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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.WishlistPermission;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Wishlist.JSON;

/**
 * WishlistSharingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T15:21:43.810950213Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class WishlistSharingResponse {
  public static final String SERIALIZED_NAME_SHARING_ID = "sharingId";
  @SerializedName(SERIALIZED_NAME_SHARING_ID)
  private String sharingId;

  public static final String SERIALIZED_NAME_SHARING_GRN = "sharingGrn";
  @SerializedName(SERIALIZED_NAME_SHARING_GRN)
  private String sharingGrn;

  public static final String SERIALIZED_NAME_WISHLIST_ID = "wishlistId";
  @SerializedName(SERIALIZED_NAME_WISHLIST_ID)
  private String wishlistId;

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private WishlistPermission permission = WishlistPermission.UNKNOWN_PERMISSION;

  public static final String SERIALIZED_NAME_CUSTOMER_GRN = "customerGrn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GRN)
  private String customerGrn;

  public static final String SERIALIZED_NAME_CUSTOMER_AGGREGATION_ID = "customerAggregationId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_AGGREGATION_ID)
  private String customerAggregationId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public WishlistSharingResponse() {
  }

  public WishlistSharingResponse sharingId(String sharingId) {
    this.sharingId = sharingId;
    return this;
  }

  /**
   * Get sharingId
   * @return sharingId
   */
  @javax.annotation.Nullable
  public String getSharingId() {
    return sharingId;
  }

  public void setSharingId(String sharingId) {
    this.sharingId = sharingId;
  }


  public WishlistSharingResponse sharingGrn(String sharingGrn) {
    this.sharingGrn = sharingGrn;
    return this;
  }

  /**
   * Get sharingGrn
   * @return sharingGrn
   */
  @javax.annotation.Nullable
  public String getSharingGrn() {
    return sharingGrn;
  }

  public void setSharingGrn(String sharingGrn) {
    this.sharingGrn = sharingGrn;
  }


  public WishlistSharingResponse wishlistId(String wishlistId) {
    this.wishlistId = wishlistId;
    return this;
  }

  /**
   * Get wishlistId
   * @return wishlistId
   */
  @javax.annotation.Nullable
  public String getWishlistId() {
    return wishlistId;
  }

  public void setWishlistId(String wishlistId) {
    this.wishlistId = wishlistId;
  }


  public WishlistSharingResponse permission(WishlistPermission permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
   */
  @javax.annotation.Nullable
  public WishlistPermission getPermission() {
    return permission;
  }

  public void setPermission(WishlistPermission permission) {
    this.permission = permission;
  }


  public WishlistSharingResponse customerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
    return this;
  }

  /**
   * Get customerGrn
   * @return customerGrn
   */
  @javax.annotation.Nullable
  public String getCustomerGrn() {
    return customerGrn;
  }

  public void setCustomerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
  }


  public WishlistSharingResponse customerAggregationId(String customerAggregationId) {
    this.customerAggregationId = customerAggregationId;
    return this;
  }

  /**
   * Get customerAggregationId
   * @return customerAggregationId
   */
  @javax.annotation.Nullable
  public String getCustomerAggregationId() {
    return customerAggregationId;
  }

  public void setCustomerAggregationId(String customerAggregationId) {
    this.customerAggregationId = customerAggregationId;
  }


  public WishlistSharingResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WishlistSharingResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WishlistSharingResponse instance itself
   */
  public WishlistSharingResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishlistSharingResponse wishlistSharingResponse = (WishlistSharingResponse) o;
    return Objects.equals(this.sharingId, wishlistSharingResponse.sharingId) &&
        Objects.equals(this.sharingGrn, wishlistSharingResponse.sharingGrn) &&
        Objects.equals(this.wishlistId, wishlistSharingResponse.wishlistId) &&
        Objects.equals(this.permission, wishlistSharingResponse.permission) &&
        Objects.equals(this.customerGrn, wishlistSharingResponse.customerGrn) &&
        Objects.equals(this.customerAggregationId, wishlistSharingResponse.customerAggregationId) &&
        Objects.equals(this.createdAt, wishlistSharingResponse.createdAt) &&
        Objects.equals(this.updatedAt, wishlistSharingResponse.updatedAt)&&
        Objects.equals(this.additionalProperties, wishlistSharingResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharingId, sharingGrn, wishlistId, permission, customerGrn, customerAggregationId, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishlistSharingResponse {\n");
    sb.append("    sharingId: ").append(toIndentedString(sharingId)).append("\n");
    sb.append("    sharingGrn: ").append(toIndentedString(sharingGrn)).append("\n");
    sb.append("    wishlistId: ").append(toIndentedString(wishlistId)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    customerGrn: ").append(toIndentedString(customerGrn)).append("\n");
    sb.append("    customerAggregationId: ").append(toIndentedString(customerAggregationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("sharingId");
    openapiFields.add("sharingGrn");
    openapiFields.add("wishlistId");
    openapiFields.add("permission");
    openapiFields.add("customerGrn");
    openapiFields.add("customerAggregationId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WishlistSharingResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WishlistSharingResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WishlistSharingResponse is not found in the empty JSON string", WishlistSharingResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sharingId") != null && !jsonObj.get("sharingId").isJsonNull()) && !jsonObj.get("sharingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharingId").toString()));
      }
      if ((jsonObj.get("sharingGrn") != null && !jsonObj.get("sharingGrn").isJsonNull()) && !jsonObj.get("sharingGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharingGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharingGrn").toString()));
      }
      if ((jsonObj.get("wishlistId") != null && !jsonObj.get("wishlistId").isJsonNull()) && !jsonObj.get("wishlistId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wishlistId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wishlistId").toString()));
      }
      // validate the optional field `permission`
      if (jsonObj.get("permission") != null && !jsonObj.get("permission").isJsonNull()) {
        WishlistPermission.validateJsonElement(jsonObj.get("permission"));
      }
      if ((jsonObj.get("customerGrn") != null && !jsonObj.get("customerGrn").isJsonNull()) && !jsonObj.get("customerGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerGrn").toString()));
      }
      if ((jsonObj.get("customerAggregationId") != null && !jsonObj.get("customerAggregationId").isJsonNull()) && !jsonObj.get("customerAggregationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerAggregationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerAggregationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WishlistSharingResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WishlistSharingResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WishlistSharingResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WishlistSharingResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WishlistSharingResponse>() {
           @Override
           public void write(JsonWriter out, WishlistSharingResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WishlistSharingResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WishlistSharingResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WishlistSharingResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WishlistSharingResponse
   * @throws IOException if the JSON string is invalid with respect to WishlistSharingResponse
   */
  public static WishlistSharingResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WishlistSharingResponse.class);
  }

  /**
   * Convert an instance of WishlistSharingResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

