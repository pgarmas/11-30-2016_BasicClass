/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicclass;

/**
 *
 * @author polina.garmas
 */
public class BasicClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human1; // Объявление объекта Вася типа Человек
        human1= new Human(); // Создание объекта 
        human1.name="Petr";
        human1.age = 18;
//        human1.talk();
//        human1.takeMoney(10.2f);
//        float z= human1.giveMoney(7.0f);
//        System.out.println(z);
//        
//        Human human2;
//        human2= new Human();
//        human2.name="Vasja";
//        human2.age= 20;
//        human2.talk();
//        human2.sayAge();
//        
//        
//        human2.buhat();
//        human2.buhat();
//        human2.talk();
//        
//        human1.study();
//        human1.study();
//        human1.talk();
        System.out.println("~~~~~~~~~~~~");
        Cat murzik = new Cat();
        murzik.name="Мурзик";
        System.out.println(murzik.name);
        System.out.println("~~~~~~~~~~~~");
        Cat mozart = new Cat();
        System.out.println(mozart.fur);
        System.out.println(mozart.getAge());
        System.out.println(mozart.name);
        System.out.println("~~~~~~~~~~~~");
        Cat buska = new Cat("Буська");
        System.out.println(buska.fur);
        System.out.println(buska.getAge());
        System.out.println(buska.name);
        
        human1.setCat(murzik);
        
        System.out.println(human1.personalCat.name);
    }
    
}
