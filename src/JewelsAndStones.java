import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones{
	public int numJewelsInStones(String J, String S) {
        int result =0;
        Map<Character,Integer> stoneMap = new HashMap<Character,Integer>();
        for(Character ch: J.toCharArray())
        {
            if(stoneMap.get(ch)==null)
            {
                stoneMap.put(ch,1);
            }
        }
        
        for(Character ch: S.toCharArray())
        {
            if(stoneMap.get(ch)!=null)
            {
                result++;
            }
        }
        
        return result;
    }
}