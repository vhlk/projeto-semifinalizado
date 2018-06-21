package curCIn;

import java.util.Scanner;
import Cantina.*;
import Curso.*;
import Disciplina.*;
import Exceptions.*;
import Material.*;
import Pessoa.*;

public class Programa {
	public static void main(String[] args) throws CantinaExistenteException, CantinaNaoExistenteException {
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
						Pessoa pessoa = new Funcionario(nome, data, cpf);
						System.out.println("Qual o nome da sua cantina?");
						String nomeC = in.nextLine();
						Cantina cant = new Cantina(nomeC, prato, pessoa);
						cc.inserirCantina(cant);
						System.out.println("A cantina " + cant.getNome() + " foi inserida no sistema.");
						System.out.println("");
					}

					else if (cRCantina == 2) {
						System.out.println("O que deseja fazer?");
						System.out.println("1 - Ver quais cantinas estâo no repositório");
						System.out.println("2 - Imprimir dados de alguma cantina especifica");
						System.out.println("3 - Manipular alguma cantina especifica");
						System.out.println("4 - Manipular o repositório");
						int tipoM = Integer.parseInt(in.nextLine());
						if (tipoM == 1) {
							System.out.println("As seguintes cantinas estao no sistema: ");
							// mostrar nome das cantinas que estao no sistema

						} else if (tipoM == 2) {
							System.out.println("Qual o nome da cantina que você deseja ver?");
							String nomeC = in.nextLine();
							System.out.println("Nome da cantina: " + cc.nomeCantina(nomeC).getNome());
							System.out.println("Prato principal: " + cc.nomeCantina(nomeC).getPrato().getNome());
							System.out.println(
									"Preco do prato principal: R$" + cc.nomeCantina(nomeC).getPrato().getPreco());
							System.out.println("Nome do gerente: " + cc.nomeCantina(nomeC).getGerente().getNome());
							System.out.println("");

						} else if (tipoM == 3) {
							System.out.println("Qual o nome da cantina que você deseja manipular?");
							String nomeC = in.nextLine();
							System.out.println("Deseja mudar seu nome? (S/N)");
							String respN = in.nextLine();
							if (respN.equals("S") || respN.equals("s")) {
								System.out.println("Qual sera o novo nome?");
								String nomeNovo = in.nextLine();
								cc.nomeCantina(nomeC).setNome(nomeNovo);
								nomeC = nomeNovo;
								System.out.println("Nome alterado!");
							}
							System.out.println("Deseja mudar o prato principal? (S/N)");
							String respP = in.nextLine();
							if (respP.equals("S") || respP.equals("s")) {
								System.out.println("Qual o nome do novo prato?");
								String respPN = in.nextLine();
								System.out.println("Qual será seu preco?");
								Double respPP = Double.parseDouble(in.nextLine());
								Prato prato = new Prato(respPN, respPP);
								cc.nomeCantina(nomeC).setPrato(prato);
							}
							System.out.println("Dados alterados com sucesso!");
						} else if (tipoM == 4) {
							System.out.println("O que deseja fazer no repositório? ");
							System.out.println("1 - Checar se uma cantina existe");
							System.out.println("2 - Remover uma cantina do repositório");
							System.out.println("3 - Soar alarme de início de expediente");
							System.out.println("4 - Soar alarme de fim de expediente");
							int manRep = Integer.parseInt(in.nextLine());
							if (manRep == 1) {
								System.out.println("Qual o nome da cantina que deseja checar?");
								String nomeC = in.nextLine();
								if (cc.procurarCantina(cc.nomeCantina(nomeC))) {
									System.out.println("A cantina " + nomeC + " esta no repositorio.");
								}
								else {
									System.out.println("A cantina " + nomeC + " nao esta no repositorio.");
								}
							}
							if (manRep == 2) {
								System.out.println("Qual o nome da cantina que deseja remover?");
								String nomeC = in.nextLine();
								cc.removerCantina(cc.nomeCantina(nomeC));
								System.out.println("Cantina removida com sucesso");
							}
							if (manRep == 3) {
								System.out.println("Digite o nome da cantina que quer soar o alarme de inicio.");
								String nomeC = in.nextLine();
								System.out.println(cc.alarmeInicioCantina(cc.nomeCantina(nomeC)));
							}
							if (manRep == 4) {
								System.out.println("Digite o nome da cantina que quer soar o alarme de fim.");
								String nomeC = in.nextLine();
								System.out.println(cc.alarmeFimCantina(cc.nomeCantina(nomeC)));
							}

						}

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

		} catch (CantinaExistenteException x) {
			System.out.println(x.getMessage());
		}
		 catch (CantinaNaoExistenteException y) {
			 System.out.println(y.getMessage());
		 }
	}
}
