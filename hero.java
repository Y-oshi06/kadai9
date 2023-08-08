
public class hero {
	private String name;
	private int hp;
	private int at;
	private int df;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name.isEmpty()) {
			throw new IllegalArgumentException("名前がnullです");
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
	  
	
	public void attack(){//攻撃
		System.out.println(this.name + "の攻撃");
		System.out.println(this.name + "は" + at +"を相手に与えた" );
	}
	
	void defense() {//守備
		System.out.println(this.name + "は防御した");
	}
	
	void heal() {//回復
		System.out.println(this.name + "は休憩した");
		System.out.println(this.name + "のHPは10回復し" + this.hp + "になった");
	}

}
