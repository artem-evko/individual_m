import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner it = new Scanner(System.in);
        CarPark cp = new CarPark();
        System.out.println("Введите количество машин в автопарке");
        int n = it.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите производителя автомобиля");
            String manf = sc.nextLine();
            System.out.println("Введите марку автомобиля");
            String mark = sc.nextLine();
            System.out.println("Введите гос.номер автомобиля(Формат X000XX)");
            String gosn = sc.nextLine();
            Car cr = new Car(manf,mark,gosn);
            cp.add(cr);
        }
        System.out.println("Какую машину удалить из списка автопарка?");
        String d = sc.nextLine();
        cp.del(d);
        System.out.println("Список машин в автопарке после удаления");
        cp.print();
        cp.sortByManufacture();
        System.out.println("Отсортировали по производителю");
        cp.print();
        cp.sortByMark();
        System.out.println("Отсортировали по марке");
        cp.print();
        System.out.println("Введите гос.номер по которому хотите найти автомобиль");
        String p = sc.nextLine();
        cp.search(p);
    }
}