public class Main 
{
	public static void main(String[] args) 
	{
		
		String stringRet;
		String string1;
		String string2;
		int    numberT;
		StringUtil su = new StringUtil();
		
		System.out.println("--Start");
		string1 = "blablablabla";
		string2 = "blablabcde";
		numberT = 8;
		stringRet = su.ConcatERemove(string1, string2, numberT);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(numberT);
		System.out.println(stringRet);
		
		System.out.println("--Start");
		
		string1 = "aba";
		string2 = "aba";
		numberT = 7;
		stringRet = su.ConcatERemove(string1, string2, numberT);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(numberT);
		System.out.println(stringRet);
		
		System.out.println("--Start");
		
		string1 = "ashley";
		string2 = "ash";
		numberT = 2;
		stringRet = su.ConcatERemove(string1, string2, numberT);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(numberT);
		System.out.println(stringRet);
		
		System.out.println("--Start");
		string1 = "a";
		string2 = "bcd";
		numberT = 2;
		stringRet = su.ConcatERemove(string1, string2, numberT);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(numberT);
		System.out.println(stringRet);
		
		System.out.println("--Start");
		string1 = "abc";
		string2 = "def";
		numberT = 6;
		stringRet = su.ConcatERemove(string1, string2, numberT);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(numberT);
		System.out.println(stringRet);
		
		
		System.out.println("--Start");
		string1 = "aaaaaaaaa";
		string2 = "a";
		numberT = 6;
		stringRet = su.ConcatERemove(string1, string2, numberT);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(numberT);
		System.out.println(stringRet);
		
		
		System.out.println("--Start");
		string1 = "a";
		string2 = "aaaaaaa";
		numberT = 6;
		stringRet = su.ConcatERemove(string1, string2, numberT);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(numberT);
		System.out.println(stringRet);
	
	}
}
