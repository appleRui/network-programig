import java.io.*;
import java.util.Date;

public class Kadai2HowOldAreYou3{

	public static void main(String[] args) {

    // ターミナルから年齢を入力する/
    BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
		Date Dt = new Date();
    int YEAR = Dt.getYear() + 1900;
		int HOLDINGYEAR = 2025;
		int age = 0;
    
		try {
			System.out.println("How old are you ?");
      while(true){
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
			if(jpYer == 1) { System.out.println("the 1st year of Reiwa"); }
			System.out.println("Reiwa " + jpYer + "th");
		}else if(birthdayYear >= 1989){
			int jpYer = birthdayYear - 1988;
			if(jpYer == 1) { System.out.println("the 1st year of Heisei"); }
			System.out.println("Heisei " + jpYer + "th");
		}else if(birthdayYear >= 1926){
			int jpYer = birthdayYear - 1925;
			if(jpYer == 1) { System.out.println("the 1st year of Showa"); }
			System.out.println("Showa " + jpYer + "th");
		}else if(birthdayYear >= 1912){
			int jpYer = birthdayYear - 1911;
			if(jpYer == 1) { System.out.println("the 1st year of Taisho"); }
			System.out.println("Taisho " + jpYer + "th");
		}else{
			int jpYer = birthdayYear - 1868;
			if(jpYer == 1) { System.out.println("the 1st year of Heisei"); }
			System.out.println("Meiji " + jpYer + "th");
		}

		System.out.println("Good bye!");
	}
}