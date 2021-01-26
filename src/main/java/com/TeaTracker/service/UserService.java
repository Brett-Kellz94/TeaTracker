package com.TeaTracker.service;

import com.TeaTracker.pojos.User;
import com.TeaTracker.repo.UserRepo;

public interface UserService {

	public User readUser(String username);

    public boolean createUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUser(int userId);

    public void setUserDao(UserRepo userRepo);

    
}
