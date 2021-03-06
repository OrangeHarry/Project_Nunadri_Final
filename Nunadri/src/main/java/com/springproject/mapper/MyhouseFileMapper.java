package com.springproject.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.springproject.vo.FileMyhouseVO;
import com.springproject.vo.NoticeMyhouseVO;

@Mapper
public interface MyhouseFileMapper {

	void insertMyhouseFileList(FileMyhouseVO fileInsert);

	void deleteMyhouseFileList(FileMyhouseVO fileDelete);

	List<FileMyhouseVO> getMyhouseFileList(NoticeMyhouseVO fileGet);

	void deleteMyhouseFileAll(NoticeMyhouseVO deleteFileAll);

	List<HashMap<String, Object>> getItem(NoticeMyhouseVO item);

	List<HashMap<String, Object>> getFleamarketList(Map<String, Object> map);
}
