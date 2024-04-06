interface EC
{
	void checkValidityOfVoter(int age);
}

interface Voter
{
	void castVote();
}

class ECIndia implements EC , Voter
{
	final int minAge;
	
	ECIndia(int minAge)
	{
		this.minAge = minAge;
	}
	
	public void castVote()
	{
		int arr[] = {1,2,3};
		
		try
		{
			System.out.println("In castVote :: ECIndia"+ arr[3]);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			for(StackTraceElement el : ex.getStackTrace())
			{
				System.out.println(el);
				System.out.println(el.getClassName()+"."+el.getMethodName()+" ( "+el.getFileName()+":"+el.getLineNumber()+" ) ");
			}
		}
	}
	
	public void checkValidityOfVoter(int age)
	{
		try
		{
			if(age < minAge) 
			{
				InvalidVoterException inVoter = new InvalidVoterException("Invalid Voter :: Required Age >= "+minAge);
				throw inVoter;
			}
			else if(age >= 150)
			{
				throw new Exception("Not a Human !!!");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}

class ECBrazil implements EC , Voter
{
	public void castVote()
	{
		System.out.println("In castVote : ECBrazil");
	}
	
	public void checkValidityOfVoter(int age)
	{
		
	}
}

class Election24
{
	public static void main(String args[])
	{
		ECIndia eci = new ECIndia(18);
		eci.checkValidityOfVoter(400);
		eci.castVote();
	}
}

class InvalidVoterException extends Exception
{
	InvalidVoterException(String msg)
	{
		super(msg);
	}
}

