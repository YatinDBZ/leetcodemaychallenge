public class NumberComplement{
	public int findComplement(int num) {
        int result =0;
		String binaryRep =getBinaryRep(Math.abs(num));
		binaryRep = negateNumber(binaryRep);
		result= getComplement(binaryRep);
		return result;
    }
    public String negateNumber(String no)
	{
		
		char[] abc = new char[no.length()];
		
		for(int i=no.length()-1;i>=0;i--)
		{
			if(no.charAt(i)=='0')
			{
				abc[i]='1';
			}
			else{
				abc[i]='0';
			}
			
		}
		
		
		return new String(abc);
	}
    	public String getBinaryRep(int num)
	{
		if(num<1)
		{
			return "";
		}
		
		String result =getBinaryRep(num/2)+String.valueOf(num%2);
		return result;
	}
	
	public int getComplement(String no)
	{
		double result =0;
		int pow=0;
		for(int i=no.length()-1;i>=0;i--)
		{
			result = result + Double.parseDouble(""+no.charAt(i))*Math.pow(2, pow);
			pow++;
		}
		return (int)result;
	}
}