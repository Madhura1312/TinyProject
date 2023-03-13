//Name:Madhura Mahadev Jadhav

import java.util.Scanner;
import java.io.*;

class BookMyshow 
{
String name;
String move_name;
String thetre_name;
private static int counter=100;
int ticket;
int cost;
void movies()
{
  if(ticket<=counter)
	{
	  System.out.println("the movies available are");
      System.out.println(" 1.Bhul Bhullaiyan 2(Hindi/Comedy)---- Rs.150 \n 2.Heropanti 2(Hindi/Action) ----- Rs.150 \n 3.Pawankhind(Marathi)---- Rs.100 \n 4.RRR(Hindi/Action) ----- Rs.170 ");
      System.out.println("\n");
     
    }

   }
}
class thea extends BookMyshow
{
private int no_f_tickets;
void th() 
{
  System.out.println("*******The theaters available are******* \n 1.Mukta Theater \n 2.New Pride theater");
  int k;
  int an;
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  if (n == 1)
{
 System.out.println("*******MUKTA THEATER*******");
 System.out.println("*******SELECT MOVIE*******");
 System.out.println("movie available are \n 1.BHUL BHULLAIYAN(HINDI/ACTION) \n 2.HEROPANTI(HINDI/ACTION) ");
 Scanner a = new Scanner(System.in);
 int o = a.nextInt();
if (o == 1)
{
  System.out.println("Bhul Bhullaiyan @ Mukta theater");
  System.out.println("Enter the number of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left= no_f_tickets-r;
  int amount=150*r;
  System.out.println("to continue to book for this movie prees 1 or to cancel the ticket  press 2");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n");
if (h == 1) 
{
  System.out.println("******************************************************");
  System.out.println("Theater ------------------- MUKTA THEATER");
  System.out.println("movie --------------------- Bhul Bhullaiyan");
  System.out.println("cost ---------------------- Rs."+amount);
  System.out.println("******************************************************");
}
if(h==2) 
{
 System.out.println("Your Ticket Is Cancelled");
 }
}
if (o == 2) 
{
 System.out.println("Heropanti @Mukta theater");
 System.out.println("Enter the number of tickets to be booked");
 Scanner j = new Scanner(System.in);
 int r = j.nextInt();
 int left= no_f_tickets-r;
 int amount=150*r;
 System.out.println("To continue to book for this movie prees 1 or to cancel the ticket  press 2");
 Scanner d = new Scanner(System.in);
 int h = d.nextInt();
 System.out.println("\n\n\n");
 if (h == 1) 
{
 System.out.println("******************************************************");
 System.out.println("Theater ------------------- Mukta theater");
 System.out.println("movie --------------------- HEROPANTI");
 System.out.println("cost ---------------------- Rs"+amount);
 System.out.println("******************************************************");
}
if(h==2)
{
  System.out.println("Your Ticket Is Cancelled");
    }
   }
}
if (n == 2) 
{
 System.out.println("*******NEW PRIDE*******");
 System.out.println("*******select a movie*******");
 System.out.println("Movie available are \n1.PAWANKHIND(MARATHI) \n2.HEROPANTI(HINDI/ACTION)\n3.RRR(HINDI/ACTIION)");
 Scanner a = new Scanner(System.in);
 int o = a.nextInt();
if (o == 1)
{
 System.out.println("Pawankhind @ New Pride theater");
 System.out.println("Enter the number of tickets to be booked");
 Scanner j = new Scanner(System.in);
 int r = j.nextInt();
 int left= no_f_tickets-r;
 int amount=100*r;
 System.out.println("To continue to book for this movie prees 1 or to cancel the ticket  press 2");
 Scanner d = new Scanner(System.in);
 int h = d.nextInt();
 System.out.println("\n\n\n");
if (h == 1) 
{
 System.out.println("******************************************************");
 System.out.println("Theater ------------------- New Pride Theater");
 System.out.println("Movie --------------------- Pawankhind");
 System.out.println("Cost ---------------------- Rs."+amount);
 System.out.println("******************************************************");
}
if(h==2) 
{
 System.out.println("Your Ticket Is Cancelled");
}
}
if (o == 2) 
{
 System.out.println("Heropanti 2 @New Pride theater");
 System.out.println("enter the number of tickets to be booked");
 Scanner j = new Scanner(System.in);
 int r = j.nextInt();
 int left= no_f_tickets-r;
 int amount=150*r;
 System.out.println("to continue to book for this movie prees 1 or to cancel the ticket  press 2");
 Scanner d = new Scanner(System.in);
 int h = d.nextInt();
 System.out.println("\n\n\n");
 if (h == 1)
{
 System.out.println("******************************************************");
 System.out.println("Theater ------------------- New Pride Theater");
 System.out.println("Movie --------------------- Heropanti 2");
 System.out.println("Cost ---------------------- Rs."+amount);
 System.out.println("\n Succesfully Booked");
}
if(h==2) 
{
 System.out.println("Your Ticket Is Cancelled");
  }
}
if(o==3)
{ 
  System.out.println("RRR @New Pride theater");
  System.out.println("enter the number of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left= no_f_tickets-r;
  int amount=170*r;
  System.out.println("to continue to book for this movie prees 1 or to cancel the ticket  press 2");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n");
if (h == 1) 
{
  System.out.println("******************************************************");
  System.out.println("Theater ------------------- New Pride Theater");
  System.out.println("Movie --------------------- RRR");
  System.out.println("Cost ---------------------- Rs."+amount);
  System.out.println("\n Succesfully Booked");
}
if(h==2)
{
  System.out.println("Your Ticket Is Cancelled");
    }
   }
  }
 }
}
public class Tic    
{
public static void main(String[] args) 
{
  BookMyshow ob = new BookMyshow();
  BookMyshow[] moviename = new BookMyshow[2];
  moviename[0] = ob;
  thea a = new thea();
  moviename[1] = a;
  System.out.println("************************************************");
  System.out.println("!! Movie Ticket Booking Mangment System !!");
  System.out.println("************************************************\n");
  System.out.println("1.list of movies and their prices");
  System.out.println("\n************************************************");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  switch (h)
{
  case 1: 
  ob.movies();
  case 2:
  Scanner scan = new Scanner (System.in);
  System.out.println("For Booking Tickets Press 2");
  int n=scan.nextInt();
  a.th();
  }
 }
}




