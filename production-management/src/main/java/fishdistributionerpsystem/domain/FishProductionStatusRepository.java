package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fishProductionStatuses",
    path = "fishProductionStatuses"
)
public interface FishProductionStatusRepository
    extends PagingAndSortingRepository<FishProductionStatus, String> {}
