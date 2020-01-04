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
        navStr += "<li class='prev'>";
        navStr += "<a href='javascript:void(0)' rel='" + blogs.prePage + "'>";
        // navStr += "<span aria-hidden='true'>&larr;</span>";
        navStr += "上一页";
        navStr += "</a>";
        navStr += "</li>";
    }
    if (blogs.hasNextPage)
    {
        navStr += "<li class='next'>";
        navStr += "<a href='javascript:void(0)' rel='" + blogs.nextPage + "'>";
        // navStr += "<span aria-hidden='true'>&larr;</span>";
        navStr += "下一页";
        navStr += "</a>";
        navStr += "</li>";
    }
    navStr += "</ul>";
    console.log("nav111111111")
    console.log(nav);
    console.log(navStr);
    nav.html(navStr);
    console.log("nav222222222")
    console.log(nav);
    console.log(blogList);
    blogList.append(nav);
    console.log(blogList);
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
    $("#ul-nav li a").on('click',function(){
        console.log($(this).text());
        var rel = $(this).attr("rel");
        if(rel){
            getBlogs(rel);
        }
    });
});



/*
 $.get('/users/aa').done(function (blogs) {
     console.log(blogs);
     var blog;
     for (blog of blogs.list) {
         console.log(blog);
         var blogItem = $('<div class="blog-post"> </div>');

         var blogTitle = $('<h3 class="blog-post-title")> </h3>');
         blogTitle.html('<a href="/blogs/' + blog.id +'">' + blog.title + '</a>');
         blogItem.append(blogTitle);

         var blogCreatedTime = $('<p class="blog-post-meta"> <a href="#">Web开发</a></p>');
         blogCreatedTime.html(blog.createdTime);
         blogItem.append(blogCreatedTime);

         var blogContent = $('<p class="blog-post-content"></p>');
         blogContent.html(blog.content);
         blogItem.append(blogContent);

         $('#blog-list').append(blogItem);
         $('#blog-list').append('<hr>')
     }
     if (blogs.hasPreviousPage)
     {
         var preNav = $(
             '<li class="previous"><a href="{/users/"' + blog.userId + '?page=' + blogs.prePage + '><span aria-hidden="true">&larr;</span> 上一页</a></li>');
         $('#nav').append(preNav);
     }
     if (blogs.hasNextPage)
     {
         var nextNav = $(
             '<li class="next"><a href="{/users/"' + blog.userId + '?page=' + blogs.nextPage + '><span aria-hidden="true">&larr;</span> 下一页</a></li>');
         $('#nav').append(nextNav);
     }
 });
}
*/
