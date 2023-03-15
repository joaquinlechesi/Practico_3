package Practico_3;

public class Practico_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1_apartado_a
		/*
		String string= "Alvaro Joaquin Lechesi";
		String minusculas = string.toLowerCase();
		char letra[]= {'a'};
		
		int cantidad=0;
		
		for(int indice=0 ; indice<string.length() ; indice++) {
			if(minusculas.charAt(indice)==letra[0]) {
				cantidad++;
			}
		}
		System.out.println(cantidad);
		*/
		
		//1_apartado_b
		/*
		int num1=40, num2=7, num3=15;
		int ordenDecreciente[] = new int[3];
		boolean ordenCreciente = true;
		
		if(num1>num2) {
			if(num1>num3) {
				if(num2>num3) {
					ordenDecreciente[0] = num1;
					ordenDecreciente[1] = num2;
					ordenDecreciente[2] = num3;
				}else {
					ordenDecreciente[0] = num1;
					ordenDecreciente[1] = num3;
					ordenDecreciente[2] = num2;
				}
			}else {
				ordenDecreciente[0] = num3;
				ordenDecreciente[1] = num1;
				ordenDecreciente[2] = num2;
			}
		}else {
			if(num1>num3) {
				ordenDecreciente[0] = num2;
				ordenDecreciente[1] = num1;
				ordenDecreciente[2] = num3;
			}else {
				if(num3>num2) {
					ordenDecreciente[0] = num3;
					ordenDecreciente[1] = num2;
					ordenDecreciente[2] = num1;
				}else {
					ordenDecreciente[0] = num2;
					ordenDecreciente[1] = num3;
					ordenDecreciente[2] = num1;
				}
			}
		}
		if(ordenCreciente) {
			for(int indice=2;indice>=0;indice--) {
				System.out.println(ordenDecreciente[indice]);
			}
		}else {
			for(int indice=0;indice<ordenDecreciente.length;indice++) {
				System.out.println(ordenDecreciente[indice]);
			}
		}
		*/

		//1_apartado_c
		/*
		int vector[] = {4,76,89,10,6};
		int x=50, suma = 0;
		for(int indice1=0; indice1 < vector.length; indice1++) {
			if(vector[indice1]>x) {
				suma = suma + vector[indice1];
			}
		}
		System.out.print("La suma es:   "+suma);
		*/
		
		//2
		/*
		String listaNombres = "Jose Luis Marcos Esteban Leila Jorge Manuel Gaston Daniel Julieta";
		String[] listaNombreCantidad = listaNombres.split(" ");
		for (int indice=9;indice>=0;indice--) {
			System.out.println(listaNombreCantidad[indice]);
		}
		*/
	}
}