
public class TestConnection {
	public static void main(String[] args) throws Exception {
		
		try (Connection connection = new Connection()){
			connection.readData();	
		}catch(IllegalStateException exception){
			System.out.println("Running catch");
			exception.printStackTrace();
		}
		
		
		
		/*Connection connection = null;
		try {
			connection=new Connection();
			connection.readData();
		} catch (IllegalStateException e) {
			System.out.println("Into of Catch");
			e.printStackTrace();
		} finally {
			System.out.println("Running finally");
			if(connection!=null) {
				connection.close();
			}
		}*/

	}
}
