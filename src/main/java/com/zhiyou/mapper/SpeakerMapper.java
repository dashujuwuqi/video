package com.zhiyou.mapper;

import java.util.ArrayList;
import java.util.List;



import com.zhiyou.model.Speaker;

public interface SpeakerMapper {

	  List<Speaker> selectAll();
	  List<Speaker> selectById(int id);

	
	  void add(Speaker speaker);
	  void update(Speaker speaker);
	  void delete(int id);
	  void deleteIn(ArrayList<Integer> ids);
}
