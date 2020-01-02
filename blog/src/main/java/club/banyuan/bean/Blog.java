package club.banyuan.bean;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable {
    private String title;
    private String content;
    private Date createdTime;
    private int id;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int userId;

    public Blog (String title, String content, User user) {
        return;
    }

    public Blog () {
        return;
    }

    public void setAuthor(User author) {
        this.userId = author.getId();
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

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdTime=" + createdTime +
                ", id=" + id +
                ", userId=" + userId +
                '}';
    }
}
