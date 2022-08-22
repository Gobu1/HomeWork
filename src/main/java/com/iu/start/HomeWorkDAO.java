package com.iu.start;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeWorkDAO implements WorkDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.start.HomeWorkDAO";

	@Override
	public List<HomeWorkDTO> getList(HomeWorkDTO homeWorkDTO) {
		return sqlSession.selectList(NAMESPACE+"getList", homeWorkDTO);
	}

	@Override
	public List<HomeWorkDTO> getDetail(HomeWorkDTO homeWorkDTO) {
		return sqlSession.selectList(NAMESPACE+"getDetail", homeWorkDTO);
	}

	@Override
	public int getAdd() {
		return sqlSession.insert(NAMESPACE+"getAdd");
	}

	@Override
	public int getUpdate() {
		return sqlSession.update(NAMESPACE+"getUpdate");
	}

	@Override
	public int getDelete(HomeWorkDTO homeWorkDTO) {
		return sqlSession.delete(NAMESPACE+"getDelete");
	}

}
