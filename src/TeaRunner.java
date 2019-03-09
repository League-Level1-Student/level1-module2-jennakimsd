

public class TeaRunner {
public static void main(String[] args) {
	TeaBag passion= new TeaBag("Passion Fruit");
	passion.getFlavor();
	Kettle water= new Kettle();
	Kettle.Water teaWater=water.getWater();
	water.boil();
	Cup tea= new Cup();
	tea.makeTea(passion, teaWater);
}
}
