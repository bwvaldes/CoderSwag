package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataServices {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatsimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatsimage"),
            Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
            Product("Devslopes Graphical Beanie", "hat1", "$20"),
            Product("Devslopes Hat Black", "hat2", "$18"),
            Product("Devslopes Hat White", "hat3", "$18"),
            Product("Devslopes Hat Snapback", "hat4", "$20"),
            Product("Devslopes Graphical Beanie", "hat1", "$20"),
            Product("Devslopes Hat Black", "hat2", "$18"),
            Product("Devslopes Hat White", "hat3", "$18"),
            Product("Devslopes Hat Snapback", "hat4", "$20"),
            Product("Devslopes Graphical Beanie", "hat1", "$20"),
            Product("Devslopes Hat Black", "hat2", "$18"),
            Product("Devslopes Hat White", "hat3", "$18"),
            Product("Devslopes Hat Snapback", "hat4", "$20")
    )
    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "hoodie1", "$28"),
            Product("Devslopes Hoodie Black", "hoodie2", "$28"),
            Product("Devslopes Hoodie White", "hoodie3", "$32"),
            Product("Devslopes Hoodie Red", "hoodie4", "$32"),
            Product("Devslopes Hoodie Gray", "hoodie1", "$28"),
            Product("Devslopes Hoodie Black", "hoodie2", "$28"),
            Product("Devslopes Hoodie White", "hoodie3", "$32"),
            Product("Devslopes Hoodie Red", "hoodie4", "$32"),
            Product("Devslopes Hoodie Gray", "hoodie1", "$28"),
            Product("Devslopes Hoodie Black", "hoodie2", "$28"),
            Product("Devslopes Hoodie White", "hoodie3", "$32"),
            Product("Devslopes Hoodie Red", "hoodie4", "$32")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "shirt1", "$18"),
            Product("Devslopes Shirt Light Gray", "shirt2", "$20"),
            Product("Devslopes Logo Shirt Red", "shirt3", "$22"),
            Product("Devslopes Hustle", "shirt4", "$24"),
            Product("Devslopes Kickflip Studios", "shirt4", "$18"),
            Product("Devslopes Shirt Black", "shirt1", "$18"),
            Product("Devslopes Shirt Light Gray", "shirt2", "$20"),
            Product("Devslopes Logo Shirt Red", "shirt3", "$22"),
            Product("Devslopes Hustle", "shirt4", "$24"),
            Product("Devslopes Kickflip Studios", "shirt4", "$18"),
            Product("Devslopes Shirt Black", "shirt1", "$18"),
            Product("Devslopes Shirt Light Gray", "shirt2", "$20"),
            Product("Devslopes Logo Shirt Red", "shirt3", "$22"),
            Product("Devslopes Hustle", "shirt4", "$24"),
            Product("Devslopes Kickflip Studios", "shirt4", "$18")

    )
    val digitalGoods = listOf<Product>()
    fun getProducts(category: String): List<Product> {

        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }


}