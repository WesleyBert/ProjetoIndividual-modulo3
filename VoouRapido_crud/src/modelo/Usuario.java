package modelo;

public class Usuario {

	public int Id_Usuario;
	private String nome_usuario;
	private String email_usuario;
	private String senha_usuario;
	
	public Usuario() {
		
	}
	
	public Usuario(int id_Usuario, String nome_usuario, String email_usuario, String senha_usuario) {
		super();
		Id_Usuario = id_Usuario;
		this.nome_usuario = nome_usuario;
		this.email_usuario = email_usuario;
		this.senha_usuario = senha_usuario;
	}

	public int getId_Usuario() {
		return Id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		Id_Usuario = id_Usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	
	public void setPermissoes(Permissoes permissao) {
		// TODO Auto-generated method stub
		
	}

	public String getPermissoes() {
		// TODO Auto-generated method stub
		return null;
	}
	
}



