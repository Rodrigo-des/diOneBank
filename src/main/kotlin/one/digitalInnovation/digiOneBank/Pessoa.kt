package one.digitalInnovation.digiOneBank

class Pessoa {
    var nome:String = "Rodrigo"
    var cpf:String = "123.456.789.12"
    private set

    fun pessoaInfo() = "Cliente: $nome, com CPF: $cpf "

}

fun main(){
    val rodrigo = Pessoa()

    println(rodrigo.pessoaInfo())


}