package myfirstpackage;

public class MySecondClass{
	private int frstNum = 0;
	private int scndNum = 0;

	public int getMinimumNumber(){
		if(getFrstNum()<=getScndNum()) return getFrstNum();
		else return getScndNum();
	}

	public int getFrstNum() {
		return frstNum;
	}

	public int getScndNum() {
		return scndNum;
	}

	public void setFrstNum(int frstNum) {
		this.frstNum = frstNum;
	}

	public void setScndNum(int scndNum) {
		this.scndNum = scndNum;
	}

	public MySecondClass(int frstNum, int scndNum) {
		this.frstNum = frstNum;
		this.scndNum = scndNum;
	}
}