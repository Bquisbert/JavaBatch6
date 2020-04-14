package com.syntax.class26;

public class Task {

	private String email, userName, password;

	public void setEmail(String email) {
		if (email.contains("yahoo.com")) {
			this.email = email;
			System.out.println("Email set up!");
		} else {
			System.out.println("Email must be yahoo.com");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
			System.out.println("Username set up!");
		} else {
			System.out.println("UserName must not be empty or less than 6 characters!");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
					System.out.println("Password set up");
				} else {
					System.out.println("Password can not contain username");
				}

			} else {
				System.out.println("Password too short");
			}

		} else {
			System.out.println("Password must not be empty");
		}
	}

	public String getPassword() {
		return password;

	}

	public static void main(String[] args) {

		Task mm = new Task();
		mm.setEmail("Brianquisbert@yahoo.com");
		System.out.println(mm.getEmail());

		mm.setUserName("Bquisbert");
System.out.println(mm.getUserName());
		mm.setPassword("Example");
System.out.println(mm.getPassword());
	}

}