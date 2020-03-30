package webupps.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webupps.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
