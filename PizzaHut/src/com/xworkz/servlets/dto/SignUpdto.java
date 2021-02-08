package com.xworkz.servlets.dto;


public class SignUpdto {
	private static final long serialVersionUID = 1L;
		
		private int id;
		private String name;
		private String email;
		private int passsword;
		private int phoneNumber;
		
		public SignUpdto() {
			
		}

		public SignUpdto(String name, String email, int passsword, int phoneNumber) {
			super();
			this.name = name;
			this.email = email;
			this.passsword = passsword;
			this.phoneNumber = phoneNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getPasssword() {
			return passsword;
		}
		public void setPasssword(int passsword) {
			this.passsword = passsword;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		@Override
		public String toString() {
			return "SignUpdto [id=" + id + ", name=" + name + ", email=" + email + ", passsword=" + passsword
					+ ", phoneNumber=" + phoneNumber + "]";
		}
				
		
	
	

}
