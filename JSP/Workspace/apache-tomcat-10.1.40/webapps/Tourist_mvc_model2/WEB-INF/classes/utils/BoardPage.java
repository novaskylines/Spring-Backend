package utils;

public class BoardPage {
	public static String pagingStr(int totalCount, int pageSize, int blockPage, int pageNum, String reqUrl) {
		String pagingStr = "";
		
		int totalPages = (int)(Math.ceil((double)totalCount/pageSize));
		
		int pageTemp = (((pageNum-1)/blockPage)*blockPage)+1;
		if(pageTemp != 1) {
			pagingStr = "<a href='" + reqUrl + "?pageNum=1' class=\"firstpage  pbtn\">"
					  + "<img src=\"img/btn_firstpage.png\" alt=\"첫 페이지로 이동\">"
					  + "</a>";
			pagingStr += "&nbsp;";
			pagingStr +="<a href='"+reqUrl+"?pageNum="+(pageTemp-1)+"' class=\"prevpage  pbtn\">"
					  + "<img src=\"img/btn_prevpage.png\" alt=\"이전 페이지로 이동\">"
					  + "</a>";
		}
		int blockCount = 1;
		while(blockCount <= blockPage && pageTemp <= totalPages) {
			if(pageTemp == pageNum) {
				pagingStr += "&nbsp;"
						  + "<a href=\"javascript:;\">"
						  + "<span class=\"pagenum currentpage\">"+pageTemp+"</span>"
						  + "</a>"
						  + "&nbsp;";
			}else {
				pagingStr += "&nbsp;"
						  + "<a href='"+reqUrl+"?pageNum="+pageTemp+"'>"
						  + "<span class=\"pagenum\">"+pageTemp+"</span>"
						  + "</a>"
						  + "&nbsp;";
			}
			pageTemp++;
			blockCount++;
		}
		if(pageTemp<= totalPages) {
			pagingStr += "<a href='"+reqUrl+"?pageNum="+pageTemp+"' class=\"nextpage  pbtn\">"
					  + "<img src=\"img/btn_nextpage.png\" alt=\"다음 페이지로 이동\">"
					  + "</a>";
			pagingStr += "&nbsp;";
			pagingStr += "<a href='"+reqUrl+"?pageNum="+totalPages+"' class=\"lastpage  pbtn\">"
					  + "<img src=\"img/btn_lastpage.png\" alt=\"마지막 페이지로 이동\">"
					  + "</a>";
		}
		
		return pagingStr;
	}
}
