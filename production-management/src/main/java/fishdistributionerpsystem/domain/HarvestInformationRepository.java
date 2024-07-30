package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "harvestInformations",
    path = "harvestInformations"
)
public interface HarvestInformationRepository
    extends PagingAndSortingRepository<HarvestInformation, String> {}
