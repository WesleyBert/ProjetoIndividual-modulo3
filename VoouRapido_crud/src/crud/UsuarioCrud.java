package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.UsuarioDAO;
import modelo.Usuario;

public class UsuarioCrud {

	public static void main(String[]args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		int posicao = 0;
		
		int id = 0;
		String nome = "";
		String email = "";
		String senha = "";
		
		List<Usuario> usuario = new ArrayList<Usuario>();
		
		
		do {
			System.out.println("***Bem vindo ao cadastro de USUARIO***");
			System.out.println("1--Cadastre Usuario--:");
			System.out.println("2--Consulta Usuario--:");
			System.out.println("3--Delete Usuario--:");
			System.out.println("4--Atualizar Cadastro de usuario--");
			System.out.println("0--Sair--:");
			
			opcao = input.nextInt();
			
			switch(opcao){
			case 1:
				System.out.println("***Cadastrar Usuario***");
				System.out.println("Digite seu nome: ");
				nome = input.nextLine();
				nome = input.nextLine();

				System.out.println("Digite seu email: ");
				email = input.nextLine();
				
				System.out.println("Digite seu senha: ");
				senha = input.nextLine();
				
				
				Usuario usuario1 = new Usuario();
				
				usuario1.setNome_usuario(nome);
				usuario1.setEmail_usuario(email);
				usuario1.setSenha_usuario(senha);
				
				usuarioDAO.save(usuario1);
				
				System.out.println("\n**Informações do Cadastro Realizadas com sucesso!**\n");
				break;
			case 2:
				//read
				for(Usuario u: usuarioDAO.getUsuarios()) {
					System.out.println("Id:" + u.getId_Usuario() + " Nome:" + u.getNome_usuario());
				}
				System.out.println("\n**Consulta finalizada**\n");
			break;
			default:
				System.out.println(opcao != 0 ?  "\n Opção é invalida, tente novamente.\n": "");
			break;
			case 3:
				//delete
				System.out.println("Passe o ID do usuario para deletar o Usuario desejado: ");
				posicao = input.nextInt();
				usuarioDAO.deleteById(id);
				System.out.println("\n**Usuario deletado com sucesso!!**\n");
				break;
				
				
			case 4:
				System.out.println("**Digite o id do usuario**");
				id = input.nextInt();
				
				System.out.println("Digite o nome do novo Usuario");
				nome = input.nextLine();
				nome = input.nextLine();
				
				System.out.println("Digite o email do novo Usuario");
				email = input.nextLine();
				
				System.out.println("Digite o senha do novo Usuario");
				senha = input.nextLine();
				
				Usuario usuario2 = new Usuario();{
					usuarioDAO.update(usuario2);
					
					System.out.println("**Usuario Atualizado com sucesso!!**");
				}
		}		
		}while(opcao != 0);
		input.close();
		System.out.println("**Finalizado**");
	
	}
}
