package hlinfo.springboot.entity;

import java.io.Serializable;

public class Rootlog implements Serializable {
    private Long id;
    private String logname;
    private String ip;
    private String logtime;
    private String role;
    private String logcon;

    public Rootlog() {
    }

    public Rootlog(Long id, String logname, String ip, String logtime, String role, String logcon) {
        this.id = id;
        this.logname = logname;
        this.ip = ip;
        this.logtime = logtime;
        this.role = role;
        this.logcon = logcon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogcon() {
        return logcon;
    }

    public void setLogcon(String logcon) {
        this.logcon = logcon;
    }
}
