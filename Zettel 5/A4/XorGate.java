
public class XorGate extends Component {
	@Override public boolean function (java.util.ArrayList<Component> inputs){
		if(inputs.size() != 2) return false;
		if(inputs.get(0) != inputs.get(1)) return true;
		return false;
	}
}
