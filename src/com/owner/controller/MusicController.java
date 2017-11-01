package com.owner.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owner.service.MusicService;

@Controller
public class MusicController {
	
	@Autowired
	private MusicService musicService;
	
	@RequestMapping("musiclist")
	public String showAllMusic(Map<String,Object> map){
		map.put("musiclist", musicService.quryAllMusic());
		return "music";
		
	}
	@RequestMapping("addmusic")
	public void addMusic(HttpRequest req){
//		musicService.insertMusicInfo();
	}
	@RequestMapping("deletemusic")
	public void deletMusic(){
		
	}
	
	public void modifyMusic(){
		
	}
}
