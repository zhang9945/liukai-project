package com.owner.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.owner.model.MusicInfo;

@Component
public interface MusicDao {
	List<MusicInfo> queryDataById(String id);

	List<MusicInfo> queryData();

	void addData(MusicInfo musicInfo);

	void removeDataById(String id);

	void modifyData(MusicInfo musicInfo);

}
