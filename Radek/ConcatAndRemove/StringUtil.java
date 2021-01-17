import java.util.StringJoiner;

public class StringUtil 
{
	private int Remove(String stringBase, String result) 
	{
		if (result.length() == 0)
		{
			return stringBase.length();
		}
		else
		{
			return stringBase.length() - result.length();
		}
		
	}
	public String ConcatERemove(String stringBase, String stringFinal, int tryNumber) 
	{
		int movement = 0;
		String result = "";
		boolean removed = false;

		if (stringBase.length() > 100 || stringFinal.length() > 100 || tryNumber > 100) 
		{
			return "Limit for String is 100 char and Number is 100";
		}
		if (!stringBase.matches("[a-z]*") || !stringFinal.matches("[a-z]*")) 
		{
			return "One of String contains characters not suported";
		}
        
		String[] arrayBase = stringBase.split("");

		String[] arrayFinal = stringFinal.split("");
		
		int maxLength = Math.max(arrayBase.length,arrayFinal.length);
		
		String[] arrayReturn = new String[maxLength];
		
		
		//limpa array 
		for (int i = 0; i < maxLength; i++) 
		{
			arrayReturn[i] ="";
		}
		
		// loop sobre o maximo array
		for (int i = 0; i < maxLength; i++) 
		{
			String charBase;
			try 
			{
				charBase = arrayBase[i];
			} 
			catch (Exception e) 
			{
				charBase = "";
			}
			
			String charFinal;
			try 
			{
				charFinal = arrayFinal[i];
			} 
			catch (Exception e) {
				charFinal = "";
			}

			if (charBase.equals(charFinal)) 
			{
				arrayReturn[i] = charFinal;
			} 
			else if(stringBase.length() == stringFinal.length()) 
			{
				if (!stringFinal.equals(result) && stringFinal.length() == stringBase.length())
				{
					if (result.length() <= stringBase.length() && !removed)
					{
						movement = movement + Remove(stringBase,result );
						removed = true;
					}
					arrayReturn[i] = charFinal;
					movement++;
				}
				else if (stringFinal.equals(result) && stringFinal.length() == stringBase.length())
				{
					if (result.length() <= stringBase.length() && !removed)
					{
						movement = movement + Remove(stringBase,result );
						removed = true;
					}
				}
			}
			else if(stringBase.length() != stringFinal.length()) 
			{
				if (charBase.isEmpty())
				{
					arrayReturn[i] = charFinal;
					movement++;
				}
				else if(charFinal.isEmpty() && !stringFinal.equals(result))
				{
					arrayReturn[i] = "";
					movement++;
				}
				else if (!stringFinal.equals(result) && stringFinal.length() != stringBase.length())
				{
					if (result.length() <= stringBase.length() && !removed)
					{
						movement = movement + Remove(stringBase,result );
						removed = true;
					}
					arrayReturn[i] = charFinal;
					movement++;
				}
				else if (stringFinal.equals(result) && stringFinal.length() != stringBase.length())
				{
					if (result.length() <= stringBase.length() && !removed)
					{
						movement = movement + Remove(stringBase,result );
						removed = true;
					}
				}
			}

			result = String.join("", arrayReturn) ;
		}
		
		if (movement >= tryNumber && !stringFinal.equals(result) )
		{
			return "NO";
		}
		else if (stringFinal.equals(result) && movement <= tryNumber)
		{
			return "YES in "+ movement +" Moviments";
		}
		else
		{
			return "NO";
		}

	}

}
