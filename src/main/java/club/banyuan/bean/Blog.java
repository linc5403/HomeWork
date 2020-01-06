package club.banyuan.bean;

import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.util.Date;

public class Blog {
    private String title;
    private String content;
    private Date createdTime;
    private int id;
    private User user;

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdTime=" + createdTime +
                ", id=" + id +
                ", user=" + user +
                '}';
    }

    public Blog() {
    }

    public Blog(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
