package web.domain;

import java.util.Date;

public class ApiRequestHistory {
    private String apiRequestHistorySysId;

    private String clientInfo;

    private String requestInfo;

    private String returnInfo;

    private Date requestTime;

    private String requestMethod;

    private String startTime;

    private String endTime;

    private String execTime;

    public String getApiRequestHistorySysId() {
        return apiRequestHistorySysId;
    }

    public void setApiRequestHistorySysId(String apiRequestHistorySysId) {
        this.apiRequestHistorySysId = apiRequestHistorySysId == null ? null : apiRequestHistorySysId.trim();
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo == null ? null : clientInfo.trim();
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo == null ? null : requestInfo.trim();
    }

    public String getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo == null ? null : returnInfo.trim();
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime == null ? null : execTime.trim();
    }
}