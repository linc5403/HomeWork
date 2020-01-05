package club.banyuan.myblog.module;

import java.io.Serializable;
import java.sql.Date;

public class Blog implements Serializable {
    private Integer id;
    private String title;
    private Date createdTime;
    private Integer userId;
    private String content;

    public Blog() {
    }

    public Blog(String title, Date createdTime, Integer userId, String content) {
        this.title = title;
        this.createdTime = createdTime;
        this.userId = userId;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createdTime=" + createdTime +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
