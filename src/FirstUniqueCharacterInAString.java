import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString{
	public int firstUniqChar(String s) {
	       int result =-1;
			Map<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
			for(Character ch: s.toCharArray())
			{
				if(charMap.get(ch)==null)
				{
					charMap.put(ch, 1);
				}
				else{
					charMap.put(ch,charMap.get(ch)+1);
				}
			}
			for(Map.Entry<Character, Integer> ent: charMap.entrySet())
			{
				if(ent.getValue()==1){
				result=s.indexOf(ent.getKey());
				break;
				}
			}
			return result;
	    }
}