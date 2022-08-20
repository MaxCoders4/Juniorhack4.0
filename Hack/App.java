import java.io.IOException;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/GPAdetails");
            java.sql.Statement statement = connection.createStatement();
            String query="INSERT INTO detailsofstudent Values('John Doe',4,2,'SENG 21233','A',2)";
            ResultSet resultset = ((java.sql.Statement) statement).executeQuery(query);

            while(resultset.next()){
               System.out.println();
            }      
            connection.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

            double gpa;
            String grade;
            int credit;
            
            System.out.println("\n__GPA Calculator_\n");
            Scanner sc = new Scanner (System.in)
                System.out.println("Enter your name"); String name = sc.nextLine();
               for(; ;){
                System.out.println("Course Duration(In years)"); int noOfYears = sc.nextInt();
                if(noOfYears>=1 && noOfYears<=5){
                    break;
                }
                else{
                    System.out.println("No valid");
                }
               }
        
                System.out.println("\n\n Congratulations! Your registration was completed");
                System.out.println("\n hello "+name+", Welcome Back !");
                System.out.println("\n__Menu_\n");
                System.out.println("1.View Results\n");
                System.out.println("2.Add Results\n");
                System.out.println("3.Export Data\n");
                System.out.println("4.Clear Data\n");
                System.out.println("5.Exit\n");
                System.out.println("Enter your choice"); int choice = sc.nextInt();
                switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:System.exit(0);
                        default :
                            System.out.println("Invalid Choice");
                            break;
                    }
            }
 }
    

            
        

