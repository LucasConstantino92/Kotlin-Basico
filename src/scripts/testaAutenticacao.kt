import contas.SistemaInterno
import funcionarios.Cliente
import funcionarios.Diretor
import funcionarios.Gerente

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Ryan",
        cpf = "111.111.111.01",
        salario = 1600.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Michely",
        cpf = "222.222.222.22",
        salario = 3000.0,
        senha = 4321,
        plr = 0.5
    )

    val cliente = Cliente(
        nome = "Alessandro",
        cpf = "444.444.444.44",
        senha = 1243
    )

    val sistema = SistemaInterno()

    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 4321)
    sistema.entra(cliente, 1243)
}