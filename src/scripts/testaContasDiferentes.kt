import contas.Conta
import contas.ContaCorrente
import contas.ContaPoupanca
import funcionarios.Cliente

fun testaContasDiferentes() {

    val contaCorrente: Conta = ContaCorrente(
        Cliente(
            nome = "Ryan",
            cpf = "",
            senha = 6
        ),
        numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca(
        Cliente(
            nome = "Ricardo",
            cpf = "",
            senha = 2255
        ),
        numero = 1500
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(2000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacaDinheiro(100.0)
    contaPoupanca.sacaDinheiro(250.0)

    println("Saldo corrente após saque: ${contaCorrente.saldo}")
    println("Saldo poupança após saque: ${contaPoupanca.saldo}")

    println()

    contaCorrente.transfere(contaPoupanca, 200.0)

    println("Valor da contas.Conta Corrente após transferencia de 200: ${contaCorrente.saldo}")
    println("Valor da contas.Conta Poupança após transferencia de 200: ${contaPoupanca.saldo}")
}