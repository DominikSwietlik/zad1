// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int silnia;

        try{
            while(true)
            {
                System.out.println("Podaj liczbę, której silnie chcesz obliczyć");
                Scanner input = new Scanner(System.in);
                int num1 = Integer.parseInt(input.nextLine());
                System.out.println("Podana liczba to : " + num1);

                if (num1 >= 1) {
                    silnia = 1;
                    for (int i = 1; i <= num1; i++) {

                        silnia = silnia * i;

                    }
                    System.out.println("Silnia liczby : " + num1 + " wynosi: " + silnia);
                    silnia = 0;
                } else if (num1 == 0) {
                    silnia = 1;
                    System.out.println("Silnia liczby : " + num1 + " wynosi: " + silnia);
                    silnia = 0;

                } else {
                    System.out.println("wprowadziłeś/łaś błędną wartość");
                }
            }


        }
        catch (NumberFormatException ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }



        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}