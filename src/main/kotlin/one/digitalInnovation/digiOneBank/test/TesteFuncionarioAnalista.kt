package one.digitalInnovation.digiOneBank.test

import one.digitalInnovation.digiOneBank.Analista


fun main(){
    val joao = Analista("Joao das Contas", "987.654.321-78", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}

