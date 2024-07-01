package com.cuckooji.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.cuckooji.common.core.domain.model.LoginUser;
import com.cuckooji.common.utils.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 审计数据自动填充
 *
 * @author shiloh
 * @date 2024/6/26 17:33
 */
@Slf4j
@Component
public class SysMetaObjectHandler implements MetaObjectHandler {
    /**
     * 新增时填充
     *
     * @param metaObject 元数据对象
     * @author shiloh
     * @date 2024/6/26 17:35
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        try {
            final LoginUser user = SecurityUtils.getLoginUser();
            final Date now = new Date();
            this.setFieldValByName("createTime", now, metaObject);
            this.setFieldValByName("createBy", user.getUsername(), metaObject);
            this.setFieldValByName("updateTime", now, metaObject);
            this.setFieldValByName("updateBy", user.getUserId(), metaObject);
        } catch (Exception ignored) {
            // ignored
        }

    }

    /**
     * 更新时填充
     *
     * @param metaObject 元数据对象
     * @author shiloh
     * @date 2024/6/26 17:35
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        try {
            final LoginUser user = SecurityUtils.getLoginUser();
            this.setFieldValByName("updateTime", new Date(), metaObject);
            this.setFieldValByName("updateBy", user.getUserId(), metaObject);
        } catch (Exception ignored) {
            // ignored
        }
    }
}
