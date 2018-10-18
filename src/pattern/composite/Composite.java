package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	List<Component> children = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public List<Component> getChildren() {
		return children;
	}

	@Override
	public void dispaly(int level) {
		System.out.println(level + "-" + name);
		for (Component component : children) {
			component.dispaly(level + 1);
		}
	}
	
}
