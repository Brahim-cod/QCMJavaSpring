package dao;

import java.util.List;
import java.util.Set;

public interface IDao<T,ID> {
    T getByID(ID id);
    List<T> BD();
}

