package com.example.ejercicios

fun main() {

    var day = 10;

    when(day) {
        0,1 -> println("Monday");
        2 -> println("Tuesday");
        3 -> println("Wednesday");
        4 -> println("Thursday");
        5 -> println("Friday");
        6 -> println("Saturday");
        7 -> println("Sunday");
        else -> println("Debe ser un dia entre 1 y 7")
    }


}