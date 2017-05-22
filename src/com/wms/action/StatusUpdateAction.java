package com.wms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import com.wms.entity.Task;
import com.wms.service.IClfaultService;
import com.wms.service.IClreturnService;
import com.wms.service.IDdjService;
import com.wms.service.ISsxService;
import com.wms.service.IStockerFaultService;
import com.wms.service.IStockerReturnService;
import com.wms.service.ITaskService;
import com.wms.serviceImpl.DdjService;

public class StatusUpdateAction {

	private IDdjService ddjservice;
	private ISsxService ssxservice;
	private Log log = LogFactory.getLog(this.getClass());

	public ISsxService getSsxservice() {
		return ssxservice;
	}

	public void setSsxservice(ISsxService ssxservice) {
		this.ssxservice = ssxservice;
	}

	private IClreturnService clreturnservice;
	private IClfaultService clfaultservice;
	private IStockerReturnService stockerreturnservice;
	private IStockerFaultService stockerfaultservice;
	private ITaskService taskservice;

	public ITaskService getTaskservice() {
		return taskservice;
	}

	public void setTaskservice(ITaskService taskservice) {
		this.taskservice = taskservice;
	}

	public IDdjService getDdjservice() {
		return ddjservice;
	}

	public void setDdjservice(IDdjService ddjservice) {
		this.ddjservice = ddjservice;
	}

	public IClreturnService getClreturnservice() {
		return clreturnservice;
	}

	public void setClreturnservice(IClreturnService clreturnservice) {
		this.clreturnservice = clreturnservice;
	}

	public IClfaultService getClfaultservice() {
		return clfaultservice;
	}

	public void setClfaultservice(IClfaultService clfaultservice) {
		this.clfaultservice = clfaultservice;
	}

	public IStockerReturnService getStockerreturnservice() {
		return stockerreturnservice;
	}

	public void setStockerreturnservice(
			IStockerReturnService stockerreturnservice) {
		this.stockerreturnservice = stockerreturnservice;
	}

	public IStockerFaultService getStockerfaultservice() {
		return stockerfaultservice;
	}

	public void setStockerfaultservice(IStockerFaultService stockerfaultservice) {
		this.stockerfaultservice = stockerfaultservice;
	}

	@Action("update")
	public void update() {

		String rkx_status = clreturnservice
				.GetClreturnBy(
						"[GVL_COM.Unit_Task[1]]",
						ssxservice.GetSsxBy("[GVL_COM.Unit_Task[1]]", "")
								.get(0).getValue()).get(0).getRemark();
		String ssx_workstatus = clreturnservice
				.GetClreturnBy(
						"GVL_COM.WorkStatus",
						ssxservice.GetSsxBy("GVL_COM.WorkStatus", "").get(0)
								.getValue()).get(0).getRemark();
		String ssx_error = clfaultservice
				.GetClfaultBy(
						ssxservice.GetSsxBy("GVL_COM.ErrorCode", "").get(0)
								.getValue(), "").get(0).getMeaning();

		String qgj1_status = clreturnservice
				.GetClreturnBy(
						"[GVL_COM.Unit_Task[2]]",
						ssxservice.GetSsxBy("[GVL_COM.Unit_Task[2]]", "")
								.get(0).getValue()).get(0).getRemark();
		String cpx1_status = clreturnservice
				.GetClreturnBy(
						"[GVL_COM.Unit_Task[3]]",
						ssxservice.GetSsxBy("[GVL_COM.Unit_Task[3]]", "")
								.get(0).getValue()).get(0).getRemark();
		String qgj2_status = clreturnservice
				.GetClreturnBy(
						"[GVL_COM.Unit_Task[4]]",
						ssxservice.GetSsxBy("[GVL_COM.Unit_Task[4]]", "")
								.get(0).getValue()).get(0).getRemark();
		String cpx2_status = clreturnservice
				.GetClreturnBy(
						"[GVL_COM.Unit_Task[5]]",
						ssxservice.GetSsxBy("[GVL_COM.Unit_Task[5]]", "")
								.get(0).getValue()).get(0).getRemark();
		String ckx_status = clreturnservice
				.GetClreturnBy(
						"[GVL_COM.Unit_Task[6]]",
						ssxservice.GetSsxBy("[GVL_COM.Unit_Task[6]]", "")
								.get(0).getValue()).get(0).getRemark();
		String ddj_status = stockerreturnservice
				.GetStockerReturnBy(
						"GVL_COM.C_ACT",
						ddjservice.GetDdjBy("GVL_COM.C_ACT", "").get(0)
								.getValue()).get(0).getRemark();
		String ddj_workstatus = stockerreturnservice
				.GetStockerReturnBy(
						"GVL_COM.WorkStatus",
						ddjservice.GetDdjBy("GVL_COM.WorkStatus", "").get(0)
								.getValue()).get(0).getRemark();
		String ddj_error = stockerfaultservice
				.GetStockerFaultBy(
						ddjservice.GetDdjBy("GVL_COM.ErrorCode", "").get(0)
								.getValue(), "").get(0).getMeaning();

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		PrintWriter write = null;
		try {
			String jsonFormat = "{\"rkx\":{\"status\":\"%1$s\",\"workstatus\":\"%2$s\",\"error\":\"%3$s\"},\"qgj1\":{\"status\":\"%4$s\",\"workstatus\":\"%5$s\",\"error\":\"%6$s\"},\"cpx1\":{\"status\":\"%16$s\",\"workstatus\":\"%17$s\",\"error\":\"%18$s\"},\"ddj\":{\"status\":\"%7$s\",\"workstatus\":\"%8$s\",\"error\":\"%9$s\"},\"ckx\":{\"status\":\"%10$s\",\"workstatus\":\"%11$s\",\"error\":\"%12$s\"},\"qgj2\":{\"status\":\"%13$s\",\"workstatus\":\"%14$s\",\"error\":\"%15$s\"},\"cpx2\":{\"status\":\"%19$s\",\"workstatus\":\"%20$s\",\"error\":\"%21$s\"},%22$s}";
			String data = String.format(jsonFormat, rkx_status, ssx_workstatus,
					ssx_error, qgj1_status, ssx_workstatus, ssx_error,
					ddj_status, ddj_workstatus, ddj_error, ckx_status,
					ssx_workstatus, ssx_error, qgj2_status, ssx_workstatus,
					ssx_error, cpx1_status, ssx_workstatus, ssx_error,
					cpx2_status, ssx_workstatus, ssx_error, queryTask());
			System.out.println(data);
			write = response.getWriter();
			write.write(data);
			write.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// write.close();
		}
	}

	public String queryTask() {
		List<Task> task = taskservice.GetAllTask();
		String jsonFormat = "\"task\":[%1$s]";
		String obj = "{\"id\":\"%1$s\",\"type\":\"%2$s\",\"inposition\":\"%3$s\",\"outposition\":\"%4$s\",\"state\":\"%5$s\",\"pri\":\"%6$s\"}";
		Task temptask;
		String temp = "";
		for (int i = 0; i < task.size(); i++) {
			temptask = task.get(i);
			String tasks = String.format(obj, temptask.getId(),
					temptask.getType(), temptask.getInPosition(),
					temptask.getOutPosition(), temptask.getState(),
					temptask.getPri());
			if (i == 0) {
				temp += tasks;
			} else {
				temp += "," + tasks;
			}
		}
		return String.format(jsonFormat, temp);
	}

	@Action("eqdetails")
	public void eqdetails() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String type = request.getParameter("type");
		System.out.println(type);

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String ssxStatus = null;
		String jsonFormat = "{\"status\":\"%1$s\",\"error\":\"%2$s\"}";
		String data;
		if (type.equals("rkx")) {
			ssxStatus = clreturnservice
					.GetClreturnBy(
							"[GVL_COM.Unit_Task[1]]",
							ssxservice.GetSsxBy("[GVL_COM.Unit_Task[1]]", "")
									.get(0).getValue()).get(0).getRemark();
		} else if (type.equals("qgj1")) {
			ssxStatus = clreturnservice
					.GetClreturnBy(
							"[GVL_COM.Unit_Task[2]]",
							ssxservice.GetSsxBy("[GVL_COM.Unit_Task[2]]", "")
									.get(0).getValue()).get(0).getRemark();
		} else if (type.equals("cpx1")) {
			ssxStatus = clreturnservice
					.GetClreturnBy(
							"[GVL_COM.Unit_Task[3]]",
							ssxservice.GetSsxBy("[GVL_COM.Unit_Task[3]]", "")
									.get(0).getValue()).get(0).getRemark();
		} else if (type.equals("ckx")) {
			ssxStatus = clreturnservice
					.GetClreturnBy(
							"[GVL_COM.Unit_Task[6]]",
							ssxservice.GetSsxBy("[GVL_COM.Unit_Task[6]]", "")
									.get(0).getValue()).get(0).getRemark();
		} else if (type.equals("qgj2")) {
			ssxStatus = clreturnservice
					.GetClreturnBy(
							"[GVL_COM.Unit_Task[4]]",
							ssxservice.GetSsxBy("[GVL_COM.Unit_Task[4]]", "")
									.get(0).getValue()).get(0).getRemark();
		} else if (type.equals("cpx2")) {
			ssxStatus = clreturnservice
					.GetClreturnBy(
							"[GVL_COM.Unit_Task[5]]",
							ssxservice.GetSsxBy("[GVL_COM.Unit_Task[5]]", "")
									.get(0).getValue()).get(0).getRemark();
		}
		if (type.equals("ddj")) {
			String ddjError = stockerfaultservice
					.GetStockerFaultBy(
							ddjservice.GetDdjBy("GVL_COM.ErrorCode", "").get(0)
									.getValue(), "").get(0).getMeaning();
			String ddjStatus = stockerreturnservice
					.GetStockerReturnBy(
							"GVL_COM.C_ACT",
							ddjservice.GetDdjBy("GVL_COM.C_ACT", "").get(0)
									.getValue()).get(0).getRemark();
			data = String.format(jsonFormat, ddjStatus, ddjError);
		} else {
			String ssxError = clfaultservice
					.GetClfaultBy(
							ssxservice.GetSsxBy("GVL_COM.ErrorCode", "").get(0)
									.getValue(), "").get(0).getMeaning();
			data = String.format(jsonFormat, ssxStatus, ssxError);
		}
		out.write(data);
		out.flush();
		out.close();
	}

	@Action("taskdetails")
	public void details() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String tid = request.getParameter("tid");
		System.out.println(tid);
	}
}
