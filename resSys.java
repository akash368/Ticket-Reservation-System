import java.util.*;
interface trainTicket
{
	public void bookOne();
	
}
interface flightTicket
{
	public void bookTwo();
	
}
interface busTicket
{
	public void bookThree();
	
}
class pay implements trainTicket,flightTicket,busTicket
{
	public void display()
	{
		
		System.out.print("Passenger Name:");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.print("Passenger Age:");
		int age=sc.nextInt();
			
		System.out.print("Phone Number:");
		long phone=sc.nextLong();
			
		System.out.println("Your ticket is booked and your total price is: Rs."+newticketprice);
		System.out.println("Happy Journey!");
		System.out.println("========================");
		System.out.println("========================");
	}
	public double ticketprice=0.0d;
	public double newticketprice=0.0d;
	Scanner sc = new Scanner(System.in);
	@Override
	public void bookOne()
	{
		System.out.println("\nTrain Reservation System");
		System.out.print("From:");
		String from = sc.nextLine();
		from = from.toUpperCase();
		System.out.print("To:");
		String to = sc.nextLine();
		to = to.toUpperCase();
		//System.out.print("d:"+from+"g:"+to);
		String destinations[][] = { //FROM       TO        TRAIN NAME    DEPARTURE  ARRIVAL  DISTANCE
									{"LUCKNOW","KANPUR","LKOKAN EXPRESS","10:30",   "12:45",  "180"},
									{"LUCKNOW","KANPUR","INTERCITY EXPRESS","17:05",   "18:54",  "180"},
									{"LUCKNOW","AGRA","LKOAGR PASSENGER","00:30",   "6:00",  "300"},
									{"LUCKNOW","MATHURA","RAJDHANI EXP. SPECIAL","20:35",   "05:20",  "480"},
									
									{"KANPUR","LUCKNOW","LKOKAN EXPRESS","12:45",   "14:00",  "180"},
									{"KANPUR","LUCKNOW","INTERCITY EXPRESS","17:05",   "18:54",  "180"},
									{"AGRA","LUCKNOW","LKOAGR PASSENGER","00:30",   "6:00",  "300"},
									{"MATHURA","LUCKNOW","RAJDHANI EXP. SPECIAL","20:35",   "05:20",  "480"},
									
									{"KANPUR","MATHURA","KANMAT PASENGER","10:20","4:00","300"},
									{"MATHURA","KANPUR","KANMAT PASENGER","12:00","6:00","300"},
									
									{"DELHI","CHANDIGARH","DELCHAN EXPRESS","08:00","20:00","800"},
									{"CHANDIGARH","DELHI","DELCHAN EXPRESS","12:00","00:30","800"},
								  };
		
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<1;j++)
			{
				if(from.equals(destinations[i][0]) && to.equals(destinations[i][1]))
				{
					System.out.println("***************************");
					System.out.println("From:"+destinations[i][0]);
					System.out.println("To:"+destinations[i][1]);
					System.out.println("Train Name:"+destinations[i][2]);
					System.out.println("Departure:"+destinations[i][3]);
					System.out.println("Arrival:"+destinations[i][4]);
					System.out.println("Distance:"+destinations[i][5]+"KM");
					ticketprice = Integer.parseInt(destinations[i][5]);
					//System.out.print(" ");
				}
				
				//System.out.print("");
			}
			
		}
		int i=0;
		int ran=0,ranTwo=0;
		while(i<1)
		{
			System.out.println("********Book Ticket********");
			System.out.println("1) 2 Seater - Rs."+ticketprice*1.2);
			System.out.println("2) Sleeper - Rs."+ticketprice*2.0);
			System.out.println("3) 3rd A.C - Rs."+ticketprice*2.5);
			System.out.println("4) 2nd A.C - Rs."+ticketprice*3.0);
			System.out.println("5) 1nd A.C - Rs."+ticketprice*3.5);
			System.out.println("6)Exit");
			System.out.print("Enter your choice:");
			int ch = sc.nextInt();
			int min = 1;
			int max = 11;
			ran = (int)(Math.random()*(max-min+1)+min);
			
			int minTwo = 1;
			int maxTwo = 61;
			ranTwo = (int)(Math.random()*(maxTwo-minTwo+1)+minTwo);
			switch(ch)
			{
				case 1:
					System.out.println("Your Coach number is: D"+ran+" and your seat number is:"+ranTwo);
					newticketprice = newticketprice+ticketprice *1.2;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 2:
					System.out.println("Your Coach number is: S"+ran+" and your seat number is: L"+ranTwo);
					newticketprice = newticketprice+ticketprice *2.0;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 3:
					System.out.println("Your Coach number is: B"+ran+" and your seat number is:"+ranTwo);
					newticketprice = newticketprice+ticketprice *2.5;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 4:
					System.out.println("Your Coach number is: B"+ran+" and your seat number is:"+ranTwo);
					newticketprice = newticketprice+ticketprice *3.0;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 5:
					System.out.println("Your Coach number is: B"+ran+" and your seat number is:"+ranTwo);
					newticketprice = newticketprice+ticketprice *3.5;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 6:
					i++;
					break;
				default:
					System.out.println("Please enter correct choice");
			}
			
		}
		
		
		
		
	}
	@Override
	public void bookTwo()
	{
		//System.out.println("book flight");
		System.out.println("\nFlight Reservation System");
		System.out.print("From:");
		String from = sc.nextLine();
		from = from.toUpperCase();
		System.out.print("To:");
		String to = sc.nextLine();
		to = to.toUpperCase();
		//System.out.print("d:"+from+"g:"+to);
		String destinations[][] = { //FROM       TO        TRAIN NAME    DEPARTURE  ARRIVAL  DISTANCE
									{"LUCKNOW","KANPUR","IndiGo Airline","10:30",   "12:45",  "180"},
									{"LUCKNOW","KANPUR","SpiceJet Airline","17:05",   "18:54",  "180"},
									{"LUCKNOW","AGRA","AirAsia","00:30",   "6:00",  "300"},
									{"LUCKNOW","MATHURA","SpiceJet","20:35",   "05:20",  "480"},
									
									{"KANPUR","LUCKNOW","IndiGo Airline","12:45",   "14:00",  "180"},
									{"KANPUR","LUCKNOW","SpiceJet Airline","17:05",   "18:54",  "180"},
									{"AGRA","LUCKNOW","AirAsia","00:30",   "6:00",  "300"},
									{"MATHURA","LUCKNOW","SpiceJet Airline","20:35",   "05:20",  "480"},
									
									{"KANPUR","MATHURA","Vistatra Airline","10:20","4:00","300"},
									{"MATHURA","KANPUR","Vistara Airline","12:00","6:00","300"},
									
									{"DELHI","CHANDIGARH","Jet Airways","08:00","20:00","800"},
									{"CHANDIGARH","DELHI","Jet Airways","12:00","00:30","800"},
								  };
		
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<1;j++)
			{
				if(from.equals(destinations[i][0]) && to.equals(destinations[i][1]))
				{
					System.out.println("***************************");
					System.out.println("From:"+destinations[i][0]);
					System.out.println("To:"+destinations[i][1]);
					System.out.println("Flight Name:"+destinations[i][2]);
					System.out.println("Departure:"+destinations[i][3]);
					System.out.println("Arrival:"+destinations[i][4]);
					System.out.println("Distance:"+destinations[i][5]+"KM");
					ticketprice = Integer.parseInt(destinations[i][5]);
					//System.out.print(" ");
				}
				
				//System.out.print("");
			}
			
		}
		int i=0;
		int ran=0,ranTwo=0;
		while(i<1)
		{
			System.out.println("********Book Ticket********");
			System.out.println("1) Economy Class - Rs."+ticketprice*5.2);
			System.out.println("2) Business Class - Rs."+ticketprice*7.0);
			System.out.println("3) First Class - Rs."+ticketprice*10);
			System.out.println("4)Exit");
			System.out.print("Enter your choice:");
			int ch = sc.nextInt();
			int minTwo = 1;
			int maxTwo = 61;
			ranTwo = (int)(Math.random()*(maxTwo-minTwo+1)+minTwo);
			switch(ch)
			{
				case 1:
					System.out.println("Your seat number is:"+ranTwo+"B");
					newticketprice = newticketprice+ticketprice *5.2;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 2:
					System.out.println("Your seat number is:"+ranTwo+"D");
					newticketprice = newticketprice+ticketprice *7.0;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 3:
					System.out.println("Your seat number is:"+ranTwo+"F");
					newticketprice = newticketprice+ticketprice *10;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 4:
					i++;
					break;
				default:
					System.out.println("Please enter correct choice");
			}
			
		}
	}
	@Override
	public void bookThree()
	{
		//System.out.println("book bus");
		System.out.println("\nBus Reservation System");
		System.out.print("From:");
		String from = sc.nextLine();
		from = from.toUpperCase();
		System.out.print("To:");
		String to = sc.nextLine();
		to = to.toUpperCase();
		//System.out.print("d:"+from+"g:"+to);
		String destinations[][] = { //FROM       TO        TRAIN NAME    DEPARTURE  ARRIVAL  DISTANCE
									{"LUCKNOW","KANPUR","InterCity Bus","10:30",   "12:45",  "180"},
									{"LUCKNOW","KANPUR","ZingBus","17:05",   "18:54",  "180"},
									{"LUCKNOW","AGRA","InterCity","00:30",   "6:00",  "300"},
									{"LUCKNOW","MATHURA","Gola Bus Service","20:35",   "05:20",  "480"},
									
									{"KANPUR","LUCKNOW","InterCity Smartbus","12:45",   "14:00",  "180"},
									{"KANPUR","LUCKNOW","R.S Bus Services","17:05",   "18:54",  "180"},
									{"AGRA","LUCKNOW","ZingBus","00:30",   "6:00",  "300"},
									{"MATHURA","LUCKNOW","Foju Travels","20:35",   "05:20",  "480"},
									
									{"KANPUR","MATHURA","InterCity SmartBus","10:20","4:00","300"},
									{"MATHURA","KANPUR","InterCity SmartBus","12:00","6:00","300"},
									
									{"DELHI","CHANDIGARH","InterCity SmartBus","08:00","20:00","800"},
									{"CHANDIGARH","DELHI","InterCity SmartBus","12:00","00:30","800"},
								  };
		
	
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<1;j++)
			{
				if(from.equals(destinations[i][0]) && to.equals(destinations[i][1]))
				{
					System.out.println("***************************");
					System.out.println("From:"+destinations[i][0]);
					System.out.println("To:"+destinations[i][1]);
					System.out.println("Bus Name:"+destinations[i][2]);
					System.out.println("Departure:"+destinations[i][3]);
					System.out.println("Arrival:"+destinations[i][4]);
					System.out.println("Distance:"+destinations[i][5]+"KM");
					ticketprice = Integer.parseInt(destinations[i][5]);
					//System.out.print(" ");
				}
				
				//System.out.print("");
			}
			
		}
		int i=0;
		int ran=0,ranTwo=0;
		while(i<1)
		{
			System.out.println("********Book Ticket********");
			System.out.println("1) Non A.C - Rs."+ticketprice*1.5);
			System.out.println("2) A.C - Rs."+ticketprice*2);
			System.out.println("3)Exit");
			System.out.print("Enter your choice:");
			int ch = sc.nextInt();
			int minTwo = 1;
			int maxTwo = 61;
			ranTwo = (int)(Math.random()*(maxTwo-minTwo+1)+minTwo);
			switch(ch)
			{
				case 1:
					System.out.println("Your seat number is:"+ranTwo);
					newticketprice = newticketprice+ticketprice *1.5;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				case 2:
					System.out.println("Your seat number is:"+ranTwo+"D");
					newticketprice = newticketprice+ticketprice *2;
					System.out.println("Please enter passenger details to confirm booking");
					display();
					break;
				
				case 3:
					i++;
					break;
				default:
					System.out.println("Please enter correct choice");
			}
			
		}
	}
}
class mainReserve extends pay 
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("             Welcome to Ticket Reservation System             \n");
		System.out.println("1) Train");
		System.out.println("2) Flight");
		System.out.println("3) Bus");
		System.out.println("==================");
		System.out.println("==================");
		System.out.print("Enter your choice:");
		int ch = sc.nextInt();
		mainReserve obj = new mainReserve();
		switch(ch)
		{
			case 1:
			obj.bookOne();
			break;
			
			case 2:
			obj.bookTwo();
			break;
			
			case 3:
			obj.bookThree();
			break;
			
			default:
			System.out.print("Enter correct response");
		}
	}
}