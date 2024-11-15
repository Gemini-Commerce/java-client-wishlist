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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * WishlistBulkRemoveItemsFromWishlistsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T15:21:43.810950213Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class WishlistBulkRemoveItemsFromWishlistsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ITEM_GRNS = "itemGrns";
  @SerializedName(SERIALIZED_NAME_ITEM_GRNS)
  private List<String> itemGrns = new ArrayList<>();

  public static final String SERIALIZED_NAME_WISHLIST_IDS = "wishlistIds";
  @SerializedName(SERIALIZED_NAME_WISHLIST_IDS)
  private List<String> wishlistIds = new ArrayList<>();

  public WishlistBulkRemoveItemsFromWishlistsRequest() {
  }

  public WishlistBulkRemoveItemsFromWishlistsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public WishlistBulkRemoveItemsFromWishlistsRequest itemGrns(List<String> itemGrns) {
    this.itemGrns = itemGrns;
    return this;
  }

  public WishlistBulkRemoveItemsFromWishlistsRequest addItemGrnsItem(String itemGrnsItem) {
    if (this.itemGrns == null) {
      this.itemGrns = new ArrayList<>();
    }
    this.itemGrns.add(itemGrnsItem);
    return this;
  }

  /**
   * Item GRNs to remove from wishlists. Max 500 items per request.
   * @return itemGrns
   */
  @javax.annotation.Nonnull
  public List<String> getItemGrns() {
    return itemGrns;
  }

  public void setItemGrns(List<String> itemGrns) {
    this.itemGrns = itemGrns;
  }


  public WishlistBulkRemoveItemsFromWishlistsRequest wishlistIds(List<String> wishlistIds) {
    this.wishlistIds = wishlistIds;
    return this;
  }

  public WishlistBulkRemoveItemsFromWishlistsRequest addWishlistIdsItem(String wishlistIdsItem) {
    if (this.wishlistIds == null) {
      this.wishlistIds = new ArrayList<>();
    }
    this.wishlistIds.add(wishlistIdsItem);
    return this;
  }

  /**
   * Wishlist IDs to remove items from. Max 500 wishlists per request. If not provided, items will be removed from all wishlists.
   * @return wishlistIds
   */
  @javax.annotation.Nullable
  public List<String> getWishlistIds() {
    return wishlistIds;
  }

  public void setWishlistIds(List<String> wishlistIds) {
    this.wishlistIds = wishlistIds;
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
   * @return the WishlistBulkRemoveItemsFromWishlistsRequest instance itself
   */
  public WishlistBulkRemoveItemsFromWishlistsRequest putAdditionalProperty(String key, Object value) {
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
    WishlistBulkRemoveItemsFromWishlistsRequest wishlistBulkRemoveItemsFromWishlistsRequest = (WishlistBulkRemoveItemsFromWishlistsRequest) o;
    return Objects.equals(this.tenantId, wishlistBulkRemoveItemsFromWishlistsRequest.tenantId) &&
        Objects.equals(this.itemGrns, wishlistBulkRemoveItemsFromWishlistsRequest.itemGrns) &&
        Objects.equals(this.wishlistIds, wishlistBulkRemoveItemsFromWishlistsRequest.wishlistIds)&&
        Objects.equals(this.additionalProperties, wishlistBulkRemoveItemsFromWishlistsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, itemGrns, wishlistIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishlistBulkRemoveItemsFromWishlistsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    itemGrns: ").append(toIndentedString(itemGrns)).append("\n");
    sb.append("    wishlistIds: ").append(toIndentedString(wishlistIds)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("itemGrns");
    openapiFields.add("wishlistIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("itemGrns");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WishlistBulkRemoveItemsFromWishlistsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WishlistBulkRemoveItemsFromWishlistsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WishlistBulkRemoveItemsFromWishlistsRequest is not found in the empty JSON string", WishlistBulkRemoveItemsFromWishlistsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WishlistBulkRemoveItemsFromWishlistsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("itemGrns") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("itemGrns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemGrns` to be an array in the JSON string but got `%s`", jsonObj.get("itemGrns").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("wishlistIds") != null && !jsonObj.get("wishlistIds").isJsonNull() && !jsonObj.get("wishlistIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `wishlistIds` to be an array in the JSON string but got `%s`", jsonObj.get("wishlistIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WishlistBulkRemoveItemsFromWishlistsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WishlistBulkRemoveItemsFromWishlistsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WishlistBulkRemoveItemsFromWishlistsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WishlistBulkRemoveItemsFromWishlistsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WishlistBulkRemoveItemsFromWishlistsRequest>() {
           @Override
           public void write(JsonWriter out, WishlistBulkRemoveItemsFromWishlistsRequest value) throws IOException {
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
           public WishlistBulkRemoveItemsFromWishlistsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WishlistBulkRemoveItemsFromWishlistsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of WishlistBulkRemoveItemsFromWishlistsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WishlistBulkRemoveItemsFromWishlistsRequest
   * @throws IOException if the JSON string is invalid with respect to WishlistBulkRemoveItemsFromWishlistsRequest
   */
  public static WishlistBulkRemoveItemsFromWishlistsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WishlistBulkRemoveItemsFromWishlistsRequest.class);
  }

  /**
   * Convert an instance of WishlistBulkRemoveItemsFromWishlistsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

