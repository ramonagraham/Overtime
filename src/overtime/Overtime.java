package overtime;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Overtime {

  public static void main(String[] args) throws IOException {
    Scanner stdin = new Scanner(System.in);
    System.out.print("Filename: ");
    String name = stdin.nextLine();
    File file = new File(name);
    Scanner fileIn = new Scanner(file);
    int numRows = fileIn.nextInt();
    fileIn.nextLine();
    // System.out.println(numRows);
    
    for (int i = 0; i < numRows; i++) {
	    String line = fileIn.nextLine();
	    System.out.println(line);
	    Scanner lineIn = new Scanner(line);
	    int[] timesheet = new int[7];   // 7 days in the week
	    int totalHours = 0;
	    
	    for (int j = 0; j < 7; j++) {
	    	timesheet[j] = lineIn.nextInt();
	        totalHours += timesheet[j];
	    }
        int totalPay = 0;
        
        if (totalHours <= 40) {
        	totalPay = totalHours * 10;
        }
	    else {
	    	totalPay = (40 * 10) + ((totalHours - 40) * 4); // reg + overtime
	    }
        
        System.out.println(totalPay);
    }
  }
}