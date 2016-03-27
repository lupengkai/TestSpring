package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("user saved");
    }


    private Set<String> sets;
    private List<String> lists;
    private Map<String, String> maps;


    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }


    @Override
    public String toString() {
        return "UserDAOImpl{" +
                "sets=" + sets +
                ", lists=" + lists +
                ", maps=" + maps +
                '}';
    }
}
