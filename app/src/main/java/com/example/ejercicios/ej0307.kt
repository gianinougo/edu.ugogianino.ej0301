package com.example.ejercicios

/*
Array. Prepara un array con los días de la semana. El usuario introducirá
un número del 1 al 7 y le mostrarás el día correspondiente.
Si introduce un valor incorrecto, le mostrarás los 7 valores
aceptables (“1=lunes”, etc).
 */


fun main() {
    var DiaSemana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves"
        , "Viernes", "Sabado", "Domingo");

    println("Ingrese un numero del 1 al 7: ");

    var x = readLine()?.toInt();

    when(x){
        1 -> print(DiaSemana[x - 1]);
        2 -> print(DiaSemana[x - 1]);
        3 -> print(DiaSemana[x - 1]);
        4 -> print(DiaSemana[x - 1]);
        5 -> print(DiaSemana[x - 1]);
        6 -> print(DiaSemana[x - 1]);
        7 -> print(DiaSemana[x - 1]);
        else -> {
               println("1-Lunes");
               println("2-Martes");
               println("3-Miercoles");
               println("4-Jueves");
               println("5-Viernes");
               println("6-Sabado");
               println("7-Domingo");
        }
    }


}