import java.util.ArrayList;

public class DictadoFacil {
	
	Nota b4,c5,d5,e5,f5,g5,a5,b5,c6,d6,e6,f6,g6;
	Nota[] notasPosibles;
	public DictadoFacil()
	{
		notasPosibles= new Nota[13];
		notasPosibles[0]=b4=new Nota("b4");
		notasPosibles[1]=c5=new Nota("c5");
		notasPosibles[2]=d5= new Nota("d5");
		notasPosibles[3]=e5= new Nota("e5");
		notasPosibles[4]=f5= new Nota("f5");
		notasPosibles[5]=g5= new Nota("g5");
		notasPosibles[6]=a5= new Nota("a5");
		notasPosibles[7]=b5= new Nota("b5");
		notasPosibles[8]=c6= new Nota("c6");
		notasPosibles[9]=d6= new Nota("d6");
		notasPosibles[10]=e6= new Nota("e6");
		notasPosibles[11]=f6= new Nota("f6");
		notasPosibles[12]=g6= new Nota("g6");

		
	}
	
	
	public ArrayList<String> generaDictado(int numNotas)
	{
		ArrayList<Nota> dictado= new ArrayList<Nota>();
		ArrayList<String> dictadoNotaAString= new ArrayList<String>();
		b4.notasPosibles(c5);
		c5.notasPosibles(b4,d5);
		d5.notasPosibles(c5,e5);
		e5.notasPosibles(d5,f5);
		f5.notasPosibles(e5,g5);
		g5.notasPosibles(f5,a5);
		a5.notasPosibles(g5,b5);
		b5.notasPosibles(a5,c6);
		c6.notasPosibles(b5,d6);
		d6.notasPosibles(c6,e6);
		e6.notasPosibles(d6,f6);
		f6.notasPosibles(e6,g6);
		g6.notasPosibles(f6);
		
		
		
		return(dictadoNotaAString);
	}
	
	public Nota generaNotaInicial()
	{
		int aux=(int)Math.random()*12;
		return(notasPosibles[aux]);
	}

}
