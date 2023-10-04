import entities.es3.Cart;
import entities.es3.Product;
import entities.es3.User;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product book1 = new Product("Bel libro", 19.99, 30);
        Product book2 = new Product("Ci sta", 40.99, 33);
        Product book3 = new Product("Ok", 11.99, 27);
        Product book4 = new Product("Nice", 13.99, 10);
        Product book5 = new Product("Daje", 16.99, 50);

        Product[] partialCart = {book1, book2, book3, book4, book5};

        System.out.print("\nType your name: ");
        String name = input.next();
        System.out.print("\nType your surname: ");
        String surname = input.next();
        System.out.print("\nType your email: ");
        String email = input.next();

        User user1 = new User(name, surname, email);


        Cart carrello = new Cart();
        carrello.setCartCodeUser(user1.getCodeUser());
        carrello.setProducts(partialCart);

        System.out.println("Your cart:");
        System.out.println("Your codeUser: " + carrello.getCartCodeUser());
        for (int i = 0; i < carrello.getProductsArr().length; i++) {
            System.out.println("Your item: " + carrello.getProductsArr()[i]);
        }


        input.close();
    }
}
