package in.achintya.gatekeeper.management.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import in.achintya.gatekeeper.management.Entity.ManagementUser;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ManagementUserRepository extends JpaRepository<ManagementUser, Long> {

    Optional<ManagementUser> findByUsername(String username);

    Optional<ManagementUser> findByOrganizationId(Long organizationId);

    boolean existsByUsername(String username);

}