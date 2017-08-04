package com.hyc.utils;

import java.io.Serializable;
import java.util.List;

public class PageData<T>
  extends Page
  implements Serializable
{
  private static final long serialVersionUID = -5617880060193122233L;
  private List<T> dataList;
  
  public PageData() {}
  
  public PageData(Page paramPage)
  {
    this.currentPage = paramPage.currentPage;
    this.pageSize = paramPage.pageSize;
    this.recordCount = paramPage.recordCount;
    this.pageCount = paramPage.pageCount;
    this.firstPage = paramPage.firstPage;
    this.lastPage = paramPage.lastPage;
    this.nextPage = paramPage.nextPage;
    this.prePage = paramPage.prePage;
    this.startRecord = paramPage.startRecord;
    this.endRecord = paramPage.endRecord;
    this.autoCount = paramPage.autoCount;
    this.hasNextPage = paramPage.hasNextPage;
    this.hasPrePage = paramPage.hasPrePage;
  }
  
  public PageData(List<T> paramList)
  {
    this.dataList = paramList;
  }
  
  public List<T> getDataList()
  {
    return this.dataList;
  }
  
  public void setDataList(List<T> paramList)
  {
    this.dataList = paramList;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    
    localStringBuilder.append("dataList.size:");
    localStringBuilder.append(null == this.dataList ? "0" : 
      Integer.valueOf(this.dataList.size()));
    localStringBuilder.append(",");
    localStringBuilder.append(super.toString());
    
    return localStringBuilder.toString();
  }
}
