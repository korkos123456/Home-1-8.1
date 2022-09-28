import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // пишикод ваш код тут0
        System.out.println( isLeap(2020)? "висакосный год": "не висакосный год");
        System.out.println(generateInstallationMessage(1, 2020));
        System.out.println("Потребуется для доставки дней: " + printCalculateDelDays(10));
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        }

    }


    private static String generateInstallationMessage(int os, int productionYear) {
        if (!(os == 0 || os == 1)) {
            throw new RuntimeException("Устройство поддерживаемо устройство немедленно ");
        }
        var currentYear = LocalDate.now().getYear();

        String versionMessage = productionYear < currentYear ? "облегченную" : "";
        String osMassage = os == 0 ? "iSO" : "android";

        return String.format("Установить %s версию приложения для %s по ссылке %s", versionMessage, osMassage, fastMassage);

    }

    private static int printCalculateDelDays(int distance) {
        int start = 20;
        int step = 40;
        int result; // кол во дней
        if (distance >= start) {

        result = (Math.abs((distance - start) / step) + 2);
        }
        return result;

        }
    }











