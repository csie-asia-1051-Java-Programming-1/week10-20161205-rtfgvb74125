package hw;

/*
 * Topic: �Y���Ǯ��|��^���˩w����A�Y�O�ǥͳq�L�Ӵ���A�h��q�L���~���e�C�Ѯv�ǳƪ� �^����礤�����T�Ӷ��ط�@�ҸաA���O�Oť�O�B�\Ū�B�f���C�C�@�Ӷ��ش��纡�� �Ҭ� 100 ���A�`���� 300 ���C�Q�n�q�L���禳��ؤ覡�C�覡�@:�Y�O�T�Ӷ��ؤ� �ƬҬ� 60 ���H�W ( �]�t 60 �� ) �Y���q�L����C�覡�G:�Y�T�Ӷ��ؤ����䤤�@ �Ӷ��ؤ��ƥ��� 60 ���A���T�Ӷ��ؤ����`�X�W�L 220 ���A�]�i��q�L����C�Y�T �Ӷ��ؤ����䤤�@�Ӷ��ؤ��ƥ��� 60 ���A�ӤT�Ӷ��ؤ����`�X�]�S��W�L 220 ���A�i��o�ɦҾ��|�C�Y�O�T�Ӷ��ؤ�����Ӷ��ؤ��ή�A���t�@�Ӷ��ئ��Z���� 80 �� ( �]�t 80 �� ) �A�]�i��o�ɦҪ����|�C��l�ҧP�w���L�k�q�L����C
 ����: �Ĥ@�欰�@�Ӿ�� N �A�N��@�� N �մ��ո�ơC���ᦳ N ��A�C�@�榳 3 �ӫD �t��� ( �d��Ҭ� 0 �� 100), ���O�N��ӦW�ǥ�ť�O�B�\Ū�B�f����������ơC
 �Y�O�q�L����A�h��X ��P�� �C�Y�O�ݭn�ɦҡA�h��X ��M�� �C�Y�O�L�k�q�L����A �h��X ��F�� 

 * Date: 2016/12/05
 * Author: 105021056 ���a��
 */
import java.util.Scanner;
import java.util.ArrayList;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		ArrayList<String> count = new ArrayList<String>();
		int n = scn.nextInt();
		int sum = 0;
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < n; i++) {
			while (sum == 0) {
				a = scn.nextInt();// ť�O
				if (a <= 100 && a >= 0) {
					a = a;
					sum++;
				} else {
					System.out.println("�Э��s��J���Z");
				}
			}
			sum=0;
			while (sum == 0) {
				b = scn.nextInt();// �\Ū
				if (b <= 100 && b >= 0) {
					b = b;
					sum++;
				} else {
					System.out.println("�Э��s��J���Z");
				}
			}
			sum=0;
			while (sum == 0) {
				c = scn.nextInt();// �f��
				if (c <= 100 && c >= 0) {
					c = c;
					sum++;
				} else {
					System.out.println("�Э��s��J���Z");
				}
			}
			sum=0;
		
			// �W��P�_�O�_0~100
			int x = a + b + c;
			if (x >= 220) {
				count.add("P");
			} else if (((a >= 60 && b >= 60 && c < 60) && x >= 220)
					|| ((a >= 60 && b < 60 && c >= 60) && x >= 220)
					|| ((a < 60 && b >= 60 && c >= 60) && x >= 220)) {
				count.add("P");
			} else if (a >= 60 && b >= 60 && c >= 60) {
				count.add("P");
			} else if ((((a >= 60 && b >= 60 && c < 60) && x < 220)
					|| ((a >= 60 && b < 60 && c >= 60) && x < 220) || ((a < 60
					&& b >= 60 && c >= 60) && x < 220))) {
				count.add("M");
			} else if (a >= 80 && b < 60 && c < 60) {
				count.add("M");
			} else if (a < 60 && b >= 80 && c < 60) {
				count.add("M");
			} else if (a < 60 && b < 60 && c >= 80) {
				count.add("M");
			} else {
				count.add("F");
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(count.get(i));
		}
		System.out.println();
	}
}
