package io.github.lisi9988.controller;

import io.github.lisi9988.model.dto.UploadDto;
import io.github.lisi9988.model.dto.UserDto;
import io.github.lisi9988.model.dto.UserPageDto;
import io.github.lisi9988.model.entity.User;
import io.github.lisi9988.toolkit.Result;
import io.github.lisi9988.toolkit.ValidGroup;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 用户前端控制层
 *
 * @author Tomcat
 */
@RestController
@Tag(name = "用户")
@RequestMapping("user")
public class UserController {

    /**
     * GET请求, 用户列表, 测试请求和响应参数分组
     *
     * @param dto 分页查询信息
     * @return List < User>
     * @author Tomcat
     */
    @Operation(summary = "用户列表", groups = ValidGroup.List.class)
    @GetMapping("list")
    public Result<List<User>> list(UserPageDto dto) {
        return null;
    }

    /**
     * GET请求,用户查询, 测试请求和响应参数分组
     *
     * @param dto 分页查询信息
     * @return List < User>
     * @author Tomcat
     */
    @Operation(summary = "用户查询", groups = ValidGroup.Query.class)
    @GetMapping("query")
    public Result<List<User>> query(UserPageDto dto) {
        return null;
    }

    /**
     * GET请求,查询用户详情, 测试响应参数分组
     *
     * @param id id
     * @return Result<User>
     * @author Tomcat
     */
    @Operation(summary = "用户详情", groups = ValidGroup.Query.class)
    @GetMapping(value = "{id}")
    public Result<User> getInfo(@PathVariable Integer id) {
        return null;
    }

    /**
     * POST请求, 添加用户, 测试请求参数分组
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "添加用户", groups = ValidGroup.Create.class)
    @PostMapping
    public Result<Void> add(@RequestBody @Validated(ValidGroup.Create.class) UserDto dto) {
        return null;
    }

    /**
     * PUT请求,修改用户, 测试请求参数分组
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "更改用户", groups = ValidGroup.Update.class)
    @PutMapping
    public Result<Void> update(@RequestBody @Validated(ValidGroup.Update.class) UserDto dto) {
        return null;
    }

    /**
     * DELETE请求,删除用户, 测试请求参数分组
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "删除用户", groups = ValidGroup.Delete.class)
    @DeleteMapping("delete")
    public Result<Void> delete(@RequestBody @Validated(ValidGroup.Delete.class) UserDto dto) {
        return null;
    }

    /**
     * 上传, 测试单个文件上传参数
     *
     * @param file 上传文件
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "上传")
    @PostMapping("upload")
    public Result<Void> upload(@RequestParam("file") @NotNull(message = "请选择上传文件") MultipartFile file) {
        return null;
    }

    /**
     * 上传,测试Parameter参数形式上传,参数必填,非必填
     *
     * @param file 上传文件
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "上传1")
    @PostMapping("upload1")
    public Result<Void> upload1(@RequestParam("file") @NotNull(message = "请选择上传文件") MultipartFile file,
                                @Parameter(description = "id", required = true) Integer id,
                                @Parameter(description = "name") String name) {
        return null;
    }

    /**
     * 上传,测试dto参数形式上传, 参数分组必填,隐藏, 非必填
     *
     * @param dto 上传信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "上传2", groups = ValidGroup.Create.class)
    @PostMapping("upload2")
    public Result<Void> upload2(UploadDto dto) {
        return null;
    }

    /**
     * 上传,测试dto参数形式上传, 参数分组必填,隐藏, 非必填
     *
     * @param dto 上传信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "上传3", groups = ValidGroup.Update.class)
    @PostMapping("upload3")
    public Result<Void> upload3(UploadDto dto) {
        return null;
    }
}
