create database personalblog
create table post
(
    id int auto_increment,
    is_hot tinyint(1) default 0 null,
    is_top tinyint(1) default 0 null,
    banner_address varchar(255) charset utf8 default '' null,
    title varchar(100) charset utf8 default '' null,
    upload_time datetime not null,
    summary varchar(300) charset utf8 default '' null,
    views_num int default 0 null,
    comment_num int default 0 null,
    is_focus tinyint(1) default 0 not null,
    tag_id int not null,
    constraint post_id_uindex
        unique (id),
    constraint post_tag_id
        foreign key (tag_id) references tag (id)
)
    comment 'table for all the posts';

alter table post
    add primary key (id);

create table tag
(
    id int auto_increment,
    tag_name varchar(30) not null,
    constraint tag_id_uindex
        unique (id),
    constraint tag_tag_name_uindex
        unique (tag_name)
)
    comment 'post tags';

alter table tag
    add primary key (id);

