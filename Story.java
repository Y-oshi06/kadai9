import java.util.Scanner;
public class Story {

	public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        
        hero h = new hero();
		System.out.println("ヒーローの名前を入力してください:３文字以上１０文字以内で入力せよ\"");
		String name1 = scan1.nextLine();
		h.setName(name1);
		
		System.out.println("ヒーローの体力を入力してください");
		int hp1 = scan1.nextInt();
		h.setHp(hp1);
		
		System.out.println("ヒーローの守備力を入力してください");		
		int df1 = scan1.nextInt();
		h.setDf(df1);
		
		System.out.println("ヒーローの攻撃力を入力してください");		
		int at1 = scan1.nextInt();
		h.setAt(at1);

		System.out.println("名前:" + h.getName());
		System.out.println("体力:" + h.getHp());
		System.out.println("攻撃力:" + h.getAt());
		System.out.println("守備力:" + h.getDf());
		System.out.println(" ");
		
		//doragon
		Scanner scan2 = new Scanner(System.in);
		doragon d = new doragon();
		System.out.println("ドラゴンの名前を入力してください:３文字以上１０文字以内で入力せよ\"");
		String name2 = scan2.nextLine();
		d.setName(name2);
		
		System.out.println("ドラゴンの体力を入力してください");
		int hp2 = scan2.nextInt();
		d.setHp(hp2);
		
		System.out.println("ドラゴンの守備力を入力してください");		
		int df2 = scan2.nextInt();
		d.setDf(df2);
		
		System.out.println("ドラゴンの攻撃力を入力してください");		
		int at2 = scan2.nextInt();
		d.setAt(at2);
		
	
		System.out.println("名前:" +  d.getName());
		System.out.println("体力:" +  d.getHp());
		System.out.println("攻撃力:" + d.getAt());
		System.out.println("守備力:" + d.getDf());
		System.out.println(" ");
		
		//魔法使い
	
		Scanner scan3 = new Scanner(System.in);
		Magician m = new Magician();//勇者
		
		System.out.println("魔法使いの名前を入力してください:３文字以上１０文字以内で入力せよ");
		String name3 = scan3.nextLine();
		m.setName(name3);
		
		System.out.println("魔法使いの体力を入力してください");
		int hp3 = scan3.nextInt();
		m.setHp(hp3);
		
		System.out.println("魔法使いの守備力を入力してください");		
		int df3 = scan3.nextInt();
		m.setDf(df3);
		
		System.out.println("魔法使いの攻撃力を入力してください");		
		int at3 = scan3.nextInt();
		m.setAt(at3);
		
		System.out.println("魔法使いのMPを入力してください");		
		int mp3 = scan3.nextInt();
		m.setMp(mp3);
		
		System.out.println("魔法使いの回復力を入力してください");		
		int recovery3 = scan3.nextInt();
		m.setRecovery(recovery3);
		
		System.out.println("名前:" + m.getName());
		System.out.println("体力:" + m.getHp());
		System.out.println("攻撃力:" + m.getAt());
		System.out.println("守備力:" + m.getDf());
		System.out.println("MP:" + m.getMp());
		System.out.println("回復力:" + m.getRecovery());
		
		scan1.close();
		scan2.close();
		scan3.close();
		
		
		
	
		
				
	}
	

}
