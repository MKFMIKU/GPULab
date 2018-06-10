package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer author;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "model_region")
    private String modelRegion;

    @Column(name = "last_modify_date")
    private Date lastModifyDate;

    @Column(name = "model_about")
    private String modelAbout;

    @Column(name = "data_code")
    private String dataCode;

    @Column(name = "model_code")
    private String modelCode;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return author
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(Integer author) {
        this.author = author;
    }

    /**
     * @return model_name
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return model_region
     */
    public String getModelRegion() {
        return modelRegion;
    }

    /**
     * @param modelRegion
     */
    public void setModelRegion(String modelRegion) {
        this.modelRegion = modelRegion;
    }

    /**
     * @return last_modify_date
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * @param lastModifyDate
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    /**
     * @return model_about
     */
    public String getModelAbout() {
        return modelAbout;
    }

    /**
     * @param modelAbout
     */
    public void setModelAbout(String modelAbout) {
        this.modelAbout = modelAbout;
    }

    /**
     * @return data_code
     */
    public String getDataCode() {
        return dataCode;
    }

    /**
     * @param dataCode
     */
    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    /**
     * @return model_code
     */
    public String getModelCode() {
        return modelCode;
    }

    /**
     * @param modelCode
     */
    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }
}