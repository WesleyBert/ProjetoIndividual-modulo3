package modelo;


public class Passeios {
	
	private int Id_passeios;
	private double valor_passeios;
	private int data_passeios;
	
	private Hotel hotel;

	
	public Passeios() {
		
	}

	public Passeios(int id_passeios, double valor_passeios, int data_passeios, Hotel hotel) {
		super();
		Id_passeios = id_passeios;
		this.valor_passeios = valor_passeios;
		this.data_passeios = data_passeios;
		this.hotel = hotel;
		
	}

	public int getId_passeios() {
		return Id_passeios;
	}

	public void setId_passeios(int id_passeios) {
		Id_passeios = id_passeios;
	}

	public double getValor_passeios() {
		return valor_passeios;
	}

	public void setValor_passeios(double valor_passeios) {
		this.valor_passeios = valor_passeios;
	}

	public int getData_passeios() {
		return data_passeios;
	}

	public void setData_passeios(int data_passeios) {
		this.data_passeios = data_passeios;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	
	
	

	
}



