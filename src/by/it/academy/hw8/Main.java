package by.it.academy.hw8;


public class Main {
    public static void main(String[] args) { //task-1
        Food omelet = new Food("Омлет");
        omelet.prepare(() -> System.out.println("""
                Взбейте яйца миксером. Сначала на маленькой скорости, потом — на максимальной.
                Добавьте молоко, соль, специи. Еще раз хорошо взбейте.
                Разогрейте хорошо сковороду. Смажьте растительным маслом.
                Влейте взбитую яичную массу. Готовьте на среднем огне 2-3 минуты.
                Готовое блюдо подавайте с измельченной зеленью.
                """));
        System.out.println("-----------------------------------------------");

        User user = new User("FredRosser", "2424a123~111"); //task-2
        User.Query query1 = user.new Query();
        query1.printToLog();
        System.out.println("-----------------------------------------------");

        Hoodie hoodie = new Hoodie("RED", "L"); //task-3
        hoodie.ColorCheck();
        hoodie.SizeCheck();
        Sweater sweater = new Sweater("WHITE", "XL");
        sweater.ColorCheck();
        sweater.SizeCheck();
        Shoes shoes = new Shoes("GREEN", "SMALL");
        shoes.ColorCheck();
        shoes.SizeCheck();
        Sneakers sneakers = new Sneakers("ORANGE", "VERY SMALL");
        sneakers.ColorCheck();
        sneakers.SizeCheck();

    }
}
