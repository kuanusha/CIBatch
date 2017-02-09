
public class Fact {

	static int res=0;
	public  int getFact(int num)
	{
		
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		if(num==0)
		{
			return 1;
		}
		if(num>0){
			
			return res=num*getFact(num-1);
		}
		return 1;
		
	}

}
