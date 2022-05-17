  
public class Proov {
	public static void main(String[] args){
		Printer<String> pr1 = new Printer<>("Prindi see tekst");
		pr1.prindi();

		Printer<Double> pr2 = new Printer<>(24.2);
		pr2.prindi();

		Printer<Integer> pr3 = new Printer<>(25000);
		pr3.prindi();

		System.out.println(pr1.kysiVaartus());
	}
}
