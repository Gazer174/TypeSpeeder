package se.ju23.typespeeder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttemptRepo extends JpaRepository<Attempt, Integer> {

}
