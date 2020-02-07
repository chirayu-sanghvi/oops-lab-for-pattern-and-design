import java.util.*;

class sports{
 String name,country;
 int price;
sports()
{return;
}
 sports(String name,String country,int price)
	{
		this.name =name;
		this.country = country;
		this.price =price;

	}

int bill(int price,String country)
{	int tax;
	if(country.toLowerCase().equals("india"))
		price+=0.18*price;
	else if(country.toLowerCase().equals("us"))
		price+=0.1*price;
	else if(country.toLowerCase().equals("canada"))
		price+=0.15*price;
	
	return price;
}
public String toString(){
	return(name+" " + country+" " + price);
}
}


class oadp{

	public static void main(String args[])
	{
		ArrayList<sports> st = new ArrayList<sports>();

		System.out.println("Enter yopur name , country  respectively");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String country=sc.next();
		System.out.println("how many items you want to purchase");
		int n = sc.nextInt();
		int price =0;
		int i=0;
		while(i++<n)
		{
			System.out.println("Enter the price of item no."+i);
			int p = sc.nextInt();
			price+=p;
		}
		
		sports sp = new sports();
		st.add(new sports(name,country,price)); 
		int fbill = sp.bill(price,country);
		for(sports x : st)
		{
			System.out.println(x);
		}
		System.out.println("the final bill including tax is:"+fbill);
}
}
		
	
		
