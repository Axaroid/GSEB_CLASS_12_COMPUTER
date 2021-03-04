public class Akshar 
{
	public static void main (String[] args)
	{
		//Declaration 
		double balance, duration, rate, totalcost;
		balance = 140; // in inr
		rate = 2; //in inr/seconds
		duration = 40; //in seconds aka time talked 
		totalcost = rate * duration;
		balance = balance - totalcost; //updating value after a call
		
		//Print Work
		System.out.println("current balance is " +balance);
	}
}
	