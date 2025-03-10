package com.project.FusionCart.repository;

import com.project.FusionCart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query("SELECT u ROM User u JOIN FETCH u.address a WHERE a.addressId = ?1")
    List<User> findByAddress(Long addressId);
    Optional<User> findByEmail(String email);
}
