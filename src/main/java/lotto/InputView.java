package lotto;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String REQUEST_PURCHASE_MOUNT = "구입금액을 입력해 주세요.";
    private static final String PURCHASE_CONFIRM = "개를 구매했습니다.";
    private static final String REQUEST_WINNING_NUM = "당첨 번호를 입력해 주세요.";
    private static final String REQUEST_BONUS_NUM = "보너스 번호를 입력해 주세요.";
    private int purchaseAmount;

    public int purchaseLotto() {
        System.out.println(REQUEST_PURCHASE_MOUNT);
        purchaseAmount = Integer.parseInt(Console.readLine());

        return purchaseAmount;
    }

    private void showDrawAmount(int drawAmount) {
        System.out.println(drawAmount + PURCHASE_CONFIRM);
    }

    private String inputWinningNumber() {
        System.out.println(REQUEST_WINNING_NUM);
        return Console.readLine();
    }

    private String inputBonusNumber() {
        System.out.println(REQUEST_BONUS_NUM);
        return Console.readLine();
    }


}
