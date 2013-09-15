package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		String sql = "select codigo,nome,saldo,tipo from conta";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try (Connection con = DriverManager.getConnection(url,"admin","admin");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery();) {
			while(rs.next()){
				String s = rs.getString("codigo")
						+ "; " + rs.getString("nome")
						+ "; " + rs.getString("saldo")
						+ "; " + rs.getString("tipo");
				System.out.println(s);
			}
		}
			
	
	//	rs.close();
	//	stm.close();
	//	con.close();

	}

}
