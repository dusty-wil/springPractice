package com.springpractice.jpaFunsies.service;

import com.springpractice.jpaFunsies.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
/**
 * This is a DAO service, in order to implement persistence in this way,
 * the persistence methods need to be implemented, IE insert is implemented below.
 * Using JPARepository, it's not necessary to implement common methods like these
 */
public class UserService
{
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user)
    {
        entityManager.persist(user);
        return user.getId();
    }
}
