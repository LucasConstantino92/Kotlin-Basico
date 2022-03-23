class ContaPoupanca(
    titular: String,
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