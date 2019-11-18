package com.example.mi_proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Alabanzas extends AppCompatActivity {

    private int id;
    private String titulo;
    private String autor;
    private String letra;

    public Alabanzas() {
    }

    public Alabanzas(int id, String titulo, String autor, String letra) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.letra = letra;
    }
}
