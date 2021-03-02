package ud8_1;

public class PersonaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona();
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
		persona1.setNombre("Emma");
		persona1.setEdad(23);
		persona1.setSexo("SEXO");
		persona1.setAltura(1.63);
		persona1.setPeso(60);
		

		persona2.setAltura(1.63);
		persona2.setPeso(60);


		System.out.println(persona1);

	}

}
