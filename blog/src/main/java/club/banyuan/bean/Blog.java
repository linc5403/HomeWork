package club.banyuan.bean;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable {
    private String title;
    private String content;
    private Date createdTime;
    private int id;
    private User author;

    public Blog() {
    }

    public Blog(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
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
                ", author=" + author.toString() +
                '}';
    }
}
