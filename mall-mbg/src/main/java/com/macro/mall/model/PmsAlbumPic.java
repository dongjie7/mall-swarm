package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class PmsAlbumPic implements Serializable {
    private Long id;

    private Long albumId;

    private String pic;

    private static final long serialVersionUID = 1L;
}