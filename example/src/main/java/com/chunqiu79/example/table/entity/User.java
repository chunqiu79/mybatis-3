package com.chunqiu79.example.table.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: chunqiu79
 * @time: 2024/4/7 10:57
 * @desc: 用户表
 */
public class User {

    /**
     * id
     */
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 更新时间
     */
    private Date updateTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", amount=" + amount +
      ", updateTime=" + updateTime +
      '}';
  }

}
