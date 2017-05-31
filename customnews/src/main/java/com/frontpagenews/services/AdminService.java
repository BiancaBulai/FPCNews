package com.frontpagenews.services;

import com.frontpagenews.models.AdminModel;

public interface AdminService extends CrudService<AdminModel>{
    public boolean verifyAdmin (String username, String password);
    public AdminModel getByUsername(String username);
    public AdminModel getByUsernameAndPassword(String username, String password);
    public AdminModel getByToken(String token);
}