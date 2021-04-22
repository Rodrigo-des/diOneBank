package one.digitalInnovation.digiOneBank.test


import one.digitalInnovation.digiOneBank.Gerente


fun main(){
    val maria = Gerente("maria da Silva", "258.654.321-78", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
