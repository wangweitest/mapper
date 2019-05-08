package com.ww.service;

import java.util.List;
import tk.mybatis.mapper.entity.Condition;
public interface BaseService<T> {
	T save(T model);

	void save(List<T> models);

	void deleteById(Object id);

	void update(T model);

	T findById(Object id);

	T findBy(String fieldName, Object value);

	T findOne(T model);

	List<T> findByCondition(Condition condition);

	List<T> findAll();
}