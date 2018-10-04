package com.jokenpokemon.jokenpokemon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class GameActivity : AppCompatActivity() {

    private var numeroAleatorio: Random? = null

    private val Bulbasaur = 1
    private val Squirtle = 2
    private val Charmander = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        numeroAleatorio = Random()

    }
}
