fun main() {
    println("Bem vindo ao ByteBank")
    val contaLucas = Conta()
    contaLucas.titular = "Lucas"
    contaLucas.numero = 2000
    contaLucas.deposita(100.0)


    val contaMichely = Conta()
    contaMichely.titular = "Michely"
    contaMichely.numero = 1000
    contaMichely.deposita(500.0)

    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)
    println()
    println(contaMichely.titular)
    println(contaMichely.numero)
    println(contaMichely.saldo)

//    println()
//
//    println("Depositando na conta do Lucas")
//    contaLucas.deposita(50.0)
//    println(contaLucas.saldo)
//
//    println()
//
//    println("Depositando na conta da Michely")
//    contaMichely.deposita(50.0)
//    println(contaMichely.saldo)
//
//    println()
//
//    println("Sacando na conta do Lucas")
//    contaLucas.saca(100.0)
//    println(contaLucas.saldo)
//
//    println()
//
//    println("Sacando em excesso")
//    contaLucas.saca(500.0)
//    println(contaLucas.saldo)
//
//    println()
//
//    println("Transferindo da Michely para o Lucas")
//    contaMichely.transfere(contaLucas, 500.0)
//    println("Conta do Lucas: ${contaLucas.saldo}")
//    println("Conta da Michely: ${contaMichely.saldo}")
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente. Seu saldo é de $saldo e sua tentativa foi de $valor")
        }
    }

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

    // Não utilizado
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }
    // Fim do não utilizado
}

fun testaCopiasReferencias() {
    val numX = 10
    var numY = numX
    numY++

    println("NumeroX $numX")
    println("NumeroY $numY")

    val contaMarcelo = Conta()
    contaMarcelo.titular = "Marcelo"
    var contaTuani = contaMarcelo
    contaTuani.titular = "Tuani"

    println("Titular conta Marcelo: ${contaMarcelo.titular}")
}

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


fun testaCondicoes(saldo: Double) {
    when {
        saldo == 0.0 -> println("Saldo é neutro")
        saldo > 0.0 -> println("Saldo é positivo")
        else -> println("Saldo é negativo")
    }
}