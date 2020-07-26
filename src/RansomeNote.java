import java.util.HashMap;
import java.util.Map;

public class RansomeNote{
	public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = Boolean.TRUE;
		if(magazine==null || ransomNote ==null|| magazine==""|| ransomNote=="")
		{
			return Boolean.FALSE;
		}
		if(ransomNote.equals(magazine))
		{
			return result;
		}
		Map<Character,Integer> magazinMap = new HashMap<Character,Integer>();
		for(Character ch: magazine.toCharArray())
		{
			if(magazinMap.get(ch)!=null)
			{
				magazinMap.put(ch, magazinMap.get(ch)+1);
			}
			else{
				magazinMap.put(ch, 1);
			}
		}
		
		for(Character ch: ransomNote.toCharArray())
		{
			if(magazinMap.get(ch)==null)
			{
				return Boolean.FALSE;
			}
			else if(magazinMap.get(ch)<1){
				return Boolean.FALSE;
			}
			else{
				magazinMap.put(ch, magazinMap.get(ch)-1);
			}
		}
		
		
		return result;
    }
}