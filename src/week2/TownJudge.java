package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TownJudge{
	public int findJudge(int N, int[][] trust) {
		if(trust.length==0)
		{
			return N;
		}
		Set<Integer> noSet = new HashSet<Integer>();
		Map<Integer,List<Integer>> trustMap = new HashMap<Integer,List<Integer>>();
		for(int i=0;i<trust.length;i++)
		{
			noSet.add(trust[i][0]);
			noSet.add(trust[i][1]);
			if(trustMap.get(trust[i][0])==null)
			{
				List<Integer> arrList = new ArrayList<Integer>();
				arrList.add(trust[i][1]);
				trustMap.put(trust[i][0], arrList);
			}
			else{
				List<Integer> abc = trustMap.get(trust[i][0]);
				abc.add(trust[i][1]);
			}
		}
		Set<Integer> setWithNoTrust = new HashSet<Integer>();		
		for(Integer a: noSet)
		{
			if(trustMap.get(a)==null)
			{
				setWithNoTrust.add(a);
			}
		}
		List<Integer> ara= new ArrayList<Integer>();
		for(Integer b: setWithNoTrust)
		{
			if(ara.size()>1){
				return -1;
			}
			boolean digitOk= true;
			for(Map.Entry<Integer, List<Integer>> en: trustMap.entrySet())
			{
				List<Integer> ar = en.getValue();
				if(!ar.contains(b))
				{
					digitOk=false;
					break;
				}

			}
			if(digitOk)
			{
				ara.add(b);
			}

		}
		if(ara.size()==1)
		{
			return ara.get(0);
		}
		return -1;
	}
}