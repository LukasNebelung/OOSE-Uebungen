
public class OrGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs){
		for(Component c : inputs){
			if(c.state) return true;
		}
		return false;
	}
}
