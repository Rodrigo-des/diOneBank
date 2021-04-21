package one.digitalInnovation.digiOneBank.test

import one.digitalInnovation.digiOneBank.Funcionario
import java.math.BigDecimal

fun main(){
    val joao = Funcionario("Joao das Contas", "987.654.321-78", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}