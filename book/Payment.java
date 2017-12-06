package book;

public class Payment implements PaymentMode
{
	String payMode, Cash, Card;
	public void pay() 
	{
			if (payMode.equalsIgnoreCase(Cash))
			{
				System.out.println("Payment By CASH");
			}
			else if (payMode.equalsIgnoreCase(Card))
			{
				System.out.println("Payment By CARD");
			}
			else
			{
				System.out.println("Invalid Entry");
			} 
		}
	}
