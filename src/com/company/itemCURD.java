package com.company;

public interface itemCURD {
    public void insert(Object object);
    public Object select(String id);
    public void delect(String id);
    public void update(String id, int number);
}
