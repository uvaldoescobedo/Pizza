
package VInicial;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConectorBD {

    Connection conectar=null;
    public Connection conexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/pizzas","admin","root");//usuario password
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, e.getMessage());
           // System.out.print(e.getMessage());
        }
        return conectar;
    }
}
