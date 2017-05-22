package com.wms.ads;

import de.beckhoff.jni.Convert;
import de.beckhoff.jni.JNIByteBuffer;
import de.beckhoff.jni.tcads.AdsCallDllFunction;
import de.beckhoff.jni.tcads.AmsAddr;

public class ssx {
	static AmsAddr addr = null;
	static boolean isConnected = false;

	public ssx() {
		if (!isConnected)
			connect();
	}

	private void connect() {
		long nPort, nErr;
		addr = new AmsAddr();
		nPort = AdsCallDllFunction.adsPortOpen();
		nErr = AdsCallDllFunction.getLocalAddress(addr);
		// FIXME setNetIdString方法名改动，不知程序能否正确运行
		addr.setNetIdString("192.168.127.11.1.1");
		addr.setPort(851);
		if (nErr != 0) {
			System.out.println("Error: fail connect to ssx PLC:"
					+ addr.getNetIdString() + ",port:" + addr.getPort());
			return;
		}
		System.out.println("success connect to ssx PLC:"
				+ addr.getNetIdString() + ",port:" + addr.getPort());
		isConnected = true;
	}

	public long Emergency(boolean value) {
		byte[] dataVal = new byte[] { 0 };
		if (value)
			dataVal[0] = 1;

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.Emergency"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0)
			return nErr;

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr, 0xF005,
				hdlBuffToInt, 0x1, dataVal);
		if (nErr != 0)
			return nErr;

		return 0;
	}

	public long Reset(boolean value) {
		byte[] dataVal = new byte[] { 0 };
		if (value)
			dataVal[0] = 1;

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.Reset"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0)
			return nErr;

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr, 0xF005,
				hdlBuffToInt, 0x1, dataVal);
		if (nErr != 0)
			return nErr;

		return 0;
	}

	public long Reset_Uint(int uint, boolean value) {
		byte[] dataVal = new byte[] { 0 };
		if (value)
			dataVal[0] = 1;

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.Reset_Uint"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0)
			return nErr;

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr, 0xF005,
				hdlBuffToInt + uint - 1, 0x1, dataVal);
		if (nErr != 0)
			return nErr;

		return 0;
	}

	public long Start_Node(int value) {
		byte[] dataVal = Convert.ShortToByteArr((short) value);

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.Start_Node"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0)
			return nErr;

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		dataBuff.setByteArray(dataVal);
		nErr = AdsCallDllFunction.adsSyncWriteReq(addr, 0xF005, hdlBuffToInt,
				dataVal.length, dataBuff);
		if (nErr != 0)
			return nErr;

		return 0;
	}

	public long End_Node(int value) {
		byte[] dataVal = Convert.ShortToByteArr((short) value);

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.End_Node"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0)
			return nErr;

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		dataBuff.setByteArray(dataVal);
		nErr = AdsCallDllFunction.adsSyncWriteReq(addr, 0xF005, hdlBuffToInt,
				dataVal.length, dataBuff);
		if (nErr != 0)
			return nErr;

		return 0;
	}

	public readResultBase RKX_STATE() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.RKX_STATE"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.btValue = (byte) intVal;
		return result;
	}

	public readResultBase YLX1_STATE() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.YLX1_STATE"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.btValue = (byte) intVal;
		return result;
	}

	public readResultBase CPX1_STATE() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.CPX1_STATE"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.btValue = (byte) intVal;
		return result;
	}

	public readResultBase YLX2_STATE() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.YLX2_STATE"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.btValue = (byte) intVal;
		return result;
	}

	public readResultBase CPX2_STATE() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.CPX2_STATE"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.btValue = (byte) intVal;
		return result;
	}

	public readResultBase CKX_STATE() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.CKX_STATE"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.btValue = (byte) intVal;
		return result;
	}

	public readResultBase WorkStatus() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.WorkStatus"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.nValue = intVal;
		return result;
	}

	public readResultBase Unit_Task(int uint) {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.Unit_Task"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(2);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt + 2
				* uint - 2, 0x2, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToShort(dataBuff.getByteArray());
		result.nError = 0;
		result.nValue = intVal;
		return result;
	}

	public readResultBase ErrorCode() {
		readResultBase result = new readResultBase();

		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(
				Convert.StringToByteArr("GVL_COM.ErrorCode"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr, 0xF003, 0x0,
				hdlBuff.getUsedBytesCount(), hdlBuff,
				symBuff.getUsedBytesCount(), symBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		nErr = AdsCallDllFunction.adsSyncReadReq(addr, 0xF005, hdlBuffToInt,
				0x4, dataBuff);
		if (nErr != 0) {
			result.nError = nErr;
			return result;
		}

		int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		result.nError = 0;
		result.nValue = intVal;
		return result;
	}
}
