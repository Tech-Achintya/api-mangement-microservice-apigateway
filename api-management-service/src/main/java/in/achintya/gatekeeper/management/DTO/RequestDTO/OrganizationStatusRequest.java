package in.achintya.gatekeeper.management.DTO.RequestDTO;

import in.achintya.gatekeeper.management.Entity.OrganizationStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationStatusRequest {

    @NotNull
    private OrganizationStatus status;
}