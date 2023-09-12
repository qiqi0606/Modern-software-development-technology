package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MyDao;

@Service
public class MySeviceImpl implements MyService{
	@Autowired
	private MyDao myDao; 
	@Override
	public void printService() {
		myDao.printDao();
		System.out.println("Test service");
	}
	
}
