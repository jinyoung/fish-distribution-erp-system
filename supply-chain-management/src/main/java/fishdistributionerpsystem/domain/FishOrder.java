package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.SupplyChainManagementApplication;
import fishdistributionerpsystem.domain.FishOrderPlaced;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FishOrder_table")
@Data
//<<< DDD / Aggregate Root
public class FishOrder {

    @Id
    private String orderId;

    private String fishId;

    private Integer quantity;

    private String orderStatus;

    @PostPersist
    public void onPostPersist() {
        FishOrderPlaced fishOrderPlaced = new FishOrderPlaced(this);
        fishOrderPlaced.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FishOrderRepository repository() {
        FishOrderRepository fishOrderRepository = SupplyChainManagementApplication.applicationContext.getBean(
            FishOrderRepository.class
        );
        return fishOrderRepository;
    }
}
//>>> DDD / Aggregate Root
