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
public class Human {

    public String name;
    public int age;
    private float money;
    private int iq=100;
    public Cat personalCat;

    public void talk() {
        if (iq>=120) {
            System.out.println("Здравствуйте! Меня зовут " + name+"\n"
                    + "Как вам новая постановка Шекспира?");
        }
        if (iq>=100&&iq<120) {
            System.out.println("Привет! Меня зовут " + name+"\n"
                    + "Как вам новости?");
        }
        if (iq>=80&&iq<100) {
            System.out.println("Привет! Меня зовут " + name+"\n"
                    + "Видел новых трансформеров?");
        }
        if (iq>=40&&iq<80) {
            System.out.println("Здарова! Я " + name+"\n"
                    + "Махнемся в картишки?");
        }
        if (iq<40) {
            System.out.println("Здравствуй, яблоко!");
        }
    }
    
    public void study() {
        System.out.println(name+" занимался весь день и выглядит поумневшим.");
        iq+=10; //iq=iq+10;
    }
    
    public void buhat(){
        System.out.println(name+" бухал всю ночь. И что то в голове не очень.");
        iq-=10;
    }
    

    public void takeMoney(float summ) {
        money = money + summ;
        System.out.println(name + " кладет в карман " + summ + "$");
    }

    public float giveMoney(float summ) {
        if (summ > money) {
            System.out.println("Извини, нет столько :(");
            return 0;
        } else {
            if (summ > money / 2) {
                float r = money / 2;
                System.out.println("Сегодня я дам тольо" + r + ". Остальное потом.");
                money = money - r;
                return r;
            } else {
                System.out.println("Конечно! Для тебя всегда найдётся " + summ + "$");
                money = money - summ;
                return summ;
            }
        }
    }

    public void sayAge() {
        System.out.println("Мне " + age + " лет.");
    }
    
    public void setCat(Cat kitty)
    {
        this.personalCat=kitty;
        System.out.println(name+" взял к себе домой котика по имени "+ kitty.name);
    }


}
