package com.arfdn.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.arfdn.kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnOne.setOnClickListener {
            //todo: action button one
        }
    }

    fun inputNilai(view: View) {
        with(binding){
            when((view as Button).text.toString()){
                "+"-> {
                    hasil.text = "plus "
                }
                "-"-> {
                    hasil.text = "minus "
                }
                "x"-> {
//                 todo: tambahkan fungsi perkalian
                }
                "/"-> {
//                todo: tambahkan fungsi pembagian
                }
                else->{
                    hasil.text = "tidak ada "
                }
            }
        }

    }
}