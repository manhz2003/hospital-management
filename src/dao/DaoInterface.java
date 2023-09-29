package dao;

import java.util.ArrayList;


public interface DaoInterface<T> {
    public int insert(T t);

    public int update(T t, int id);

    public int deleteById(int id);
    
    public void deleteAll();

    public ArrayList<T> selectAll();

    public T selectById(int id);
}
