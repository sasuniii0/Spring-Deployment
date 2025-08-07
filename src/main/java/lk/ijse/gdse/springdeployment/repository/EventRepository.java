package lk.ijse.gdse.springdeployment.repository;

import lk.ijse.gdse.springdeployment.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
