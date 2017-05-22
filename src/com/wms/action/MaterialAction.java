package com.wms.action;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.entity.Material;
import com.wms.service.IMaterialService;

public class MaterialAction {

	private IMaterialService service;
	private Material material;

	public IMaterialService getService() {
		return service;
	}

	public void setService(IMaterialService service) {
		this.service = service;
	}
	
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Material RFID2Material(String rfid){
		material.setName(rfid.substring(0,10));
		//省略
		return material;
	}
    public String Material2RFID(Material material){
		String rfid;
		rfid=material.getName()+"省略";
    	return rfid;
	}
}
