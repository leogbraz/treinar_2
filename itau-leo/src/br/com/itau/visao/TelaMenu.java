package br.com.itau.visao;

import br.com.itau.servico.ItauService;
import br.com.itau.util.ItauUtil;

public class TelaMenu {

	private ItauService service;
	
	public TelaMenu() {
		this.service = new ItauService();
	}
	
	public void iniciarAtendimento() {
		int opcao = 0;
		do {
			imprimirMenu();
			opcao = ItauUtil.leitor.nextInt();
			switch (opcao) {
			case 1:
				cadastrarConta();
				break;
			case 2:
				exibirSaldo();
				break;
			case 3:
				depositar();
				break;
			case 4:
				sacar();
				break;
			case 5:
				cadastrarTaxaRendimentoPoupanca();
				break;
			case 6:
				aplicarTaxaRendimentoPoupanca();
				break;
			case 7:
				imprimirConta();
				break;
			case 8:
				excluirConta();
				break;
			case 0:
				System.out.println("###### Saiu do sistema! ######");
				break;
			default:
				System.out.println("###### Opção Inválida ######");
				break;
			}

		} while (opcao != 0);
	}

	private void excluirConta() {
		int numeroConta = recuperarNumeroConta();
		service.excluirConta(numeroConta);
		System.out.println("Conta excluida com sucesso!");
	}

	private void imprimirConta() {
		this.service.imprimirConta();
	}

	private void aplicarTaxaRendimentoPoupanca() {
		service.capitalizarPoupanca();
	}

	private void cadastrarTaxaRendimentoPoupanca() {
		service.cadastrarTaxaRendimentoPoupanca();
	}

	private void sacar() {
		int numeroConta = recuperarNumeroConta();
		service.sacar(numeroConta);
		double novoSaldo = service.recuperarSaldo(numeroConta);
		System.out.println("Saque efetuado com sucesso\nNovo saldo: " + novoSaldo);
	}

	private void depositar() {
		int numeroConta = recuperarNumeroConta();
		service.depositar(numeroConta);
		double novoSaldo = service.recuperarSaldo(numeroConta);
		System.out.println("Deposito efetuado com sucesso\nNovo saldo: " + novoSaldo);
	}

	private void exibirSaldo() {
		int numeroConta = recuperarNumeroConta();
		double saldo = service.recuperarSaldo(numeroConta);
		System.out.println("Saldo atual: " + saldo);
	}

	private int recuperarNumeroConta() {
		System.out.println("Digite o numero da conta");
		service.listarContas();
		return ItauUtil.leitor.nextInt();
	}

	private void cadastrarConta() {
		System.out.print("Digite:\n\t1 - Poupança\n\t2 - Corrente\n\t3 - Salário\n=> ");
		int tipoConta = ItauUtil.leitor.nextInt();
		service.cadastrarConta(tipoConta);
		System.out.println("Conta cadastrada com sucesso!");
	}
	
	private void imprimirMenu() {
		System.out.print("Informe:\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "5 - Cadastrar taxa de rendimento da Poupança\n\t"
				+ "6 - Aplicar rendimento Poupança\n\t"
				+ "7 - Imprimir Conta\n\t"
				+ "8 - Excluir Conta\n\t"
				+ "0 - Sair\n=> ");
	}
}
