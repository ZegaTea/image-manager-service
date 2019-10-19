package com.ttc.faceid.model.response;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tudv on 2019/10/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageResponse {
    @Expose
    private String imageName;
    @Expose
    private String imageLink;
    @Expose
    private double imageSize;
}
