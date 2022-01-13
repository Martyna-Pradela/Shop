package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Martyna", "Pradela");
        Account account = new Account(300);

        customer.setAccount(account);

        List<Dresses> dresses1 = Arrays.asList(
                new Dresses("Sukienka Dama", Lenght.LONG, Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Dresses("Sukienka Lama", Lenght.MEDIUM, Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Dresses("Sukienka Sama", Lenght.LONG, Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Dresses("Sukienka Jama", Lenght.MEDIUM, Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Dresses("Sukienka Fama", Lenght.LONG, Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Dresses("Sukienka Gama", Lenght.MEDIUM, Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Dresses("Sukienka Da", Lenght.LONG, Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Dresses("Sukienka La", Lenght.MEDIUM, Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Dresses("Sukienka Sa", Lenght.LONG, Season.SPRING_SUMMER, 20.99, 38, "red"),
                new Dresses("Sukienka Ja", Lenght.MEDIUM, Season.SPRING_SUMMER, 20.99, 38, "red"),
                new Dresses("Sukienka Fa", Lenght.LONG, Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Dresses("Sukienka Ga", Lenght.MEDIUM, Season.SPRING_SUMMER, 20.99, 38, "red"));

        List<Trousers> trousers1 = Arrays.asList(
                new Trousers("Spodnie Dama", Type.JEANS, CollectionType.PETITE, 20.99, 38, "blue"),
                new Trousers("Spodnie Lama", Type.SHORTS, CollectionType.PLUS_SIZE, 20.99, 52, "blue"),
                new Trousers("Spodnie Sama", Type.LEGGINGS, CollectionType.FOR_HIGH, 20.99, 38, "blue"),
                new Trousers("Spodnie Jama", Type.JEANS, CollectionType.FOR_HIGH, 20.99, 38, "blue"),
                new Trousers("Spodnie Fama", Type.LEGGINGS, CollectionType.PETITE, 20.99, 38, "blue"),
                new Trousers("Spodnie Gama", Type.JEANS, CollectionType.FOR_HIGH, 20.99, 38, "blue"),
                new Trousers("Spodnie Da", Type.JEANS, CollectionType.PETITE, 20.99, 38, "red"),
                new Trousers("Spodnie La", Type.SHORTS, CollectionType.PLUS_SIZE, 20.99, 52, "red"),
                new Trousers("Spodnie Sa", Type.LEGGINGS, CollectionType.FOR_HIGH, 20.99, 38, "red"),
                new Trousers("Spodnie Ja", Type.JEANS, CollectionType.FOR_HIGH, 20.99, 38, "red"),
                new Trousers("Spodnie Fa", Type.LEGGINGS, CollectionType.PETITE, 20.99, 38, "red"),
                new Trousers("Spodnie Ga", Type.JEANS, CollectionType.FOR_HIGH, 20.99, 38, "red"));

        List<Skirts> skirts1 = Arrays.asList(
                new Skirts("Spódnica Dama", Lenght.LONG, Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Skirts("Spódnica Lama", Lenght.LONG, Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Skirts("Spódnica Sama", Lenght.MEDIUM, Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Skirts("Spódnica Jama", Lenght.MEDIUM, Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Skirts("Spódnica Fama", Lenght.SHORT, Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Skirts("Spódnica Gama", Lenght.SHORT, Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Skirts("Spódnica Da", Lenght.LONG, Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Skirts("Spódnica La", Lenght.LONG, Season.SPRING_SUMMER, 20.99, 38, "red"),
                new Skirts("Spódnica Sa", Lenght.MEDIUM, Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Skirts("Spódnica Ja", Lenght.MEDIUM, Season.SPRING_SUMMER, 20.99, 38, "red"),
                new Skirts("Spódnica Fa", Lenght.SHORT, Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Skirts("Spódnica Ga", Lenght.SHORT, Season.SPRING_SUMMER, 20.99, 38, "red"));

        List<Jackets> jackets1 = Arrays.asList(
                new Jackets("Kurtka Dama", Type.JEANS, CollectionType.PETITE, 20.99, 38, "blue"),
                new Jackets("Kurtka Lama", Type.NO_ZIPPED, CollectionType.PLUS_SIZE, 20.99, 52, "blue"),
                new Jackets("Kurtka Sama", Type.WITH_HOOD, CollectionType.FOR_HIGH, 20.99, 38, "blue"),
                new Jackets("Kurtka Jama", Type.NO_ZIPPED, CollectionType.FOR_HIGH, 20.99, 38, "blue"),
                new Jackets("Kurtka Fama", Type.ZIPPED, CollectionType.PETITE, 20.99, 38, "blue"),
                new Jackets("Kurtka Gama", Type.JEANS, CollectionType.FOR_HIGH, 20.99, 38, "blue"),
                new Jackets("Kurtka Da", Type.JEANS, CollectionType.PETITE, 20.99, 38, "red"),
                new Jackets("Kurtka La", Type.NO_ZIPPED, CollectionType.PLUS_SIZE, 20.99, 52, "red"),
                new Jackets("Kurtka Sa", Type.WITH_HOOD, CollectionType.FOR_HIGH, 20.99, 38, "red"),
                new Jackets("Kurtka Ja", Type.NO_ZIPPED, CollectionType.FOR_HIGH, 20.99, 38, "red"),
                new Jackets("Kurtka Fa", Type.ZIPPED, CollectionType.PETITE, 20.99, 38, "red"),
                new Jackets("Kurtka Ga", Type.JEANS, CollectionType.FOR_HIGH, 20.99, 38, "red"));

        List<Shirts> shirts1 = Arrays.asList(new Shirts("Bluzka Dama", Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Shirts("Bluzka Lama", Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Shirts("Bluzka Sama", Season.AUTUMN_WINTER, 20.99, 38, "blue"),
                new Shirts("Bluzka Jama", Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Shirts("Bluzka Fama", Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Shirts("Bluzka Gama", Season.SPRING_SUMMER, 20.99, 38, "blue"),
                new Shirts("Bluzka Da", Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Shirts("Bluzka La", Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Shirts("Bluzka Sa", Season.AUTUMN_WINTER, 20.99, 38, "red"),
                new Shirts("Bluzka Ja", Season.SPRING_SUMMER, 20.99, 38, "red"),
                new Shirts("Bluzka Fa", Season.SPRING_SUMMER, 20.99, 38, "red"),
                new Shirts("Bluzka Ga", Season.SPRING_SUMMER, 20.99, 38, "red"));

        List<Clothes> toBasket = new ArrayList<>();

        Basket basket = new Basket();

        Scanner scanner = new Scanner(System.in);

        List<Clothes> avaliable = new ArrayList<Clothes>();
        boolean shopping = true;
        while(true) {
            while (shopping) {
                System.out.println("\nChoose Category:\n 0. DRESS\n 1. JACKET\n 2. SHIRT\n 3. SKIRT\n 5. TROUSER");
                int newcat = 10;
                try {
                    newcat = scanner.nextInt();
                    scanner.nextLine();
                }catch(InputMismatchException e) {
                    System.err.println("\nPodałeś liczbę w złym formacie.");
                }

                if (newcat  == What.DRESS.ordinal()) {
                    System.out.println("Lenght (LONG, SHORT, MEDIUM).");
                    String dlug = scanner.nextLine();
                    String newdlug = dlug.toUpperCase();
                    System.out.println("Season (SPRING_SUMMER, AUTUMN_WINTER).");
                    String sez = scanner.nextLine();
                    String newsez = sez.toUpperCase();
                    System.out.println("Size.");
                    int roz = scanner.nextInt();
                    System.out.println("Sukienki z tej kategorii: " + "\n");

                    int i = 0;
                    for (Dresses dresses2 : dresses1) {
                        if (dresses2.getLenght().name().equals(newdlug)) {
                            if (dresses2.getSeason().name().equals(newsez)) {
                                if (dresses2.getSize() == roz) {
                                    avaliable.add(dresses2); // dodaje do listy
                                    System.out.println(i + ". " + dresses2.getName() + "\n" + "Price: " + dresses2.getPrice() + "\n"
                                            + dresses2.getColor() + "\n");

                                    i++;

                                }
                            }
                        }
                    }
                }

                if (newcat == What.TROUSERS.ordinal()) {
                    System.out.println("Type (JEANS, SHORTS,LEGGINGS).");
                    String typ = scanner.nextLine();
                    String newtyp = typ.toUpperCase();
                    System.out.println("Collection type (FOR_HIGH, PLUS_SIZE, PETITE).");
                    String rod = scanner.nextLine();
                    String newrod = rod.toUpperCase();
                    System.out.println("Size.");
                    int roz = scanner.nextInt();
                    System.out.println("Spodnie z tej kategorii: " + "\n");

                    int i = 0;
                    for (Trousers trousers2 : trousers1) {
                        if (trousers2.getType().name().equals(newtyp)) {
                            if (trousers2.getCollectionType().name().equals(newrod)) {
                                if (trousers2.getSize() == roz) {
                                    avaliable.add(trousers2);
                                    System.out.println(i + ". " + trousers2.getNazwa() + "\n" + "Price: " + trousers2.getPrice() + "\n"
                                            + trousers2.getColor() + "\n");
                                    i++;
                                }
                            }
                        }
                    }
                }

                if (newcat == What.SKIRT.ordinal()) {
                    System.out.println("Lenght (LONG, SHORT, MEDIUM).");
                    String dlu = scanner.nextLine();
                    String newdlu = dlu.toUpperCase();
                    System.out.println("Season (SPRING_SUMMER, AUTUMN_WINTER).");
                    String sez = scanner.nextLine();
                    String newsez = sez.toUpperCase();
                    System.out.println("Size.");
                    int roz = scanner.nextInt();
                    System.out.println("Spódnice z tej kategorii: " + "\n");

                    int i = 0;
                    for (Skirts skirts2 : skirts1) {
                        if (skirts2.getLenght().name().equals(newdlu)) {
                            if (skirts2.getSeason().name().equals(newsez)) {
                                if (skirts2.getSize() == roz) {
                                    avaliable.add(skirts2);
                                    System.out.println(i + ". " + skirts2.getNazwa() + "\n" + "Price: " + skirts2.getPrice() + "\n"
                                            + skirts2.getColor() + "\n");
                                    i++;
                                }
                            }
                        }
                    }
                }

                if (newcat == What.JACKET.ordinal()) {
                    System.out.println("Type (JEANS, ZIPPED, WITH_HOOD, NO_ZIPPED).");
                    String typ = scanner.nextLine();
                    String newtyp = typ.toUpperCase();
                    System.out.println("Collection type (FOR_HIGH, PLUS_SIZE, PETITE).");
                    String rod = scanner.nextLine();
                    String newrod = rod.toUpperCase();
                    System.out.println("Size.");
                    int roz = scanner.nextInt();
                    System.out.println("Kurtki z tej kategorii: " + "\n");

                    int i = 0;
                    for (Jackets jackets2 : jackets1) {
                        if (jackets2.getType().name().equals(newtyp)) {
                            if (jackets2.getCollectionType().name().equals(newrod)) {
                                if (jackets2.getSize() == roz) {
                                    avaliable.add(jackets2);
                                    System.out.println(i + ". " + jackets2.getNazwa() + "\n" + "Price: " + jackets2.getPrice() + "\n"
                                            + jackets2.getColor() + "\n");
                                    i++;
                                }
                            }
                        }
                    }
                }


                if (newcat == What.SHIRT.ordinal()) {
                    System.out.println("Season (SPRING_SUMMER, AUTUMN_WINTER).");
                    String sez = scanner.nextLine();
                    String newsez = sez.toUpperCase();
                    System.out.println("Size.");
                    int roz = scanner.nextInt();
                    System.out.println("Bluzki z tej kategorii: " + "\n");

                    int i = 0;
                    for (Shirts shirts2 : shirts1) {
                        if (shirts2.getSeason().name().equals(newsez)) {
                            if (shirts2.getSize() == roz) {
                                avaliable.add(shirts2);
                                System.out.println(i + ". " + shirts2.getName() + "\n" + "Price: " + shirts2.getPrice() + "\n"
                                        + shirts2.getColor() + "\n");
                                i++;
                            }
                        }
                    }
                }


                if (!avaliable.isEmpty()) {
                    System.out.println("Choice number.");
                    int wyb = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        System.out.println(avaliable.get(wyb));
                        toBasket.add(avaliable.get(wyb));
                    }catch (IndexOutOfBoundsException e) {
                        System.out.println("\nWybrano nieistniejący produkt. ");
                    }
                } else {
                    System.out.println("\nBrak ubrań o zadanych parametrach");
                    scanner.nextLine();
                }

                System.out.println("\nCzy chcesz kontynuować zakupy? TAK/NIE");
                String decision = scanner.nextLine();
                decision = decision.toUpperCase();
                if (decision.equals("NIE")) {
                    shopping = false;
                }
                avaliable.clear();
            }
            if(!toBasket.isEmpty()) {
                basket.setProduktList(toBasket);
                System.out.println(basket.getProduktList().toString());
                System.out.println("\nCzy chcesz kupić te produkty? TAK/NIE");
                String decision = scanner.nextLine();
                decision = decision.toUpperCase();
                if (decision.equals("TAK")) {
                    if (customer.getAccount().getBalance() >= basket.shoppingPrice()) {
                        customer.getAccount().setMinus(basket.shoppingPrice());
                        System.out.println("\nKupiłeś");
                        System.out.println("\nCzy chcesz zachować paragon? TAK/NIE");
                        String decision2 = scanner.nextLine();
                        decision2 = decision2.toUpperCase();
                        if (decision2.equals("TAK")) {
                            System.out.println("\nZapisano paragon.");
                            /////////////////////////////
                        }else {
                            System.out.println("\nDziękujemy za zakupy.");
                        }
                    } else {
                        System.out.println("\nZakup nie powiódł się. ");
                    }
                }else {
                    System.out.println("\nTwój koszyk jest pusty. ");
                }
                System.out.println("\nCzy chcesz rozpocząć zakupy od nowa? TAK/NIE");
                String decision1 = scanner.nextLine();
                decision1 = decision1.toUpperCase();
                if(decision.equals("NIE")) {
                    System.out.println("\nDo widzenia.");
                    System.exit(0);
                }else {
                    shopping = true;
                }
            }
        }
    }
}
