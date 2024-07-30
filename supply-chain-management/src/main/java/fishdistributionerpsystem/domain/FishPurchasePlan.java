package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.SupplyChainManagementApplication;
import fishdistributionerpsystem.domain.FishPurchasePlanCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FishPurchasePlan_table")
@Data
//<<< DDD / Aggregate Root
public class FishPurchasePlan {

    @Id
    private String planId;

    @PostPersist
    public void onPostPersist() {
        FishPurchasePlanCreated fishPurchasePlanCreated = new FishPurchasePlanCreated(
            this
        );
        fishPurchasePlanCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FishPurchasePlanRepository repository() {
        FishPurchasePlanRepository fishPurchasePlanRepository = SupplyChainManagementApplication.applicationContext.getBean(
            FishPurchasePlanRepository.class
        );
        return fishPurchasePlanRepository;
    }
}
//>>> DDD / Aggregate Root
