package com.example.ejercicios

fun main() {

    var cadena : MutableList<String> = mutableListOf();

    while (!cadena.contains("fin")){

        println("Ingresa un texto");
        cadena.add(readln());
    }

    if (cadena.contains("fin")){
        cadena.removeLast();
    }

    val reverse: List<String> = cadena.reversed();

    println(reverse);

    cadena.forEach() {
        println(it);
    }


}