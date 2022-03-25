fun testaCondicoes(saldo: Double) {
    when {
        saldo == 0.0 -> println("Saldo é neutro")
        saldo > 0.0 -> println("Saldo é positivo")
        else -> println("Saldo é negativo")
    }
}