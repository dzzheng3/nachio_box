package com.ocnyang.qbox.app.model.entities;

import java.util.List;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/2/16 10:11.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public class NewsItem {

    /**
     * articles : [{"author":"Lucas Matney","description":"Google has been experimenting with smartphone AR since it first showed off Project Tango in 2014. Three years later the company has some great technology to..","publishedAt":"2017-08-29T15:01:49Z","title":"Google shows off ARCore, its answer to Apple\u2019s ARKit","url":"https://techcrunch.com/2017/08/29/google-shows-off-arcore-its-answer-to-apples-arkit/","urlToImage":"https://tctechcrunch2011.files.wordpress.com/2017/08/arcore_hero.png"},{"author":"Jonathan Shieber","description":"In the intervening years since those storms, the nation has been continually pummeled by  climatological events. While the country has been taking..","publishedAt":"2017-09-02T16:59:17Z","title":"After Harvey, ignore the climate debate and focus on building better, more efficient cities","url":"https://techcrunch.com/2017/09/02/after-harvey-ignore-the-climate-debate-and-focus-on-building-better-more-efficient-cities/","urlToImage":"https://tctechcrunch2011.files.wordpress.com/2017/08/gettyimages-840594602.jpg"}]
     * sortBy : top
     * source : techcrunch
     * status : ok
     */

    private String sortBy;
    private String source;
    private String status;
    private List<ArticlesBean> articles;

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }

    public static class ArticlesBean {
        /**
         * author : Lucas Matney
         * description : Google has been experimenting with smartphone AR since it first showed off Project Tango in 2014. Three years later the company has some great technology to..
         * publishedAt : 2017-08-29T15:01:49Z
         * title : Google shows off ARCore, its answer to Apple’s ARKit
         * url : https://techcrunch.com/2017/08/29/google-shows-off-arcore-its-answer-to-apples-arkit/
         * urlToImage : https://tctechcrunch2011.files.wordpress.com/2017/08/arcore_hero.png
         */

        private String author;
        private String description;
        private String publishedAt;
        private String title;
        private String url;
        private String urlToImage;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }
    }
}
