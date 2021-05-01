package com.zup.orange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.orange.models.UserAdress;

@Repository
public interface AdressRepository extends JpaRepository<UserAdress, Long> {}
