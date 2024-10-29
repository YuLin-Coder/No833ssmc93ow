
var projectName = '影视企业全渠道会员管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '电影',
	url: './pages/dianying/list.html'
}, 
{
	name: '积分兑换',
	url: './pages/jifenduihuan/list.html'
}, 

{
	name: '电影观后感',
	url: './pages/forum/list.html'
}, 
{
	name: '电影资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmc93ow/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"电影","menuJump":"列表","tableName":"dianying"}],"menu":"电影管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"电影分类","menuJump":"列表","tableName":"dianyingfenlei"}],"menu":"电影分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","消积分","加积分","更新使用积分","更新获得积分"],"menu":"会员信息管理","menuJump":"列表","tableName":"huiyuanxinxiguanli"}],"menu":"会员信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"消费记录","menuJump":"列表","tableName":"xiaofeijilu"}],"menu":"消费记录管理"},{"child":[{"buttons":["提交审核","查看","新增","修改","删除"],"menu":"积分兑换","menuJump":"列表","tableName":"jifenduihuan"}],"menu":"积分兑换管理"},{"child":[{"buttons":["查看","审核"],"menu":"积分兑换审核","menuJump":"列表","tableName":"jifenduihuanshenhe"}],"menu":"积分兑换审核管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"电影观后感","tableName":"forum"}],"menu":"电影观后感"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"电影资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"电影列表","menuJump":"列表","tableName":"dianying"}],"menu":"电影模块"},{"child":[{"buttons":["提交审核"],"menu":"积分兑换列表","menuJump":"列表","tableName":"jifenduihuan"}],"menu":"积分兑换模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"电影","menuJump":"列表","tableName":"dianying"}],"menu":"电影管理"},{"child":[{"buttons":["查看"],"menu":"会员信息管理","menuJump":"列表","tableName":"huiyuanxinxiguanli"}],"menu":"会员信息管理"},{"child":[{"buttons":["查看"],"menu":"消费记录","menuJump":"列表","tableName":"xiaofeijilu"}],"menu":"消费记录管理"},{"child":[{"buttons":["查看","提交审核","兑换商品"],"menu":"积分兑换","menuJump":"列表","tableName":"jifenduihuan"}],"menu":"积分兑换管理"},{"child":[{"buttons":["查看"],"menu":"积分兑换审核","menuJump":"列表","tableName":"jifenduihuanshenhe"}],"menu":"积分兑换审核管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"电影列表","menuJump":"列表","tableName":"dianying"}],"menu":"电影模块"},{"child":[{"buttons":["提交审核"],"menu":"积分兑换列表","menuJump":"列表","tableName":"jifenduihuan"}],"menu":"积分兑换模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
