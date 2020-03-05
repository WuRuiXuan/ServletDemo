package com.study.demo;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {
	public void insert(Product p) throws SQLException;
	public void delete(int id) throws SQLException;
	public void update(Product p) throws SQLException;
	public Product findById(int id) throws SQLException;
	public List<Product> findAll() throws SQLException;
}
