package com.cuckooji.common.exception.user;

import com.cuckooji.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author cuckooji
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
