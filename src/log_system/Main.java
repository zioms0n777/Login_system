package log_system;

public class Main {

	public static void main(String[] args) {

		Users_Info users_info = new Users_Info();
		
		Login_Page login_page = new Login_Page(users_info.getLoginInfo());
		
		
	}

}
