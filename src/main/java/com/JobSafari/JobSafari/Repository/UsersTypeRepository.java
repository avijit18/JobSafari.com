package com.JobSafari.JobSafari.Repository;

import com.JobSafari.JobSafari.Entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
}
