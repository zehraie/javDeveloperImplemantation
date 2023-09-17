package com.edu.week01;

public class Feast {
    public static void main(String[] args) {
        String animal = "great blue heron";
        String dish = "garlic naan";

        boolean canBring = canBringAnimal(animal, dish);
        System.out.println("it is suitable animal and dish couple : "+canBring);

    }

    public static boolean canBringAnimal(String animal,String dish){
        if(animal.length()<2 || dish.length()<2 || animal.contains("-")|| dish.contains("-")){
         return false;
        }
       animal =animal.toLowerCase().trim();
        dish = dish.toLowerCase().trim();
        char firstAnimalLetter = animal.charAt(0);
        char lastAnimalLetter = animal.charAt(animal.length()-1);

        return firstAnimalLetter == dish.charAt(0) && lastAnimalLetter == dish.charAt(dish.length()-1);
    }
}
