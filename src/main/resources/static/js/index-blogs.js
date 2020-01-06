function formatBlogItem(blogs) {
    var blogList = $('#blog-list');
    blogList.empty();
    var blog;
    for (blog of blogs.list) {
        console.log(blog);
        var blogItem = $('<div class="blog-post"> </div>');

        var blogTitle = $('<h3 class="blog-post-title")> </h3>');
        blogTitle.html('<a href="/blogs/' + blog.id + '">' + blog.title + '</a>');
        blogItem.append(blogTitle);

        var blogCreatedTime = $('<p class="blog-post-meta"> <a href="#">Web开发</a></p>');
        blogCreatedTime.html(blog.createdTime);
        blogItem.append(blogCreatedTime);

        var blogContent = $('<p class="blog-post-content"></p>');
        blogContent.html(blog.content);
        blogItem.append(blogContent);

        blogList.append(blogItem);
        blogList.append('<hr>');
    }

    var nav = $("<nav></nav>");
    var navStr = "<ul id='ul-nav' class='pager'>";
    if (blogs.hasPreviousPage)
    {
        navStr += "<li class='previous'>";
        navStr += "<a href='javascript:void(0)' onclick='getBlogs(" + blogs.prePage + ")' >";
        navStr += "<span aria-hidden='true'>&larr;</span>";
        navStr += "上一页";
        navStr += "</a>";
        navStr += "</li>";
    }
    if (blogs.hasNextPage)
    {
        navStr += "<li class='next'>";
        navStr += "<a href='javascript:void(0)' onclick='getBlogs(" + blogs.nextPage + ")' >";
        navStr += "下一页";
        navStr += "<span aria-hidden='true'>&rarr;</span>";
        navStr += "</a>";
        navStr += "</li>";
    }
    navStr += "</ul>";
    nav.html(navStr);
    blogList.append(nav);
}

function getBlogs(page) {
    $.ajax({
            url: '/blogs',
            type: 'GET',
            data: {'page': page},
            dataType: 'json',
            success: function (blogs) {
                if (blogs.size > 0) {
                    formatBlogItem(blogs);
                }
            }
        }
    )
}

$(function(){
    getBlogs(1);
});
