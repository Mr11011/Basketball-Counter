package com.example.mycounterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var score1: TextView
    private lateinit var button1A: Button
    private lateinit var button2A: Button
    private lateinit var buttonFA: Button
    var counter1: Int = 0
    var counter2: Int = 0

    private lateinit var score2: TextView
    private lateinit var button3B: Button
    private lateinit var button2B: Button
    private lateinit var buttonFB: Button
    private lateinit var resetbutton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        score1 = findViewById(R.id.score_a)
        button1A = findViewById(R.id.ButtonA3)
        button2A = findViewById(R.id.ButtonA2)
        buttonFA = findViewById(R.id.ButtonF_A)
        score2 = findViewById(R.id.score_b)
        button3B = findViewById(R.id.ButtonB3)
        button2B = findViewById(R.id.ButtonB2)
        buttonFB = findViewById(R.id.ButtonFB3)
        resetbutton = findViewById(R.id.reset)


        button1A.setOnClickListener {
            counter1 += 3
            score1.text = counter1.toString()

        }



        button2A.setOnClickListener {
            counter1 += 2
            score1.text = counter1.toString()


        }

        buttonFA.setOnClickListener {
            counter1 += 1
            score1.text = counter1.toString()

        }

        button3B.setOnClickListener {
            counter2 += 3
            score2.text = counter2.toString()


        }
        button2B.setOnClickListener {
            counter2 += 2
            score2.text = counter2.toString()


        }
        buttonFB.setOnClickListener {
            counter2 += 1
            score2.text = counter2.toString()


        }
        resetbutton.setOnClickListener {
            score2.text= 0.toString()
            score1.text= 0.toString()

        }
    }
}
