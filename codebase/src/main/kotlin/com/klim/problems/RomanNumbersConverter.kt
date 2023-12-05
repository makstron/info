package com.klim.problems

import com.klim.Color

/**
 * Римські числа в арабські
 * https://findhow.org/5149-konverter-rimskih-tsifr.html
 *
 * ідея:
 * розбити число на логічні частини які можна просумувати і потім знайти їх суму
 * MMMCMXCV -> [MMM, CM, XC, V]  ->  [3000, 900, 90, 5] = 3995
 *
 */

fun main() {
    print("I"); printResult(RomanNumerals().run("I") == 1)
    print("II"); printResult(RomanNumerals().run("II") == 2)
    print("III"); printResult(RomanNumerals().run("III") == 3)
    print("IV"); printResult(RomanNumerals().run("IV") == 4)
    print("V"); printResult(RomanNumerals().run("V") == 5)
    print("VI"); printResult(RomanNumerals().run("VI") == 6)
    print("VII"); printResult(RomanNumerals().run("VII") == 7)
    print("VIII"); printResult(RomanNumerals().run("VIII") == 8)
    print("IX"); printResult(RomanNumerals().run("IX") == 9)
    print("X"); printResult(RomanNumerals().run("X") == 10)
    print("XI"); printResult(RomanNumerals().run("XI") == 11)
    print("XII"); printResult(RomanNumerals().run("XII") == 12)
    print("XIII"); printResult(RomanNumerals().run("XIII") == 13)
    print("XIV"); printResult(RomanNumerals().run("XIV") == 14)
    print("XV"); printResult(RomanNumerals().run("XV") == 15)
    print("XVI"); printResult(RomanNumerals().run("XVI") == 16)
    print("XVII"); printResult(RomanNumerals().run("XVII") == 17)
    print("XVIII"); printResult(RomanNumerals().run("XVIII") == 18)
    print("XIX"); printResult(RomanNumerals().run("XIX") == 19)
    print("XX"); printResult(RomanNumerals().run("XX") == 20)
    print("XXI"); printResult(RomanNumerals().run("XXI") == 21)
    print("XXII"); printResult(RomanNumerals().run("XXII") == 22)
    print("XXIII"); printResult(RomanNumerals().run("XXIII") == 23)
    print("XXIV"); printResult(RomanNumerals().run("XXIV") == 24)
    print("XXV"); printResult(RomanNumerals().run("XXV") == 25)
    print("XXVI"); printResult(RomanNumerals().run("XXVI") == 26)
    print("XXVII"); printResult(RomanNumerals().run("XXVII") == 27)
    print("XXVIII"); printResult(RomanNumerals().run("XXVIII") == 28)
    print("XXIX"); printResult(RomanNumerals().run("XXIX") == 29)
    print("XXX"); printResult(RomanNumerals().run("XXX") == 30)
    print("XXXI"); printResult(RomanNumerals().run("XXXI") == 31)
    print("XXXII"); printResult(RomanNumerals().run("XXXII") == 32)
    print("XXXIII"); printResult(RomanNumerals().run("XXXIII") == 33)
    print("XXXIV"); printResult(RomanNumerals().run("XXXIV") == 34)
    print("XXXV"); printResult(RomanNumerals().run("XXXV") == 35)
    print("XXXVI"); printResult(RomanNumerals().run("XXXVI") == 36)
    print("XXXVII"); printResult(RomanNumerals().run("XXXVII") == 37)
    print("XXXVIII"); printResult(RomanNumerals().run("XXXVIII") == 38)
    print("XXXIX"); printResult(RomanNumerals().run("XXXIX") == 39)
    print("XL"); printResult(RomanNumerals().run("XL") == 40)
    print("XLI"); printResult(RomanNumerals().run("XLI") == 41)
    print("XLII"); printResult(RomanNumerals().run("XLII") == 42)
    print("XLIII"); printResult(RomanNumerals().run("XLIII") == 43)
    print("XLIV"); printResult(RomanNumerals().run("XLIV") == 44)
    print("XLV"); printResult(RomanNumerals().run("XLV") == 45)
    print("XLVI"); printResult(RomanNumerals().run("XLVI") == 46)
    print("XLVII"); printResult(RomanNumerals().run("XLVII") == 47)
    print("XLVIII"); printResult(RomanNumerals().run("XLVIII") == 48)
    print("XLIX"); printResult(RomanNumerals().run("XLIX") == 49)
    print("L"); printResult(RomanNumerals().run("L") == 50)
    print("LI"); printResult(RomanNumerals().run("LI") == 51)
    print("LII"); printResult(RomanNumerals().run("LII") == 52)
    print("LIII"); printResult(RomanNumerals().run("LIII") == 53)
    print("LIV"); printResult(RomanNumerals().run("LIV") == 54)
    print("LV"); printResult(RomanNumerals().run("LV") == 55)
    print("LVI"); printResult(RomanNumerals().run("LVI") == 56)
    print("LVII"); printResult(RomanNumerals().run("LVII") == 57)
    print("LVIII"); printResult(RomanNumerals().run("LVIII") == 58)
    print("LIX"); printResult(RomanNumerals().run("LIX") == 59)
    print("LX"); printResult(RomanNumerals().run("LX") == 60)
    print("LXI"); printResult(RomanNumerals().run("LXI") == 61)
    print("LXII"); printResult(RomanNumerals().run("LXII") == 62)
    print("LXIII"); printResult(RomanNumerals().run("LXIII") == 63)
    print("LXIV"); printResult(RomanNumerals().run("LXIV") == 64)
    print("LXV"); printResult(RomanNumerals().run("LXV") == 65)
    print("LXVI"); printResult(RomanNumerals().run("LXVI") == 66)
    print("LXVII"); printResult(RomanNumerals().run("LXVII") == 67)
    print("LXVIII"); printResult(RomanNumerals().run("LXVIII") == 68)
    print("LXIX"); printResult(RomanNumerals().run("LXIX") == 69)
    print("LXX"); printResult(RomanNumerals().run("LXX") == 70)
    print("LXXI"); printResult(RomanNumerals().run("LXXI") == 71)
    print("LXXII"); printResult(RomanNumerals().run("LXXII") == 72)
    print("LXXIII"); printResult(RomanNumerals().run("LXXIII") == 73)
    print("LXXIV"); printResult(RomanNumerals().run("LXXIV") == 74)
    print("LXXV"); printResult(RomanNumerals().run("LXXV") == 75)
    print("LXXVI"); printResult(RomanNumerals().run("LXXVI") == 76)
    print("LXXVII"); printResult(RomanNumerals().run("LXXVII") == 77)
    print("LXXVIII"); printResult(RomanNumerals().run("LXXVIII") == 78)
    print("LXXIX"); printResult(RomanNumerals().run("LXXIX") == 79)
    print("LXXX"); printResult(RomanNumerals().run("LXXX") == 80)
    print("LXXXI"); printResult(RomanNumerals().run("LXXXI") == 81)
    print("LXXXII"); printResult(RomanNumerals().run("LXXXII") == 82)
    print("LXXXIII"); printResult(RomanNumerals().run("LXXXIII") == 83)
    print("LXXXIV"); printResult(RomanNumerals().run("LXXXIV") == 84)
    print("LXXXV"); printResult(RomanNumerals().run("LXXXV") == 85)
    print("LXXXVI"); printResult(RomanNumerals().run("LXXXVI") == 86)
    print("LXXXVII"); printResult(RomanNumerals().run("LXXXVII") == 87)
    print("LXXXVIII"); printResult(RomanNumerals().run("LXXXVIII") == 88)
    print("LXXXIX"); printResult(RomanNumerals().run("LXXXIX") == 89)
    print("XC"); printResult(RomanNumerals().run("XC") == 90)
    print("XCI"); printResult(RomanNumerals().run("XCI") == 91)
    print("XCII"); printResult(RomanNumerals().run("XCII") == 92)
    print("XCIII"); printResult(RomanNumerals().run("XCIII") == 93)
    print("XCIV"); printResult(RomanNumerals().run("XCIV") == 94)
    print("XCV"); printResult(RomanNumerals().run("XCV") == 95)
    print("XCVI"); printResult(RomanNumerals().run("XCVI") == 96)
    print("XCVII"); printResult(RomanNumerals().run("XCVII") == 97)
    print("XCVIII"); printResult(RomanNumerals().run("XCVIII") == 98)
    print("XCIX"); printResult(RomanNumerals().run("XCIX") == 99)
    print("C"); printResult(RomanNumerals().run("C") == 100)

    print("CDLXXXVIII" + " -> "); printResult(RomanNumerals().run("CDLXXXVIII") == 488)
    print("CMLXXXVIII" + " -> "); printResult(RomanNumerals().run("CMLXXXVIII") == 988)
    print("CMXCV" + " -> "); printResult(RomanNumerals().run("CMXCV") == 995)
    print("M" + " -> "); printResult(RomanNumerals().run("M") == 1000)
    print("XLV" + " -> "); printResult(RomanNumerals().run("XLV") == 45)
    print("MMMCMXCV" + " -> "); printResult(RomanNumerals().run("MMMCMXCV") == 3995)

}

private fun printResult(result: Boolean) {
    if (result) {
        print(Color.GREEN_BOLD)
    } else {
        print(Color.RED_BOLD)
    }
    println(result)
    print(Color.RESET)
}

class RomanNumerals {

    private val values = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000,
    )

    fun run(number: String): Int {
        val subLists = split(number).toMutableList()
        print("\t\t\t\t" + subLists.toString() + "  ->  ")
        return sum(subLists)
    }

    private fun split(number: String): List<String> {
        val list = number.toMutableList()
        val numberParts = mutableListOf<String>()
        val part = StringBuilder()

        do {
            if (part.isEmpty() ||
                part.last() == list.first() ||
                (part.length == 1 && part.last().toArabic() < list.first().toArabic())
            ) {
                part.append(list.first())
                list.removeFirst()
            } else {
                numberParts += part.toString()
                part.clear()
            }
        } while (list.size > 0)

        if (part.isNotEmpty()) {
            numberParts += part.toString()
        }

        return numberParts
    }

    private fun convertRomanPrt(part: String): Int = when {
        part.length == 1 -> part.first().toArabic()
        part.first().toArabic() < part[1].toArabic() -> part[1].toArabic() - part.first().toArabic()
        else -> part.map { it.toArabic() }.sum()
    }

    private fun sum(subLists: List<String>): Int {
        var summ = 0
        print("[")
        subLists.forEach { part ->
            summ += convertRomanPrt(part)
                .also { print("" + it + ", ") }
        }
        print("]  -> ")
        return summ
    }

    private fun Char.toArabic(): Int {
        return values[this] ?: 0
    }

}




