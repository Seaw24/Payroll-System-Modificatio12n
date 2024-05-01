   // Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.TimeZone;
public class PayrollSystemTest {
   public static void main(String[] args) {
      Calendar localCalendar=Calendar.getInstance(TimeZone.getDefault());
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00,10,5,1996);    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40,12,13,1997);  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", "333-33-3333", 10000, .06,9,13,2004);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300,8,25,2004);                  

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings(0));
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings(0));
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings(0));
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings(0));

      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         int a = 0;
         System.out.println(currentEmployee); // invokes toString
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
                    if(currentMonth == currentEmployee.getMonth() ) {
                     a = 1000; // bonus on birthday month
                    }
         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings(a));
      } 
     
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
