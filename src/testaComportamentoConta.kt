fun testaComportamentosConta() {
    val contaLucas = Conta(titular = "Lucas", numero = 100)
    contaLucas.deposita(100.0)


    val contaMichely = Conta(numero = 1000, titular = "Michely")
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
    println("Conta do Lucas: ${contaLucas.saldo}")
    println("Conta da Michely: ${contaMichely.saldo}")
}