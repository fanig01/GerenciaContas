package jdbc;
import principal.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {

	public void criar(Connection con, ContaCorrente conta) throws SQLException{
		String sql = "insert into conta values (?,?,?)";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1,conta.nroConta);
			stm.setString(2,conta.titular);
			stm.setDouble(3, conta.saldo);
			//stm.setString(4,"CORRENTE");
			stm.executeUpdate();
		}
	}
	
	public void sacar(Connection con, ContaCorrente conta,double quantia) throws SQLException{
		String sql = "update conta set saldo=? where codigo=?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setDouble(1, conta.saldo-quantia);
			stm.setInt(2,conta.nroConta);
			stm.executeUpdate();
		}
	}
	
	public void depositar(Connection con, ContaCorrente conta,double quantia) throws SQLException{
		String sql = "update conta set saldo=? where codigo=?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setDouble(1, conta.saldo+quantia);
			stm.setInt(2,conta.nroConta);
			stm.executeUpdate();
		}
	}
	
	public List<ContaCorrente> ler (Connection con) throws SQLException{
		List<ContaCorrente> lista = new ArrayList<>();
		String sql = "select codigo,nome,saldo from conta";
		try(PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				lista.add(new ContaCorrente(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
			}
		}
		return lista;
	}
	
	public double procurar (Connection con, int nro) throws SQLException{
		double quantia = 0.0;
		String sql = "select saldo from conta where codigo = ?";
		try(PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				if(rs.getInt(1)==nro){
					quantia = rs.getDouble(3);
				}
			}
		}
			
		return quantia;
	}
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try(Connection con = DriverManager.getConnection(url,"admin","admin")){
			ContaCRUD crud = new ContaCRUD();
			
			/*ContaCorrente conta1 = new ContaCorrente (10,"Nivian",1000.10);
			ContaCorrente conta2 = new ContaCorrente (11,"Italo",1800.10);
			ContaCorrente conta3 = new ContaCorrente (12,"Bia",17700.10);
			
			crud.criar(con,conta1);
			crud.criar(con,conta2);
			crud.criar(con,conta3);*/
			
			List<ContaCorrente>contacorrente = crud.ler(con);
			for(ContaCorrente conta : contacorrente ){
				System.out.println(conta);
			}
		}
	}
	
	

}
