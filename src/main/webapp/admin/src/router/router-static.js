import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xiaofeijilu from '@/views/modules/xiaofeijilu/list'
    import jifenduihuanshenhe from '@/views/modules/jifenduihuanshenhe/list'
    import dianying from '@/views/modules/dianying/list'
    import jifenduihuan from '@/views/modules/jifenduihuan/list'
    import storeup from '@/views/modules/storeup/list'
    import dianyingfenlei from '@/views/modules/dianyingfenlei/list'
    import forum from '@/views/modules/forum/list'
    import discussdianying from '@/views/modules/discussdianying/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import huiyuanxinxiguanli from '@/views/modules/huiyuanxinxiguanli/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '电影资讯',
        component: news
      }
      ,{
	path: '/xiaofeijilu',
        name: '消费记录',
        component: xiaofeijilu
      }
      ,{
	path: '/jifenduihuanshenhe',
        name: '积分兑换审核',
        component: jifenduihuanshenhe
      }
      ,{
	path: '/dianying',
        name: '电影',
        component: dianying
      }
      ,{
	path: '/jifenduihuan',
        name: '积分兑换',
        component: jifenduihuan
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/dianyingfenlei',
        name: '电影分类',
        component: dianyingfenlei
      }
      ,{
	path: '/forum',
        name: '电影观后感',
        component: forum
      }
      ,{
	path: '/discussdianying',
        name: '电影评论',
        component: discussdianying
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/huiyuanxinxiguanli',
        name: '会员信息管理',
        component: huiyuanxinxiguanli
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
