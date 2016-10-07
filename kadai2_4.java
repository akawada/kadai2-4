import java.util.Scanner;

public class kadai2_4 {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		Integer num=0;
		// 入力の繰り返し

		while (true) {
			System.out.println("1~100の数値を入力してください。");				
			strin = scan.next();
			// 数値チェック
			if (chknum(strin) == false){
				System.err.println("不正な数値です。もう一度入力してください。");				
			}
			else{
				num = Integer.parseInt(strin);
				for (int i = 1; i <= num; i++){
					
					if(i%15==0){
					//3と5の倍数
						System.out.println("FizzBuzz");
					}
					else if(i%5==0){
					//5の倍数
						System.out.println("Fizz");
					}
					else if(i%3==0){
					//3の倍数
						System.out.println("Buzz");
					}
					else{
					//数字
						System.out.println(i);
					}
				}
				scan.close();
				break;
			}
	}
}
	// 数値チェック
	static boolean chknum(String numchk) {
		try {
			Integer.parseInt(numchk);
			if (Integer.parseInt(numchk) < 0){
				return false;
			}
			else if (Integer.parseInt(numchk) > 100){
				return false;
			}
			else{
					return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
