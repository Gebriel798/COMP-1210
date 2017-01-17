import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
* This program evaluates football tickets.
* COMP 1210 - Project 3.
*
* @author Grant Haislip - Lab 7
* @version 9/11/2016
*/
public class GameTicket
{
   static final double STUDENT_DISCOUNT = .85;
   static final double FACULTY_STAFF_DISCOUNT = .25;
/**
* This method evaluates football tickets.
*
* @param args Command line (not used).
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      DecimalFormat dFmt = new DecimalFormat("$#,##0.00");
      Random generator = new Random();
   // variables
      String inputTicket = "";
      String ticket = "";
      String price = "";
      String section = "";
      String row = "";
      String seat = "";
      int fixedSection = 0;
      int fixedRow = 0;
      int fixedSeat = 0;
      double priceDouble = 0;
      double priceResult = 0;
      double cost = 0;
      String game = "";
      int prizeNumber;
   // prompt user for ticket code and trim it
      System.out.print("Enter your ticket code: ");
      inputTicket = userInput.nextLine();
      System.out.println("");
      ticket = inputTicket.trim();
   // check for valid ticket
      if (ticket.length() < 25) {
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 25 characters.");
      }
      else {
      // evaluate price
         price = ticket.substring(0, 4);
         priceDouble = Double.parseDouble(price);
         priceResult = priceDouble / 10;
      // evaluate cost
         if (ticket.charAt(5) == 's') {
            cost = priceResult - (priceResult * STUDENT_DISCOUNT);
         }
         else if (ticket.charAt(5) == 'f') {
            cost = priceResult - (priceResult * FACULTY_STAFF_DISCOUNT);
         }
         else {
            cost = priceResult;
         }
      // evaluate section
         section = ticket.substring(22, 24);
         fixedSection = Integer.parseInt(section);
      // evaluate row
         row = ticket.substring(20, 22);
         fixedRow = Integer.parseInt(row);
      // evaluate seat
         seat = ticket.substring(18, 20);
         fixedSeat = Integer.parseInt(seat);
      // evaluate game
         game = ticket.substring(24, ticket.length());
      // print game information
         System.out.print("Game: " + game);
         System.out.print("   Date: " + ticket.substring(10, 12)
            + "/" + ticket.substring(12, 14) + "/" + ticket.substring(14, 18));
         System.out.println("   Time: " + ticket.substring(6, 8) + ":"
            + ticket.substring(8, 10));
         System.out.print("Section: " + fixedSection);
         System.out.print("   Row: " + fixedRow);
         System.out.println("   Seat: " + fixedSeat);
         System.out.print("Price: " + dFmt.format(priceResult));
         System.out.print("   Category: " + ticket.charAt(5));
         System.out.println("   Cost: " + dFmt.format(cost));
      // get prize number
         System.out.print("Prize Number: "
            + String.format("%07d", generator.nextInt(9999999) + 1));
      }
   }
}