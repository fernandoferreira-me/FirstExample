package br.edu.infnet.prof.fernandogferreira;

public class Fibonacci {
	
	public long fibo(int position){
		if(position < 2){
			return position;
		}
		return this.fibo(position - 1) + this.fibo(position - 2);
	}

	public static void main(String[] args) {
		// Test class printing the first 30 items in a
		// Fibonacci sequence
		// Example: 0 1 1 2 3 5 8
		Fibonacci fobj = new Fibonacci();
		for (int i=0; i <= 30; i ++){
			System.out.println("(" + i + "):" + fobj.fibo(i));
		}
		
	}

}
