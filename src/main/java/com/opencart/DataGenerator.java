package com.opencart;

import com.github.javafaker.Faker;

public class DataGenerator {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println("This is the name that was randomly generated: "+faker.name().firstName());
        System.out.println("This is the address that was randomly generated: "+faker.address().fullAddress());
        System.out.println("This is the country that was randomly generated: "+faker.country().name());
    }
}
