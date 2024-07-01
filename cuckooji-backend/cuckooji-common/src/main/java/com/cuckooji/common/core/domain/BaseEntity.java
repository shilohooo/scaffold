package com.cuckooji.common.core.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.cuckooji.common.constant.DatePatternConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Entity基类
 *
 * @author cuckooji
 */
@Setter
@Getter
@ToString
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 创建人 ID
     */
    @TableField("create_by")
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    @JsonFormat(pattern = DatePatternConstants.NORM_DATETIME_PATTERN)
    private Date createTime;

    /**
     * 更新人 ID
     */
    @TableField("update_by")
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField("update_time")
    @JsonFormat(pattern = DatePatternConstants.NORM_DATETIME_PATTERN)
    private Date updateTime;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 逻辑删除标识
     * <p>
     * {@code true} = 已删除，{@code false} = 未删除
     */
    @TableField("deleted")
    private Boolean deleted;

    /**
     * 请求参数
     */
    @TableField(exist = false)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Object> params = new HashMap<>(0);
}
