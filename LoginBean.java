
import java.sql.*;

public class LoginBean {
	String name;
	String pass;
	boolean bb;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;	
		}
	public boolean validate(String n,String p)throws SQLException
	{
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBmanager.getConnection();
			ps=cn.prepareStatement("select * from admin1 where name=(?) and password=(?)");
			ps.setString(1,n);
			ps.setString(2,p);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				bb=true;
			}else {
				bb=false;
			}
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			ps.close();
			cn.close();
		}
		return bb;
	}
}