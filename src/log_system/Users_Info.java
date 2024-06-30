package log_system;

import java.util.HashMap;

public class Users_Info {
	
	
	HashMap<String, String> logininfo = new HashMap<String,String>();
	
	
	Users_Info(){
	logininfo.put("ziomson", "kokos");
	logininfo.put("ketrue", "husqvarna");
	}
	
	protected HashMap getLoginInfo()
	{
		return logininfo;
	}
	

}
