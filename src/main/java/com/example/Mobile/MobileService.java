package com.example.Mobile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
	@Autowired
	MobileDao md;
	public List<Mobile> get() {
		return md.get();
	}
public String add(Mobile m) {
	return md.add(m);
}
public Optional<Mobile> getId(int a) {
	return md.getId(a);
}
public String delete(int b) {
	return md.delete(b);
}
public String update(int h, Mobile m) {
	return md.update(h,m);
}
}
