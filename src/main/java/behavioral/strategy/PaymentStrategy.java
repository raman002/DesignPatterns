package behavioral.strategy;

import java.util.Properties;

public interface PaymentStrategy<T> {

    void setPaymentProperties(Properties properties);
    void execute();
}
