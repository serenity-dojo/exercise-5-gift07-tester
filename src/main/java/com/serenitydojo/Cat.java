package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteFood;
    private String favoriteToy;

    public static final String  CAT_SOUND = "meow";

    public static String usualFood(){
        return "Tuna";
    }
    public Cat(String name, int age){
        super(name,age);
        this.favoriteFood = usualFood();


    }
    public Cat(String name, int age,String favoriteToy) {
        super(name,age);
        this.favoriteToy = favoriteToy;
    }
    public Cat(String name, String favoriteFood, int age){
        super(name,age);
        this.favoriteFood = favoriteFood;


    }



    public String getFavoriteFood(){
        return favoriteFood;
    }
    public String getFavoriteToy(){
        return favoriteToy;
    }


    @Override
    public String makeNoise(){
        return CAT_SOUND;
    }


    public void feed(String food) {
        System.out.println(getName() + "eats " + food);
    }
    public void groom(){
        lickPaw();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + "cleans fur");
    }

    private void lickPaw() {
        System.out.println(getName() + "licks paw");
    }
    @Override
    public String play(){
        return "plays with string";

    }

}
