import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ElkaToy> toys = new ArrayList<>(addElkaToy());

        Elka elka1 = new Elka(1, toys);

        System.out.println("Создана " + elka1);

        System.out.println("Красные игрушки:");
        printToysOfColour(toys);

        System.out.println("Сортировка игрушек по имени в алфавитном порядке " + sortToysName(elka1.getElkaToys()));

        System.out.println("Сортировка игрушек по цвету в алфавитном порядке " + sortToysColour(elka1.getElkaToys()));
    }

     static ArrayList<ElkaToy> addElkaToy() {
        ArrayList<ElkaToy> toys = new ArrayList<>();
        toys.add(new ElkaToy(1, "Star", "red"));
        toys.add(new ElkaToy(2, "DedMoroz", "blue"));
        toys.add(new ElkaToy(3, "Bear", "red"));
        toys.add(new ElkaToy(4, "Hare", "white"));
        toys.add(new ElkaToy(5, "SnowMaiden", "red"));
        return toys;
    }

     static void printToysOfColour(ArrayList<ElkaToy> toys) {
        for (ElkaToy toy : toys) {
            if (toy.getColour().toLowerCase() == "red") {
                System.out.println(toy);
            }
        }

    }

     static ArrayList sortToysName(ArrayList<ElkaToy> toys) {
        for (int i = toys.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (toys.get(i).getName().charAt(0) < toys.get(j).getName().charAt(0)) {
                    {
                        ElkaToy a = toys.get(i);
                        toys.set(i, toys.get(j));
                        toys.set(j, a);
                    }

                }
            }
        }
        return toys;
    }

     static ArrayList sortToysColour(ArrayList<ElkaToy> toys) {
        for (int i = toys.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (toys.get(i).getColour().toLowerCase().charAt(0) < toys.get(j).getColour().toLowerCase().charAt(0)) {
                    {
                        ElkaToy a = toys.get(i);
                        toys.set(i, toys.get(j));
                        toys.set(j, a);
                    }

                }
            }
        }
        return toys;
    }
}