package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AccountingProcessed extends AbstractEvent {

    private String accountId;
    private String data;

    public AccountingProcessed(Accounting aggregate) {
        super(aggregate);
    }

    public AccountingProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
