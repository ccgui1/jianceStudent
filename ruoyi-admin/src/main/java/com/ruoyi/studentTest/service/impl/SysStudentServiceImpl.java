package com.ruoyi.studentTest.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.studentTest.mapper.SysStudentMapper;
import com.ruoyi.studentTest.domain.SysStudent;
import com.ruoyi.studentTest.service.ISysStudentService;

/**
 * 学员信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-22
 */
@Service
public class SysStudentServiceImpl implements ISysStudentService 
{
    @Autowired
    private SysStudentMapper sysStudentMapper;

    /**
     * 查询学员信息
     * 
     * @param userId 学员信息主键
     * @return 学员信息
     */
    @Override
    public SysStudent selectSysStudentByUserId(Long userId)
    {
        return sysStudentMapper.selectSysStudentByUserId(userId);
    }

    /**
     * 查询学员信息列表
     * 
     * @param sysStudent 学员信息
     * @return 学员信息
     */
    @Override
    public List<SysStudent> selectSysStudentList(SysStudent sysStudent)
    {
        return sysStudentMapper.selectSysStudentList(sysStudent);
    }

    /**
     * 新增学员信息
     * 
     * @param sysStudent 学员信息
     * @return 结果
     */
    @Override
    public int insertSysStudent(SysStudent sysStudent)
    {
        return sysStudentMapper.insertSysStudent(sysStudent);
    }

    /**
     * 修改学员信息
     * 
     * @param sysStudent 学员信息
     * @return 结果
     */
    @Override
    public int updateSysStudent(SysStudent sysStudent)
    {
        return sysStudentMapper.updateSysStudent(sysStudent);
    }

    /**
     * 批量删除学员信息
     * 
     * @param userIds 需要删除的学员信息主键
     * @return 结果
     */
    @Override
    public int deleteSysStudentByUserIds(Long[] userIds)
    {
        return sysStudentMapper.deleteSysStudentByUserIds(userIds);
    }

    /**
     * 删除学员信息信息
     * 
     * @param userId 学员信息主键
     * @return 结果
     */
    @Override
    public int deleteSysStudentByUserId(Long userId)
    {
        return sysStudentMapper.deleteSysStudentByUserId(userId);
    }
}
