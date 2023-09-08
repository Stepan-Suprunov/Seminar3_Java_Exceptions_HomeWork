public class DataTester {

    public void testData(String s) {

        String[] arr = s.split("");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) count++;
        }

        if (count > 5)
            throw new MoreWhitespaceException("Вы ввели больше данных чем требуется.");
        if (count < 5)
            throw new LessWhitespaceException("Вы ввели меньше данных чем требуется.");
    }
}

class MoreWhitespaceException extends RuntimeException {
    public MoreWhitespaceException(String message) {
        super(message);
    }
}

class LessWhitespaceException extends RuntimeException {
    public LessWhitespaceException(String message) {
        super(message);
    }
}
