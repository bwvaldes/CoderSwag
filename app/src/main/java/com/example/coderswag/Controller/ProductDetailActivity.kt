package com.example.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_IMAGE
import com.example.coderswag.Utilities.EXTRA_NAME
import com.example.coderswag.Utilities.EXTRA_PRICE
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)


    }

    override fun onStart() {
        super.onStart()

        val image = intent?.getStringExtra(EXTRA_IMAGE)
        val resourceId = this.resources.getIdentifier(image, "drawable", this.packageName)
        productDetailsImage.setImageResource(resourceId)

        val name = intent?.getStringExtra(EXTRA_NAME)
        productDetailsName.text = name

        val price = intent?.getStringExtra(EXTRA_PRICE)
        productDetailsPrice.text = price
    }


//// This is how to receive it via a lambda
//        intent?.getStringExtra("EXTRA_IMAGE")?.let { image ->
//            productDetailsImage.setImageResource(this.resources.getIdentifier(image, "drawable", this.packageName))
//        }?: run {
//            //No Image
//            Toast.makeText(this,"No product found", Toast.LENGTH_SHORT).show()
//        }
//
//    }
}
