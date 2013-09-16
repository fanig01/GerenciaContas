package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDados {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into conta values (?,?,?,?)";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String [] nomes = {"Sandra","Beatriz","Isabela"};
	try (	Connection con = DriverManager.getConnection(url,"admin","admin")){
		
	
	try(	PreparedStatement stm = con.prepareStatement(sql)){
		for (int i = 0;i<nomes.length;i++){
			stm.setInt(1,i+4);
			stm.setString(2,nomes[i]);
			stm.setDouble(3,50000);
			stm.setString(4, "POUPANCA");
			stm.addBatch();
		}
		stm.executeBatch();
	} catch (SQLException e){
		
	}
	sql = "select nome, saldo from conta";
	try(PreparedStatement stm2 = con.prepareStatement(sql);
	ResultSet rs = stm2.executeQuery()){
		while(rs.next()){
			System.out.println(rs.getString(1)+ " : "+rs.getString(2));
		}
	}
	}
	}

}
