package ie.gmit.open;

import java.util.List;

public class PhoneSubscriber extends CommonSubscriber {

    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }
}
