package view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static int setMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();

    }

    public static String setWinner() {
        scanner.nextLine();
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        return scanner.nextLine();
    }

}