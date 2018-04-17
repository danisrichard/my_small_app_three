package com.example.learn_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn_project.dao.MicroGamerInformationDao;

@Service
public class MicroGameInformationService {

	@Autowired
	MicroGamerInformationDao mcg;
	
	public String tesztQuery() {
		return mcg.tesztQuery();
	}
}
