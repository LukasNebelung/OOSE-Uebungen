class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public int getAlter() {
		return alter;
	}
	public int getGehalt() {
		return gehalt;
	}
	public Angestellter (String v, String n, int a, int g){
		this.vorname = v;
		this.nachname = n;
		this.alter = a;
		this.gehalt =g;
	}

	public void altern(){
		this.alter += 1;
	}
	
	public void gehaltup (int g){
		this.gehalt +=g;
		}
}