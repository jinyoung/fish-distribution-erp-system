package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ProductionManagementApplication;
import fishdistributionerpsystem.domain.FishProductionPlanCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FishProductionPlan_table")
@Data
//<<< DDD / Aggregate Root
public class FishProductionPlan {

    @Id
    private String planId;

    @PostPersist
    public void onPostPersist() {
        FishProductionPlanCreated fishProductionPlanCreated = new FishProductionPlanCreated(
            this
        );
        fishProductionPlanCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FishProductionPlanRepository repository() {
        FishProductionPlanRepository fishProductionPlanRepository = ProductionManagementApplication.applicationContext.getBean(
            FishProductionPlanRepository.class
        );
        return fishProductionPlanRepository;
    }
}
//>>> DDD / Aggregate Root
