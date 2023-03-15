
public class Connection implements AutoCloseable{
	public Connection() {
		System.out.println("Opening connection");
	};
	public void readData() {
		System.out.println("Receiving data");
		throw new IllegalStateException();
	};
	public void close1() {
		System.out.println("Closing connection");
	}
	
	@Override
	public void close() throws Exception {
		close1();
		// TODO Auto-generated method stub
		
	};
	 
}
