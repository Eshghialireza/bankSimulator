package com.banksimulator.base.repository.imple;

import com.banksimulator.base.domain.Base;
import com.banksimulator.base.repository.BaseRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class BaseRepositoryImpl <ID extends Serializable,T extends Base<ID>> implements BaseRepository<ID,T> {
    protected final EntityManager em;
    public Class<T> getClass;
    public BaseRepositoryImpl(EntityManager em, Class<T> getClass) {
        this.em = em;
    }
    @Override
    public T save(T t) {
            beginTransaction();
            if(t.getId()==null){
                em.persist(t);
            }else{
               t=em.merge(t);
            }
            return t;
    }

    @Override
    public void deleteById(ID id) {
          T t =findById(id);
          if(t!=null){
              em.remove(t);
          }
    }

    @Override
    public List<T> findAll(T t) {
        return em.createQuery(
                "select t from "+getClass.getSimpleName() +
                        " t",getClass).getResultList();
    }

    @Override
    public T findById(ID id) {
        return em.find(getClass,id);
    }

    @Override
    public void beginTransaction() {
if(!em.getTransaction().isActive()){
    em.getTransaction().begin();
}
    }

    @Override
    public void commitTransaction() {
em.getTransaction().commit();
    }

    @Override
    public void roleBackTransaction() {
em.getTransaction().rollback();
    }
}
