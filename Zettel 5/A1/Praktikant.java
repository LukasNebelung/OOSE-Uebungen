
public class Praktikant extends Angestellter {
	private int gehalt = 400;
	public Praktikant (String v, String n, int a){
		super(v,n,a,400);
	}
	@Override public void gehaltup(int g){
		
	}
	public int getGehalt() {
		return gehalt;
	}
	
}
