import contas.ContaCorrente
import contas.ContaPoupanca
import funcionarios.Cliente

fun testaComportamentosConta() {

    val lucas = Cliente(
        nome = "Lucas",
        cpf = "444.444.444.44",
        senha = 1234
    )
    val contaLucas = ContaCorrente(titular = lucas, numero = 100)
    contaLucas.deposita(100.0)

    val michely = Cliente(
        nome = "Michely",
        cpf = "222.222.222.22",
        senha = 4321
    )


    val contaMichely = ContaPoupanca(numero = 1000, titular = michely)
    contaMichely.deposita(500.0)

    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)
    println()
    println(contaMichely.titular)
    println(contaMichely.numero)
    println(contaMichely.saldo)

    println()

    println("Depositando na conta do Lucas")
    contaLucas.deposita(50.0)
    println(contaLucas.saldo)

    println()

    println("Depositando na conta da Michely")
    contaMichely.deposita(50.0)
    println(contaMichely.saldo)

    println()

    println("Sacando na conta do Lucas")
    contaLucas.sacaDinheiro(100.0)
    println(contaLucas.saldo)

    println()

    println("Sacando em excesso")
    contaLucas.sacaDinheiro(500.0)
    println(contaLucas.saldo)

    println()

    println("Transferindo da Michely para o Lucas")
    contaMichely.transfere(contaLucas, 500.0)
    println("contas.Conta do Lucas: ${contaLucas.saldo}")
    println("contas.Conta da Michely: ${contaMichely.saldo}")
}