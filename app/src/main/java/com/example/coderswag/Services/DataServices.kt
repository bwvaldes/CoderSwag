package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataServices {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatsimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphical Beanie", "hat01", "$20"),
            Product("Devslopes Hat Black", "hat02", "$18"),
            Product("Devslopes Hat White", "hat03", "$18"),
            Product("Devslopes Hat Snapback", "hat04", "$20")
    )
    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "hoodie01", "$28"),
            Product("Devslopes Hoodie Black", "hoodie02", "$28"),
            Product("Devslopes Hoodie White", "hoodie03", "$32"),
            Product("Devslopes Hoodie Red", "hoodie04", "$32")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "shirt01", "$18"),
            Product("Devslopes Shirt Light Gray", "shirt02", "$20"),
            Product("Devslopes Logo Shirt Red", "shirt03", "$22"),
            Product("Devslopes Hustle", "shirt04", "$24"),
            Product("Devslopes Kickflip Studios", "shirt04", "$18")

    )


}