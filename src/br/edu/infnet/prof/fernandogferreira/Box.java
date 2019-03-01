package br.edu.infnet.prof.fernandogferreira;

import java.util.Scanner;

public class Box {
	float depth, height, width;

	
	public void setDepth(float depth) {
		this.depth = depth;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	
	public float calculateVolume(){
		return this.depth * this.height * this.width;
	}

	public static void main(String[] args) {
		Box bobj = new Box();
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a largura da caixa?");
		float width = scan.nextFloat();
		bobj.setWidth(width);
		System.out.println("Usuario escolhou largura: " + width + " cm"  );
		System.out.println("Qual a altura da caixa?");
		float height = scan.nextFloat();
		bobj.setHeight(height);
		System.out.println("Usuario escolhou altura: " + height + " cm"  );
		System.out.println("Qual a profundidade da caixa?");
		float depth = scan.nextFloat();
		bobj.setDepth(depth);
		System.out.println("Usuario escolhou profundidade: " + depth + " cm"  );
		
		System.out.println("O volume da caixa eh " + bobj.calculateVolume() + "cm3" );
	}

}
