package com.springpractice.jpaFunsies.repository;

import com.springpractice.jpaFunsies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{

}
