package in.achintya.gatekeeper.management.DTO;




import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
@Setter
public class HealthResponse {

    private String serviceStatus;
    private String dbStatus;
    private LocalDateTime timestamp;
}