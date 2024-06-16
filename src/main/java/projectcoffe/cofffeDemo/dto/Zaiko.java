package projectcoffe.cofffeDemo.dto;

public class Zaiko {
	
	private int zaikoCf1, zaikoCf2,zaikoCf3,zaikoCf4,zaikoCf5,
	zaikoCf6,zaikoMilk,zaikoHukuro,zaikoTisshu;
	
	public Zaiko() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void zaikohuyashi(HachuList hcl) {
		zaikoCf1 = zaikoCf1 + hcl.getCf1();
		this.zaikoCf2 = zaikoCf2 + hcl.getCf2();
		this.zaikoCf3 = zaikoCf3 + hcl.getCf3();
		this.zaikoCf4 = zaikoCf4 + hcl.getCf4();
		this.zaikoCf5 = zaikoCf5 + hcl.getCf5();
		this.zaikoCf6 = zaikoCf6 + hcl.getCf6();
		this.zaikoMilk = zaikoMilk + hcl.getMilk();
		this.zaikoHukuro = zaikoHukuro + hcl.getHukuro();
		this.zaikoTisshu = zaikoTisshu + hcl.getTisshu();
	}
	public int getZaikoCf1() {
		return zaikoCf1;
	}

	public void setZaikoCf1(int zaikoCf1) {
		this.zaikoCf1 = zaikoCf1;
	}

	public int getZaikoCf2() {
		return zaikoCf2;
	}

	public void setZaikoCf2(int zaikoCf2) {
		this.zaikoCf2 = zaikoCf2;
	}

	public int getZaikoCf3() {
		return zaikoCf3;
	}

	public void setZaikoCf3(int zaikoCf3) {
		this.zaikoCf3 = zaikoCf3;
	}

	public int getZaikoCf4() {
		return zaikoCf4;
	}

	public void setZaikoCf4(int zaikoCf4) {
		this.zaikoCf4 = zaikoCf4;
	}

	public int getZaikoCf5() {
		return zaikoCf5;
	}

	public void setZaikoCf5(int zaikoCf5) {
		this.zaikoCf5 = zaikoCf5;
	}

	public int getZaikoCf6() {
		return zaikoCf6;
	}

	public void setZaikoCf6(int zaikoCf6) {
		this.zaikoCf6 = zaikoCf6;
	}

	public int getZaikoMilk() {
		return zaikoMilk;
	}

	public void setZaikoMilk(int zaikoMilk) {
		this.zaikoMilk = zaikoMilk;
	}

	public int getZaikoHukuro() {
		return zaikoHukuro;
	}

	public void setZaikoHukuro(int zaikoHukuro) {
		this.zaikoHukuro = zaikoHukuro;
	}

	public int getZaikoTisshu() {
		return zaikoTisshu;
	}

	public void setZaikoTisshu(int zaikoTisshu) {
		this.zaikoTisshu = zaikoTisshu;
	}
	
}
