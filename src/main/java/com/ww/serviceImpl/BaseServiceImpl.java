package com.ww.serviceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.ww.service.BaseService;

import tk.mybatis.mapper.common.Mapper;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
	
	@Autowired
	protected Mapper<T> mapper;
	private Class<T> modelClass;

	public BaseServiceImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.modelClass = (Class) pt.getActualTypeArguments()[0];
	}

	public T save(T model) {
		this.mapper.insertSelective(model);
		return model;
	}

	public void deleteById(Object id) {
		this.mapper.deleteByPrimaryKey(id);
	}

	public void update(T model) {
		this.mapper.updateByPrimaryKeySelective(model);
	}

	public T findById(Object id) {
		return this.mapper.selectByPrimaryKey(id);
	}

	public T findBy(String fieldName, Object value) {
		try {
			T model = this.modelClass.newInstance();
			Field field = this.modelClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(model, value);
			return this.mapper.selectOne(model);
		} catch (ReflectiveOperationException var5) {
			throw new RuntimeException("查询操作异常!");
		}
	}

	public T findOne(T model) {
		return this.mapper.selectOne(model);
	}

	public List<T> findAll() {
		return this.mapper.selectAll();
	}
}