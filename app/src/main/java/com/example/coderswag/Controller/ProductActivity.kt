package com.example.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.GridLayoutManager
import com.example.coderswag.Adapters.ProductsAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataServices
import com.example.coderswag.Utilities.*
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity() : AppCompatActivity(), Parcelable {

    /**
     * make parcelable in order to pass data onto  the product detail activity
     * */


    lateinit var adapter: ProductsAdapter

    constructor(parcel: Parcel) : this()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataServices.getProducts(categoryType)) {
             product -> println(product.title)
            val productDetailsIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailsIntent.putExtra(EXTRA_NAME, product.title)
            productDetailsIntent.putExtra(EXTRA_IMAGE, product.image)
            productDetailsIntent.putExtra(EXTRA_PRICE, product.price)
            startActivity(productDetailsIntent)
        }
/**
 * rather than making layouts for multiple configurations, create variable that can adapt accordingly,
 * like below. we access the configuration file in order to set values to get a particular response
 * */
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 4

            /**
             * 720 refers to the dp of a given device
             * */
        }


        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProductActivity> {
        override fun createFromParcel(parcel: Parcel): ProductActivity {
            return ProductActivity(parcel)
        }

        override fun newArray(size: Int): Array<ProductActivity?> {
            return arrayOfNulls(size)
        }
    }
}
