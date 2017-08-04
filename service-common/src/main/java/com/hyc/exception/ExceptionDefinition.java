package com.hyc.exception;


import java.io.Serializable;

public class ExceptionDefinition
  implements Serializable
{
  private static final long serialVersionUID = 7403552150617989317L;
  private String errorCode;
  private String errorText;
  private String errorMsg;
  private Exception exception;
  private boolean sysException = false;
  
  public ExceptionDefinition() {}
  
  public ExceptionDefinition(String paramString)
  {
    this.errorCode = paramString;
  }
  
  public String getErrorCode()
  {
    return this.errorCode;
  }
  
  public void setErrorCode(String paramString)
  {
    this.errorCode = paramString;
  }
  
  public String getErrorText()
  {
    return this.errorText;
  }
  
  public void setErrorText(String paramString)
  {
    this.errorText = paramString;
  }
  
  public String getErrorMsg()
  {
    return this.errorMsg;
  }
  
  public void setErrorMsg(String paramString)
  {
    this.errorMsg = paramString;
  }
  
  public Exception getException()
  {
    return this.exception;
  }
  
  public void setException(Exception paramException)
  {
    this.exception = paramException;
  }
  
  public boolean isSysException()
  {
    return this.sysException;
  }
  
  public void setSysException(boolean paramBoolean)
  {
    this.sysException = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("errorCode:");
    sb.append(this.errorCode);
    sb.append(",");
    
    sb.append("errorText:");
    sb.append(this.errorText);
    sb.append(",");
    sb.append("errorMsg:");
    sb.append(this.errorMsg);
    sb.append(",");
    sb.append("exceptionName:");
    sb.append(this.exception.getClass().getName());
    sb.append(",");
    sb.append("sysException:");
    sb.append(this.sysException);
    
    return sb.toString();
  }
}
