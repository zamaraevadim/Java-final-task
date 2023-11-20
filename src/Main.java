import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(16,1000,"Windows","White");
        Laptop laptop2 = new Laptop(32,500,"macOS","Black");
        Laptop laptop3 = new Laptop(16,2000,"Windows","Green");
        Laptop laptop4 = new Laptop(8,1500,"macOS","Blue");
        Laptop laptop5 = new Laptop(64,1000,"Windows","White");
        Laptop laptop6 = new Laptop(8,100,"macOS","White");
        ArrayList<Laptop> listLaptop = new ArrayList();
        listLaptop.add(laptop1);
        listLaptop.add(laptop2);
        listLaptop.add(laptop3);
        listLaptop.add(laptop4);
        listLaptop.add(laptop5);
        listLaptop.add(laptop6);
        filterLaptop(listLaptop);
    }
    public static void filterLaptop(ArrayList<Laptop> listLaptop){
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет");
        Scanner scanner = new Scanner(System.in);
        int criterion_number = Integer.parseInt(scanner.nextLine());

        ArrayList<Laptop> list = new ArrayList<>();
        switch (criterion_number){
            case 1:
                System.out.println("Введите объем ОЗУ");
                Scanner scanner1 = new Scanner(System.in);
                int num1 = Integer.parseInt(scanner.nextLine());
                for(Laptop el:listLaptop){
                    if(num1 == el.getRam()){
                        list.add(el);
                    }
                }
                break;
            case 2:
                System.out.println("Введите объем ЖД");
                Scanner scanner2 = new Scanner(System.in);
                int num2 = Integer.parseInt(scanner.nextLine());
                for(Laptop el:listLaptop){
                    if(num2 == el.getHDD()){
                        list.add(el);
                    }
                }
                break;
            case 3:
                System.out.println("Введите название ОС");
                Scanner scanner3 = new Scanner(System.in);
                String nameOS = scanner.nextLine();
                for(Laptop el:listLaptop){
                    if(nameOS.equals(el.getOS())){
                        list.add(el);
                    }
                }
                break;
            case 4:
                System.out.println("Введите цвет");
                Scanner scanner4 = new Scanner(System.in);
                String color = scanner.nextLine();
                for(Laptop el:listLaptop){
                    if(color.equals(el.getColor())){
                        list.add(el);
                    }
                }
                break;
        }
        for(Laptop el:list){
            System.out.println(el);
        }

    }
}
