private fun testaFuncionarios() {
    val ryan = Funcionario(
        nome = "Ryan",
        cpf = "500.001.111.01",
        salario = 1000.0
    )

    println("Nome ${ryan.nome}")
    println("CPF ${ryan.cpf}")
    println("Salario ${ryan.salario}")
    println("Bonificação ${ryan.getBonificacao()}")

    println()

    val alessandro = Gerente(
        nome = "Alessandro",
        cpf = "111.111.111.1",
        salario = 3000.0,
        senha = 1234
    )

    println("Nome ${alessandro.nome}")
    println("CPF ${alessandro.cpf}")
    println("Salario ${alessandro.salario}")
    println("Bonificação Gerente ${alessandro.getBonificacao()}")

    if (alessandro.autentica(1234)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação.")
    }

    val ricardo = Diretor(
        nome = "Ricardo",
        cpf = "333.333.333.09",
        salario = 8000.0,
        senha = 4321,
        plr = 200.0
    )

    println()

    println("Nome ${ricardo.nome}")
    println("CPF ${ricardo.cpf}")
    println("Salario ${ricardo.salario}")
    println("Bonificação Gerente ${ricardo.getBonificacao()}")
    println("PLR: ${ricardo.plr}")

    val luciana = Analista(
        nome = "Luciana",
        cpf = "555.555.555.56",
        salario = 2500.0,
        senha = 5434
    )

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(ryan)
    calculadora.registra(ricardo)
    calculadora.registra(alessandro)
    calculadora.registra(luciana)

    println("Total de bonificão: ${calculadora.total}")
}