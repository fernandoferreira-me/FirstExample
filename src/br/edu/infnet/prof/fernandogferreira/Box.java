package br.edu.infnet.prof.fernandogferreira;

import java.util.Scanner;
import java.util.InputMismatchException;
 
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
		return (this.depth * 
				this.height * 
				this.width);
	}
	
	public String formatVolume(float volume){
		return String.format("%.2f", volume);
	}

	public static void main(String[] args) {
		Box bobj = new Box();
		Scanner scan = new Scanner(System.in);
		float w = 0;
		// Box width
		System.out.println("Qual a largura da caixa?");
		try {
			w = scan.nextFloat();
			bobj.setWidth(w);
			System.out.println("Usuario escolhou largura: " + w + " m"  );
		} catch (InputMismatchException exception){
			System.out.println("O programa espera um numero valido" +
		                       " para a largura da caixa");
			scan.close();
			return;
		}
		// Box Height
		System.out.println("Qual a altura da caixa?");
		try {
			float h = scan.nextFloat();
			bobj.setHeight(h);
			System.out.println("Usuario escolhou altura: " + h + " m"  );
		} catch (InputMismatchException exception){
			System.out.println("O programa espera um numero valido" +
		                       " para a altura da caixa");
			scan.close();
			return;
		}
		// Box Depth
		try{
			System.out.println("Qual a profundidade da caixa?");
			float d = scan.nextFloat();
			bobj.setDepth(d);
		System.out.println("Usuario escolhou profundidade: " + d + " m"  );
		} catch (InputMismatchException exception){
			System.out.println("O programa espera um numero valido" +
							    " para a profundidade da caixa");
			scan.close();
			return;
		}
		
		System.out.println("O volume da caixa eh " 
		                   +  bobj.formatVolume(bobj.calculateVolume()) 
				           + " m3" );
		scan.close();
	}

}
