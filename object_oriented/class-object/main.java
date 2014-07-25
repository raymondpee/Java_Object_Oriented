class Account{
	public Account(int x, int y){
		this.x=x;
		this.y=y;
		System.out.printf("%d\n",x);
	}
	public void addup(){
		x=x+1;
		System.out.printf("%d\n",x);
	}
	
	private int x,y;
}


class Main{
	public static void main(String args[]){
		Account a= new Account(10,2);
		a.addup();
	}
}
