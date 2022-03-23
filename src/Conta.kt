open class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

    open fun sacaDinheiro(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente. Seu saldo é de $saldo e sua tentativa foi de $valor")
        }
    }
}