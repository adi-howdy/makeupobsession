package swiki.mainapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swiki.mainapplication.model.FutureDate;

public interface FutureDateRepository extends JpaRepository<FutureDate, Integer>{

}
