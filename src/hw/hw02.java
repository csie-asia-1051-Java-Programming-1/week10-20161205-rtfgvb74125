package hw;
/*
 * Topic: ���@�ا{���`�����C���٬� "18 �� "~ ���k���� : �ѥ|�ӻ�l���Y�A�u�n�䤤���� �ӬO�ۦP�I�A�~�}�l�p���I�ơA�I�ƧY���t����I�Ƭۥ[�A�Y�t��Ӥ]�@�ˡA�h���� �j���@�լۥ[�A�t�~���U�C�X�دS���p:
�Y�X 4 ����l�I�Ƨ��ۦP�A�٬��q�� !
���T���I�ƬۦP�Υ|���I�Ƨ����ۦP�A�Y���L�N�q ! �мg�@�{���A�U�O��J�|����l�I�ơA�P�_���G !

 * Date: 2016/12/05
 * Author: 105021056 ���a��
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		if(a==b && a==c && a==d && b==c && b==d && c==d ){
			System.out.println("�q��");
		}else if(a==b  && c==d){
			a = a*2;
			c = c*2;
			if(a>c){
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else if(a==c && b==d){
			a = a*2;
			b = b*2;
			if(a>b){
				System.out.println(a);
			}else{
				System.out.println(b);
			}
		}else if(a==d && c==b){
			a = a*2;
			c = c*2;
			if(a>c){
				System.out.println(a);
			}else{
				System.out.println(c);
			}
			
		}else{
			System.out.println("R");
		}
	}

}
