package programs;

import java.util.Scanner;

public class Enu {
	enum currency
	{
		DOLLAR,RUPEES,EURO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currency d[]=currency.values();
		for(currency i:d)
		{
			System.out.println(i);
			
			
		}
		
		currency c=currency.DOLLAR;
		switch(c)
		{
		case DOLLAR:
			System.out.println("Currency::dollars");break;
		case RUPEES:
			System.out.println("Currency::rupees");break;
		case EURO:
			System.out.println("Currency::euro");break;
		}

	}

}
