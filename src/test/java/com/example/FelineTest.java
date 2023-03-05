package com.example;

import org.junit.Assert;
import org.junit.Test;



import java.util.List;

import static org.junit.Assert.*;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Error eatMeat",expected,actual);
    }


    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWhenReturnKittensCount() {
        assertEquals(2, feline.getKittens(2));
    }
}
