package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FishProductionPlanCreated extends AbstractEvent {

    private String planId;

    public FishProductionPlanCreated(FishProductionPlan aggregate) {
        super(aggregate);
    }

    public FishProductionPlanCreated() {
        super();
    }
}
//>>> DDD / Domain Event
