import java.io.*;
import java.util.Date;

public class Kadai2HowOldAreYou3{

		// 定数の定義
		public static final Date Dt = new Date();
		public static final int HOLDINGYEAR = 2025;
    public static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    public static final int YEAR = Dt.getYear() + 1900;

	public static void main(String[] args) {

		// 変数の定義
		int age = 0;

		try {
			System.out.println("How old are you ?");
      while(true){
    		// ターミナルから年齢を入力する/
				String input = IN.readLine();

    		// qまたは0の場合は、終了する
				if(input.equals("q")|| input.equals("0")){ System.exit(0); }
				age = Integer.parseInt(input);

    		// 120歳以上かチェックする
				if(age <= 120){ 
					System.out.println("You age is " + age);
					break;
				}

			System.out.println("No!!!");
      }
		}
		catch(IOException e) {
			System.out.println(e);
		}

    // 大阪万博開催される2025年の時の年齢
		int diff = HOLDINGYEAR - YEAR;
		int ageAt2025Year = age + diff;
		System.out.println("Your age in the year of the Osaka Expo is " + ageAt2025Year + " years old.");

    // 誕生年をを出力（令和・平成・昭和・大正・明治）
    // 1年の時は元年を優先させる
		int birthdayYear = YEAR - age;

		if(birthdayYear >= 2019){
			int jpYer = birthdayYear - 2018;
			if(jpYer == 1) { 
				System.out.println("the 1st year of Reiwa");
			}else{
				System.out.println("Reiwa " + jpYer + "th");
			}
		}else if(birthdayYear >= 1989){
			int jpYer = birthdayYear - 1988;
			System.out.println(jpYer == 1 ? "the 1st year of Heisei" : "Heisei " + jpYer + "th" );
		}else if(birthdayYear >= 1926){
			int jpYer = birthdayYear - 1925;
			System.out.println(jpYer == 1 ? "the 1st year of Showa" : "Showa " + jpYer + "th" );
		}else if(birthdayYear >= 1912){
			int jpYer = birthdayYear - 1911;
			System.out.println(jpYer == 1 ?  "the 1st year of Taisho" : "Taisho " + jpYer + "th" );
		}else{
			int jpYer = birthdayYear - 1868;
			System.out.println(jpYer == 1 ?  "the 1st year of Meiji" : "Meiji " + jpYer + "th" );
		}

		System.out.println("Good bye!");
	}
}