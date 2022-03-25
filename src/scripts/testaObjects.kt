package scripts

import contas.*
import funcionarios.Cliente
import testaContasDiferentes

fun testaObjects(){
    val mika = object : Autenticavel {
        val nome: String = "Mika"
        val cpf: String = "534.534.456.85"
        val senha: Int = 1200

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(mika, 1200)

    println("nome do cliente ${mika.nome}")



    val lucas = Cliente(
        nome = "Lucas",
        cpf = "",
        senha = 1234
    )

    val contaPoupanca = ContaPoupanca(titular = lucas, numero = 1000)
    val contaCorrente = ContaCorrente(titular = lucas, numero = 2000)

    testaContasDiferentes()

    println("Total de Contas: ${Conta.total}")
}