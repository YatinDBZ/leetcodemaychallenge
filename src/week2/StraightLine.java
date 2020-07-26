package week2;

public class StraightLine{
	public boolean checkStraightLine(int[][] coordinates) {
	       if(coordinates.length==2)
			{
				return Boolean.TRUE;
			}
			int xstart = coordinates[0][0],ystart= coordinates[0][1];
			int xprogress = coordinates[1][0],yprogress= coordinates[1][1];
			
			if(coordinates.length>2)
			{
				for(int i=2;i<coordinates.length;i++)
				{
					int x3= coordinates[i][0];
					int y3= coordinates[i][1];
					
					if(!((y3-yprogress)*(xprogress-xstart)==(yprogress-ystart)*(x3-xprogress)))
					{
						return Boolean.FALSE;
					}
					xstart = xprogress;
					ystart = yprogress;
					xprogress=  x3;
					yprogress=y3;
				}
			}

			return Boolean.TRUE;
	    }
}