package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "productSales",
    path = "productSales"
)
public interface ProductSaleRepository
    extends PagingAndSortingRepository<ProductSale, String> {}
