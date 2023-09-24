class MyFirstClass{
	public static void main(String [] s){
	MySecondClass mySecondClass = new MySecondClass(42,10);
	System.out.println(mySecondClass.getMinimumNumber());
	for (int i = 1; i <= 8; i++){
		for (int j = 1; j <= 8; j++){
			mySecondClass.setFrstNum(i);
			mySecondClass.setScndNum(j);
			System.out.print(mySecondClass.getMinimumNumber());
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
class MySecondClass{
	private int frstNum = 0;
	private int scndNum = 0;

	public MySecondClass(int frstNum, int scndNum) {
		this.frstNum = frstNum;
		this.scndNum = scndNum;
	}

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
}
