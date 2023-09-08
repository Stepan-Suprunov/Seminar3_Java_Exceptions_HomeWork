public class DataParcer {

    DataTester dataTester = new DataTester();
    DataScanner dataScanner = new DataScanner();

    public String[] parceData(String s) {

// Возвращает массив строк, по индексам:
// 0: Имя
// 1: Фамилия
// 2: Отчество
// 3: Датат рождения
// 4: Телефонный номер
// 5: Пол

        String[] arr = s.split(" ");

        String name = null;
        String surname = null;
        String patronymic = null;
        String birthDate = null;
        String phoneNumber = null;
        String gender = null;

        for (int i = 0; i < arr.length; i++) {
            String[] temporary = arr[i].split("");
            for (int j = 0; j < arr[i].length(); j++) {
                if (temporary[j].equals(".")) {
                    birthDate = arr[i];
                    arr[i] = "*";
                    break;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (isNumeric(arr[i])) {
                phoneNumber = arr[i];
                arr[i] = "*";
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("f") || arr[i].equals("m")) {
                gender = arr[i];
                arr[i] = "*";
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            if (arr[i].equals("*")) flag = true;
            if (!flag) {
                surname = arr[i];
                arr[i] = "*";
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            if (arr[i].equals("*")) flag = true;
            if (!flag) {
                name = arr[i];
                arr[i] = "*";
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            if (arr[i].equals("*")) flag = true;
            if (!flag) {
                patronymic = arr[i];
                arr[i] = "*";
                break;
            }
        }

        String[] finalDataArray = new String[]{name, surname, patronymic, birthDate, phoneNumber, gender};

        try {
            dataTester.testData(finalDataArray);
        } catch (RuntimeException e) {
            System.out.println(e);
            dataScanner.requestData();
        }

        return finalDataArray;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
