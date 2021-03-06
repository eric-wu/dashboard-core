package org.sagebionetworks.dashboard.model;

public class SynapseRepoRecord implements AccessRecord {
    public String getSessionId() {
        return sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getObjectId() {
        return objectId;
    }
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getQueryString() {
        return queryString;
    }
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getLatency() {
        return latency;
    }
    public void setLatency(Long latency) {
        this.latency = latency;
    }
    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    public String getStack() {
        return stack;
    }
    public void setStack(String stack) {
        this.stack = stack;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getInstance() {
        return instance;
    }
    public void setInstance(String instance) {
        this.instance = instance;
    }
    public String getVM() {
        return vmId;
    }
    public void setVM(String vmId) {
        this.vmId = vmId;
    }
    public String getThreadId() {
        return threadId;
    }
    public void setThreadId(String threadId){
        this.threadId = threadId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SynapseRepoRecord [sessionId=").append(sessionId).append(", timestamp=")
                .append(timestamp).append(", userId=").append(userId).append(", objectId=")
                .append(objectId).append(", method=").append(method).append(", uri=").append(uri)
                .append(", queryString=").append(queryString).append(", status=").append(status)
                .append(", latency=").append(latency).append(", userAgent=").append(userAgent)
                .append(", stack=").append(stack).append(", host=").append(host)
                .append(", instance=").append(instance).append(", vmId=").append(vmId)
                .append(", threadId=").append(threadId).append("]");
        return builder.toString();
    }

    private String sessionId;
    private Long timestamp;
    private String userId;
    private String objectId;
    private String method;
    private String uri;
    private String queryString;
    private String status;
    private Long latency;
    private String userAgent;
    private String stack;
    private String host;
    private String instance;
    private String vmId;
    private String threadId;
}
