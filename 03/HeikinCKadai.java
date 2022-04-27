import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class HeikinCKadai {
  public static final int N = 100;
	public static final Random random = new Random();

	public static void main(String[] args){
		ArrayList<Integer> passes = new ArrayList<>();
		ArrayList<Integer> scores = new ArrayList<>();
		int scoreSum = 0;

		// 100人の生徒の先生の作成 & 100人分の合計
		for(int i=0; i<N; i++){
			int score = random.nextInt(100);
			scores.add(score);
			scoreSum += score;
		}

		// 平均
		int avaScore = scoreSum/scores.size();
		System.out.println("平均点は" + avaScore);

		// 80点以上のスコア
		for(int score: scores){
			if(score >= 80){
				passes.add(score);
			}
		}

		// 合格点の表示 & ソートする
		Collections.sort(passes);
		System.out.println("以下合格者の点数です");
		for(int score: passes){
			System.out.println(score);
		}
		
	}
}