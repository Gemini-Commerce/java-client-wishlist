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


package org.openapitools.client.api;

import GeminiCommerce_Wishlist.ApiException;
import org.openapitools.client.model.RpcStatus;
import org.openapitools.client.model.WishlistAddItemToWishlistRequest;
import org.openapitools.client.model.WishlistAreItemsInWishlistsRequest;
import org.openapitools.client.model.WishlistAreItemsInWishlistsResponse;
import org.openapitools.client.model.WishlistBulkCreateSharingRequest;
import org.openapitools.client.model.WishlistBulkCreateSharingResponse;
import org.openapitools.client.model.WishlistBulkRemoveItemsFromWishlistsRequest;
import org.openapitools.client.model.WishlistBulkRevokeSharingRequest;
import org.openapitools.client.model.WishlistCreateWishlistRequest;
import org.openapitools.client.model.WishlistDeleteWishlistRequest;
import org.openapitools.client.model.WishlistGetItemFromWishlistRequest;
import org.openapitools.client.model.WishlistGetWishlistByIdRequest;
import org.openapitools.client.model.WishlistGetWishlistBySharedCodeRequest;
import org.openapitools.client.model.WishlistListWishlistItemsRequest;
import org.openapitools.client.model.WishlistListWishlistItemsResponse;
import org.openapitools.client.model.WishlistListWishlistsRequest;
import org.openapitools.client.model.WishlistListWishlistsResponse;
import org.openapitools.client.model.WishlistMergeWishlistsRequest;
import org.openapitools.client.model.WishlistRemoveItemFromWishlistRequest;
import org.openapitools.client.model.WishlistUpdateItemInWishlistRequest;
import org.openapitools.client.model.WishlistUpdateWishlistRequest;
import org.openapitools.client.model.WishlistWishlistItemResponse;
import org.openapitools.client.model.WishlistWishlistResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WishlistApi
 */
@Disabled
public class WishlistApiTest {

    private final WishlistApi api = new WishlistApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistAddItemToWishlistTest() throws ApiException {
        WishlistAddItemToWishlistRequest body = null;
        WishlistWishlistItemResponse response = api.wishlistAddItemToWishlist(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistAreItemsInWishlistsTest() throws ApiException {
        WishlistAreItemsInWishlistsRequest body = null;
        WishlistAreItemsInWishlistsResponse response = api.wishlistAreItemsInWishlists(body);
        // TODO: test validations
    }

    /**
     * Sharing endpoints
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistBulkCreateSharingTest() throws ApiException {
        WishlistBulkCreateSharingRequest body = null;
        WishlistBulkCreateSharingResponse response = api.wishlistBulkCreateSharing(body);
        // TODO: test validations
    }

    /**
     * BulkRemoveItemsFromWishlists removes items from wishlists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistBulkRemoveItemsFromWishlistsTest() throws ApiException {
        WishlistBulkRemoveItemsFromWishlistsRequest body = null;
        Object response = api.wishlistBulkRemoveItemsFromWishlists(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistBulkRevokeSharingTest() throws ApiException {
        WishlistBulkRevokeSharingRequest body = null;
        Object response = api.wishlistBulkRevokeSharing(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistCreateWishlistTest() throws ApiException {
        WishlistCreateWishlistRequest body = null;
        WishlistWishlistResponse response = api.wishlistCreateWishlist(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistDeleteWishlistTest() throws ApiException {
        WishlistDeleteWishlistRequest body = null;
        Object response = api.wishlistDeleteWishlist(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistGetItemFromWishlistTest() throws ApiException {
        WishlistGetItemFromWishlistRequest body = null;
        WishlistWishlistItemResponse response = api.wishlistGetItemFromWishlist(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistGetWishlistByIdTest() throws ApiException {
        WishlistGetWishlistByIdRequest body = null;
        WishlistWishlistResponse response = api.wishlistGetWishlistById(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistGetWishlistBySharedCodeTest() throws ApiException {
        WishlistGetWishlistBySharedCodeRequest body = null;
        WishlistWishlistResponse response = api.wishlistGetWishlistBySharedCode(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistListWishlistItemsTest() throws ApiException {
        WishlistListWishlistItemsRequest body = null;
        WishlistListWishlistItemsResponse response = api.wishlistListWishlistItems(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistListWishlistsTest() throws ApiException {
        WishlistListWishlistsRequest body = null;
        WishlistListWishlistsResponse response = api.wishlistListWishlists(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistMergeWishlistsTest() throws ApiException {
        WishlistMergeWishlistsRequest body = null;
        WishlistWishlistResponse response = api.wishlistMergeWishlists(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistRemoveItemFromWishlistTest() throws ApiException {
        WishlistRemoveItemFromWishlistRequest body = null;
        Object response = api.wishlistRemoveItemFromWishlist(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistUpdateItemInWishlistTest() throws ApiException {
        WishlistUpdateItemInWishlistRequest body = null;
        WishlistWishlistItemResponse response = api.wishlistUpdateItemInWishlist(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wishlistUpdateWishlistTest() throws ApiException {
        WishlistUpdateWishlistRequest body = null;
        WishlistWishlistResponse response = api.wishlistUpdateWishlist(body);
        // TODO: test validations
    }

}