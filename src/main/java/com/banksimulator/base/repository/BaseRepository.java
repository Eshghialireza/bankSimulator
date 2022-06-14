package com.banksimulator.base.repository;
import com.banksimulator.base.domain.Base;
import java.io.Serializable;
import java.util.List;
public interface BaseRepository<ID extends Serializable,T extends Base<ID>> {
    T save(T t);
    void deleteById(ID id);
    List<T> findAll(T t);
    T findById(ID id);
    void beginTransaction();
    void commitTransaction();
    void roleBackTransaction();
}
