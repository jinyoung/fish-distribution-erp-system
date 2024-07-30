package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fishProductionPlans",
    path = "fishProductionPlans"
)
public interface FishProductionPlanRepository
    extends PagingAndSortingRepository<FishProductionPlan, String> {}
