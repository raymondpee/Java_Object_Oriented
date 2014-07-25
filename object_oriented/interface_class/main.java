interface Math{
	public int add();
}

class Andy implements Math{
	public int add(){
		return 10;
	}
}

class Bryan implements Math{
	public int add(){
		return 20;
	}
}

class Main{
	public static void main(String args[]){
		Andy andy =new Andy();
		Bryan bryan = new Bryan();
		int value= andy.add();
		System.out.printf("%d\n", value);
		value = bryan.add();
		System.out.printf("%d\n", value);
	}
}
