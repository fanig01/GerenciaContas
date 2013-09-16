package jdbc;
import principal.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaCRUD {

	public void criar(Connection con, ContaCorrente conta) throws SQLException{
		String sql = "insert into conta values (?,?,?)";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1,conta.nroConta);
			stm.setString(2,conta.titular);
			stm.setDouble(3, conta.saldo);
			stm.setString(4,"CORRENTE");
		}
	}

}
