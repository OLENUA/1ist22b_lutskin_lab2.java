/*Варіант 8. Клас «Записна книжка»
        Створити структуру «ЗАПИС»:
        - прізвище;
        - номер телефону;
        - дата народження;
        - коментар.
        До закритих полів добавити:
        - об’єкт структури «ЗАПИС».
        До відкритих методів добавити:
        - функцію повертає дату народження;
        - функцію яка встановлює коментар через параметр.
        - функцію без параметрів. яка в дане-член коментар записує «немає
        коментарів».
        В конструкторі створити динамічний масив структур типу «ЗАПИС». В
        конструкторі зчитати дані з текстового файлу (крім коментаря) у масив структур.*/
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Record record = new Record("res\\as.txt");
            for (Record r : record.getRecords()) {
                System.out.println("Surname: " + r.getSurname());
                System.out.println("Phone number: " + r.getPhoneNumber());
                System.out.println("Birth date: " + r.retrieveBirthDate());
                System.out.println("Comment: " + r.getComment());
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
