package com.example.ejercicios

fun esPrimo(x : Int): Boolean{
    if (x == 0 || x == 1 || x == 4){
        return false
    }


    return true
}

fun main() {
    esPrimo(1);
}