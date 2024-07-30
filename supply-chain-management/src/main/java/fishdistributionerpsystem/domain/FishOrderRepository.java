package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fishOrders",
    path = "fishOrders"
)
public interface FishOrderRepository
    extends PagingAndSortingRepository<FishOrder, String> {}
