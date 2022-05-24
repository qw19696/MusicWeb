package com.zf.musicweb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since 2022-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("song")
@ApiModel(value="Song对象", description="")
public class Song implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer singerId;

    private String name;

    private String introduction;

    @ApiModelProperty(value = "发行时间")
    private Date createTime;

    private Date updateTime;

    private String pic;

    private String lyric;

    private String url;


}
