package springbootkafkaconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootkafkaconsumer.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
