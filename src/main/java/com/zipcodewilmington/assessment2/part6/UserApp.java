package com.zipcodewilmington.assessment2.part6;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class UserApp {
    ConnectionSource connectionSource;

    public UserApp(ConnectionSource connectionSource) throws SQLException {
        this.connectionSource = connectionSource;
    }
    private Dao<User, Integer> accountDao;

    /**
     * Given a user, add it to the database. Return the id generated by the database.
     * @param user The user to be saved
     * @return id of the user returned from the database
     * @throws SQLException
     */
    public int create(User user) throws SQLException {
        return accountDao.create(user);
    }

    /**
     * Find the user in the database with the given id
     * @param id id of the user
     * @return The user associated with that id
     * @throws SQLException
     */
    public User findById(long id) throws SQLException {
        return null;
    }

    /**
     * Given a user id, find the user, and update the user name.
     * @param id id of the user
     * @param newName the user new name
     * @throws SQLException
     */
    public void updateName(long id, String newName) throws SQLException {
    }
}
