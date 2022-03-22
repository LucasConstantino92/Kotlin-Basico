fun main() {
    println("Bem vindo ao ByteBank")
    val contaLucas = Conta()
    contaLucas.titular = "Lucas"
    contaLucas.numero = 2000
    contaLucas.saldo = 100.0


    val contaMichely = Conta()
    contaMichely.titular = "Michely"
    contaMichely.numero = 1000
    contaMichely.saldo = 5000.0

    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)
    println()
    println(contaMichely.titular)
    println(contaMichely.numero)
    println(contaMichely.saldo)

    println()

    println("Depositando na conta do Lucas")
    contaLucas.deposita(contaLucas, 50.0)
    println(contaLucas.saldo)

    println()

    println("Depositando na conta da Michely")
    contaMichely.deposita(contaMichely, 50.0)
    println(contaMichely.saldo)
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(conta: Conta, valor: Double){
        conta.saldo += valor
    }
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

fun testaLacos(){
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