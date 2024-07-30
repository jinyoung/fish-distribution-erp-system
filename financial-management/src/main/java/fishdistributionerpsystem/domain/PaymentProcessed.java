package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentProcessed extends AbstractEvent {

    private String paymentId;
    private String orderId;
    private Double amount;

    public PaymentProcessed(Payment aggregate) {
        super(aggregate);
    }

    public PaymentProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
