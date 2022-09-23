package crud;

import java.util.ArrayList; 
import java.util.Scanner;

import DAO.HotelDAO;
import modelo.Hotel;

public class HotelCrud {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		HotelDAO hoteisDAO = new HotelDAO();
		
		Scanner input = new Scanner(System.in);
	
		 String nome = "";
		double preco = 0; 
		String data = "";
		 int Id_hotel = 0;
	
		 int opcao = 0;
		 int posicao = 0;
		
		 ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
		 
		 do{
			 System.out.println("**Cadastro de Hotel**");
			 System.out.println("**1- Dados de Cadastro**");
			 System.out.println("**2- Consulta de Cadastro**");
			 System.out.println("**3- Delete de Cadastro**");
			 System.out.println("**4- Atualizar Cadastro**");
			 System.out.println("**0- Sair**");
			 
			 opcao = input.nextInt();
				
				switch(opcao){
				case 1:
					System.out.println("***Cadastrar Hotel***");
					System.out.println("Digite seu nome: ");
					nome = input.nextLine();
					nome = input.nextLine();
					System.out.println("Digite o valor do Hotel desejado: ");
					preco = input.nextDouble();
					System.out.println("Digite a Data da reserva: ");
					data = input.nextLine();
					data = input.nextLine();
					
					
					Hotel hoteis1 = new Hotel();
					
					hoteis1.setNome_hotel(nome);
					hoteis1.setPreco_hotel(preco);
					hoteis1.setData_hotel(data);
					
					hoteisDAO.save(hoteis1);
					
					System.out.println("\n**Informações do Cadastro Realizadas com sucesso!**");
					break;
				case 2:
					//read
					for(Hotel h: hoteisDAO.getHotel() ) {
						System.out.println("Id:" + h.getId_hotel()  +"Nome: "+  h.getNome_hotel() +" Preco:"+ h.getPreco_hotel() +" Data:"+ h.getData_hotel());
					}
					System.out.println("**Consulta finalizada**");
				break;
				default:
					System.out.println(opcao != 0 ?  "\n Opção é invalida, tente novamente.\n": "");
				break;
				case 3:
					//delete
					System.out.println("Passe o ID do usuario para deletar o Usuario desejado: ");
					posicao = input.nextInt();
					hoteisDAO.deleteById(Id_hotel);
					System.out.println("**Usuario deletado com sucesso!!**");
					break;
					
					//UPDATE
				case 4:
					System.out.println("**Digite o id do usuario**");
					Id_hotel = input.nextInt();
					
					System.out.println("Digite o nome do novo Hotel");
					nome = input.nextLine();
					nome = input.nextLine();
					
					System.out.println("Digite o preco da nova reserva ");
					preco = input.nextDouble();
					
					System.out.println("Digite a data da nova reserva");
					 data = input.nextLine();
					 data = input.nextLine();
					
					Hotel hoteis2 = new Hotel();{
						hoteisDAO.update(hoteis2);
						
						System.out.println("\n**Reserva Atualizada com sucesso!!**\n");
					}
			}
			}while(opcao != 0);
			input.close();
			System.out.println("**Finalizado**");
		
		}
	

	}
