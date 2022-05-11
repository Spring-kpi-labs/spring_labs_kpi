package rest.dao.implementations;

import rest.dao.interfaces.GroupDAO;
import rest.entity.Group;
import rest.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupDAOImpl implements GroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Group> getAllGroups() {
        Session session = sessionFactory.getCurrentSession();
        List<Group> allGroups = session
                .createQuery("select g from Group g", Group.class)
                .getResultList();

        return allGroups;
    }

    @Override
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
    }
}
