package ginfo.emi.ac.ma.repositories;

import ginfo.emi.ac.ma.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface CompteRepository extends JpaRepository<Compte, Long> {
    Optional<Compte> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Compte a " +
            "SET a.active = TRUE WHERE a.email = ?1")
    int enableUser(String email);


}
