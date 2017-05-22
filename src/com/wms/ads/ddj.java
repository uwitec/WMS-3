package com.wms.ads;

import de.beckhoff.jni.Convert;
import de.beckhoff.jni.JNIByteBuffer;
import de.beckhoff.jni.tcads.AmsAddr;
import de.beckhoff.jni.tcads.AdsCallDllFunction;

public class ddj {
	static AmsAddr addr = null;
	static boolean isConnected = false;
	
	public ddj(){
		if(!isConnected)
			connect();
	}
	
	private void connect(){
		long nPort, nErr;
        addr = new AmsAddr();
        nPort = AdsCallDllFunction.adsPortOpen();
        nErr = AdsCallDllFunction.getLocalAddress(addr);
        addr.setNetIdString("192.168.127.10.1.1");
        addr.setPort(851);
        if(nErr!=0) { 
        	System.out.println("Error: fail connect to ddj PLC:"+addr.getNetIdString()+",port:"+addr.getPort()); 
        	return;
        }
        System.out.println("success connect to ddj PLC:"+addr.getNetIdString()+",port:"+addr.getPort());
        isConnected = true;
	}
	
	public long Emergency(boolean value){
		byte[] dataVal=new byte[]{0};
		if(value)
			dataVal[0] = 1;
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Emergency"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x1,
                 dataVal);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long Reset(boolean value){
		byte[] dataVal=new byte[]{0};
		if(value)
			dataVal[0] = 1;
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Reset"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x1,
                 dataVal);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long Online(boolean value){
		byte[] dataVal=new byte[]{0};
		if(value)
			dataVal[0] = 1;
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Online"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x1,
                 dataVal);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long Offline(boolean value){
		byte[] dataVal=new byte[]{0};
		if(value)
			dataVal[0] = 1;
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Offline"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x1,
                 dataVal);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long GoStation(boolean value){
		byte[] dataVal=new byte[]{0};
		if(value)
			dataVal[0] = 1;
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.GoStation"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x1,
                 dataVal);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long RF_BW_L(boolean value){
		byte[] dataVal=new byte[]{0};
		if(value)
			dataVal[0] = 1;
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.RF_BW_L"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x1,
                 dataVal);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long RF_BW_R(boolean value){
		byte[] dataVal=new byte[]{0};
		if(value)
			dataVal[0] = 1;
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.RF_BW_R"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 nErr = AdsCallDllFunction.adsSyncWriteReqArray(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x1,
                 dataVal);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long RK_Hang(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.RK_Hang"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long RK_Line(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.RK_Line"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long RK_Ceng(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.RK_Ceng"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long CK_Hang(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.CK_Hang"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long CK_Line(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.CK_Line"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long CK_Ceng(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.CK_Ceng"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long PK_G_Hang(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PK_G_Hang"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long PK_G_Line(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PK_G_Line"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long PK_G_Ceng(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PK_G_Ceng"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long PK_P_Hang(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PK_P_Hang"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long PK_P_Line(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PK_P_Line"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long PK_P_Ceng(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PK_P_Ceng"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long GetStation(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.GetStation"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long PutStation(int value){
		byte[] dataVal=Convert.ShortToByteArr((short) value);
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PutStation"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0)
			return nErr;
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(dataVal.length);
		 dataBuff.setByteArray(dataVal);
		 nErr = AdsCallDllFunction.adsSyncWriteReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 dataVal.length,
                 dataBuff);
		 if(nErr != 0)
			return nErr;
		 
		 return 0;
	}
	
	public long L_RF_W(readResultStruct value){
		return 0;
	}
	
	public long R_RF_W(readResultStruct value){
		return 0;
	}
	
	
	//bool
	public readResultBase GetDone(){
		readResultBase result = new readResultBase();
		
		long nErr;
		JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
		JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.GetDone"));
		nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
                 0xF003,
                 0x0,
                 hdlBuff.getUsedBytesCount(),
                 hdlBuff,
                 symBuff.getUsedBytesCount(),
                 symBuff);
		if(nErr != 0){
			result.nError = nErr;
			return result;
		}
		
		 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
		 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
		 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
                 0xF005,
                 hdlBuffToInt,
                 0x4,
                 dataBuff);
		 if(nErr != 0){
				result.nError = nErr;
				return result;
			}
		 
		 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
		 result.nError=0;
		 if(intVal == 0)
			 result.bValue = false;
		 else
			 result.bValue = true;
		 return result;
	}
	
	//bool
		public readResultBase PutDone(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PutDone"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//bool
		public readResultBase HC_MID(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.HC_MID"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//bool
		public readResultBase Line_Pos(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Line_Pos"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//bool
		public readResultBase GetCeng_Pos(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.GetCeng_Pos"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//bool
		public readResultBase PutCeng_Pos(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.PutCeng_Pos"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//bool
		public readResultBase ZHT_YH(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.ZHT_YH"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//bool
		public readResultBase RF_BR_L(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.RF_BR_L"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//bool
		public readResultBase RF_BR_R(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.RF_BR_R"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
				}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 if(intVal == 0)
				 result.bValue = false;
			 else
				 result.bValue = true;
			 return result;
		}
		
		//int
		public readResultBase C_Task_Hang(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Task_Hang"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_Task_Line(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Task_Line"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_Task_Ceng(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Task_Ceng"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_Task_Station(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Task_Station"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_Hang(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Hang"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_Line(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Line"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_Ceng(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Ceng"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_Station(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_Station"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase WorkStatus(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.WorkStatus"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase Axis_X(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Axis_X"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase Axis_Y(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Axis_Y"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase Axis_Z(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.Axis_Z"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase ErrorCode(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.ErrorCode"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultBase C_ACT(){
			readResultBase result = new readResultBase();
			
			long nErr;
			JNIByteBuffer hdlBuff = new JNIByteBuffer(4);
			JNIByteBuffer symBuff = new JNIByteBuffer(Convert.StringToByteArr("GVL_COM.C_ACT"));
			nErr = AdsCallDllFunction.adsSyncReadWriteReq(addr,
	                 0xF003,
	                 0x0,
	                 hdlBuff.getUsedBytesCount(),
	                 hdlBuff,
	                 symBuff.getUsedBytesCount(),
	                 symBuff);
			if(nErr != 0){
				result.nError = nErr;
				return result;
			}
			
			 int hdlBuffToInt = Convert.ByteArrToInt(hdlBuff.getByteArray());
			 JNIByteBuffer dataBuff = new JNIByteBuffer(4);
			 nErr = AdsCallDllFunction.adsSyncReadReq(addr,
	                 0xF005,
	                 hdlBuffToInt,
	                 0x4,
	                 dataBuff);
			 if(nErr != 0){
					result.nError = nErr;
					return result;
			}
			 
			 int intVal = Convert.ByteArrToInt(dataBuff.getByteArray());
			 result.nError=0;
			 result.nValue = intVal;
			 return result;
		}
		
		public readResultStruct L_RF_R(){
			readResultStruct result = new readResultStruct();
			return result;
		}
		
		public readResultStruct R_RF_R(){
			readResultStruct result = new readResultStruct();
			return result;
		}
}
