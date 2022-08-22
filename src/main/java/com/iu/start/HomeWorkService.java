package com.iu.start;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeWorkService {
	
	@Autowired
	private HomeWorkDAO homeWorkDAO;
	
	public List<HomeWorkDTO> getList(HomeWorkDTO homeWorkDTO){
		return homeWorkDAO.getList(homeWorkDTO);
	}
	
	public List<HomeWorkDTO> getDetail(HomeWorkDTO homeWorkDTO){
		return homeWorkDAO.getDetail(homeWorkDTO);
	}
	
	public int getAdd() {
		return homeWorkDAO.getAdd();
	}
	
	public int getUpdate() {
		return homeWorkDAO.getUpdate();
	}
	
	public int getDelete(HomeWorkDTO homeWorkDTO) {
		return homeWorkDAO.getDelete(homeWorkDTO);
	}


}
