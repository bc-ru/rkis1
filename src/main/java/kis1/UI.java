package kis1;

import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.out;
// import java.io.PrintStream;
// import java.io.UnsupportedEncodingException;

/**
 * User Interface Class
 */
public class UI {

    public static void menu() {
        ArrayList<Ship> ships = new ArrayList<Ship>();

        int choice;
        do {
            menuOutput();
            choice = Input.naturalIntInput();
            switch (choice) {
                case 1:
                    int classType = getClassType();
                    ships.add(classCreater(classType));
                    break;
                case 2:
                    if (ships.size() == 0) {
                        System.err.println("Сначала нужно добавить элементы");
                        break;
                    }
                    System.out.println("Введите порядковый индекс элемента");
                    choice = Input.naturalIntInput();
                    if (choice > ships.size() || choice < 1) {
                        System.err.println("Выбран несуществующий индекс");
                        break;
                    }
                    ships.remove(choice - 1);
                    successMessage();
                    break;
                case 3:
                    if (ships.size() == 0) {
                        System.err.println("Сначала нужно добавить элементы");
                        break;
                    }
                    for (int i = 0; i < ships.size(); i++) {
                        System.out.println("№ " + (i + 1));
                        System.out.println(ships.get(i).toString());
                        // PrintStream ps;
                        // try {
                        //     ps = new PrintStream(System.out, true, "UTF-8");
                        //     ps.println(ships.get(i).toString());
                        // } catch (UnsupportedEncodingException e) {
                        //     // TODO Auto-generated catch block
                        //     e.printStackTrace();
                        // }
                    }
                    successMessage();
                    break;
                case 4:
                    if (ships.size() == 0) {
                        System.err.println("Сначала нужно добавить элементы");
                        break;
                    }
                    System.out.println("Введите порядковый индекс элемента");
                    choice = Input.naturalIntInput();
                    if (choice > ships.size() || choice < 1) {
                        System.err.println("Выбран несуществующий индекс");
                        break;
                    }
                    Ship obj1 = ships.get(choice - 1);
                    System.out.println("Введите порядковый индекс второго элемента\n");
                    choice = Input.naturalIntInput();
                    if (choice > ships.size() || choice < 1) {
                        System.err.println("Выбран несуществующий индекс");
                        break;
                    }
                    Ship obj2 = ships.get(choice - 1);

                    out.println(obj1.equals(obj2));
                    out.println("\n");
                    break;
                case 5:
                    menuOutput();
                    break;
                default:
                    if (choice != 6) {
                        System.err.println("Использована неизвестная команда");
                    }
            }
        } while (choice != 6);

        out.println("Спасибо за использование!");
    }

    /**
     * Определяет, какой класс юзер хочет создать 
     * @return int
     */
    public static int getClassType() {
        out.print("""
                ______________________________
                Создать класс:
                0. Корабль
                1. Пароход
                2. Корвет
                3. Парусник
                ______________________________
                """);
        int num = Input.intInput();
        while (!(num >= 0 && num <= 3)) {
            out.println("В меню нет такого пункта.");
            num = Input.intInput();
        }
        return num;

    }

    /**
     * Выводит в консоль текст меню
     */
    public static void menuOutput() {

        String menu = ("""
                МЕНЮ:
                ______________________________
                Выберите пункт меню:
                1 - Добавить новый элемент
                2 - Удалить новый элемент
                3 - Показать все элементы
                4 - Сравнить два элемента
                5 - Меню
                6 - Выход
                ______________________________
                """);
        out.println(menu);
    }

    /**
     * Метод создаёт класс, собирает параметры для конструктора
     * @param classType
     * @return Ship
     */
    private static Ship classCreater(int classType) {
        Scanner in = new Scanner(System.in, "UTF-8");
        String name;
        String codeNumber;
        int yearMade;
        int capacity;
        int weight;
        System.out.println("Введите название: ");
        name = in.nextLine();
        System.out.println("Введите номер: ");
        codeNumber = in.nextLine();
        System.out.println("Введите год создания: ");
        yearMade = Input.naturalIntInput();
        System.out.println("Введите вместимость (чел.): ");
        capacity = Input.naturalIntInput();
        System.out.println("Введите вес (кг): ");
        weight = Input.naturalIntInput();
        switch (classType) {
            case 0:
                return new Ship(name, codeNumber, yearMade, weight, capacity);
            case 1:
                String captainName;
                int wheelDiameter;
                System.out.println("Введите имя капитана: ");
                captainName = in.nextLine();
                System.out.println("Введите диаметр гребного колеса (м): ");
                wheelDiameter = Input.naturalIntInput();
                return new Steamship(name, codeNumber, yearMade, weight, capacity, captainName, wheelDiameter);
            case 2:
                String captainName1;
                int numOfGuns;
                System.out.println("Введите имя капитана: ");
                captainName1 = in.nextLine();
                System.out.println("Введите количество орудий: ");
                numOfGuns = Input.naturalIntInput();
                return new Corvette(name, codeNumber, yearMade, weight, capacity, numOfGuns, captainName1);
            case 3:
                String sailColor;
                String captainName3;
                int durability;
                System.out.println("Введите цвет паруса: ");
                sailColor = in.nextLine();
                System.out.println("Введите имя капитана: ");
                captainName3 = in.nextLine();
                System.out.println("Введите срок эксплуатации (лет): ");
                durability = Input.naturalIntInput();
                return new Sailboat(name, codeNumber, yearMade, weight, capacity, captainName3, sailColor,
                        durability);

        }
        return new Ship(name, codeNumber, yearMade, weight, capacity);
    }

    private static void successMessage() {
        out.println("Успешно!");
    }

    public UI() {
        menu();
    }
}
