package club.banyuan.bean;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable {
    private String title;
    private String content;
    private Date createdTime;
    private int id;
    private int user_id;

    public Blog (String title, String content, User user) {
        return;
    }

    public Blog () {
        return;
    }

    public void setAuthor(User author) {

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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdTime=" + createdTime +
                ", id=" + id +
                ", user_id=" + user_id +
                '}';
    }
}
