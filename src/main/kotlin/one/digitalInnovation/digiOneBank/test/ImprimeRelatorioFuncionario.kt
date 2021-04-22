package one.digitalInnovation.digiOneBank.test

import one.digitalInnovation.digiOneBank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}