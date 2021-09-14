package Maps;
import java.util.Map;
import java.util.HashMap;


public class Hashmaps {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<>();
		
		maps.put("b", 2);
		maps.put("c", 3);
		maps.put("d", 4);
		maps.put("a", 1);
		
		maps.put("e", 5);
		
	/*	System.out.println(maps);
		System.out.println(maps.keySet());
		System.out.println(maps.entrySet());
		System.out.println(maps.values());
		
	*/	
		//System.out.println(getHash("Key"));
		
		
	}
	/*
	 * 			This function shows how a simple HASH FUNCTION COULD BE IMPLEMENTED
	 */
		public static int getHash(String key) {

			int hash = 0;
			for(int i = 0; i < key.length(); i++)
			{
				hash += key.charAt(i);
			}
			return hash;
		}
}
