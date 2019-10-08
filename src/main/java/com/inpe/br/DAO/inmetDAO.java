package com.inpe.br.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpe.br.model.inmet;

public class inmetDAO {
	
	public static  inmet in = new inmet();
	
	public inmetDAO() {
	}
	

	
	public static List<inmet> listaTodos(){
		try {
			
			PreparedStatement ps = Conexao.conectando().prepareStatement("select * from inmet limit 10");
			ResultSet rs = ps.executeQuery();
			
			
			List<inmet> listaI = new ArrayList<inmet>();
			while(rs.next()) {
				Long idpcd = rs.getLong("idpcd");
				java.sql.Date datahora = rs.getDate("datahora");
				Long idsensor = rs.getLong("idsensor");
				Double valor = rs.getDouble("valor");
				String valido = rs.getString("valido");
				
				inmet met = new inmet(idpcd, datahora, idsensor, valor, valido);
				
				listaI.add(met);
			}
			rs.close();
			ps.close();
			
			return listaI;
		}catch(SQLException sql) {
			sql.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	

}
