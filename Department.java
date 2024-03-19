import java.util.Scanner;

import com.Employ;

public class Department {
    public static void main(String[] args) throws Exception {
        Employ emp=new Employ();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your experience:");
        int exp=sc.nextInt();
        emp.setName("Mohammad Ali");
        emp.setExp(exp);
        emp.setSalary(2000);
        if(emp.getExp()>5){
            double totalSal=emp.getSalary();
            emp.setSalary(totalSal+totalSal*0.1);
            System.out.println("your name is "+emp.getName());
        System.out.println("Your current Sal is "+emp.getSalary());
        System.out.println("Your current experience is"+emp.getExp());
        }
        else{
            System.out.println("Your are "+emp.getName()+"not capable");


        }
        

        sc.close();
        
    }
}
