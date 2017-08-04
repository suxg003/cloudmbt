package com.hyc.exception;


public class AppException
  extends RuntimeException
{
  private static final long serialVersionUID = 4320079912907345292L;
  private String errorCode;
  
  public AppException(String paramString)
  {
    super("");
    this.errorCode = paramString;
  }
  
  public AppException(String paramString1, String paramString2)
  {
    super(paramString2);
    this.errorCode = paramString1;
  }
  
  public AppException(String paramString, Throwable paramThrowable)
  {
    super(paramThrowable);
    this.errorCode = paramString;
  }
  
  public AppException(String paramString1, String paramString2, Throwable paramThrowable)
  {
    super(paramString2, paramThrowable);
    this.errorCode = paramString1;
  }
  
  public String getErrorCode()
  {
    return this.errorCode;
  }
  
  protected void setErrorCode(String paramString)
  {
    this.errorCode = paramString;
  }
  
  public static boolean isSubException(Exception paramException)
  {
    if (null == paramException) {
      return false;
    }
    return paramException instanceof AppException;
  }
}
