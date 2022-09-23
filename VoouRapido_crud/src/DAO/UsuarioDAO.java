package DAO;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import Connection.ConnectionMySQL;
	import modelo.Usuario;

	public class UsuarioDAO {
		//CREATE
		public void save(Usuario usuario) { 
			
			String sql = "INSERT INTO usuarios " + "(nome_usuario, email_usuario, senha_usuario)" + " VALUES (?, ?, ?)";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, usuario.getNome_usuario());
				pstm.setString(2, usuario.getEmail_usuario());
				pstm.setString(3, usuario.getSenha_usuario());
				
				pstm.execute();
						
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
		
		//DELETE BY ID
		public void deleteById(int id) { 
			String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1, id);
				
				pstm.execute();
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
		
		//UPDATE
		public void update(Usuario usuario) { 
			String sql = "UPDATE usuarios " + "SET nome_usuario = ?, email_usuario = ?, senha_usuario = ? WHERE id_usuario = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, usuario.getNome_usuario());
				pstm.setString(2, usuario.getEmail_usuario());
				pstm.setString(3, usuario.getSenha_usuario());
				pstm.setInt(4, usuario.getId_Usuario());
				
				
				pstm.execute();
				
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
		
		//READ
		public List<Usuario> getUsuarios() { 
			String sql = "SELECT * FROM usuarios";
			
			List<Usuario> usuarios = new ArrayList<Usuario>();
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			ResultSet rset = null;
			
			try { 
				conn = ConnectionMySQL.createConnectionMySQL();
				
				pstm = conn.prepareStatement(sql);
				
				rset = pstm.executeQuery();
				
				while (rset.next()) { 
					Usuario usuario = new Usuario();
					
					usuario.setId_Usuario(rset.getInt("id_usuario"));
					usuario.setNome_usuario(rset.getString("nome_usuario"));
					usuario.setEmail_usuario(rset.getString("email_usuario"));
					usuario.setSenha_usuario(rset.getString("senha_usuario"));
					
					
					usuarios.add(usuario);
				}
			} catch (Exception e) { 
				e.printStackTrace();
			} finally { 
				try { 
					if (pstm != null) { 
						pstm.close();
					}
					if (conn != null) { 
						conn.close();
					}
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
			
			return usuarios;
		}
		
	}

