package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductOrderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProductOrder>> {

    @Override
    public EntityModel<ProductOrder> process(EntityModel<ProductOrder> model) {
        return model;
    }
}
