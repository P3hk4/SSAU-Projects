import myfirstpackage.*;

class MyFirstClass{
	public static void main(String [] s){
	MySecondClass mySecondClass = new MySecondClass(42,10);
	System.out.println(mySecondClass.getMinimumNumber());
	for (int i = 1; i <= 8; i++){
		for (int j = 1; j <= 8; j++){
			mySecondClass.setFrstNum(i);
			mySecondClass.setScndNum(j);
			System.out.println(mySecondClass.getMinimumNumber());
			System.out.println("\n");
		}
		System.out.println();
	}
}
}

