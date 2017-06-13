import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nico on 13/06/17.
 */
public class TimeGate extends Component {
    @Override
    public boolean function(java.util.ArrayList<Component> inputs) {
        DateFormat df = new SimpleDateFormat("ss");
        Date date = new Date();
        int seconds = Integer.getInteger(df.format(date));
        return seconds % 2 == 0;
    }
}
