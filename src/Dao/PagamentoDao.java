package Dao;

import java.util.logging.Level;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Connection.ConnectionFactory;

public class PagamentoDao {

	   

	
	
	public void create(){
		Connection con = ConnectionFactory.getConnection();
	    PreparedStatement stmt = null;
	    try{
	    stmt = con.prepareStatement("INSERT INTO Pagamento"(,,,)VALUES(,,,)");
	    stmt.setString(1.get);		
	    stmt.setString(2.get);		
	    stmt.setString(3.get);
	    
	    stmt.executeUpdate()
	       
	    JOptionPane.showMessageDialog(null, "Salvo Com Sucesso");
	    
	    }catch(SQLException ex) {
	    	JOptionPane.showMessageDialog(null, "Erro Ao Salvar"+ ex);
	    	
	    }finally{
	    	ConnectionFactory.closeConnection(con.stmt);
	    }
	}
	
}