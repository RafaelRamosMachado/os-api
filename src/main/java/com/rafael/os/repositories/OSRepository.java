package com.rafael.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.os.domain.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer>{

}
