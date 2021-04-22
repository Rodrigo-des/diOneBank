package one.digitalInnovation.digiOneBank.test

import one.digitalInnovation.digiOneBank.Cliente
import one.digitalInnovation.digiOneBank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose Junqueira",
        cpf = "963852741-56",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}