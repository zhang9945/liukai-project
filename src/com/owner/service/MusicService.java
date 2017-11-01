package com.owner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owner.dao.MusicDao;
import com.owner.model.MusicInfo;

@Service
public class MusicService {
	
	@Autowired
	private MusicDao dao;

	public List<MusicInfo> quryAllMusic() {
		return dao.queryData();
	}
	
	public void insertMusicInfo(MusicInfo musicInfo){
		dao.addData(musicInfo);
	}
	
	public void modifyMusic(MusicInfo musicInfo){
		dao.modifyData(musicInfo);
	}
	
	public void removeMusic(String id){
		dao.removeDataById(id);
	}
}
