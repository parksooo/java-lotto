package lotto;

import java.util.Map;

public class PrintMessenger {
    public static void askPriceToBuy(){
        System.out.println("구입금액을 입력해 주세요.");
    }
    public static void volumeBuying(int volume){
        System.out.println(volume + "개를 구매했습니다.");
    }
    public static void askWinningNumber()
    {
        System.out.println("당첨 번호를 입력해 주세요.");
    }
    public static void askBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
    }
    public static void winningResult(Map<Integer, Integer> lottoResult)// list를 받을지 int를 받을지 고민;;
    {
        System.out.println("당첨 통계\n" + "---");
        System.out.println("3개 일치 (5,000원) -" + lottoResult.get(0) + "개");
        System.out.println("4개 일치 (50,000원) -"+ lottoResult.get(1) +"개");
        System.out.println("5개 일치 (1,500,000원) -"+ lottoResult.get(2) +"0개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) -"+ lottoResult.get(3) +"0개");
        System.out.println("6개 일치 (2,000,000,000원) -"+ lottoResult.get(4) +"0개");
    }
}
