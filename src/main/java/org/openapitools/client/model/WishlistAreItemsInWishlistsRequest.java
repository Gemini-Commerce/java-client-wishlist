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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Wishlist.JSON;

/**
 * WishlistAreItemsInWishlistsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:50:13.759631386Z[Etc/UTC]")
public class WishlistAreItemsInWishlistsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_WISHLIST_ID = "wishlistId";
  @SerializedName(SERIALIZED_NAME_WISHLIST_ID)
  private String wishlistId;

  public static final String SERIALIZED_NAME_CUSTOMER_GRN = "customerGrn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GRN)
  private String customerGrn;

  public static final String SERIALIZED_NAME_ITEM_GRNS = "itemGrns";
  @SerializedName(SERIALIZED_NAME_ITEM_GRNS)
  private List<String> itemGrns = new ArrayList<>();

  public WishlistAreItemsInWishlistsRequest() {
  }

  public WishlistAreItemsInWishlistsRequest tenantId(String tenantId) {
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


  public WishlistAreItemsInWishlistsRequest wishlistId(String wishlistId) {
    this.wishlistId = wishlistId;
    return this;
  }

   /**
   * Get wishlistId
   * @return wishlistId
  **/
  @javax.annotation.Nullable
  public String getWishlistId() {
    return wishlistId;
  }

  public void setWishlistId(String wishlistId) {
    this.wishlistId = wishlistId;
  }


  public WishlistAreItemsInWishlistsRequest customerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
    return this;
  }

   /**
   * Get customerGrn
   * @return customerGrn
  **/
  @javax.annotation.Nullable
  public String getCustomerGrn() {
    return customerGrn;
  }

  public void setCustomerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
  }


  public WishlistAreItemsInWishlistsRequest itemGrns(List<String> itemGrns) {
    this.itemGrns = itemGrns;
    return this;
  }

  public WishlistAreItemsInWishlistsRequest addItemGrnsItem(String itemGrnsItem) {
    if (this.itemGrns == null) {
      this.itemGrns = new ArrayList<>();
    }
    this.itemGrns.add(itemGrnsItem);
    return this;
  }

   /**
   * Get itemGrns
   * @return itemGrns
  **/
  @javax.annotation.Nonnull
  public List<String> getItemGrns() {
    return itemGrns;
  }

  public void setItemGrns(List<String> itemGrns) {
    this.itemGrns = itemGrns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishlistAreItemsInWishlistsRequest wishlistAreItemsInWishlistsRequest = (WishlistAreItemsInWishlistsRequest) o;
    return Objects.equals(this.tenantId, wishlistAreItemsInWishlistsRequest.tenantId) &&
        Objects.equals(this.wishlistId, wishlistAreItemsInWishlistsRequest.wishlistId) &&
        Objects.equals(this.customerGrn, wishlistAreItemsInWishlistsRequest.customerGrn) &&
        Objects.equals(this.itemGrns, wishlistAreItemsInWishlistsRequest.itemGrns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, wishlistId, customerGrn, itemGrns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishlistAreItemsInWishlistsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    wishlistId: ").append(toIndentedString(wishlistId)).append("\n");
    sb.append("    customerGrn: ").append(toIndentedString(customerGrn)).append("\n");
    sb.append("    itemGrns: ").append(toIndentedString(itemGrns)).append("\n");
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
    openapiFields.add("wishlistId");
    openapiFields.add("customerGrn");
    openapiFields.add("itemGrns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("itemGrns");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WishlistAreItemsInWishlistsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WishlistAreItemsInWishlistsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WishlistAreItemsInWishlistsRequest is not found in the empty JSON string", WishlistAreItemsInWishlistsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WishlistAreItemsInWishlistsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WishlistAreItemsInWishlistsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WishlistAreItemsInWishlistsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("wishlistId") != null && !jsonObj.get("wishlistId").isJsonNull()) && !jsonObj.get("wishlistId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wishlistId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wishlistId").toString()));
      }
      if ((jsonObj.get("customerGrn") != null && !jsonObj.get("customerGrn").isJsonNull()) && !jsonObj.get("customerGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerGrn").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("itemGrns") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("itemGrns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemGrns` to be an array in the JSON string but got `%s`", jsonObj.get("itemGrns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WishlistAreItemsInWishlistsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WishlistAreItemsInWishlistsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WishlistAreItemsInWishlistsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WishlistAreItemsInWishlistsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WishlistAreItemsInWishlistsRequest>() {
           @Override
           public void write(JsonWriter out, WishlistAreItemsInWishlistsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WishlistAreItemsInWishlistsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WishlistAreItemsInWishlistsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WishlistAreItemsInWishlistsRequest
  * @throws IOException if the JSON string is invalid with respect to WishlistAreItemsInWishlistsRequest
  */
  public static WishlistAreItemsInWishlistsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WishlistAreItemsInWishlistsRequest.class);
  }

 /**
  * Convert an instance of WishlistAreItemsInWishlistsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
