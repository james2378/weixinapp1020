(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yuangongxinxi/add-or-update"],{"01dd":function(n,e,t){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var a=i(t("a34a"));function i(n){return n&&n.__esModule?n:{default:n}}function r(n,e,t,a,i,r,u){try{var o=n[r](u),g=o.value}catch(c){return void t(c)}o.done?e(g):Promise.resolve(g).then(a,i)}function u(n){return function(){var e=this,t=arguments;return new Promise((function(a,i){var u=n.apply(e,t);function o(n){r(u,a,i,o,g,"next",n)}function g(n){r(u,a,i,o,g,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("8c56"))}.bind(null,t)).catch(t.oe)},g={data:function(){return{ruleForm:{mendianmingcheng:"",yuangonggonghao:"",yuangongxingming:"",yuangongxingbie:"",lianxidianhua:"",yuangongtupian:""},mendianmingchengOptions:[],mendianmingchengIndex:0,yuangongxingbieOptions:[],yuangongxingbieIndex:0,user:{},ro:{mendianmingcheng:!1,yuangonggonghao:!1,yuangongxingming:!1,yuangongxingbie:!1,lianxidianhua:!1,yuangongtupian:!1}}},components:{wPicker:o},computed:{},onLoad:function(e){var t=this;return u(a.default.mark((function i(){var r,u,o,g;return a.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return r=n.getStorageSync("nowTable"),i.next=3,t.$api.session(r);case 3:return u=i.sent,t.user=u.data,i.next=7,t.$api.option("mendianxinxi","mendianmingcheng",{});case 7:if(u=i.sent,t.mendianmingchengOptions=u.data,t.yuangongxingbieOptions="男,女".split(","),t.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(t.ruleForm.refid=e.refid),!e.id){i.next=18;break}return t.ruleForm.id=e.id,i.next=16,t.$api.info("yuangongxinxi",t.ruleForm.id);case 16:u=i.sent,t.ruleForm=u.data;case 18:if(!e.cross){i.next=49;break}o=n.getStorageSync("crossObj"),i.t0=a.default.keys(o);case 21:if((i.t1=i.t0()).done){i.next=49;break}if(g=i.t1.value,"mendianmingcheng"!=g){i.next=27;break}return t.ruleForm.mendianmingcheng=o[g],t.ro.mendianmingcheng=!0,i.abrupt("continue",21);case 27:if("yuangonggonghao"!=g){i.next=31;break}return t.ruleForm.yuangonggonghao=o[g],t.ro.yuangonggonghao=!0,i.abrupt("continue",21);case 31:if("yuangongxingming"!=g){i.next=35;break}return t.ruleForm.yuangongxingming=o[g],t.ro.yuangongxingming=!0,i.abrupt("continue",21);case 35:if("yuangongxingbie"!=g){i.next=39;break}return t.ruleForm.yuangongxingbie=o[g],t.ro.yuangongxingbie=!0,i.abrupt("continue",21);case 39:if("lianxidianhua"!=g){i.next=43;break}return t.ruleForm.lianxidianhua=o[g],t.ro.lianxidianhua=!0,i.abrupt("continue",21);case 43:if("yuangongtupian"!=g){i.next=47;break}return t.ruleForm.yuangongtupian=o[g],t.ro.yuangongtupian=!0,i.abrupt("continue",21);case 47:i.next=21;break;case 49:t.styleChange();case 50:case"end":return i.stop()}}),i)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},mendianmingchengChange:function(n){this.mendianmingchengIndex=n.target.value,this.ruleForm.mendianmingcheng=this.mendianmingchengOptions[this.mendianmingchengIndex]},yuangongxingbieChange:function(n){this.yuangongxingbieIndex=n.target.value,this.ruleForm.yuangongxingbie=this.yuangongxingbieOptions[this.yuangongxingbieIndex]},yuangongtupianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.yuangongtupian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(a.default.mark((function e(){return a.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(n.ruleForm.yuangonggonghao){e.next=3;break}return n.$utils.msg("员工工号不能为空"),e.abrupt("return");case 3:if(n.ruleForm.yuangongxingming){e.next=6;break}return n.$utils.msg("员工姓名不能为空"),e.abrupt("return");case 6:if(!n.ruleForm.id){e.next=11;break}return e.next=9,n.$api.update("yuangongxinxi",n.ruleForm);case 9:e.next=13;break;case 11:return e.next=13,n.$api.add("yuangongxinxi",n.ruleForm);case 13:n.$utils.msgBack("提交成功");case 14:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,t=e.getFullYear(),a=e.getMonth()+1,i=e.getDate();return"start"===n?t-=60:"end"===n&&(t+=2),a=a>9?a:"0"+a,i=i>9?i:"0"+i,"".concat(t,"-").concat(a,"-").concat(i)},toggleTab:function(n){this.$refs[n].show()}}};e.default=g}).call(this,t("543d")["default"])},"3b72":function(n,e,t){},5234:function(n,e,t){"use strict";t.r(e);var a=t("807f"),i=t("66bd");for(var r in i)"default"!==r&&function(n){t.d(e,n,(function(){return i[n]}))}(r);t("ed1d");var u,o=t("f0c5"),g=Object(o["a"])(i["default"],a["b"],a["c"],!1,null,"73bd0a1c",null,!1,a["a"],u);e["default"]=g.exports},"66bd":function(n,e,t){"use strict";t.r(e);var a=t("01dd"),i=t.n(a);for(var r in a)"default"!==r&&function(n){t.d(e,n,(function(){return a[n]}))}(r);e["default"]=i.a},"807f":function(n,e,t){"use strict";var a;t.d(e,"b",(function(){return i})),t.d(e,"c",(function(){return r})),t.d(e,"a",(function(){return a}));var i=function(){var n=this,e=n.$createElement;n._self._c},r=[]},"9e53":function(n,e,t){"use strict";(function(n){t("fbee");a(t("66fd"));var e=a(t("5234"));function a(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,t("543d")["createPage"])},ed1d:function(n,e,t){"use strict";var a=t("3b72"),i=t.n(a);i.a}},[["9e53","common/runtime","common/vendor"]]]);