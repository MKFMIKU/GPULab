package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Experiments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "model_id")
    private Integer modelId;

    private Integer epoch;

    private Float result;

    private String checkpoint;

    @Column(name = "create_date")
    private Date createDate;

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
     * @return model_id
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * @param modelId
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * @return epoch
     */
    public Integer getEpoch() {
        return epoch;
    }

    /**
     * @param epoch
     */
    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    /**
     * @return result
     */
    public Float getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(Float result) {
        this.result = result;
    }

    /**
     * @return checkpoint
     */
    public String getCheckpoint() {
        return checkpoint;
    }

    /**
     * @param checkpoint
     */
    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}