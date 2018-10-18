package pattern.composite;

public class Client {

	public static void main(String[] args) {
		Component comp0 = new Composite("comp0");
		Component comp1 = new Composite("comp1");
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		
		comp0.add(comp1);
		comp0.add(leaf1);
		comp1.add(leaf2);
		
		comp0.dispaly(0);
	}

}
