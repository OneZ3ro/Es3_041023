import entities.Calls;
import entities.Sim;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your phone number");
        int phone = Integer.parseInt(input.nextLine());

        Sim sim1 = new Sim(phone);
        getDataSim(sim1);

        input.close();
    }

    public static void getDataSim(Sim sim1){
        System.out.println("Your phone number: " + sim1.getPhoneNumber());
        System.out.println("Your remaining credit: " + sim1.getRemainingCredit());
        System.out.print("Your last five calls: " );

        Calls[] calls = sim1.getCalls();
        for (int i = 0; i < calls.length; i++) {
            if (i != (calls.length - 1)) {
                System.out.print(calls[i] + " - ");
            } else {
                System.out.print(calls[i]);
            }
        }
    }

}
