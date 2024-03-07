package com.example.Mobile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
	@Autowired
	MobileService ms;
	@GetMapping("/get")
	public List<Mobile> get() {
		return ms.get();
	}
	@PostMapping("/post")
	public String add(@RequestBody Mobile m) {
		return ms.add(m);
	}
	@GetMapping("/getid/{a}")
	public Optional <Mobile> getId(@PathVariable int a) {
		return ms.getId(a);
	}
@DeleteMapping("/del/{b}")
public String delete(@PathVariable int b) {
	return ms.delete(b);
}
@PutMapping("/updatemobile/{h}")
public String update(@PathVariable int h, @RequestBody Mobile m) {
	return ms.update(h,m);
}
}
