package cn.xyz.mbs.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fanchengwei on 2017/7/29.
 */
public class CustomerDateDonverter implements Converter<String,Date>{

    @Override
    public Date convert(String source) {
        //将日期串转换为日期类型
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //转换成功直接返回
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //转换失败，返回null
        return null;
    }
}
