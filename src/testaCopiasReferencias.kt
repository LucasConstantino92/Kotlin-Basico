fun testaCopiasReferencias() {
    val numX = 10
    var numY = numX
    numY++

    println("NumeroX $numX")
    println("NumeroY $numY")

    val contaMarcelo = Conta(titular = "Marcelo", numero = 200)
    contaMarcelo.titular = "Marcelo"
    var contaTuani = contaMarcelo
    contaTuani.titular = "Tuani"

    println("Titular conta Marcelo: ${contaMarcelo.titular}")
}