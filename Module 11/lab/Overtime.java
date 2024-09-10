// ****************************************************************
// Overtime.java
//
// Reads a file of employee payroll information and determines
// how many employees worked more than 40 hours.
// ****************************************************************
import java.util.Scanner;
public class Overtime {
        public static void main(String[] args) {
            String fileName; // Name of the file to be read from
            Scanner scan = new Scanner(System.in);
            System.out.println("\nPayroll Program");
            System.out.print("Enter the name of the file containing payroll information: ");
            fileName = scan.nextLine();

            // Instatiate a Payroll object and read the file
            Payroll payroll = new Payroll();
            payroll.readPayrollInfo(fileName);

            // Determine how many employees worked overtime
            int numOvertime = payroll.numOvertime();

            // Print the number of employees who worked overtime
            System.out.println("Number of employees who worked overtime: " + numOvertime);
            scan.close();
        }
}
