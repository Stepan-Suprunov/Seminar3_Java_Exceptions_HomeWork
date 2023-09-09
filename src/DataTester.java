public class DataTester {

    public void testInsertion(String s) {

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

    public void testData(String[] data) {

        String[] dateArr = data[3].split("\\.");
        int day = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int year = Integer.parseInt(dateArr[2]);

        if (day > 31 || day < 1) {
            throw new IncorrectBirthDayException("Неверно указан день рождения.");
        }
        if (month > 12 || month < 1) {
            throw new IncorrectBirthMonthException("Неверно указан месяц рождения.");
        }
        if (year > 2023 || year < 1900) {
            throw new IncorrectBirthYearException("Неверно указан год рождения.");
        }

        if (data[5] == null) {
            throw new IncorrectGenderException("Неверно указан пол.");
        }
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

class IncorrectBirthDayException extends RuntimeException {
    public IncorrectBirthDayException(String message) {
        super(message);
    }
}

class IncorrectBirthMonthException extends RuntimeException {
    public IncorrectBirthMonthException(String message) {
        super(message);
    }
}

class IncorrectBirthYearException extends RuntimeException {
    public IncorrectBirthYearException(String message) {
        super(message);
    }
}

class IncorrectGenderException extends RuntimeException {
    public IncorrectGenderException(String message) {
        super(message);
    }
}
