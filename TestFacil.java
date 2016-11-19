import java.util.ArrayList;

public class TestFacil {
	
	
	
	
	public static void main(String[] args)
	{ 
		//generamos objeto de la clase  DictadoFacil que generará los dictados para el nivel facil
		DictadoFacil df= new DictadoFacil();
		//creamos un arrayList de string que guardará la sucesion de notas del dictado
		//mandamos el número de notas que contendrá el dictado
		ArrayList<String> dictado=df.generaDictado(20);
		
		
		
	}
	

}
