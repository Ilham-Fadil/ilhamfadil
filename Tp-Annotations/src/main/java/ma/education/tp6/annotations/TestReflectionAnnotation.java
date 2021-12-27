package ma.education.tp6.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = Calculatrice.class;
		Programmer programmer = (Programmer)c.getDeclaredAnnotation(Programmer.class);
		System.out.println(programmer.id()+":"+programmer.name());
		
		Class c1 = CalculatriceMath.class;
		Programmer programmer1 = (Programmer)c.getAnnotation(Programmer.class);
		System.out.println(programmer1.id()+":"+programmer1.name());

	}

}
