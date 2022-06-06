package ru.dgu.testryceclerviewviewbinding

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ModelMebel (
    @SerializedName("totalCount") @Expose var totalCount: Int?,
    @SerializedName("plashka") @Expose var plashka: String?,
    @SerializedName("items") @Expose var items: List<Item>,
    @SerializedName("relatedCategories") @Expose var relatedCategories: List<Item2>,
    @SerializedName("categoryName") @Expose var categoryName: String?,
    @SerializedName("categoryUrl") @Expose var categoryUrl: String?,
) {
    data class Item (
        @SerializedName("id") @Expose var id: String?,
        @SerializedName("name") @Expose var name: String,
        @SerializedName("imageURL") @Expose var imageURL: String,
        @SerializedName("prices") @Expose var prices: Prices,
        @SerializedName("discount") @Expose var discount: Int,
        @SerializedName("full_set_prices") @Expose var fullSetPrices: String,
        @SerializedName("isBestPrice") @Expose var isBestPrice: Boolean,
        @SerializedName("tag") @Expose var tag: String,
        @SerializedName("isFavorite") @Expose var isFavorite: Boolean,
        @SerializedName("articul") @Expose var articul: String,
        @SerializedName("rating") @Expose var rating: Double,
        @SerializedName("numberOfReviews") @Expose var numberOfReviews: String,
        @SerializedName("in_stock") @Expose var inStock: Int,
        @SerializedName("yellow") @Expose var yellow: Boolean,
        @SerializedName("statusText") @Expose var statusText: String,
        @SerializedName("bonusesForbuy") @Expose var bonusesForbuy: Int,
        @SerializedName("deliveryTime") @Expose var deliveryTime: Int,
        @SerializedName("is_it_kit") @Expose var isItKit: Int,
        @SerializedName("offers_xml_ids") @Expose var offersXmlIds: ArrayList<Int>,
        @SerializedName("isAvailable") @Expose var isAvailable: Boolean,
        @SerializedName("images") @Expose var images: ArrayList<String>,
        @SerializedName("complexAsOne") @Expose var complexAsOne: String,
        @SerializedName("categoryId") @Expose var categoryId: String,
        @SerializedName("categoryTitle") @Expose var categoryTitle: String
    ){
        data class Prices (
            @SerializedName("new") @Expose var new: Int,
            @SerializedName("old") @Expose var old: Int,
        )
    }
    data class Item2 (
        @SerializedName("id") @Expose var id: String?,
        @SerializedName("name") @Expose var name: String,
        @SerializedName("link") @Expose var link: String,
        @SerializedName("count") @Expose var count: Int,
        @SerializedName("sister") @Expose var sister: Boolean,
    )
}