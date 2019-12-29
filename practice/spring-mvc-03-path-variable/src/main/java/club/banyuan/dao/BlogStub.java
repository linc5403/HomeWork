package club.banyuan.dao;

import java.util.Date;

public class BlogStub {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String title;

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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private String content;
    private Date createAt;

    public BlogStub(String title, String content, Date createAt) {
        this.title = title;
        this.content = content;
        this.createAt = createAt;
    }
}
