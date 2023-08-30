package com.arfdn.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun InputNilai(view: View) {
        when((view as Button).text.toString()){
            "+"-> { findViewById<TextView>(R.id.hasil).text = "Halo"
            }
            "-"-> {
//                todo: tambahkan fungsi pengurangan
            }
            "x"-> {
//                 todo: tambahkan fungsi perkalian
            }
            "/"-> {
//                todo: tambahkan fungsi pembagian
            }
            else->{
                findViewById<TextView>(R.id.hasil).text =
                    findViewById<TextView>(R.id.hasil).text.toString()+(view as Button).text.toString()

            }
        }
    }
}