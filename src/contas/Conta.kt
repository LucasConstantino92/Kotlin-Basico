package contas

import funcionarios.Cliente

abstract class Conta(
    var titular: Cliente,
    var numero: Int
) {
    var saldo = 0.0
        protected set
    companion object Contador{
        var total = 0
            private set
        }

    init {
        println("Criando Conta")
        total++
    }

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

    abstract fun sacaDinheiro(valor: Double)
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun sacaDinheiro(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
)
{

    override fun sacaDinheiro(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}