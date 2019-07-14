package com.chuyu.dao.lmpl;

import com.chuyu.dao.UserDao;

import java.util.*;

public class UserDaoImpl implements UserDao {
    //复杂属性的注入
    private String[] myarr;
    private Map<String,String> mymap;
    private List<String> mylist;
    private Set<String> myset;
    private Properties mypro;

    public void setMypro(Properties mypro) {
        this.mypro = mypro;
    }

    public void setMyarr(String[] myarr) {
        this.myarr = myarr;
    }

    public void setMymap(Map<String, String> mymap) {
        this.mymap = mymap;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public void setMyset(Set<String> myset) {
        this.myset = myset;
    }

    public void saveUser() {
    System.out.println(myarr.toString());
    System.out.println(mylist);
    System.out.println(mymap);
    System.out.println(myset);
    System.out.println(mypro);

    }
}
