package pattern.composite;

import java.util.List;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Component> getChildren() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void dispaly(int level) {
		System.out.println(level + "-" + name);
	}

}
