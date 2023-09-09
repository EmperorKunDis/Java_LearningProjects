import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> drink = new ArrayList<String>();
        ArrayList<String> candy = new ArrayList<String>();

        food.add("Pizza");
        food.add("Kebab");
        food.add("Hotdog");
        food.add("Spaggeti");
        food.add("ZmrzkoPizza");

        drink.add("Cola");
        drink.add("Jack Daniels");
        drink.add("Water");
        drink.add("Tonic");
        drink.add("Wine");

        candy.add("Harribo");
        candy.add("Snickers");
        candy.add("Mars");
        candy.add("Bounty");

        food.set(4, "Sushi");
        drink.remove(2);
        candy.clear();

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
        for(int j=0; j<drink.size(); j++) {
            System.out.println(drink.get(j));
        }

    }
}
