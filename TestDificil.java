import java.util.ArrayList;

public class TestDificil {
	
	
	
	
	public static void main(String[] args)
	{ 
		//generamos objeto de la clase  DictadoFacil que generará los dictados para el nivel facil
		DictadoDificil df= new DictadoDificil();
		//creamos un arrayList de string que guardará la sucesion de notas del dictado
		//mandamos el número de notas que contendrá el dictado
		
		ArrayList<String> dictado;
		
		
		dictado=df.generaDictado(20);
		int index=0;
		System.out.println("");
		while(index<dictado.size())
		{
			
			System.out.print(dictado.get(index)+",");
			index++;
		}
		
		
	}
	

}
