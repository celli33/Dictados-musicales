import java.util.ArrayList;


//clase Nota que tiene dos atributos el nombre de la nota 
//y un arrayList que referencía a sus notas posibles
public class Nota {
	
	private String name;
	private ArrayList<Nota> notasPosibles;
	
	
	//constructor de la clase Nota que le da un nombre
	Nota(String name)
	{
		this.name=name;
		this.notasPosibles= new ArrayList<Nota>();
	}
	
	//metodo que agrega las notas posibles al objeto nota
	//recibe un Array de notas que contiene las notas a las que puede ir el objeto nota
	public void notasPosibles(Nota...notasPosibles)
	{
		//inicialicamos el array de notas posibles
		this.notasPosibles= new ArrayList<Nota>();
		
		System.out.println("tamaño del Array notas Posibles: "+notasPosibles.length+ " de la nota "+this.name);
		//hacemos un for segun el tamaño del array recibido para agregar las notas al array de notasPosibles
		for(int i=0;i<notasPosibles.length;i++)
		{ //agregamos la nota posible al arrayList
		   this.notasPosibles.add(notasPosibles[i]);
		   System.out.println("Agregando Nota Posible:"+ notasPosibles[i].name+" a nota "+this.name);
		}
		System.out.println("notas Posibles Agregadas con Exito");
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
