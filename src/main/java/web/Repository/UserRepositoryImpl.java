package web.Repository;

import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        List<User> users = null;
//        users = entityManager.createQuery("FROM web.Model.User", User.class).getResultList();
//        users.forEach(user -> System.out.println(user.getFirstname()));
//        return users;
        return entityManager.createQuery("from web.Model.User", User.class).getResultList();
    }
}
