package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import static com.serenitydojo.Cat.usualFood;


public class WhenCreatingObjects {
    @Test
    public void creating_a_cat(){
        String name = "felix";
        String favoriteFood = "Tuna";
        int age = 5;

        Cat felix = new Cat("Felix","Tuna",4);
        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat("Spot","Salmon",3);
        System.out.println(spot.getName());
        System.out.println(spot.getFavoriteFood());

        Dog fido = new Dog("Fido","Bone",5);
        fido.makeNoise();
        // Pet hamster = new Pet("Rusty");


    }

    @Test
    public void creating_a_dog(){
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido","Bone",5);
        Assert.assertEquals(fido.getName(),"Fido");
        Assert.assertEquals(fido.getFavoriteToy(),"Bone");
        Assert.assertEquals(fido.getAge(),5);




    }
    @Test
    public void cat_makes_noise(){
        Cat felix = new Cat("Felix",4);
        Cat spot = new Cat("Spot","Salmon",3);

        System.out.println("Cats favorite food is " + usualFood());
        System.out.println("felix goes " + felix.makeNoise());
        spot.makeNoise();
        felix.feed("Tuna");
        felix.groom();
    }
    public void creating_a_hampster(){
        Hampster rusty = new Hampster("Rusty","Wheel",1);

    }
    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido", "bone", 5);
        System.out.println("Fido goes " + fido.makeNoise());
    }
    @Test
    public void pets_make_noise(){
        Pet felix = new Cat("Felix",4);
        Pet fido = new Dog("Fido","Bone",5);
        Pet rusty = new Hampster("Rusty","wheel",1);

        System.out.println("felix goes " + felix.makeNoise());
        System.out.println("fido goes " + fido.makeNoise());
        System.out.println("rusty goes " + rusty.makeNoise());
    }
    @Test
    public void whenAnimalsPlay(){
        Pet fido = new Dog("Fido","Bone",5);
        Pet spot = new Cat("Spot", 4);
        Pet hazel = new Hampster("Hazel","Wheel",1);

        assertThat(fido.play(),equalTo("plays with bone"));
        assertThat(spot.play(),equalTo("plays with string"));
        assertThat(hazel.play(),equalTo("runs in wheel"));

    }


}