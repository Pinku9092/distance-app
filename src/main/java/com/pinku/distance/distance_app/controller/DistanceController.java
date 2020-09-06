package com.pinku.distance.distance_app.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pinku.distance.distance_app.bean.RequestBean;
import com.pinku.distance.distance_app.bean.ResponseBean;

@RestController
public class DistanceController {
	
	public ResponseBean getDistanceTravel(@RequestBody RequestBean requestBean) {
		
		return new ResponseBean();
	}
}
