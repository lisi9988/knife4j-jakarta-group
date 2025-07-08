package io.github.lisi9988.controller;

import io.github.lisi9988.model.dto.UserDto;
import io.github.lisi9988.model.dto.UserPageDto;
import io.github.lisi9988.model.entity.User;
import io.github.lisi9988.toolkit.Result;
import io.github.lisi9988.toolkit.ValidGroup;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
     * 用户列表
     *
     * @param dto 分页查询信息
     * @return List < User>
     * @author Tomcat
     */
    @Operation(summary = "用户列表")
    @GetMapping("list")
    public List<User> list(UserPageDto dto) {
        return null;
    }

    /**
     * 查询用户详情
     *
     * @param id id
     * @return Result<User>
     * @author Tomcat
     */
    @Operation(summary = "用户详情")
    @GetMapping(value = "{id}")
    public Result<User> getInfo(@PathVariable Integer id) {
        return null;
    }

    /**
     * 添加
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    // @Operation(summary = "添加用户", groups = ValidGroup.Create.class)
    @Operation(summary = "添加用户")
    @PostMapping
    public Result<Void> add(@RequestBody @Validated(ValidGroup.Create.class) UserDto dto) {
        return null;
    }

    /**
     * 修改用户
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    // @Operation(summary = "更改用户", groups = ValidGroup.Update.class)
    @Operation(summary = "更改用户")
    @PutMapping
    public Result<Void> update(@RequestBody @Validated(ValidGroup.Update.class) UserDto dto) {
        return null;
    }


    /**
     * 修改用户
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    // @Operation(summary = "查询用户", groups = ValidGroup.Query.class)
    @Operation(summary = "查询用户")
    @GetMapping("query")
    public Result<Void> query(@Validated(ValidGroup.Query.class) UserDto dto) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    // @Operation(summary = "删除用户", groups = ValidGroup.Delete.class)
    @Operation(summary = "删除用户")
    @DeleteMapping("delete")
    public Result<Void> delete(@RequestBody @Validated(ValidGroup.Delete.class) UserDto dto) {
        return null;
    }
}
