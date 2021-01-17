public class FooBar {
	public String FooBarReturn(int number) 
	{
		if (number % 3 == 0) 
		{
            if (number % 5 == 0) 
            {
                return "FooBar";
            } 
            else 
            {
                return "Foo";
            }
        } 
		else if (number % 5 == 0) 
		{
            return "Bar";
        }
        return String.valueOf(number);
    }
}