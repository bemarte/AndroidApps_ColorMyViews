package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint_layout,
                btn_green, btn_red, btn_yellow, btn_back
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }


    private fun makeColored(view: View) {

        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.btn_red -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.btn_yellow -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.btn_green -> box_five_text.setBackgroundResource(R.color.my_green)

            //+
            //Change all boxes to default collor( WHITE )

            R.id.btn_back -> { box_one_text.setBackgroundColor(Color.WHITE); box_two_text.setBackgroundColor(Color.WHITE);
                                box_three_text.setBackgroundColor(Color.WHITE); box_four_text.setBackgroundColor(Color.WHITE);
                                box_five_text.setBackgroundColor(Color.WHITE)}

            else -> view.setBackgroundColor(Color.WHITE)
        }

    }

}
