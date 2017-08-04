package com.hyc.utils;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AppMap
  implements Serializable
{
  public static final String RETURN_TYPE_JSON = "json";
  public static final String RETURN_TYPE_HTML = "html";
  public static final String RETURN_TYPE_DOWNLOAD = "download";
  public static final String SUCCESS_CODE = "00";
  public static final String ERROR_CODE = "99";
  private static final long serialVersionUID = 1L;
  private StatusData statusData = null;
  private String returnViewPath = null;
  private Map<String, Object> in = null;
  private Page page = null;
  private Map<String, Object> upFiles = null;
  private Map<String, Object> out = new HashMap();
  private Map<String, Object> loginUser = null;
  private Map<String, Object> loginUserExtendInfo = null;
  private Map<String, Object> context = new HashMap();
  private Map<String, Object> mout = new HashMap();
  private String returnType = null;
  private String lcode = null;
  private String ltime = null;
  private String rcode = null;
  private String rtime = null;
  private String channel = null;
  private boolean clearFlag = true;
  
  public Page getPage()
  {
    return this.page;
  }
  
  public void setPage(Page paramPage)
  {
    this.page = paramPage;
  }
  
  public Map<String, Object> getIn()
  {
    return this.in;
  }
  
  public void setIn(Map<String, Object> paramMap)
  {
    this.in = paramMap;
  }
  
  public Map<String, Object> getOut()
  {
    return this.out;
  }
  
  public void put(String paramString, Object paramObject)
  {
    this.out.put(paramString, paramObject);
  }
  
  public Map<String, Object> getLoginUser()
  {
    return this.loginUser;
  }
  
  public void setLoginUser(Map<String, Object> paramMap)
  {
    this.loginUser = paramMap;
  }
  
  public Map<String, Object> getLoginUserExtendInfo()
  {
    return this.loginUserExtendInfo;
  }
  
  public void setLoginUserExtendInfo(Map<String, Object> paramMap)
  {
    this.loginUserExtendInfo = paramMap;
  }
  
  public Map<String, Object> getMout()
  {
    return this.mout;
  }
  
  public void mput(String paramString, Object paramObject)
  {
    this.mout.put(paramString, paramObject);
  }
  
  public StatusData getStatusData()
  {
    return this.statusData;
  }
  
  public void setStatusData(StatusData paramStatusData)
  {
    this.statusData = paramStatusData;
  }
  
  public String getReturnViewPath()
  {
    return this.returnViewPath;
  }
  
  public void setReturnViewPath(String paramString)
  {
    this.returnViewPath = paramString;
  }
  
  public void initUpFiles()
  {
    if (this.upFiles == null) {
      this.upFiles = new HashMap();
    }
  }
  
  public Map<String, Object> getUpFiles()
  {
    initUpFiles();
    return this.upFiles;
  }
  
  public void setUpFiles(Map<String, Object> paramMap)
  {
    this.upFiles = paramMap;
  }
  
  public Map<String, Object> getContext()
  {
    return this.context;
  }
  
  public void setContext(Map<String, Object> paramMap)
  {
    this.context = paramMap;
  }
  
  public String getReturnType()
  {
    return this.returnType;
  }
  
  public void setReturnType(String paramString)
  {
    this.returnType = paramString;
  }
  
  public void setHtmlReturnType()
  {
    this.returnType = "html";
  }
  
  public void setJsonReturnType()
  {
    this.returnType = "json";
  }
  
  public void setDownloadReturnType()
  {
    this.returnType = "download";
  }
  
  public String getLcode()
  {
    return this.lcode;
  }
  
  public void setLcode(String paramString)
  {
    this.lcode = paramString;
  }
  
  public String getLtime()
  {
    return this.ltime;
  }
  
  public void setLtime(String paramString)
  {
    this.ltime = paramString;
  }
  
  public String getRcode()
  {
    return this.rcode;
  }
  
  public void setRcode(String paramString)
  {
    this.rcode = paramString;
  }
  
  public String getRtime()
  {
    return this.rtime;
  }
  
  public void setRtime(String paramString)
  {
    this.rtime = paramString;
  }
  
  public boolean isClearFlag()
  {
    return this.clearFlag;
  }
  
  public void setClearFlag(boolean paramBoolean)
  {
    this.clearFlag = paramBoolean;
  }
  
  public String getChannel()
  {
    return this.channel;
  }
  
  public void setChannel(String paramString)
  {
    this.channel = paramString;
  }
  
  public void clear()
  {
    this.upFiles = null;
    this.loginUser = null;
  }
  
  public static void fillAppMap(AppMap paramAppMap1, AppMap paramAppMap2)
  {
    fillAppMap1(paramAppMap1, paramAppMap2);
  }
  
  private static void fillAppMap1(AppMap paramAppMap1, AppMap paramAppMap2)
  {
    if (null == paramAppMap2) {
      return;
    }
    if (null != paramAppMap2.getIn()) {
      paramAppMap1.getIn().putAll(paramAppMap2.getIn());
    }
    if (null != paramAppMap2.getOut()) {
      paramAppMap1.getOut().putAll(paramAppMap2.getOut());
    }
    paramAppMap1.setStatusData(paramAppMap2.getStatusData());
  }
  
  public void setSuccessStatusData()
  {
    setSuccessStatusData("00");
  }
  
  public void setSuccessStatusData(String paramString)
  {
    StatusData localStatusData = new StatusData(true, paramString);
    setStatusData(localStatusData);
  }
  
  public void setErrorStatusData(String paramString)
  {
    setErrorStatusData(paramString, "");
  }
  
  public void setErrorStatusData(String paramString1, String paramString2)
  {
    StatusData localStatusData = new StatusData(false, paramString1, paramString2);
    
    setStatusData(localStatusData);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    
    localStringBuilder.append("{");
    localStringBuilder.append(this.statusData == null ? "statusData:null" : this.statusData
      .toString());
    localStringBuilder.append("}");
    
    return localStringBuilder.toString();
  }
}
