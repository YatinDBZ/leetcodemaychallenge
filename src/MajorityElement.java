import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement{
	public int majorityElement(int[] nums){
        int result =0;
		int count =0,length=nums.length;
		if(length==1)
		{
			return nums[0];
		}
		Map<Integer,Integer> elementOccurenceMap = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<length;i++)
		{
			if(elementOccurenceMap.get(nums[i])==null)
			{
				elementOccurenceMap.put(nums[i], 1);
			}
			else{
				elementOccurenceMap.put(nums[i], elementOccurenceMap.get(nums[i])+1);
				 count = elementOccurenceMap.get(nums[i]);
				 if(count>(length/2))
				 {
					 result =nums[i];
					 break;
				 }
			}
		}
      
		return result;
    }
}