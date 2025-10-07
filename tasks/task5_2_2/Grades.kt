// Task 5.2.2: conversion of marks into grades, using a function
fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

fun main(marks: Array<String>){
    for (mark in marks){
        val result = grade(mark.toInt())
        print("$mark is a $result\n")
    }
}