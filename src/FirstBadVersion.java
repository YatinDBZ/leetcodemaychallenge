public class FirstBadVersion{
    public int firstBadVersion(int n) {
        int start =1;
		int last =n;
        int result =0;
		
		if(isBadVersion(start))
		{
			return 1;
		}
		if(!isBadVersion(n))
		{
			return 0;
		}
		
	        long mid = 0;
			boolean isBad = false;
			while(start<=last)
			{
				mid =((long)start ) + last;
				mid=mid/2;
				int val= (int)mid;
				isBad= isBadVersion(val);
				if(isBad)
				{
					last =val-1;
					result =val;
				}
				else{
					start= val+1;
				}
				
			}
			return result;

    }
    
    
    
    public boolean isBadVersion(int version)
    {
    	//Uncomment this line
        //return super.isBadVersion(version);
    	return Boolean.TRUE;//comment this line
    }
}