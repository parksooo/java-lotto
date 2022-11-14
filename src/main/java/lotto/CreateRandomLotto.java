package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class CreateRandomLotto {
    public List<LottoPaper> randomLotto(long counts){
        List<LottoPaper> lottoPaper = new ArrayList<>();
        for(int i = 0; i < counts; i++){
            List<Integer> lotto = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            List<Integer> copyOfLotto = new ArrayList<>(lotto);
            Collections.sort(copyOfLotto);
            LottoPaper eachNumber = new LottoPaper();
            eachNumber.setLottoNumber(copyOfLotto);
            lottoPaper.add(eachNumber);
        }
        return lottoPaper;
    }
}
