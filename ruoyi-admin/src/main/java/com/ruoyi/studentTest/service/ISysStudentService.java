package com.ruoyi.studentTest.service;

import java.util.List;
import com.ruoyi.studentTest.domain.SysStudent;

/**
 * 学员信息Service接口
 * 
 * @author ruoyi
 * @date 2022-10-22
 */
public interface ISysStudentService 
{
    /**
     * 查询学员信息
     * 
     * @param userId 学员信息主键
     * @return 学员信息
     */
    public SysStudent selectSysStudentByUserId(Long userId);

    /**
     * 查询学员信息列表
     * 
     * @param sysStudent 学员信息
     * @return 学员信息集合
     */
    public List<SysStudent> selectSysStudentList(SysStudent sysStudent);

    /**
     * 新增学员信息
     * 
     * @param sysStudent 学员信息
     * @return 结果
     */
    public int insertSysStudent(SysStudent sysStudent);

    /**
     * 修改学员信息
     * 
     * @param sysStudent 学员信息
     * @return 结果
     */
    public int updateSysStudent(SysStudent sysStudent);

    /**
     * 批量删除学员信息
     * 
     * @param userIds 需要删除的学员信息主键集合
     * @return 结果
     */
    public int deleteSysStudentByUserIds(Long[] userIds);

    /**
     * 删除学员信息信息
     * 
     * @param userId 学员信息主键
     * @return 结果
     */
    public int deleteSysStudentByUserId(Long userId);
}
