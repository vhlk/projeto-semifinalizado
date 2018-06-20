package curCIn;

import java.util.Scanner;

import Cantina.*;
import Curso.*;
import Disciplina.*;
import Exceptions.*;
import Material.*;
import Pessoa.*;

public class Programa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RepositorioCantinaLista rcl = new RepositorioCantinaLista();
		RepositorioCantinaArray rca = new RepositorioCantinaArray();
		
		System.out.println("Bem vindo ao registro do CurCIn!");
		System.out.println("Digite o número do tipo de registro que você deseja manipular:");
		System.out.println("1 - Cantina");
		System.out.println("2 - Curso");
		System.out.println("3 - Disciplina");
		System.out.println("4 - Material");
		System.out.println("5 - Pessoa");
		int codigoRegistro = Integer.parseInt(in.nextLine());
		
		if (codigoRegistro == 1) {
			System.out.println("Você escolheu cantina! O que você deseja fazer?");
			System.out.println("1 - Criar uma cantina e registrá-la no repositório");
			System.out.println("2 - Mudar algo ");
			int cRCantina = Integer.parseInt(in.nextLine());
			
			if (cRCantina == 1) {
				System.out.println("Você deseja registrar uma cantina!");
				System.out.println("Qual o nome do prato principal da cantina? ");
				String nomeP = in.nextLine();
				System.out.println("Qual o seu preço? ");
				double precoP = Double.parseDouble(in.nextLine());
				Prato prato = new Prato(nomeP, precoP);
				System.out.println("O gerente da cantina já está registrado? (S/N)");
				String resposta = in.nextLine();
				if (resposta.equals("S") || resposta.equals("s")) {
					System.out.println("Qual seu nome?");
					String nome = in.nextLine();
					// SABENDO O NOME REGISTRAR A PESSOA
				}
				else if(resposta.equals("N") || resposta.equals("n")) {
					System.out.println("Então devemos registrar uma pessoa no sistema.");
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
					System.out.println("Cantina criada!");
					System.out.println("Hora de registra-la em um repositorio? Que tipo deseja?");
					System.out.println("1 - Lista");
					System.out.println("2 - Array");
					int tipoRep = Integer.parseInt(in.nextLine());
					
					if (tipoRep == 1) {
						System.out.println("Você escolheu lista e a cantina" + cant.getNome() +  " foi registrada.");
						rcl.inserir(cant);
					}
					
					else if (tipoRep == 2) {
						System.out.println("Você escolheu array e a cantina" + cant.getNome() +  " foi registrada.");
						rca.inserir(cant);
					}
				}
				
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
