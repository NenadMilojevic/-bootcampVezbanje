package KlaseUcenje;

public class PolaznikKursa1 {
 
	public int idPolaznika; 
	public String imePolaznika; 
	public String prezimePolaznika; 
	public int godinaRodjenja; 
	public int prosekOcena; 
	
	public PolaznikKursa1(int id, String ime, String prezime, int godina, int prosek) {
		this.idPolaznika = id; 
		this.imePolaznika = ime; 
		this.prezimePolaznika = prezime; 
		this.godinaRodjenja = godina; 
		this.prosekOcena = prosek; 
		
	}
	public PolaznikKursa1() {
		
	}
	public void StampanjePodataka() {
		System.out.println("id plaznika je = " + idPolaznika + "\nime je: " + imePolaznika 
				+ "\nprezime polaznika je: " + prezimePolaznika +  "\ngodina rodjenja je : "  + godinaRodjenja + 
				"\n prosek je: " + prosekOcena);
		
		
	}
	
}
