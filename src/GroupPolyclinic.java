import java.util.ArrayList;
import java.util.Comparator;

public class GroupPolyclinic {
    private int id; // Уникальный номер группы
    private ArrayList<Polyclinic> polyclinicList; // Список объектов Polyclinic

    // Конструктор по умолчанию
    public GroupPolyclinic() {
        this.id = 0;
        this.polyclinicList = new ArrayList<>();
    }

    // Конструктор с параметром
    public GroupPolyclinic(int id, ArrayList<Polyclinic> polyclinicList) {
        this.id = id;
        this.polyclinicList = polyclinicList;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Polyclinic> getPolyclinicList() {
        return polyclinicList;
    }

    public void setPolyclinicList(ArrayList<Polyclinic> polyclinicList) {
        this.polyclinicList = polyclinicList;
    }

    // Получение объекта из списка
    public Polyclinic getPolyclinic(int index) {
        return polyclinicList.get(index);
    }

    // Установка объекта в список
    public void setPolyclinic(int index, Polyclinic polyclinic) {
        polyclinicList.set(index, polyclinic);
    }

    // Добавление объекта
    public void addPolyclinic(Polyclinic polyclinic) {
        polyclinicList.add(polyclinic);
    }

    // Удаление объекта по фамилии пациента
    public void removePolyclinicByPatientLastName(String lastName) {
        polyclinicList.removeIf(p -> p.getPatientLastName().equals(lastName));
    }

    // Сортировка списка по фамилии пациента
    public void sortByPatientLastName() {
        polyclinicList.sort(Comparator.comparing(Polyclinic::getPatientLastName));
    }

    // Переопределение toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group ID: ").append(id).append("\n");
        for (Polyclinic p : polyclinicList) {
            sb.append(p).append("\n---------------------\n");
        }
        return sb.toString();
    }
}