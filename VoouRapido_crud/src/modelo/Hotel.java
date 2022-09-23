package modelo;

import java.util.List;

public class Hotel {

	private int id_hotel;
	private String nome_hotel;
	private double preco_hotel;
	private String data_hotel;
	
	public int Id_hotel;
	
	public Hotel() {
		
		
	}

	public Hotel(int id_hotel, String nome_hotel, double preco_hotel, String data_hotel, int id_hotel2) {
		super();
		this.id_hotel = id_hotel;
		this.nome_hotel = nome_hotel;
		this.preco_hotel = preco_hotel;
		this.data_hotel = data_hotel;
		Id_hotel = id_hotel;
	}


	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public String getNome_hotel() {
		return nome_hotel;
	}

	public void setNome_hotel(String nome_hotel) {
		this.nome_hotel = nome_hotel;
	}

	public Double getPreco_hotel() { 
		return preco_hotel;
	}

	public void setPreco_hotel(double preco_hotel) {
		this.preco_hotel = preco_hotel;
	}

	public String getData_hotel() {
		return data_hotel;
	}

	public void setData_hotel(String data_hotel) {
		this.data_hotel = data_hotel;
	}

	public void add(List<Hotel> hoteis) {
		// TODO Auto-generated method stub
		
	}

}


