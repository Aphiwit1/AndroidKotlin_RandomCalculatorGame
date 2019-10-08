package com.example.randomgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game_play.*
import kotlin.math.log
import kotlin.random.Random

class GamePlayActivity : AppCompatActivity() {

    val RANDOM_NUM1 = Random.nextInt(1, 10)
    val RANDOM_NUM2 = Random.nextInt(1, 10)
    val RANDOM_OPARATION = Random.nextInt(1, 4)
    var result: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)
        textView_num1.text = "$RANDOM_NUM1"
        textView_num2.text = "$RANDOM_NUM2"

        when (RANDOM_OPARATION) {
            1 -> {
                textField_Operator.text = "+"
            }
            2 -> {
                textField_Operator.text = "-"
            }
            3 -> {
                textField_Operator.text = "x"
            }
            4 -> {
                textField_Operator.text = "/"
            }
        }
    }

    fun calculateNumber(view: View) {
        var answerString = myAnswer_editText.text.toString()

        if (answerString == "") {
            Toast.makeText(this, "Please! enter your answer", Toast.LENGTH_LONG).show()
        } else {
            var myAnswer = myAnswer_editText.text.toString().toInt()

            if (RANDOM_OPARATION == 1) {
                result = RANDOM_NUM1 + RANDOM_NUM2
                if (myAnswer == result) {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Correct")
                    startActivity(showAnswerActivity)
                } else {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Wrong!")
                    startActivity(showAnswerActivity)
                }
            } else if (RANDOM_OPARATION == 2) {
                result = RANDOM_NUM1 - RANDOM_NUM2
                if (myAnswer == result) {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Correct")
                    startActivity(showAnswerActivity)
                } else {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Wrong!")
                    startActivity(showAnswerActivity)
                }
            } else if (RANDOM_OPARATION == 3) {
                result = RANDOM_NUM1 * RANDOM_NUM2
                if (myAnswer == result) {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Correct")
                    startActivity(showAnswerActivity)
                } else {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Wrong!")
                    startActivity(showAnswerActivity)
                }
            } else if (RANDOM_OPARATION == 4) {
                result = RANDOM_NUM1 / RANDOM_NUM2
                if (myAnswer == result) {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Correct")
                    startActivity(showAnswerActivity)
                } else {
                    var showAnswerActivity = Intent(this, ShowAnswerActivity::class.java)
                    showAnswerActivity.putExtra("answer", "That's Wrong!")
                    startActivity(showAnswerActivity)
                }
            }
        }
    }
}
