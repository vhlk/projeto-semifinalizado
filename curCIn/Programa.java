package curCIn;

import java.util.Scanner;
import Cantina.*;
import Curso.*;
import Disciplina.*;
import Exceptions.*;
import Material.*;
import Pessoa.*;

public class Programa {
	public static void main(String[] args) throws CantinaExistenteException {
		Scanner in = new Scanner(System.in);
		System.out.println("Bem vindo ao registro do CurCIn!");
		System.out.println("Para iniciar, que tipo de repositorio deseja utilizar?");
		try {
			System.out.println("1 - Lista       2 - Array");
			int tipoRep = Integer.parseInt(in.nextLine());
			if (tipoRep == 1) {
				System.out.println("Voce escolheu o tipo Lista. Vamos comecar!");
			}
			if (tipoRep == 2) {
				System.out.println("Voce escolheu o tipo Array. Vamos comecar!");
			}
			CadastroCurCIn cc = new CadastroCurCIn(tipoRep);
			boolean repetidor = true;
			while (repetidor) {
				System.out.println("Digite o numero do tipo de registro que você deseja manipular:");
				System.out.println("0 - Sair");
				System.out.println("1 - Cantina");
				System.out.println("2 - Curso");
				System.out.println("3 - Disciplina");
				System.out.println("4 - Material");
				System.out.println("5 - Pessoa");
				int codigoRegistro = Integer.parseInt(in.nextLine());
				
				if (codigoRegistro == 0) {
					repetidor = false;
				}
				
				if (codigoRegistro == 1) {
					System.out.println("Você escolheu cantina! O que você deseja fazer?");
					System.out.println("1 - Criar uma cantina e registrá-la no repositório");
					System.out.println("2 - Manipular as cantinas existentes.");
					int cRCantina = Integer.parseInt(in.nextLine());

					if (cRCantina == 1) {
						System.out.println("Você deseja registrar uma cantina!");
						System.out.println("Qual o nome do prato principal da cantina? ");
						String nomeP = in.nextLine();
						System.out.println("Qual o seu preço? ");
						double precoP = Double.parseDouble(in.nextLine());
						Prato prato = new Prato(nomeP, precoP);
						System.out.println("Devemos registrar o gerente no sistema.");
						System.out.println("Qual seu nome?");
						String nome = in.nextLine();
						System.out.println("Quando ele nasceu? (DD/MM/AA)");
						String data = in.nextLine();
						System.out.println("Qual seu CPF?");
						String cpf = in.nextLine();
						Pessoa pessoa= new Funcionario(nome, data, cpf);
						System.out.println("Qual o nome da sua cantina?");
						String nomeC = in.nextLine();
						Cantina cant = new Cantina(nomeC, prato, pessoa);
						cc.inserirCantina(cant);
					}

					else if(cRCantina == 2) {


					}
				}


				else if (codigoRegistro == 2) {

				}

				else if (codigoRegistro == 3) {

				}

				else if (codigoRegistro == 4) {

				}

				else if (codigoRegistro == 5) {

				}
			}

		}
		catch (CantinaExistenteException x) {
			System.out.println(x.getMessage());
		}
	}
}
