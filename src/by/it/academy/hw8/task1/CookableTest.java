package by.it.academy.hw8.task1;

public class CookableTest {
    public static void main(String[] args) {
        Food omelet = new Food();
        Cookable cookable = str -> System.out.println("Готовим " + str);
        omelet.prepare(cookable, "Омлет");
        System.out.println("""
                Взбейте яйца миксером. Сначала на маленькой скорости, потом — на максимальной.
                Добавьте молоко, соль, специи. Еще раз хорошо взбейте.
                Разогрейте хорошо сковороду. Смажьте растительным маслом.
                Влейте взбитую яичную массу. Готовьте на среднем огне 2-3 минуты.
                Готовое блюдо подавайте с измельченной зеленью.""");
    }
}
