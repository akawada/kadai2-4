import java.util.Scanner;

public class kadai2_4 {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		Integer num=0;
		// ���͂̌J��Ԃ�

		while (true) {
			System.out.println("1~100�̐��l����͂��Ă��������B");				
			strin = scan.next();
			// ���l�`�F�b�N
			if (chknum(strin) == false){
				System.err.println("�s���Ȑ��l�ł��B������x���͂��Ă��������B");				
			}
			else{
				num = Integer.parseInt(strin);
				for (int i = 1; i <= num; i++){
					
					if(i%15==0){
					//3��5�̔{��
						System.out.println("FizzBuzz");
					}
					else if(i%5==0){
					//5�̔{��
						System.out.println("Fizz");
					}
					else if(i%3==0){
					//3�̔{��
						System.out.println("Buzz");
					}
					else{
					//����
						System.out.println(i);
					}
				}
				scan.close();
				break;
			}
	}
}
	// ���l�`�F�b�N
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
