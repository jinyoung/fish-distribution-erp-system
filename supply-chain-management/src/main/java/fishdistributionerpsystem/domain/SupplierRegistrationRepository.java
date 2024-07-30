package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "supplierRegistrations",
    path = "supplierRegistrations"
)
public interface SupplierRegistrationRepository
    extends PagingAndSortingRepository<SupplierRegistration, String> {}
