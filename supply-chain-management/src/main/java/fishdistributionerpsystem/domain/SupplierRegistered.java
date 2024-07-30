package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SupplierRegistered extends AbstractEvent {

    private String supplierId;
    private String supplierName;

    public SupplierRegistered(SupplierRegistration aggregate) {
        super(aggregate);
    }

    public SupplierRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
