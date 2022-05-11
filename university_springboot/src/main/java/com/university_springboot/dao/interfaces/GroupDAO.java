package com.university_springboot.dao.interfaces;

import com.university_springboot.entity.Group;

import java.util.List;

public interface GroupDAO {
    public List<Group> getAllGroups();

/*    public Group getGroup(int id);

    public void saveGroup(Group group);

    public void deleteGroup(int id);

    public List<Group> getFilteredGroupsByName(String name);*/
}
