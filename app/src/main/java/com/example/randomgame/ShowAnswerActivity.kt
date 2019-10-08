package com.example.randomgame

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_show_answer.*

class ShowAnswerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_answer)
        var intentData = intent.extras
        var answer = intentData!!.getString("answer")

        if (answer == "That's Correct") {
            showAnswer_textField.text = "$answer"
            showAnswer_textField.setTextColor(Color.parseColor("#4caf50"))
        } else {
            showAnswer_textField.text = "$answer"
            showAnswer_textField.setTextColor(Color.parseColor("#e91e63"))
        }
    }

    fun playGameAgain(view: View) {
        var showAnswerActivity = Intent(this,GamePlayActivity::class.java)
        startActivity(showAnswerActivity)
    }
}
