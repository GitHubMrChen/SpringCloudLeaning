package com.springcloud.leaning.pojo;

import java.util.Date;

// @Table(name = "")
public class User {

    // @Id
    // @KeySql=(useGeneratedKeys = true)
    private Long id;

   private String userName; // 用户名

   private String password; // 密码

   private String name; // 姓名

   private Integer age; // 年龄

   private Integer sex; // 性别 1女性 2男性

   private Date birthday; // 出生日期

   private Date created; // 创建时间

   private Date updated; // 更新时间

   private String note; // 备注

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getAge() {
      return age;
   }

   public void setAge(Integer age) {
      this.age = age;
   }

   public Integer getSex() {
      return sex;
   }

   public void setSex(Integer sex) {
      this.sex = sex;
   }

   public Date getBirthday() {
      return birthday;
   }

   public void setBirthday(Date birthday) {
      this.birthday = birthday;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Date getUpdated() {
      return updated;
   }

   public void setUpdated(Date updated) {
      this.updated = updated;
   }

   public String getNote() {
      return note;
   }

   public void setNote(String note) {
      this.note = note;
   }
}
