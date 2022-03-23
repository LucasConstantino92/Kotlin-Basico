class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacaDinheiro(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.sacaDinheiro(valorComTaxa)
    }
}