package com.example.basketballscore

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.basketballscore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.resultsButton.setOnClickListener{
            openResultadoActivity()
        }

    }
    var teamL = 0
    var teamV = 0


    fun local_plus_button(view: View?) {
        teamL = teamL + 1
        score_board_L_current(teamL)
    }

    fun local_two_points_button(view: View?) {
        teamL = teamL + 2
        score_board_L_current(teamL)
    }

    fun local_minus_button(view: View?) {
        teamL = teamL - 1
        score_board_L_current(teamL)
    }

    private fun score_board_L_current(teamL: Int) {
        val textView: TextView = findViewById(R.id.local_score)
        textView.text = "" + teamL
    }

    fun visitor_plus_button(view: View?) {
        teamV = teamV + 1
        score_board_V_current(teamV)
    }

    fun visitor_two_points_button(view: View?) {
        teamV = teamV + 2
        score_board_V_current(teamV)
    }

    fun visitor_minus_button(view: View?) {
        teamV = teamV - 1
        score_board_V_current(teamV)
    }

    private fun score_board_V_current(teamV: Int) {
        val textView: TextView = findViewById(R.id.visitor_score)
        textView.text = "" + teamV
    }
    fun restart_button(view: View) {
        teamV = 0
        score_board_V_current(teamV)
        teamL = 0
        score_board_L_current(teamL)
    }
    private fun openResultadoActivity(){
        val intent = Intent(this, Resultado::class.java)
        startActivity(intent)
    }

}