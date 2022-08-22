package com.iu.start;

import java.util.List;

public interface WorkDAO {
	
	public List<HomeWorkDTO> getList(HomeWorkDTO homeWorkDTO);
	
	public List<HomeWorkDTO> getDetail(HomeWorkDTO homeWorkDTO);
	
	public int getAdd();
	
	public int getUpdate();
	
	public int getDelete(HomeWorkDTO homeWorkDTO);

}
