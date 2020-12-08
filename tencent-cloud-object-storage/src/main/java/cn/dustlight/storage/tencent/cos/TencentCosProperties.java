package cn.dustlight.storage.tencent.cos;

import com.qcloud.cos.http.HttpProtocol;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dustlight.storage.tencent.cos")
public class TencentCosProperties {

    private boolean enabled = true;
    private String secretId;
    private String secretKey;
    private String bucket;
    private String region;
    private String generalApi = null;
    private String serviceApi = "service.cos.myqcloud.com";
    private HttpProtocol httpProtocol = HttpProtocol.https;

    public String getGeneralApi() {
        return generalApi;
    }

    public void setGeneralApi(String generalApi) {
        this.generalApi = generalApi;
    }

    public String getServiceApi() {
        return serviceApi;
    }

    public void setServiceApi(String serviceApi) {
        this.serviceApi = serviceApi;
    }

    public HttpProtocol getHttpProtocol() {
        return httpProtocol;
    }

    public void setHttpProtocol(HttpProtocol httpProtocol) {
        this.httpProtocol = httpProtocol;
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
