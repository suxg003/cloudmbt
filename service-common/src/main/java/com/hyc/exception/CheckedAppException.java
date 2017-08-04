package com.hyc.exception;


public class CheckedAppException
  extends Exception
{
  private static final long serialVersionUID = -2698957087485471079L;
  private String errorCode;
  
  public CheckedAppException(String paramString)
  {
    this.errorCode = paramString;
  }
  
  public CheckedAppException(String paramString1, String paramString2)
  {
    super(paramString2);
    this.errorCode = paramString1;
  }
  
  public CheckedAppException(String paramString, Throwable paramThrowable)
  {
    super(paramThrowable);
    this.errorCode = paramString;
  }
  
  public CheckedAppException(String paramString1, String paramString2, Throwable paramThrowable)
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
    return paramException instanceof CheckedAppException;
  }
}
