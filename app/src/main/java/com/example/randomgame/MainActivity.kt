package com.example.randomgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickToStartGamePlay(view: View) {
        var gamePlayActivity = Intent(this, GamePlayActivity::class.java)
        startActivity(gamePlayActivity)
    }

}
