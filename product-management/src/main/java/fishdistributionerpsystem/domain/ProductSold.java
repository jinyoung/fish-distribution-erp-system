package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductSold extends AbstractEvent {

    private String saleId;
    private String productId;
    private Integer quantity;

    public ProductSold(ProductSale aggregate) {
        super(aggregate);
    }

    public ProductSold() {
        super();
    }
}
//>>> DDD / Domain Event
