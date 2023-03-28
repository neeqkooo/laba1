import java.util.ArrayList;
import java.util.Scanner;

public class StringList {
    private ArrayList<String> stringList;

    public StringList() {
        stringList = new ArrayList<String>();
    }

    public void addString(String str) {
        stringList.add(str);
    }

    public ArrayList<String> getStringList() {
        return stringList;
    }

    public ArrayList<String> searchSubstrings(String substring) {
        ArrayList<String> result = new ArrayList<String>();
        for (String str : stringList) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringList stringList = new StringList();

// Заполняем список строками
        System.out.println("Введите список строк (для завершения ввода введите пустую строку):");
        String inputString = scanner.nextLine();
        while (!inputString.equals("")) {
            stringList.addString(inputString);
            inputString = scanner.nextLine();
        }

// Выводим на экран строки, содержащие заданную подстроку
        System.out.println("Введите подстроку для поиска:");
        String substring = scanner.nextLine();
        ArrayList<String> searchResult = stringList.searchSubstrings(substring);
        System.out.println("Результаты поиска:");
        for (String str : searchResult) {
            System.out.println(str);
        }
    }
}