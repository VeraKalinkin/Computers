import java.util.*;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Lenovo", "серый", "Linux", 8, 15.6);
        Computer computer2 = new Computer("HUAWEI", "черный", "Windows11", 16, 16.0);
        Computer computer3 = new Computer("Irbis", "бежевый", "Windows10", 8, 17.3);
        Computer computer4 = new Computer("ASUS", "черный", "Windows11", 8, 14.0);
        Computer computer5 = new Computer("Thunderobot", "белый", "Windows11", 16, 16.0);
        Computer computer6 = new Computer("Thunderobot", "белый", "Windows11", 16, 16.0);

        Set<Computer> computers = new HashSet<>(Arrays.asList(computer1, computer2, computer3, computer4, computer5, computer6));

        for (Computer computer: computers)
            System.out.println(computer);

        while (true) {
            System.out.println();
            System.out.println("Введите команду: ");
            System.out.println("Поиск - 1");
            System.out.println("Выйти из программы - 2");
            Scanner scan = new Scanner(System.in);
            int question = scan.nextInt();
            if (question == 2)
                break;
            if (question == 1) {
                System.out.println("Выберете параметр поиска: ");
                System.out.println("Название бренда - 1");
                System.out.println("Цвет - 2");
                System.out.println("Операционная система - 3");
                System.out.println("Объем оперативной памяти - 4");
                System.out.println("Диагональ экрана - 5");
                int search = scan.nextInt();
                switch (search) {
                    case 1:
                        System.out.println("Введите название: ");
                        String brand = scan.next();
                        for (Computer computer : computers)
                            if (computer.getBrand().equals(brand))
                                System.out.println(computer);
                        break;
                    case 2:
                        System.out.println("Введите цвет: ");
                        String colour = scan.next().toLowerCase();
                        for (Computer computer : computers)
                            if (computer.getColour().equals(colour))
                                System.out.println(computer);
                        break;
                    case 3:
                        System.out.println("Введите название операционной системы: ");
                        String operatingSystem = scan.next();
                        for (Computer computer : computers)
                            if (computer.getOperatingSystem().contains(operatingSystem))
                                System.out.println(computer);
                        break;
                    case 4:
                        System.out.println("Введите минамальный объем оперативной памяти: ");
                        int RAM = scan.nextInt();
                        for (Computer computer : computers)
                            if (computer.getRandomAccessMemory() >= RAM)
                                System.out.println(computer);
                        break;
                    case 5:
                        System.out.println("Введите минимальную диагональ экрана: ");
                        double diagonal = scan.nextInt();
                        for (Computer computer : computers)
                            if (computer.getScreenDiagonal() >= diagonal)
                                System.out.println(computer);
                        break;
                }
            }
            if(question != 1 && question != 2)
                System.out.println("Некорректная команда");
        }


    }

}