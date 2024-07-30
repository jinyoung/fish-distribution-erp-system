package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FishOrderPlaced extends AbstractEvent {

    private String orderId;
    private String fishId;
    private Integer quantity;
    private String orderStatus;

    public FishOrderPlaced(FishOrder aggregate) {
        super(aggregate);
    }

    public FishOrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
