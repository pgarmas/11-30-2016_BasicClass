/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicclass;

/**
 *Котики это наше всё
 * @author polina.garmas
 */
public class Cat {
    public String name;
    public String fur;
    private int age;

    public int getAge() {
        return age;
    }

    /**
     * Создание дикого котика
     */
    public Cat() {
        String s= "Появился новый котэ и сказал мяу";
        System.out.println(s);
        this.age=0;
        this.fur="короткошерстная";
        this.name="без имени";
    }

    /**
     * Создание домашнего котика
     * @param name имя котика
     */
    public Cat(String name) {
        String s= "Появился новый котэ и сказал мяу";
        s+="\n При рождении котику дали имя "+name;
        System.out.println(s);
        this.name = name;
        this.fur="короткошерстная";
        this.age = 0;
    }
    
    
    
    
    
    public void makeVoice()
    {
        System.out.println("Mjau");
    }
}
