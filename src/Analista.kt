class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun getBonificacao(): Double {
        return super.getBonificacao() + salario
    }
}