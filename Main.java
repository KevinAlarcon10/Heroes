
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
     
     System.out.println("El heroe es:"+iron_man.heroName+" y sus poderes son:"+iron_man.powers);
     
     Persona peter_parker = new Persona ();
     peter_parker.setName("Peter Parker");
     peter_parker.setEdad(22);
     peter_parker.setCity("New York");
     System.out.println(peter_parker.name+":"+peter_parker.edad+","+peter_parker.city);
     
     SuperHero spiderman = new SuperHero(peter_parker.name,peter_parker.edad);
     spiderman.heroName="Spiderman ";
     spiderman.powers= new String[] {"Telarañas","Golpear"};
     
     System.out.println("El heroe es:"+spiderman.heroName+" y sus poderes son:"+spiderman.powers);
     
     
     Persona max_eisenhard = new Persona ();
     max_eisenhard.setName("Max Eisenhard");
     max_eisenhard.setEdad(60);
     max_eisenhard.setCity("Krakoa");
     System.out.println(max_eisenhard.name+":"+max_eisenhard.edad+","+max_eisenhard.city);
     
     Villano magneto = new Villano(max_eisenhard.name,max_eisenhard.edad);
     magneto.villanoName="Magneto";
     magneto.powers= new String[] {"Super Magnetismo","Erupciones"};
     
     System.out.println("El villano es:"+magneto.villanoName+" y sus poderes son:"+magneto.powers);
     
     Persona nathaniel_richards = new Persona ();
     nathaniel_richards.setName("Nathaniel Richards");
     nathaniel_richards.setEdad(34);
     nathaniel_richards.setCity("Cronópolis");
     System.out.println(nathaniel_richards.name+":"+nathaniel_richards.edad+","+nathaniel_richards.city);
     
     Villano kang = new Villano(nathaniel_richards.name,nathaniel_richards.edad);
     kang.villanoName="Kang";
     kang.powers= new String[] {"Controlar el tiempo","Viajar en el tiempo"};
     
     System.out.println("El villano es:"+kang.villanoName+" y sus poderes son:"+kang.powers);
     
     	}

}
