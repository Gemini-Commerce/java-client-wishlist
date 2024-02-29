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
import org.openapitools.client.model.WishlistLocalizedText;
import org.openapitools.client.model.WishlistPrivacy;

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
 * WishlistWishlistResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:50:13.759631386Z[Etc/UTC]")
public class WishlistWishlistResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_SHARED_CODE = "sharedCode";
  @SerializedName(SERIALIZED_NAME_SHARED_CODE)
  private String sharedCode;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private WishlistPrivacy privacy = WishlistPrivacy.UNKNOWN;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private WishlistLocalizedText label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private WishlistLocalizedText description;

  public static final String SERIALIZED_NAME_CUSTOMER_GRN = "customerGrn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GRN)
  private String customerGrn;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_ITEMS_COUNT = "itemsCount";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private String itemsCount;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public WishlistWishlistResponse() {
  }

  public WishlistWishlistResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public WishlistWishlistResponse grn(String grn) {
    this.grn = grn;
    return this;
  }

   /**
   * Get grn
   * @return grn
  **/
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public WishlistWishlistResponse sharedCode(String sharedCode) {
    this.sharedCode = sharedCode;
    return this;
  }

   /**
   * Get sharedCode
   * @return sharedCode
  **/
  @javax.annotation.Nullable
  public String getSharedCode() {
    return sharedCode;
  }

  public void setSharedCode(String sharedCode) {
    this.sharedCode = sharedCode;
  }


  public WishlistWishlistResponse privacy(WishlistPrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable
  public WishlistPrivacy getPrivacy() {
    return privacy;
  }

  public void setPrivacy(WishlistPrivacy privacy) {
    this.privacy = privacy;
  }


  public WishlistWishlistResponse label(WishlistLocalizedText label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public WishlistLocalizedText getLabel() {
    return label;
  }

  public void setLabel(WishlistLocalizedText label) {
    this.label = label;
  }


  public WishlistWishlistResponse description(WishlistLocalizedText description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public WishlistLocalizedText getDescription() {
    return description;
  }

  public void setDescription(WishlistLocalizedText description) {
    this.description = description;
  }


  public WishlistWishlistResponse customerGrn(String customerGrn) {
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


  public WishlistWishlistResponse isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public WishlistWishlistResponse itemsCount(String itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

   /**
   * Get itemsCount
   * @return itemsCount
  **/
  @javax.annotation.Nullable
  public String getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(String itemsCount) {
    this.itemsCount = itemsCount;
  }


  public WishlistWishlistResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WishlistWishlistResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishlistWishlistResponse wishlistWishlistResponse = (WishlistWishlistResponse) o;
    return Objects.equals(this.id, wishlistWishlistResponse.id) &&
        Objects.equals(this.grn, wishlistWishlistResponse.grn) &&
        Objects.equals(this.sharedCode, wishlistWishlistResponse.sharedCode) &&
        Objects.equals(this.privacy, wishlistWishlistResponse.privacy) &&
        Objects.equals(this.label, wishlistWishlistResponse.label) &&
        Objects.equals(this.description, wishlistWishlistResponse.description) &&
        Objects.equals(this.customerGrn, wishlistWishlistResponse.customerGrn) &&
        Objects.equals(this.isDefault, wishlistWishlistResponse.isDefault) &&
        Objects.equals(this.itemsCount, wishlistWishlistResponse.itemsCount) &&
        Objects.equals(this.createdAt, wishlistWishlistResponse.createdAt) &&
        Objects.equals(this.updatedAt, wishlistWishlistResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grn, sharedCode, privacy, label, description, customerGrn, isDefault, itemsCount, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishlistWishlistResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    sharedCode: ").append(toIndentedString(sharedCode)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customerGrn: ").append(toIndentedString(customerGrn)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("grn");
    openapiFields.add("sharedCode");
    openapiFields.add("privacy");
    openapiFields.add("label");
    openapiFields.add("description");
    openapiFields.add("customerGrn");
    openapiFields.add("isDefault");
    openapiFields.add("itemsCount");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WishlistWishlistResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WishlistWishlistResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WishlistWishlistResponse is not found in the empty JSON string", WishlistWishlistResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WishlistWishlistResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WishlistWishlistResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("sharedCode") != null && !jsonObj.get("sharedCode").isJsonNull()) && !jsonObj.get("sharedCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharedCode").toString()));
      }
      // validate the optional field `privacy`
      if (jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) {
        WishlistPrivacy.validateJsonElement(jsonObj.get("privacy"));
      }
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        WishlistLocalizedText.validateJsonElement(jsonObj.get("label"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        WishlistLocalizedText.validateJsonElement(jsonObj.get("description"));
      }
      if ((jsonObj.get("customerGrn") != null && !jsonObj.get("customerGrn").isJsonNull()) && !jsonObj.get("customerGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerGrn").toString()));
      }
      if ((jsonObj.get("itemsCount") != null && !jsonObj.get("itemsCount").isJsonNull()) && !jsonObj.get("itemsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemsCount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WishlistWishlistResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WishlistWishlistResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WishlistWishlistResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WishlistWishlistResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WishlistWishlistResponse>() {
           @Override
           public void write(JsonWriter out, WishlistWishlistResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WishlistWishlistResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WishlistWishlistResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WishlistWishlistResponse
  * @throws IOException if the JSON string is invalid with respect to WishlistWishlistResponse
  */
  public static WishlistWishlistResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WishlistWishlistResponse.class);
  }

 /**
  * Convert an instance of WishlistWishlistResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
