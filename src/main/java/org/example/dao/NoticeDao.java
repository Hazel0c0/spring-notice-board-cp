package org.example.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeDao {

	private static final String NAME_SPACE = "NoticeService.";
	private final SqlSessionTemplate sessionTemplate;

	/**
	 * list 조회
	 * @param param
	 * @return : List<Map>
	 */
	public List<?> getBoardList(Object param) {
		return sessionTemplate.selectList(NAME_SPACE + "getBoardList", param);
	}

}