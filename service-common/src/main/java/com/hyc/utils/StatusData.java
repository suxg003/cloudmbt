package com.hyc.utils;


import java.io.Serializable;

public class StatusData
  implements Serializable
{
  private static final long serialVersionUID = -3205094719765712634L;
  public static final String SUCCESS_CODE = "00";
  public static final String SYS_EX_CODE = "99";
  private boolean resultStatus;
  private String resultCode;
  private String resultMessage;
  
  public StatusData()
  {
    this.resultStatus = true;
  }
  
  public StatusData(boolean paramBoolean)
  {
    this(paramBoolean, "");
  }
  
  public StatusData(boolean paramBoolean, String paramString)
  {
    this.resultStatus = true;
    
    this.resultStatus = paramBoolean;
    this.resultCode = (!paramBoolean ? "99" : "00");
    this.resultMessage = paramString;
  }
  
  public StatusData(boolean paramBoolean, String paramString1, String paramString2)
  {
    this.resultStatus = true;
    
    this.resultStatus = paramBoolean;
    this.resultCode = paramString1;
    this.resultMessage = paramString2;
  }
  
  public boolean isResultStatus()
  {
    return this.resultStatus;
  }
  
  public void setResultStatus(boolean paramBoolean)
  {
    this.resultStatus = paramBoolean;
  }
  
  public String getResultMessage()
  {
    return this.resultMessage;
  }
  
  public void setResultMessage(String paramString)
  {
    this.resultMessage = paramString;
  }
  
  public String getResultCode()
  {
    return this.resultCode;
  }
  
  public void setResultCode(String paramString)
  {
    this.resultCode = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    
    localStringBuilder.append("resultStatus:");
    localStringBuilder.append(this.resultStatus);
    localStringBuilder.append(",");
    
    localStringBuilder.append("resultCode:");
    localStringBuilder.append(this.resultCode);
    localStringBuilder.append(",");
    
    localStringBuilder.append("resultMessage:");
    localStringBuilder.append(this.resultMessage);
    
    return localStringBuilder.toString();
  }
}

