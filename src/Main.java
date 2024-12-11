import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание объектов Polyclinic
        Polyclinic p1 = new Polyclinic("Поликлиника №1", "ул. Ленина, 10", "Иванов", "12345",
                "10.12.2024", "Смирнов", "Терапевт", "ОРВИ");
        Polyclinic p2 = new Polyclinic("Поликлиника №2", "ул. Пушкина, 15", "Петров", "67890",
                "11.12.2024", "Кузнецов", "Хирург", "Перелом");

        // Создание группы
        ArrayList<Polyclinic> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        GroupPolyclinic group = new GroupPolyclinic(1, list);

        // Вывод информации
        System.out.println(group);

        // Сортировка по фамилии пациента
        group.sortByPatientLastName();
        System.out.println("После сортировки:");
        System.out.println(group);

        // Удаление пациента
        group.removePolyclinicByPatientLastName("Иванов");
        System.out.println("После удаления:");
        System.out.println(group);
    }
}