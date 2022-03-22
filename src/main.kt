fun main() {
    println("Bem vindo ao ByteBank")

    val ryan = Funcionario(
        nome = "Ryan",
        cpf = "500.001.111.01",
        salario = 1000.0
    )

    println("Nome ${ryan.nome}")
    println("CPF ${ryan.cpf}")
    println("Salario ${ryan.salario}")
    println("Bonificação ${ryan.bonificacao()}")

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
    println("Bonificação Gerente ${alessandro.bonificacao()}")

    if(alessandro.autentica(1234)){
        println("Autenticou com sucesso!")
    }else {
        println("Falha na autenticação.")
    }
}
