package com.university_springboot.dao.implementations;

import com.university_springboot.dao.interfaces.GroupDAO;
import com.university_springboot.entity.Group;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GroupDAOImpl implements GroupDAO {

    private EntityManager entityManager;

    @Override
    public List<Group> getAllGroups() {
        Session session = entityManager.unwrap(Session.class);
        List<Group> allGroups = session
                .createQuery("select g from Group g", Group.class)
                .getResultList();
        System.out.println("GROUPS COUNT: " + allGroups.size());
        return allGroups;
    }

    /*@Override
    public Group getGroup(int id) {
        Session session = sessionFactory.getCurrentSession();

        Group group = session.get(Group.class, id);
        return group;
    }

    @Override
    public void saveGroup(Group group) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(group);
    }

    @Override
    public void deleteGroup(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Student> query1 = session.createQuery("update Student set universityGroup = null " +
                "where universityGroup.id=:groupId");

        query1.setParameter("groupId", id);
        query1.executeUpdate();

        Query<Group> query2 = session.createQuery("delete from Group " +
                "where id=:groupId");

        query2.setParameter("groupId", id);
        query2.executeUpdate();
    }

    @Override
    public List<Group> getFilteredGroupsByName(String name) {
        Session session = sessionFactory.getCurrentSession();

        Query<Group> query = session.createQuery("select g from Group g " +
                "where g.name like :groupName");

        query.setString("groupName", "%" + name + "%");
        List<Group> filteredGroups = query.getResultList();

        return filteredGroups;
    }*/
}
