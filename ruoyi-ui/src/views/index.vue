<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="24">
        <blockquote class="text-warning" style="font-size: 14px">
          建策报名指南
          <br />
          <el-link
            href="http://www.jiancenj.com/xinwendongtai/165.html"
            type="primary"
            target="_blank"
            >http://www.jiancenj.com/xinwendongtai/165.html</el-link
          >
          <br />
         建策技能培训介绍
          <br />
          <el-link
            href="http://www.jiancenj.com/jinenpeixun478/"
            type="primary"
            target="_blank"
            >http://www.jiancenj.com/jinenpeixun478/</el-link
          >

        </blockquote>

        <hr />
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>建策学员后台管理系统</h2>
        <p>
         该后台管理系统可以主要为了实现公司对于学员信息的汇总录入，可以创建管理账号，其中管理员账号唯一，且权限最大，普通用户仅可以进行查询操作，无法删除学员信息
        </p>
        <p>
          <b>当前版本:</b> <span>v{{ version }}</span>
        </p>

      </el-col>

    </el-row>
    <el-divider />
    <el-row :gutter="20">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>联系信息</span>
          </div>
          <div class="body">
            <p>
              <i class="el-icon-s-promotion"></i> 官网：<el-link
                href="http://www.jiancenj.com"
                target="_blank"
                >http://www.jiancenj.com</el-link
              >
            </p>

            <p>
              <i class="el-icon-chat-dot-round"></i> 微信公众号：<a
                href="javascript:;"
                >建策科技</a
              >
            </p>
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>更新日志</span>
          </div>
          <el-collapse accordion>
            <el-collapse-item title="v1.0.0 - 2022-10-22">
              <ol>
                <li>修改框架界面</li>
                <li>添加学员信息功能</li>
              </ol>
            </el-collapse-item>
          </el-collapse>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "1.0.0",
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

