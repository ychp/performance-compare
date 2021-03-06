package com.ychp.java.bean.copy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author yingchengpeng
 * @date 2018/11/28
 */
@Data
public class ToBean implements Serializable {

    private static final long serialVersionUID = 3049399712676702453L;
    private String id;
    private String name;
    private String desc;
    private String subId;
    private String bizId;
    private Integer bizType;
    private List<String> subBizIds;
    private Integer status;
    private Boolean isDeleted;
    private Long quantity;
    private Map<String, String> extra;
    private String entityId;
    private Integer entityType;
    private Long targetId;
    private Long eventId;
    private Long realQuantityDelta;
    private Long safeQuantityDelta;
    private Long preOrderQuantityDelta;
    private Long withholdQuantityDelta;
    private Long occupyQuantityDelta;
    private Long expectQuantity;
    private Long realQuantityResult;
    private Long safeQuantityResult;
    private Long preOrderQuantityResult;
    private Long withholdQuantityResult;
    private Long occupyQuantityResult;
    private Integer version;
    private Date createdAt;
    private Date updatedAt;

}
