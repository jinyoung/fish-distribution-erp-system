package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fishPurchasePlans",
    path = "fishPurchasePlans"
)
public interface FishPurchasePlanRepository
    extends PagingAndSortingRepository<FishPurchasePlan, String> {}
