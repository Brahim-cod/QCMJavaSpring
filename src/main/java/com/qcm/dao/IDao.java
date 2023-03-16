package com.qcm.dao;

import java.util.List;

public interface IDao<T,ID> {
    T getByID(ID id);
    List<T> BD();
}

