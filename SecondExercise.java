import entities.es2.Calls;
import entities.es2.Sim;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your phone number");
        int phone = Integer.parseInt(input.nextLine());
        getDataSim(phone);

        input.close();
    }

    public static void getDataSim(int a){
        Sim sim1 = new Sim();
        sim1.setPhoneNumber(a);
        System.out.println("Your phone number: " + sim1.getPhoneNumber());
        System.out.println("Your remaining credit: " + sim1.getRemainingCredit());

        Calls call1 = new Calls(120, 12345690);
        Calls call2 = new Calls(10, 14325690);
        Calls call3 = new Calls(20, 95143450);
        Calls call4 = new Calls(30, 12973490);
        Calls call5 = new Calls(40, 11099690);

        Calls[] callArr = {call1, call2, call3, call4, call5};

        sim1.setCalls(callArr);
        System.out.println("Your last five calls: " );

        for (int i = 0; i < sim1.getCalls().length; i++) {
            System.out.println("Duration: " + sim1.getCalls()[i].getDuration() + ", phone number called: " + sim1.getCalls()[i].getPhoneNumCalled());
        }
    }

}
