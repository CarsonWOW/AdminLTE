package com.javacto.po;

import java.io.Serializable;

/**
 * traveller
 * @author 
 */
public class Traveller implements Serializable {
    private String id;

    private String name;

    private String sex;

    private String phonenum;

    private Integer credentialstype;

    private String credentialstypestr;

    private String credentialsnum;

    private Integer travellertype;
    private String travellertypestr;

    public String getCredentialstypestr() {
        if (credentialstype==0){
            credentialstypestr="身份证";
        }else if (credentialstype==1){
            credentialstypestr="学生证";
        }
        return credentialstypestr;
    }

    public void setCredentialstypestr(String credentialstypestr) {
        this.credentialstypestr = credentialstypestr;
    }

    public String getTravellertypestr() {
        if (travellertype==0){
            travellertypestr="成人";
        }else if (travellertype==1){
            travellertypestr="儿童";
        }else if (travellertype==2){
            travellertypestr="老人";
        }
        return travellertypestr;
    }

    public void setTravellertypestr(String travellertypestr) {
        this.travellertypestr = travellertypestr;
    }

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public Integer getCredentialstype() {
        return credentialstype;
    }

    public void setCredentialstype(Integer credentialstype) {
        this.credentialstype = credentialstype;
    }

    public String getCredentialsnum() {
        return credentialsnum;
    }

    public void setCredentialsnum(String credentialsnum) {
        this.credentialsnum = credentialsnum;
    }

    public Integer getTravellertype() {
        return travellertype;
    }

    public void setTravellertype(Integer travellertype) {
        this.travellertype = travellertype;
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
        Traveller other = (Traveller) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPhonenum() == null ? other.getPhonenum() == null : this.getPhonenum().equals(other.getPhonenum()))
            && (this.getCredentialstype() == null ? other.getCredentialstype() == null : this.getCredentialstype().equals(other.getCredentialstype()))
            && (this.getCredentialsnum() == null ? other.getCredentialsnum() == null : this.getCredentialsnum().equals(other.getCredentialsnum()))
            && (this.getTravellertype() == null ? other.getTravellertype() == null : this.getTravellertype().equals(other.getTravellertype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPhonenum() == null) ? 0 : getPhonenum().hashCode());
        result = prime * result + ((getCredentialstype() == null) ? 0 : getCredentialstype().hashCode());
        result = prime * result + ((getCredentialsnum() == null) ? 0 : getCredentialsnum().hashCode());
        result = prime * result + ((getTravellertype() == null) ? 0 : getTravellertype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", phonenum=").append(phonenum);
        sb.append(", credentialstype=").append(credentialstype);
        sb.append(", credentialsnum=").append(credentialsnum);
        sb.append(", travellertype=").append(travellertype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}