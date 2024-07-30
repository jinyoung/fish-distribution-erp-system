package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductSaleHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProductSale>> {

    @Override
    public EntityModel<ProductSale> process(EntityModel<ProductSale> model) {
        return model;
    }
}
