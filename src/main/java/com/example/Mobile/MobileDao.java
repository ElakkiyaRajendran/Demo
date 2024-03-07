package com.example.Mobile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;
	public List<Mobile> get() {
		return mr.findAll();
		
	}
public String add(Mobile m) {
	mr.save(m);
	return "Success";
}
public Optional<Mobile> getId(int a) {
	return mr.findById(a);
}
public String delete(int b) {
	mr.deleteById(b);
	return "Deleted";
}
public String update(int h, Mobile m) {
	Mobile m1 = mr.findById(h).get();
	m1.setBrand(m.getBrand());
	m1.setPrice(m.getPrice());
	mr.save(m1);
	return "update";
}
}
