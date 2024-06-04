package com.example.unittesting;

import lombok.Setter;


public class Mocking {
    User user;
    ApplicationDao applicationDao;

    public void setApplicationDao(ApplicationDao applicationDao) {
        this.applicationDao = applicationDao;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public int assignPermission() {
        if(user.getRole().equals("admin")) {
            String userName = user.getUserName();
            System.out.println("Assign special permissions for user " + userName);
            return 1;
        } else {
            String userName = user.getUserName();
            System.out.println("Cannot assign permission for user "+ userName);
            return -1;
        }
    }
    public int updateUsername(String id, String userName) throws Exception{
        ApplicationDao applicationDao = new ApplicationDao();
        User user = applicationDao.getUserById(id);
        if(user!=null)
            user.setUserName(userName);
        applicationDao.save(user);
        return 1;
    }
}
