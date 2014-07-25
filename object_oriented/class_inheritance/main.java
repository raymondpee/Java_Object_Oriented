class Math{
	public int addvalue;
}

class Andy extends Math{
	public int add(){
		addvalue=10;
		return addvalue;
	}
}

class Main{
	public static void main(String args[]){
		Andy andy =new Andy();
		int value= andy.add();
		System.out.printf("%d\n", value);
	}
}
