package com.example.helloworld

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.media.MediaPlayer
import android.view.View.OnClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Bigbutton.setOnClickListener{

            gamertext.setText("Bruh moment rn")
            //MyImageView.setImageBitmap(BitmapFactory.decodeFile("file:///assets/VERY jpeg Doggo.jpg"))

        }
    }
}