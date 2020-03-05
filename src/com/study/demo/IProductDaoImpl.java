package com.study.demo;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class IProductDaoImpl implements IProductDao {

	@Override
	public void insert(Product p) throws SQLException {
		String sql = "insert into product(name, price, nums, description) values(?, ?, ?, ?)";
		QueryRunner qr = new QueryRunner();
		qr.update(MyDbUtils.getConnection(), sql, p.getName(), p.getPrice(), p.getNums(), p.getDescription());
	}

	@Override
	public void delete(int id) throws SQLException {
		String sql = "delete from product where pid=?";
		QueryRunner qr = new QueryRunner();
		qr.update(MyDbUtils.getConnection(), sql, id);
	}

	@Override
	public void update(Product p) throws SQLException {
		String sql = "update product set name=?, price=?, nums=?, description=? where pid=?";
		QueryRunner qr = new QueryRunner();
		qr.update(MyDbUtils.getConnection(), sql, p.getName(), p.getPrice(), p.getNums(), p.getDescription(), p.getPid());
	}

	@Override
	public Product findById(int id) throws SQLException {
		String sql = "select pid,name,price,nums,description from product where pid=?";
		QueryRunner qr = new QueryRunner();
		Product p = qr.query(MyDbUtils.getConnection(), sql, new BeanHandler<Product>(Product.class), id);
		return p;
	}

	@Override
	public List<Product> findAll() throws SQLException {
		String sql = "select pid,name,price,nums,description from product";
		QueryRunner qr = new QueryRunner();
		List<Product> list = qr.query(MyDbUtils.getConnection(), sql, new BeanListHandler<Product>(Product.class));
		return list;
	}

}
