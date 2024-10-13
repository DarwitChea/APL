package Polymorphism_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClassHierarchy {
    static class Food {
        int quantity;
        String type;
        public Food(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity(){
            return quantity;
        }

        public void setType(String type){
            this.type = type;
        }

        public String getType(){
            return type;
        }
    }

    static class Vegetable extends Food{
        public Vegetable(int quantity) {
            super(quantity);
        }

        public String getType(){
            return "Vegetable";
        }


        @Override
        public void setType(String type) {
            super.setType("Vegetable");
        }
    }

    static class Fruit extends Food{
        public Fruit(int quantity) {
            super(quantity);
        }

        public String getType(){
            return "Fruit";
        }

        @Override
        public void setType(String type) {
            super.setType("Fruit");
        }
    }

    static class Meat extends Food{
        public Meat(int quantity) {
            super(quantity);
        }

        public String getType(){
            return "Meat";
        }

        @Override
        public void setType(String type) {
            super.setType("Meat");
        }
    }

    class Seeds extends Food{
        public Seeds(int quantity) {
            super(quantity);
        }

        public String getType(){
            return "Seeds";
        }

        @Override
        public void setType(String type) {
            super.setType("Seeds");
        }
    }

    static class Animal {
        String name;
        Double weight;
        int foodEaten;
        Double weightGain;

        public Animal() {}

        public Animal(String name, Double weight, int foodEaten) {
            this.name = name;
            this.weight = weight;
            this.foodEaten = foodEaten;
        }

        void makeSound(String sound){
            System.out.println(sound);
        }

        public List<String> getCompatibleFoods(String food){
            List<String> comFood = new ArrayList<>();
            String[] foods = food.split(" ");
            for(int i = 0; i < foods.length; i++){
                comFood.add(foods[i].toString());
            }
            return comFood;
        }

        public Double getWeightGain(Double weightGain){
            return weightGain;
        }

        String getName(){return this.name;}
        Double getWeight(){return this.weight;}
        int getFoodEaten(){return this.foodEaten;}

        @Override
        public String toString() {
            return String.format("%s [%s, %s, %.1f, %d]", getClass().getSimpleName(), getName(),getWeight(), getFoodEaten());
        }

        public void eat(Food food, List<String> compatibleFoods){
            if (compatibleFoods.contains(food.getType())){
                this.weight += food.quantity * this.getWeightGain(weightGain);
                this.foodEaten += food.quantity;
            } else {
                System.out.println(this.getClass().getSimpleName() + " does not eat " + food.getType());
            }
        }
    }

    static class Bird extends Animal{
        double wingSize;

        public Bird(String name, Double weight, int foodEaten, double wingSize) {
            super(name, weight, foodEaten);
            this.wingSize = wingSize;
        }

        Double getWing(){return wingSize;}

        @Override
        public String toString() {
            return String.format("%s [%s, %.1f, %.2f, %d]", getClass().getSimpleName(), getName(), getWing(), getWeight(), getFoodEaten());
        }
    }

    static class Owl extends Bird{
        public Owl(String name, Double weight, int foodEaten, double wingSize) {
            super(name, weight, foodEaten, wingSize);
            makeSound("");
        }

        @Override
        void makeSound(String sound) {
            super.makeSound("Hoot Hoot");
        }

        @Override
        public List<String> getCompatibleFoods(String food){
            return super.getCompatibleFoods("Meat ");
        }

        @Override
        public Double getWeightGain(Double weightGain){
            return super.getWeightGain(0.25);
        }
    }

    static class Hen extends Bird{

        public Hen(String name, Double weight, int foodEaten, double wingSize) {
            super(name, weight, foodEaten, wingSize);
            makeSound("");
        }

        @Override
        void makeSound(String sound) {
            super.makeSound("Cluck Cluck");
        }

        @Override
        public List<String> getCompatibleFoods(String food){
            return super.getCompatibleFoods("Meat Fruit Vegetable Seeds");
        }

        @Override
        public Double getWeightGain(Double weightGain){
            return super.getWeightGain(0.35);
        }
    }

    static class Mammal extends Animal{
        String livingRegion;
        public Mammal(String name, Double weight, int foodEaten, String livingRegion) {
            super(name, weight, foodEaten);
            this.livingRegion = livingRegion;
        }

        String getLivingRegion(){return this.livingRegion;}

        @Override
        public String toString() {
            return String.format("%s [%s, %.1f, %s, %d]", getClass().getSimpleName(), getName(), getWeight(), getLivingRegion(),getFoodEaten());
        }
    }

    static class Mouse extends Mammal{
        public Mouse(String name, Double weight, int foodEaten, String livingRegion) {
            super(name, weight, foodEaten, livingRegion);
            makeSound("");
        }
        @Override
        void makeSound(String sound) {
            super.makeSound("Squeak Squeak");
        }

        @Override
        public List<String> getCompatibleFoods(String food){
            return super.getCompatibleFoods("Vegetable Fruit");
        }

        @Override
        public Double getWeightGain(Double weightGain){
            return super.getWeightGain(0.1);
        }
    }

    static class Dog extends Mammal{
        public Dog(String name, Double weight, int foodEaten, String livingRegion) {
            super(name, weight, foodEaten, livingRegion);
            makeSound("");
        }

        @Override
        void makeSound(String sound) {
            super.makeSound("Woof Woof");
        }

        @Override
        public List<String> getCompatibleFoods(String food){
            return super.getCompatibleFoods("Meat ");
        }

        @Override
        public Double getWeightGain(Double weightGain){
            return super.getWeightGain(0.4);
        }
    }

    static class Feline extends Mammal{
        String breed;
        public Feline(String name, Double weight, int foodEaten, String livingRegion, String breed) {
            super(name, weight, foodEaten, livingRegion);
            this.breed = breed;
        }

        String getBreed(){return this.breed;}

        @Override
        public String toString() {
            return String.format("%s [%s, %s, %.1f, %s, %d]", getClass().getSimpleName(), getName(), getBreed(), getWeight(), getLivingRegion(), getFoodEaten());
        }
    }

    static class Cat extends Feline{

        public Cat(String name, Double weight, int foodEaten, String livingRegion, String breed) {
            super(name, weight, foodEaten, livingRegion, breed);
            makeSound("");
        }

        @Override
        void makeSound(String sound) {
            super.makeSound("Meowww");
        }

        @Override
        public List<String> getCompatibleFoods(String food){
            return super.getCompatibleFoods("Meat Vegetable");
        }

        @Override
        public Double getWeightGain(Double weightGain){
            return super.getWeightGain(0.3);
        }
    }

    static class Tiger extends Feline{
        public Tiger(String name, Double weight, int foodEaten, String livingRegion, String breed) {
            super(name, weight, foodEaten, livingRegion, breed);
            makeSound("");
        }

        @Override
        void makeSound(String sound) {
            super.makeSound("ROARRR!");
        }

        @Override
        public List<String> getCompatibleFoods(String food){
            return super.getCompatibleFoods("Meat ");
        }

        @Override
        public Double getWeightGain(Double weightGain){
            return super.getWeightGain(1.0);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                for (int i = 0; i <= animals.size()-1; i++){
                    System.out.println(animals.get(i).toString());
                }
                break;
            }

            String[] animalData = input.split("\\s+");
            String animalType = animalData[0];
            String animalName = animalData[1];
            double animalWeight = Double.parseDouble(animalData[2]);

            switch (animalType) {
                case "Hen":
                    double wingSize = Double.parseDouble(animalData[3]);
                    animals.add(new Hen(animalName, animalWeight, 0, wingSize));
                    break;
                case "Owl":
                    double owlWingSize = Double.parseDouble(animalData[3]);
                    animals.add(new Owl(animalName, animalWeight, 0, owlWingSize));
                    break;
                case "Mouse":
                    String livingRegion = animalData[3];
                    animals.add(new Mouse(animalName, animalWeight, 0, livingRegion));
                    break;
                case "Dog":
                    String dogLivingRegion = animalData[3];
                    animals.add(new Dog(animalName, animalWeight, 0, dogLivingRegion));
                    break;
                case "Cat":
                    String catLivingRegion = animalData[3];
                    String breed = animalData[4];
                    animals.add(new Cat(animalName, animalWeight, 0, catLivingRegion, breed));
                    break;
                case "Tiger":
                    String tigerLivingRegion = animalData[3];
                    String tigerBreed = animalData[4];
                    animals.add(new Tiger(animalName, animalWeight, 0, tigerLivingRegion, tigerBreed));
                    break;
                default:
                    System.out.println("Invalid animal type.");
                    break;
            }

            input = scanner.nextLine();
            String[] foodData = input.split("\\s+");
            String foodType = foodData[0];
            int quantity = Integer.parseInt(foodData[1]);

            switch (foodType) {
                case "Vegetable":
                    if (animals.get(animals.size() - 1) instanceof Mouse) {
                        animals.get(animals.size() - 1).eat(new Vegetable(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Vegetable"));
                    } else if (animals.get(animals.size() - 1) instanceof Cat) {
                        animals.get(animals.size() - 1).eat(new Vegetable(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Vegetable"));
                    } else if (animals.get(animals.size() - 1) instanceof Hen) {
                        animals.get(animals.size() - 1).eat(new Vegetable(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Vegetable"));
                    } else {
                        System.out.println(animalType + " does not eat " + foodType + "!");
                    }
                    break;
                case "Fruit":
                    if (animals.get(animals.size() - 1) instanceof Mouse) {
                        animals.get(animals.size() - 1).eat(new Fruit(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Fruit"));
                    } else if (animals.get(animals.size() - 1) instanceof Hen) {
                        animals.get(animals.size() - 1).eat(new Fruit(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Fruit"));
                    } else {
                        System.out.println(animalType + " does not eat " + foodType + "!");
                    }
                    break;
                case "Meat":
                    if (animals.get(animals.size() - 1) instanceof Cat) {
                        animals.get(animals.size() - 1).eat(new Meat(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Meat"));
                    } else if (animals.get(animals.size() - 1) instanceof Tiger) {
                        animals.get(animals.size() - 1).eat(new Meat(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Meat"));
                    } else if (animals.get(animals.size() - 1) instanceof Dog) {
                        animals.get(animals.size() - 1).eat(new Meat(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Meat"));
                    } else if (animals.get(animals.size() - 1) instanceof Owl) {
                        animals.get(animals.size() - 1).eat(new Meat(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Meat"));
                    } else {
                        System.out.println(animalType + " does not eat " + foodType + "!");
                    }
                    break;
                case "Seeds":
                    if (animals.get(animals.size() - 1) instanceof Hen) {
                        animals.get(animals.size() - 1).eat(new Meat(quantity), animals.get(animals.size() - 1).getCompatibleFoods("Seeds"));
                    } else {
                        System.out.println(animalType + " does not eat " + foodType + "!");
                    }
            }
        }
    }
}
