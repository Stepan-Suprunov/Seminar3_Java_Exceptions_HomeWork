import java.util.Scanner;

public class DataScanner {

    DataTester dataTester = new DataTester();
    Scanner scanner = new Scanner(System.in);

    public String requestData() {
        System.out.println("Введите Фамилию, Имя, Отчество, дату рождения, номер телефона и пол" +
                " в произвольном порядке, разделённые прробелом:");
        String data = scanner.nextLine();

        try {
            dataTester.testData(data);
        } catch (RuntimeException e) {
            System.out.println(e);
            requestData();
        }

        return data;
    }
}
