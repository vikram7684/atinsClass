import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRun {

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
       dishes.add(new Dish("Samosa", DishType.Veg, 1, Arrays.asList("Potato", "Peas", "Cumin")));

        dishes.add(new Dish("Paneer", DishType.Non_Veg, 15, Arrays.asList("Paneer", "Cream", "Salt")));
        dishes.add(new Dish("Carrot Cake", DishType.Veg, 25, Arrays.asList("Carrot", "APF", "Sugar")));
        dishes.add(new Dish("Daal Makhani", DishType.Non_Veg, 18, Arrays.asList("Lentil", "Butter", "Cream")));
        dishes.add(new Dish("Buter Chicken", DishType.Non_Veg, 18, Arrays.asList("Chicken", "Butter", "Salt")));
        dishes.add(new Dish("Goat Curry", DishType.Non_Veg, 18, Arrays.asList("Meat", "Chilli", "Oniotn")));
dishes.stream().filter(d -> d.getType()==DishType.Veg).map(d->d.getName()).forEach(System.out::println);

    }
}
