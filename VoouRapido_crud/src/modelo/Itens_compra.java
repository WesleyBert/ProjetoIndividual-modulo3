package modelo;

public class Itens_compra{
	private int id_item;
	private int quantidade;
	
	private Hotel hotel;
	private Passeios passeios;
	
	public Itens_compra() {
		
	}
	
	public Itens_compra(int id_item, int quantidade, Hotel hotel, Passeios passeios) {
		super();
		this.id_item = id_item;
		this.quantidade = quantidade;
		this.hotel = hotel;
		this.passeios = passeios;
	}

	public int getId_item() {
		return id_item;
	}

	public void setId_item(int id_item) {
		this.id_item = id_item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	
	public Passeios getPasseios() {
		return passeios;
	}

	public void setPasseios(Passeios passeios) {
		this.passeios = passeios;
	}
	
	
}
