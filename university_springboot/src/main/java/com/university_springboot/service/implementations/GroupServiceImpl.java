package com.university_springboot.service.implementations;

import com.university_springboot.dao.interfaces.GroupDAO;
import com.university_springboot.entity.Group;
import com.university_springboot.service.interfaces.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    private GroupDAO groupDao;

    @Autowired
    public GroupServiceImpl(GroupDAO groupDao) {
        this.groupDao = groupDao;
    }

    @Override
    @Transactional
    public List<Group> getAllGroups() {
        return groupDao.getAllGroups();
    }

   /* @Override
    @Transactional
    public Group getGroup(int id) {
        return groupDao.getGroup(id);
    }

    @Override
    @Transactional
    public void saveGroup(Group group) {
        groupDao.saveGroup(group);
    }

    @Override
    @Transactional
    public void deleteGroup(int id) {
        groupDao.deleteGroup(id);
    }

    @Override
    @Transactional
    public List<Group> getFilteredGroupsByName(String name) {
        return groupDao.getFilteredGroupsByName(name);
    }*/
}
