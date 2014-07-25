abstract class Math{
	public int method(){
		return 10;
	}
	abstract int abstractmethod();
}

class Andy extends Math{
	int abstractmethod(){
		int value=super.method();
		return value;
	}
}

class Main{
	public static void main(String args[]){
		Andy andy =new Andy();
		int value= andy.abstractmethod();
		System.out.printf("%d",value);
	}
}
