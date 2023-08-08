
public class Magician {
	
	private String name;
	
	private int hp;//体力
	private int at;//攻撃力
	private int df;//防御力
	private int MP;//魔法
	private int recovery;//回復力
	//名前
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name.isEmpty()) {
			throw new IllegalArgumentException("文字数が適切ではありません");
		}else if(0 < name.length() && name.length() < 3) {
			throw new IllegalArgumentException("文字数が適切ではありません");
		}else if(name.length() > 10) {
			throw new IllegalArgumentException("文字数が適切ではありません");
		}
		this.name = name;
		
	}
	//HP
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(Math.signum(hp) == -1) {
			hp = 0 ;
		}
		this.hp = hp;
	}
	//攻撃力
	public int getAt() {
		return this.at;
	}
	public void setAt(int at) {
		if(Math.signum(at) == -1) {
			at = 0 ;
		}
		this.at = at;
	}
	//防御力
	public int getDf() {
		return this.df;
	}
	public void setDf(int df) {
		if(Math.signum(df) == -1) {
			df = 0 ;
		}
		this.df = df;
	}
	//MP
	public int getMp() {
		return this.MP;
	}
	public void setMp(int mp) {
		if(Math.signum(mp) == -1) {
			mp = 0 ;
		}
		this.MP = mp;
	}
	//回復力
	public int getRecovery() {
		return this.recovery;
	}
	public void setRecovery(int recovery) {
		if(Math.signum(recovery) == -1) {
			recovery = 0 ;
		}
		this.recovery = recovery;
	}
	public void atack() {//攻撃
		System.out.println(this.name + "の攻撃");
		System.out.println(this.name + "は" + this.at +"を相手に与えた");
	}
	public void defense() {//防御
		System.out.println(this.name + "は防御した");
	}
	public void wizard_attack() {//攻撃魔法
		System.out.println(this.name + "の魔法攻撃");
		System.out.println(this.name + "は" + this.at * 2 + "を相手に与えた");
		System.out.println("MPを5消費した");
		this.MP -= 5;
		System.out.println("MPは"+ MP + "になった");
	}
	public void wizard_recovery() {//回復魔法
		System.out.println(this.name + "は回復魔法を使った");
		System.out.println(this.name + "は" + this.recovery + "を回復した");
		System.out.println("MPを3消費した");
		MP -= 3;
		System.out.println("MPは"+ this.MP +"になった");
		this.hp += recovery;
		System.out.println("体力は"+ this.hp + "になった");
		
		
	}
	public void heal() {//休憩
		System.out.println(this.name + "は休憩した");
		System.out.println(this.name + "のHPは10回復し" + this.hp + "になった");
	}

}
