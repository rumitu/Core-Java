import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeTracker {
    private Map<String, OperationTimes> operations = new HashMap<>();

    public void finish(String operation) {
        if (operations.containsKey(operation)) {
            Calendar calendar = Calendar.getInstance();
            operations.get(operation).finishTime = calendar.getTimeInMillis();
        }
    }

    public void getReport() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm dd-MM-YYYY");
        Date date;
        for (String operation : operations.keySet()) {
            OperationTimes operationTimes = operations.get(operation);
            if (operationTimes.finishTime != 0) {
                System.out.println(String.format("Operation %s took %d ms.", operation, operationTimes.finishTime
                        - operationTimes.startTime));
                date = new Date(operationTimes.startTime);
                System.out.println(String.format("%s %s", sdf.format(date), "started"));
                printUpdates(operationTimes);
                date = new Date(operationTimes.finishTime);
                System.out.println(String.format("%s %s", sdf.format(date), "finished"));
            } else {
                System.out.println(String.format("Operation %s not finished yet.", operation));
                date = new Date(operationTimes.startTime);
                System.out.println(String.format("%s %s", sdf.format(date), "started"));
                printUpdates(operationTimes);
            }
        }
    }

    private void printUpdates(OperationTimes operationTimes) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm dd-MM-YYYY");
        Date date;
        if (!operationTimes.updateTimes.isEmpty()) {
            for (Long time : operationTimes.updateTimes) {
                date = new Date(time);
                System.out.println(String.format("%s %s", sdf.format(date), "updated"));
            }
        }
    }

    public void start(String operation) {
        Calendar calendar = Calendar.getInstance();
        operations.put(operation, new OperationTimes(calendar.getTimeInMillis()));
    }

    public void update(String operation) {
        Calendar calendar = Calendar.getInstance();
        if (operations.containsKey(operation)) {
            operations.get(operation).updateTimes.add(calendar.getTimeInMillis());
        }
    }
}
