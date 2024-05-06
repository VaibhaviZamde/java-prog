class ValidReg
{
	public static void main(String args[])
	{
		String reg[] = {"2019bit045","2025bch63","2025bcs503","2023bme001","2023bce8","202bit555"};
		
		ValidReg vr = new ValidReg();
		int size = reg.length;
		//System.out.println(size);
		
		int count = vr.getValidCount(reg,size);
		System.out.println(count);
	}
	
	public int getValidCount(String regist[],int len)
	{	
		int validcount = 0;
		
		for(int i=0; i <len; i++)
		{
			if(isRegLen(regist[i]))
			{
				if(isEnrollYr(regist[i]))
				{
					if(isDept(regist[i]))
					{	
						if(isDigit(regist[i]))
						{
							validcount = validcount + 1;
						}
					}
				}
			}
		}
		return validcount;
	}
	
	public boolean isRegLen(String regi)
	{
		if(regi.length() == 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEnrollYr(String regi)
	{
		String regsub = regi.substring(0,4);
		int enroll = Integer.parseInt(regsub);
		
		if(enroll >= 2000 && enroll <= 2024)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isDept(String regi)
	{
		String dept = regi.substring(4,7);
		
		if(dept.equals("bit") || dept.equals("bch") || dept.equals("bme") || dept.equals("bcs"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isDigit(String regi)
	{
		String digit = regi.substring(7,10);
		int dig = Integer.parseInt(digit);
		
		if(dig >0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}



