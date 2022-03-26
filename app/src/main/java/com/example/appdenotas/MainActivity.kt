package com.example.appdenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appdenotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var listaNota: List<Nota> = listOf(Nota("E-mail", "Responder os e-mails urgentes"),
                                               Nota("Estudar", "RX, Coroutines"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        iniciarRecycleView()
    }

    private fun iniciarRecycleView() {
        val adapter = NotaAdapter(applicationContext, listaNota)
        binding.recycleViewNotas.adapter = adapter

    }
}