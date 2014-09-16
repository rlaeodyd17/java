package collection;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoEx {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//랜덤한 수를 저장하는 Set이 필요함
		//TreeSet은 중복을 허용하지 않고 정렬도 된다!
		
		Set lottoNums = new TreeSet();
		
		while(lottoNums.size() < 6){
			
			int num = ran.nextInt(45)+1;
			
			lottoNums.add(num);
		}
		
		System.out.println(lottoNums);
	}
}
