package com.example.listacompraignacio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listacompraignacio.databinding.ActivityMain2Binding
import com.example.listacompraignacio.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var b: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(b.root)
        var total = 0.0

        b.tvLista.text = "LISTA\n\n"
        val myExtras = intent.extras
        if (myExtras != null){
            val keys = myExtras.keySet()
            for (key in keys){
                b.tvLista.text = b.tvLista.text.toString().plus("$key:\t\t\t${myExtras.get(key)}\n")
                total = myExtras.get(key).toString().toDouble() + total

            }
            b.tvLista.text = b.tvLista.text.toString().plus("\n\n Total: $total")
        }
        b.btnVolver.setOnClickListener {
            onBackPressed()
        }

    }
    fun msj (str:String){
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
}







