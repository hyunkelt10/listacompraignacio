package com.example.listacompraignacio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.listacompraignacio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    private var lista = mutableMapOf<String, String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        var suma = 0





    }





    fun addItem (view: View ){
        if (b.etArticulo.text.isNotEmpty() and b.etPrecio.text.isNotEmpty()){
            lista.put(b.etArticulo.text.toString(), b.etPrecio.text.toString())





            Toast.makeText(this, "añadido ${b.etArticulo.text}", Toast.LENGTH_SHORT).show()
            b.etArticulo.text.clear()
            b.etPrecio.text.clear()


            // msj(lista.toString())
        } else {
            msj("Todos los campos son obligatorios")
        }


    }



    fun nextActivity(view: View){
        val myIntent = Intent(this@MainActivity, MainActivity2::class.java)
        lista.forEach { k,v ->
            myIntent.putExtra(k,v)
        }


        startActivity(myIntent)
    }

    fun msj (str:String){
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }



}

