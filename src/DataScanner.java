import java.util.Scanner;

public class DataScanner {

    DataTester dataTester = new DataTester();
    Scanner scanner = new Scanner(System.in);

    public String requestData() {

        System.out.println("Введите Фамилию, Имя, Отчество, дату рождения, номер телефона и пол" +
                " в произвольном порядке, разделённые пробелом:");

        String temporary = scanner.nextLine();

        try {
            dataTester.testInsertion(temporary);
        } catch (RuntimeException e) {
            System.out.println(e);
            requestData();
        }

        String data = temporary;

        return data;
    }
}
