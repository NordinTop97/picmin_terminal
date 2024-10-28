package picmin_terminal;

import picmin_terminal.UserType;

public class User {
	//naam
	//rol
	private String username;
	private String password;
	private UserType role;
	
	public User(String username, String password, UserType role) {
		this.username = username;
		this.password = password;
		this.setRole(role);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getRole() {
		return role;
	}

	public void setRole(UserType role) {
		this.role = role;
	}
}
