package io.github.lisi9988.model.dto;

import io.github.lisi9988.toolkit.ValidGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * 上传文件-请求数据载体
 *
 * @author Tomcat
 */
@Getter
@Setter
@Schema(description = "上传文件-请求数据载体")
public class UploadDto implements Serializable {

    /**
     * 文件
     */
    @Schema(description = "文件", groups = {ValidGroup.Create.class, ValidGroup.Update.class})
    private MultipartFile file;

    /**
     * ID
     */
    @Schema(description = "ID", groups = ValidGroup.HiddenUpdate.class)
    private Integer id;

    /**
     * 名称
     */
    @Schema(description = "名称", groups = ValidGroup.HiddenCreate.class)
    private String name;
}
