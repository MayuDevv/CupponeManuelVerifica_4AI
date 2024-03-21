
/**
 * 
 * @author <b>CupponeManuel</b>
 * <dl>4AI</dl>
 * <i>21/03/2024</i>
 * @version 2
 */

public class CupponeManuelClass {


	/**
	 * @param Metodo Costruttore
	 */
	public CupponeManuelClass() {
		
	}
	
	/**
	 * 
	 * @param a
	 * @param e
	 * @param Prende come parametri 2 interi e calcola quanto vale il parametro1 elevato all parametro2
	 * @return
	 */
	
	public int cupponeMet(int a, int e) {
		int v=0; 
		for(int i=0; i<=e; i++)
			v+=a*a;
		return v;
	}
	
	public static void main(String[] args) {
		CupponeManuelClass a=new CupponeManuelClass();
		System.out.println(a.cupponeMet(8, 4));
	}
	
}
