import java.util.ArrayList;

public class Nota {
	
	private String name;
	private ArrayList<Nota> notasPosibles;
	
	
	Nota(String name)
	{
		this.name=name;
		this.notasPosibles= new ArrayList<Nota>();
	}
	
	public void notasPosibles(Nota...notasPosibles)
	{
		
		this.notasPosibles= new ArrayList<Nota>();
		
		System.out.println("tamaño del Array notas Posibles: "+notasPosibles.length+ " de la nota "+this.name);
		for(int i=0;i<notasPosibles.length;i++)
		{ this.notasPosibles.add(notasPosibles[i]);
		   System.out.println("Agregando Nota Posible:"+ notasPosibles[i].name+" a nota "+this.name);
		}
		System.out.println("notas Posibles Agregadas con Exito");
		
	}
	
	public Nota eligeNotaSiguiente()
	{
		int aux=(int)Math.random()*notasPosibles.size();
		
		System.out.println("Agregando nota: "+this.notasPosibles.get(aux)+" al dictado");
		return(notasPosibles.remove(aux));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
