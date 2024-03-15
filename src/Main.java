
public class Main {

	public static void main(String[] args) {
	
     Persona tony_stark = new Persona ();
     tony_stark.setName("Tony Stark");

     tony_stark.setEdad(35);
    
     tony_stark.setCity("New York");
     System.out.println(tony_stark.name+":"+tony_stark.edad+","+tony_stark.city);
     
     SuperHero iron_man = new SuperHero(tony_stark.name,tony_stark.edad);
     iron_man.heroName="Iron Man";
     iron_man.powers= new String[] {"volar","Pelear"};
     
     
     Persona majin_boo = new Persona ();
     majin_boo.setName("Majin Boo");
     majin_boo.setEdad(3);
     majin_boo.setCity("Tierra");
     
     System.out.println(majin_boo.name+":"+majin_boo.edad+","+majin_boo.city);
     
	}

}
