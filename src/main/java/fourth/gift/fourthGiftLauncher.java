package fourth.gift;

import java.util.Scanner;

public class fourthGiftLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean contAdd = true;
        //переменные для Candy
        int candyPrice = 0;
        int candyWeight = 0;
        int candyQuantity = 0;
        String candyType = null;
        //переменные для Jellybean
        int jellyPrice = 0;
        int jellyWeight = 0;
        int jellyQuantity = 0;
        String jellyType = null;
        //переменные для Etc
        int etcPrice = 0;
        int etcWeight = 0;
        int etcQuantity = 0;
        String etcType = null;

//основной цикл добавления в gift
        while (contAdd == true){
            System.out.println("Chose item to add in gift");
            System.out.println("1 - candy, 2 - jellybean, 3 - Etc");
            System.out.println("4 - to form a gift");
            int add = scanner.nextInt();
            switch (add){
                case 1:
                    System.out.print("candy quantity: ");
                    Candy can = new Candy();
                    int quantityC = scanner.nextInt();
                    candyPrice = can.getPrice()*quantityC;
                    candyWeight = can.getWeight()*quantityC;
                    candyType = can.getType();
                    candyQuantity = candyQuantity + quantityC;
                    System.out.println(candyQuantity + " candy inside gift");
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.print("jelly quantity: ");
                    Jellybean jell = new Jellybean();
                    int quantityJ = scanner.nextInt();
                    jellyPrice = jell.getPrice()*quantityJ;
                    jellyWeight = jell.getWeight()*quantityJ;
                    jellyType = jell.getJellyType();
                    jellyQuantity = jellyQuantity + quantityJ;
                    System.out.println(jellyQuantity + " jelly inside gift");
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    System.out.print("Etc quantity: ");
                    Etc some = new Etc();
                    int quantityE = scanner.nextInt();
                    etcPrice = some.getPrice()*quantityE;
                    etcWeight = some.getWeight()*quantityE;
                    etcType = some.getEtcType();
                    etcQuantity = etcQuantity + quantityE;
                    System.out.println(etcQuantity + " Etc inside gift");
                    System.out.println("----------------------------------");
                    break;
                case 4:
                    System.out.println(candyQuantity + " " + candyType + " candy's for " + candyPrice + " cent");
                    System.out.println("candy's weight is " + candyWeight + " gram");
                    System.out.println("----------------------------------");

                    System.out.println(jellyQuantity + " " + jellyType + " jellybean's for " + jellyPrice + " cent");
                    System.out.println("jellybean's weight is " + jellyWeight + " gram");
                    System.out.println("----------------------------------");

                    System.out.println(etcQuantity + " " + etcType + " Etc's for " + etcPrice + " cent");
                    System.out.println("Etc's Weight is " + etcWeight + " gram");
                    System.out.println("----------------------------------");

                    System.out.println("----------------------------------");

                    System.out.println("gift price is " + (candyPrice+jellyPrice+etcPrice) + " cent");
                    System.out.println("gift weight is " + (candyWeight+jellyWeight+etcWeight) + " gram");

                    contAdd = false;
            }
        }
    }
}

