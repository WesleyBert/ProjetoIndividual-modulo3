package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionMySQL;
import modelo.Hotel;

public class HotelDAO {
	//CREATE
	public void save(Hotel hoteis) {
		String sql = "INSERT INTO hotel (nome_hotel, preco_hotel,data_hotel) VALUES(?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
	
		try { 
			
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, hoteis.getNome_hotel());
			pstm.setDouble(2, hoteis.getPreco_hotel());
			pstm.setString(3, hoteis.getData_hotel());
			
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
	public List<Hotel> getHotel(){
		//CRIAR A QUERY
		String sql = "SELECT * FROM hotel";
		
		List<Hotel> hoteis = new ArrayList<Hotel>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
		
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Hotel hoteis1 = new Hotel();
				
				hoteis1.setId_hotel(rset.getInt("Id_hotel"));
				hoteis1.setNome_hotel(rset.getString("Nome_hotel"));
				hoteis1.setPreco_hotel(rset.getDouble("Preco_hotel"));
				hoteis1.setData_hotel(rset.getString("Data_hotel"));
				
				hoteis.add(hoteis1);
			}
			
	 }catch (Exception e) { 
		e.printStackTrace();
	} finally { 
		try { 
			if (rset != null) { 
				rset.close();
			}
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
		return hoteis;
		}
		
		//UPDATE
		public void update(Hotel hoteis) {
			String sql = "UPDATE hotel SET nome_hotel = ?, preco_hotel = ? ,data_hotel= ? WHERE id_hotel = ?";
		

			Connection conn = null;
			PreparedStatement pstm = null;
		try {
			
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, hoteis.getNome_hotel());
			pstm.setDouble(2,hoteis.getPreco_hotel());
			pstm.setString(3,hoteis.getData_hotel());
			pstm.setInt(4,hoteis.getId_hotel());
			
			pstm.execute();
			
			 
		}catch(Exception ex) {
			ex.printStackTrace();
		
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
		//DELETE
		public void deleteById(int id) {
			String sql = "DELETE FROM hotel WHERE id_hotel = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				
				conn = ConnectionMySQL.createConnectionMySQL();
				
				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1,id);
				
				pstm.execute();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		public Hotel[] getHotel1() {
			// TODO Auto-generated method stub
			return null;
		}
}
	
	
	

