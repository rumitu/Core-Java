import java.util.ArrayList;
import java.util.List;

public class OperationTimes {
    public long startTime;
    public long finishTime;
    public List<Long> updateTimes;

    public OperationTimes(long startTime) {
        this.startTime = startTime;
        this.updateTimes = new ArrayList<Long>();
    }
}
