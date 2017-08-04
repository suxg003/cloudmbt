package com.hyc.utils;

import java.io.Serializable;

public class Page
  extends StatusData
  implements Serializable
{
  private static final long serialVersionUID = 4418332053713380699L;
  public static final String CURRENT_PAGE_KEY = "currentPage";
  public static final String CURRENT_PAGE_CONDITION_KEY = "current_page";
  public static final String DEFAULT_CURRENT_PAGE_STR = "1";
  private static final int DEFAULT_CURRENT_PAGE = 1;
  private static final int DEFAULT_PAGE_SIZE = 10;
  private static final int DEFAULT_RECORD_COUNT = -1;
  private static final boolean DEFAULT_AUTO_COUNT = true;
  protected int currentPage = 1;
  protected int pageCount = 1;
  protected int pageSize = 10;
  protected int recordCount = -1;
  protected int startRecord = -1;
  protected int endRecord = -1;
  protected int firstPage = 1;
  protected int prePage = 1;
  protected int nextPage = 1;
  protected int lastPage = 1;
  protected boolean hasPrePage = false;
  protected boolean hasNextPage = false;
  protected boolean autoCount = true;
  
  public Page() {}
  
  public Page(int paramInt)
  {
    this.currentPage = paramInt;
  }
  
  public Page(int paramInt1, int paramInt2)
  {
    this.currentPage = paramInt1;
    this.pageSize = paramInt2;
  }
  
  public int getCurrentPage()
  {
    return this.currentPage;
  }
  
  public int getPageCount()
  {
    return this.pageCount;
  }
  
  public int getPageSize()
  {
    return this.pageSize;
  }
  
  public int getRecordCount()
  {
    return this.recordCount;
  }
  
  public int getStartRecord()
  {
    return this.startRecord;
  }
  
  public int getEndRecord()
  {
    return this.endRecord;
  }
  
  public int getFirstPage()
  {
    return this.firstPage;
  }
  
  public int getLastPage()
  {
    return this.lastPage;
  }
  
  public int getPrePage()
  {
    return this.prePage;
  }
  
  public int getNextPage()
  {
    return this.nextPage;
  }
  
  public boolean isHasPrePage()
  {
    return this.hasPrePage;
  }
  
  public boolean isHasNextPage()
  {
    return this.hasNextPage;
  }
  
  public void setCurrentPage(int paramInt)
  {
    this.currentPage = paramInt;
  }
  
  public void setPageSize(int paramInt)
  {
    this.pageSize = paramInt;
  }
  
  public void setRecordCount(int paramInt)
  {
    this.recordCount = paramInt;
  }
  
  public void setAutoCount(boolean paramBoolean)
  {
    this.autoCount = paramBoolean;
  }
  
  public boolean isAutoCount()
  {
    if (this.recordCount == -1) {
      return true;
    }
    return this.autoCount;
  }
  
  public void refresh()
  {
    this.pageCount = (this.recordCount > 0 ? (this.recordCount + this.pageSize - 1) / this.pageSize : 1);
    


    this.currentPage = (this.currentPage > this.pageCount ? this.pageCount : this.currentPage);
    
    this.currentPage = (this.currentPage < 1 ? 1 : this.currentPage);
    
    this.startRecord = ((this.currentPage - 1) * this.pageSize);
    this.endRecord = (this.startRecord + this.pageSize - 1);
    
    this.prePage = (this.currentPage - 1 < 1 ? 1 : this.currentPage - 1);
    this.nextPage = (this.currentPage + 1 > this.pageCount ? this.pageCount : this.currentPage + 1);
    

    this.lastPage = this.pageCount;
    
    this.hasPrePage = (this.prePage < this.currentPage);
    this.hasNextPage = (this.nextPage > this.currentPage);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    
    localStringBuilder.append("currentPage:");
    localStringBuilder.append(this.currentPage);
    localStringBuilder.append(",");
    
    localStringBuilder.append("pageCount:");
    localStringBuilder.append(this.pageCount);
    localStringBuilder.append(",");
    
    localStringBuilder.append("pageSize:");
    localStringBuilder.append(this.pageSize);
    localStringBuilder.append(",");
    
    localStringBuilder.append("recordCount:");
    localStringBuilder.append(this.recordCount);
    localStringBuilder.append(",");
    
    localStringBuilder.append("startRecord:");
    localStringBuilder.append(this.startRecord);
    localStringBuilder.append(",");
    
    localStringBuilder.append("endRecord:");
    localStringBuilder.append(this.endRecord);
    localStringBuilder.append(",");
    
    localStringBuilder.append("firstPage:");
    localStringBuilder.append(this.firstPage);
    localStringBuilder.append(",");
    
    localStringBuilder.append("lastPage:");
    localStringBuilder.append(this.lastPage);
    localStringBuilder.append(",");
    
    localStringBuilder.append("prePage:");
    localStringBuilder.append(this.prePage);
    localStringBuilder.append(",");
    
    localStringBuilder.append("nextPage:");
    localStringBuilder.append(this.nextPage);
    localStringBuilder.append(",");
    
    localStringBuilder.append("hasPrePage:");
    localStringBuilder.append(this.hasPrePage);
    localStringBuilder.append(",");
    
    localStringBuilder.append("hasNextPage:");
    localStringBuilder.append(this.hasNextPage);
    localStringBuilder.append(",");
    
    localStringBuilder.append("autoCount:");
    localStringBuilder.append(this.autoCount);
    localStringBuilder.append(",");
    
    localStringBuilder.append(super.toString());
    
    return localStringBuilder.toString();
  }
}