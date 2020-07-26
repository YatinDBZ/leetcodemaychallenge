package week2;

public class ValidPerfectSquare{
	
	public boolean isPerfectSquare(int num) {

		if(num==0||num==2||num==3)
		{

			return Boolean.FALSE;
		}
		if(num==1)
		{
			return Boolean.TRUE;
		}
		int n= num/2;
		for(int i=1;i<=n;i++)
		{
			if(i*i==num)
			{
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
}