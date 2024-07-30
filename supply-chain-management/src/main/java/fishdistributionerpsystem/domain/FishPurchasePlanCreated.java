package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FishPurchasePlanCreated extends AbstractEvent {

    private String planId;

    public FishPurchasePlanCreated(FishPurchasePlan aggregate) {
        super(aggregate);
    }

    public FishPurchasePlanCreated() {
        super();
    }
}
//>>> DDD / Domain Event
