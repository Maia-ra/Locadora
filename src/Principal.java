
import java.util.*;
import java.util.Scanner;

public class Principal {

	// MEMBROS DA EQUIPE
	//
	// ANA BEATRIZ
	// TAYSA BARBOSA
	// MAIARA
	// PERICLES
	// VANESSA
	// ADEMARIO TELES

	// Trabalho de Programação Orientada a Objetos - Eliel
	public static void main(String[] args) {

		//DECLARAÇÃO DE VARIAVEIS
		int geradorNumeros = 0;
		int diasConvencional = 0;
		int diasLuxo = 0;
		int automovel = 0;
		int autoluxo = 0;
		double total = 0;
		Scanner sc = new Scanner(System.in);

		ArrayList<Automovel> car = new ArrayList<Automovel>(); // um cliente pode alugar varios carros convencionais
		ArrayList<Autoluxo> carluxo = new ArrayList<Autoluxo>();// um cliente pode alugar varios carros de luxo

		System.out.println("  ______\r\n" + " /|_||_\\`.__\r\n"
				+ "(   _    _ _\\ SEJA BEM-VINDO A LOCADORA DE CARROS\r\n" + "=`-(_)--(_)-'");// Tela de Bem-vindo

		System.out.println("Preencha o cadastro...\n"); // Cadastro do Cliente com nome, data de nascimento e CPF
		System.out.print("Nome do Cliente:\n");
		String nome = sc.next();
		System.out.print("Numero do CPF:\n");
		String cpf = sc.next();

		System.out.print("Data de Nascimento:\n");
		String dtNascimento = sc.next();

		System.out.print("Quantos carros de luxo gostaria de alugar:\n");// Perguntar quantos carros convencios o
																			// cliente quer alugar caso seja 0
																			// Não sera perguntado o numero de dias
		autoluxo = sc.nextInt();
		if (autoluxo > 0) {//Caso ele não queria nenhum carro de luxo não sera perguntado quantos dias ira alugar 
			System.out.print("Por quantos dias desejar alugar:\n");
			diasLuxo = sc.nextInt();
		}

		System.out.print("Quantos carros convencionais gostaria de alugar:\n");// Perguntar quantos carros de luxo o
																				// cliente quer alugar caso seja 0
		// Não sera perguntado o numero de dias
		automovel = sc.nextInt();
		if (automovel > 0) {//Caso ele não queria nenhum carro de convencional não sera perguntado quantos dias ira alugar 
			System.out.print("Por quantos dias desejar alugar:\n");
			diasConvencional = sc.nextInt();
		}

		Cliente client = new Cliente(nome, dtNascimento, cpf); // Sera cadastrado 3 atributos no objeto cliente

		ArrayList<Aluguel> alugueu = new ArrayList<Aluguel>();

		System.out.print("O cliente com o nome " + client.getNome() + " e CPF:" + client.getCPF() + " adquiriu "
				+ (autoluxo + automovel) + " Veiculo(s)\r\r");
		for (int i = 0; i < automovel; i++) {// Sera adicionado dados do Carro no ArrayList Automovel
			geradorNumeros = (int) (i + Math.random() * 1000);
			car.add(new Automovel("GOL-" + geradorNumeros, geradorNumeros + "89AEABCDE", 1995, "GOL", "Azul", 35.0));
			alugueu.add(new Aluguel(car.get(i), client, "31/05/2022", diasConvencional));

		}

		for (int z = 0; z < autoluxo; z++) {// Sera adicionado dados do Carro no ArrayList Autoluxo
			geradorNumeros = (int) (z + Math.random() * 1000);
			carluxo.add(
					new Autoluxo("BMW-" + geradorNumeros, geradorNumeros + "89AEABCDE", 2016, "BMW", "Cinza", 35.0));

			alugueu.add(new Aluguel(carluxo.get(z), client, "31/05/2022", diasLuxo));

		}

		for (int x = 0; x < automovel + autoluxo; x++) {// Sera impresso os veiculos convencionais do ArrayList
														// Automovel

			System.out.println(alugueu.get(x).toString());
			total += alugueu.get(x).totalapagar();
			System.out.println(
					"==============================================================================================================================================================");
		}

		System.out.println("Valor total do aluguel: R$" + total);// Aqui exibirá o total em Reais dos dias alugados e
																	// multiplicado pela diaria

	}

}
