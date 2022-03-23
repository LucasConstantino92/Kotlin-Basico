class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.getBonificacao()
    }

    fun registra(funcionario: Gerente) {
        this.total += funcionario.getBonificacao()
    }

    fun registra(funcionario: Diretor) {
        this.total += funcionario.getBonificacao()
    }
}