public class NotGate extends Component {
    @Override
    public boolean function(java.util.ArrayList<Component> inputs) {
        return (inputs.get(0).state ? false : true);
    }
}
