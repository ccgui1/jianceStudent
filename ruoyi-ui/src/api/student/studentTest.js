import request from '@/utils/request'

// 查询学员信息列表
export function listStudentTest(query) {
  return request({
    url: '/student/studentTest/list',
    method: 'get',
    params: query
  })
}

// 查询学员信息详细
export function getStudentTest(userId) {
  return request({
    url: '/student/studentTest/' + userId,
    method: 'get'
  })
}

// 新增学员信息
export function addStudentTest(data) {
  return request({
    url: '/student/studentTest',
    method: 'post',
    data: data
  })
}

// 修改学员信息
export function updateStudentTest(data) {
  return request({
    url: '/student/studentTest',
    method: 'put',
    data: data
  })
}

// 删除学员信息
export function delStudentTest(userId) {
  return request({
    url: '/student/studentTest/' + userId,
    method: 'delete'
  })
}
