package byteBank;

public class Customer implements AuthenticableFuncionary{
		private String name;
		private String document;
		private String phoneNumber;
		
		private UsefulClass useful;
		
		public Customer() {
			this.useful=new UsefulClass();
		};
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDocument() {
			return document;
		}
		public void setDocument(String document) {
			this.document = document;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		@Override
		public void setKey(String key) {
			this.setKey(key);;
			
		}
		@Override
		public boolean login(String key) {
			return this.useful.login(key);
		}
		
		
}
