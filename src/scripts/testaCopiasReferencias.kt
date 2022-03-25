import contas.ContaCorrente
import funcionarios.Cliente

fun testaCopiasReferencias() {
    val numX = 10
    var numY = numX
    numY++

    println("NumeroX $numX")
    println("NumeroY $numY")

    val marcelo = Cliente(
        nome = "Marcelo",
        cpf = "",
        senha = 3
    )

    val tuani = Cliente(
        nome = "Tuani",
        cpf = "",
        senha = 5
    )

    val contaMarcelo = ContaCorrente(titular = marcelo, numero = 200)
    contaMarcelo.titular = marcelo
    var contaTuani = contaMarcelo
    contaTuani.titular = tuani

    println("Titular conta Marcelo: ${contaMarcelo.titular.nome}")
}