package pattern.composite;

import java.util.List;

public abstract class Component {
	
	protected String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract List<Component> getChildren();
	
	public abstract void dispaly(int level);

	@Override
	public String toString() {
		return "Component [name=" + name + "]";
	}

}
