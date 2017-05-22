package com.wms.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.wms.service.IDdjService;
import com.wms.service.IMaterialService;
import com.wms.service.ISsxService;

public class ADSAction {

	private IDdjService ddjservice;
	private ISsxService ssxservice;
	private IMaterialService materialService;
	private TaskAction mTaskAction;

	public IMaterialService getMaterialService() {
		return materialService;
	}

	public void setMaterialService(IMaterialService materialService) {
		this.materialService = materialService;
	}

	public ISsxService getSsxservice() {
		return ssxservice;
	}

	public void setSsxservice(ISsxService ssxservice) {
		this.ssxservice = ssxservice;
	}

	public IDdjService getDdjservice() {
		return ddjservice;
	}

	public void setDdjservice(IDdjService ddjservice) {
		this.ddjservice = ddjservice;
	}

	int mSize;

	/**
	 * 接收ku管系统命令并响应返回值
	 * 
	 * @throws IOException
	 */
	public void write() throws IOException {
		mTaskAction = new TaskAction();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String cmd = request.getParameter("cmd");
		System.out.println("-----------cmd:" + cmd);
		String result = "XXXX,00";
		out.print(mTaskAction.addTask(cmd));
		out.flush();
		out.close();
	}

}
