package byteBank;

public class Customer implements AuthenticableFuncionary{
		private String name;
		private String document;
		private String phoneNumber;
		
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
			// TODO Auto-generated method stub
			
		}
		@Override
		public boolean login(String key) {
			// TODO Auto-generated method stub
			return false;
		}
		
		
}
