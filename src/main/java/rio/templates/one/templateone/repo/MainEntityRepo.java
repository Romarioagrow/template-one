package rio.templates.one.templateone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainEntityRepo extends JpaRepository<MainEntityRepo, Long> {
}
