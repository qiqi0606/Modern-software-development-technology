package dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyDaoImpl implements MyDao{
	
	@Override
	public void printDao() {
		System.out.println("Test dao");
	}

}
