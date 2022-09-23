package modelo;

	import java.util.ArrayList;
	import java.util.List;

	public class Compras {

		private int id_compra;
		private String data_compra;
		private double valor_compra;
		private Usuario usuario;
		
		private List<Itens_compra> itens = new ArrayList<Itens_compra>();

		public Compras() {
			
		}
		public Compras(int id_compra, String data_compra, double valor_compra, Usuario usuario,
				List<Itens_compra> itens) {
			super();
			this.id_compra = id_compra;
			this.data_compra = data_compra;
			this.valor_compra = valor_compra;
			this.usuario = usuario;
			this.itens = itens;
		}
		public int getId_compra() {
			return id_compra;
		}
		public void setId_compra(int id_compra) {
			this.id_compra = id_compra;
		}
		public String getData_compra() {
			return data_compra;
		}
		public void setData_compra(String data_compra) {
			this.data_compra = data_compra;
		}
		public double getValor_compra() {
			return valor_compra;
		}
		public void setValor_compra(double valor_compra) {
			this.valor_compra = valor_compra;
		}
		public Usuario getUsuario() {
			return usuario;
		}
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		public List<Itens_compra> getItens() {
			return itens;
		}
		public void setItens(List<Itens_compra> itens) {
			this.itens = itens;
		}

		

	}

