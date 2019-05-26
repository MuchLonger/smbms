package cn.smbms.tools;

/**
 * @description:
 * @Time: 2018/10/8 20:59
 */
public class PageSupport {
    private int currentPageNo;
    private int pageSize;
    private int totalCount;

    private int totalPageCount=0;



    public int getTotalPageCount() {
        return totalPageCount;
    }

    public int getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(int currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        totalPageCount=(int)(totalCount/pageSize)+1;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
