public class DataParcer {

    public void parceData(String s) {

        String[] arr = s.split(" ");
        String[] name = new String[0];
        String[] surname = new String[0];
        String[] patronymic = new String[0];
        String[] birthDate = new String[0];
        String[] phoneNumber = new String[0];
        String[] gender = new String[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i][j].equals(".")) birthDate = arr[i];
            }
        }
    }
}
