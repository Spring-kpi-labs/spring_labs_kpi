package rest.service.interfaces;

import rest.entity.Group;

import java.util.List;

public interface GroupService {

    public List<Group> getAllGroups();

    public Group getGroup(int id);

    public void saveGroup(Group group);

    public void deleteGroup(int id);

    public List<Group> getFilteredGroupsByName(String name);
}
