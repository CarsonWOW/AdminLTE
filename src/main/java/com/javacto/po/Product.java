package com.javacto.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * product
 * @author 
 */
public class Product implements Serializable {
    private String id;

    private String productnum;

    private String productname;

    private String cityname;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date departuretime;

    private Integer productprice;

    private String productdesc;

    private Integer productstatus;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductnum() {
        return productnum;
    }

    public void setProductnum(String productnum) {
        this.productnum = productnum;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Integer getProductprice() {
        return productprice;
    }

    public void setProductprice(Integer productprice) {
        this.productprice = productprice;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductnum() == null ? other.getProductnum() == null : this.getProductnum().equals(other.getProductnum()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getDeparturetime() == null ? other.getDeparturetime() == null : this.getDeparturetime().equals(other.getDeparturetime()))
            && (this.getProductprice() == null ? other.getProductprice() == null : this.getProductprice().equals(other.getProductprice()))
            && (this.getProductdesc() == null ? other.getProductdesc() == null : this.getProductdesc().equals(other.getProductdesc()))
            && (this.getProductstatus() == null ? other.getProductstatus() == null : this.getProductstatus().equals(other.getProductstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductnum() == null) ? 0 : getProductnum().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getDeparturetime() == null) ? 0 : getDeparturetime().hashCode());
        result = prime * result + ((getProductprice() == null) ? 0 : getProductprice().hashCode());
        result = prime * result + ((getProductdesc() == null) ? 0 : getProductdesc().hashCode());
        result = prime * result + ((getProductstatus() == null) ? 0 : getProductstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productnum=").append(productnum);
        sb.append(", productname=").append(productname);
        sb.append(", cityname=").append(cityname);
        sb.append(", departuretime=").append(departuretime);
        sb.append(", productprice=").append(productprice);
        sb.append(", productdesc=").append(productdesc);
        sb.append(", productstatus=").append(productstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}