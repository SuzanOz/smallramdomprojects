package UserDBHashMap;

import java.util.HashMap;

public class UserDBRunner {

	public static void main(String[] args) {
		
		HashMap<String, String> user = new HashMap<>();
		System.out.println(user);
		AddUser.addUser(user);
		GetInfo.getInfo(user);
		RemoveUser.removeUser(user);
		
	}
}
