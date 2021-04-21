package one.digitalInnovation.digiOneBank.test

import one.digitalInnovation.digiOneBank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val digiOneBank2 = digiOneBank.copy(numero = 14)
    println(digiOneBank2.bancoInfo())

}