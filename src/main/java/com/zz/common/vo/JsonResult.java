package com.zz.common.vo;

import com.zz.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class JsonResult implements Serializable {
    private Integer result = 200;
    private String msg;
    private Object data;
    private Serializable token;


    public JsonResult(String e) {
        this.msg = e;
    }

    public JsonResult(Object data, Serializable token) {
        this.data = data;
        this.token = token;
    }

    public JsonResult(Object data) {
        this.data = data;

    }

    public JsonResult(Throwable throwable) {
        this.result = 500;
        this.msg = throwable.getMessage();
    }


    //当正确时返回的值
    public static JsonResult success(Object data) {
        JsonResult re = new JsonResult();
        re.setResult(200);
        re.setMsg("OK");
        re.setData(data);
        return re;
    }


    public static JsonResult success() {
        return success(null);
    }

    //当错误时返回的值
    public static JsonResult error(int code, String msg) {
        JsonResult result = new JsonResult();
        result.setResult(code);
        result.setMsg(msg);
        return result;
    }


}
