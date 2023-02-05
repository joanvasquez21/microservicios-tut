package com.usuario.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usuario.service.entidades.User;



@Repository
public interface UserRepository extends JpaRepository<User , Integer> {

}
