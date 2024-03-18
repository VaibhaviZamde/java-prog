class ComplexNumber
{	
	int real , imag;

	ComplexNumber(int r , int i)
	{
		real = r;
		imag = i;
	}
	
	public static ComplexNumber addCom(ComplexNumber n1 , ComplexNumber n2)
	{
		ComplexNumber result = new ComplexNumber(0,0);
		
		result.real = n1.real+n2.real;
		result.imag = n1.imag+n2.imag;
		return result;
	}
	
	public void showCom()
	{
		System.out.println(this.real+"+i"+this.imag);
	}
	
	public static void main(String args[])
	{
		ComplexNumber cn1 = new ComplexNumber(2,3);
		ComplexNumber cn2 = new ComplexNumber(4,5);
		
		cn1.showCom();
		cn2.showCom();
		
		ComplexNumber res = addCom(cn1 , cn2);
		System.out.print("Addition is ");
		res.showCom();
	}
}
