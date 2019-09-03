package com.airan.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2019/9/3.
 */
@Entity
@Table(name = "product", schema = "fund_product")
public class ProductEntity {
    private int id;
    private String serialNum;
    private String name;
    private BigDecimal vetValue;
    private BigDecimal startPoint;
    private BigDecimal profitRate;
    private String presentation;
    private int managerId;
    private int inventory;
    private Timestamp seckillStartTime;
    private Timestamp seckillEndTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "serial_num")
    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "vet_value")
    public BigDecimal getVetValue() {
        return vetValue;
    }

    public void setVetValue(BigDecimal vetValue) {
        this.vetValue = vetValue;
    }

    @Basic
    @Column(name = "start_point")
    public BigDecimal getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(BigDecimal startPoint) {
        this.startPoint = startPoint;
    }

    @Basic
    @Column(name = "profit_rate")
    public BigDecimal getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(BigDecimal profitRate) {
        this.profitRate = profitRate;
    }

    @Basic
    @Column(name = "presentation")
    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    @Basic
    @Column(name = "manager_id")
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "inventory")
    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Basic
    @Column(name = "seckill_start_time")
    public Timestamp getSeckillStartTime() {
        return seckillStartTime;
    }

    public void setSeckillStartTime(Timestamp seckillStartTime) {
        this.seckillStartTime = seckillStartTime;
    }

    @Basic
    @Column(name = "seckill_end_time")
    public Timestamp getSeckillEndTime() {
        return seckillEndTime;
    }

    public void setSeckillEndTime(Timestamp seckillEndTime) {
        this.seckillEndTime = seckillEndTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (id != that.id) return false;
        if (managerId != that.managerId) return false;
        if (inventory != that.inventory) return false;
        if (serialNum != null ? !serialNum.equals(that.serialNum) : that.serialNum != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (vetValue != null ? !vetValue.equals(that.vetValue) : that.vetValue != null) return false;
        if (startPoint != null ? !startPoint.equals(that.startPoint) : that.startPoint != null) return false;
        if (profitRate != null ? !profitRate.equals(that.profitRate) : that.profitRate != null) return false;
        if (presentation != null ? !presentation.equals(that.presentation) : that.presentation != null) return false;
        if (seckillStartTime != null ? !seckillStartTime.equals(that.seckillStartTime) : that.seckillStartTime != null)
            return false;
        if (seckillEndTime != null ? !seckillEndTime.equals(that.seckillEndTime) : that.seckillEndTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (serialNum != null ? serialNum.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (vetValue != null ? vetValue.hashCode() : 0);
        result = 31 * result + (startPoint != null ? startPoint.hashCode() : 0);
        result = 31 * result + (profitRate != null ? profitRate.hashCode() : 0);
        result = 31 * result + (presentation != null ? presentation.hashCode() : 0);
        result = 31 * result + managerId;
        result = 31 * result + inventory;
        result = 31 * result + (seckillStartTime != null ? seckillStartTime.hashCode() : 0);
        result = 31 * result + (seckillEndTime != null ? seckillEndTime.hashCode() : 0);
        return result;
    }
}
