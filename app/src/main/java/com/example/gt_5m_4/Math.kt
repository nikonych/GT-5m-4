package com.example.gt_5m_4

class Math {

    val integerChars = '0'..'9'

    fun add(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger()) {
            result = (a.toInt() + b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            if((a.isDouble() && b.isDouble()) || (a.isDouble() && b.isInteger()) || (a.isInteger() && b.isDouble())){
                result = (a.toDouble() + b.toDouble()).toString()
            } else {
                result = "Некорректный ввод"
            }
        } else {
            result = "Вы объязаны ввести числа"
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger() && b != "0") {
            result = (a.toDouble() / b.toDouble()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            if((a.isDouble() && b.isDouble()) || (a.isDouble() && b.isInteger()) || (a.isInteger() && b.isDouble())){
                result = (a.toDouble() / b.toDouble()).toString()
            } else {
                result = "Некорректный ввод"
            }
        } else if (b == "0") {
            result = "На ноль делить нельзя"
        } else {
            result = "Вы объязаны ввести числа"
        }
        return result
    }


    fun String.isDouble() = this.toDoubleOrNull()?.let { true } ?: false
    fun String.isInteger() = this.toIntOrNull()?.let { true } ?: false
}