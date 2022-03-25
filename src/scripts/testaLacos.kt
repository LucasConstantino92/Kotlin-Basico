fun testaLacos() {
    for (i in 5 downTo 1 step 2) {

        if (i == 4) {
            continue
//            Irá pular o 4. Caso utilizado break, iria terminar a execução.
        }

        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
    }
}