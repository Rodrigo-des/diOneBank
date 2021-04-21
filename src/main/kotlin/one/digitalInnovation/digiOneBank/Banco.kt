package one.digitalInnovation.digiOneBank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun bancoInfo() = "$nome - $numero"
}
