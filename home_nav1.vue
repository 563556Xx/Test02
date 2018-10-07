<template>
			<div class='home_nav'>
			<span :class='{active: nowIndex==0}' @click='nowIndex=0'>
				<router-link to=''>动态</router-link>
			</span>
			<span @click='nowIndex=1' :class='{active: nowIndex==1}'>
				<router-link to=''>推荐</router-link>
			</span>
		</div>
</template>

<script>
	export default{
		data:function(){
			return{
				nowIndex:0,
			}
		}
	}
</script>

<style>
	.home_nav {width: 100%;height: 30px; line-height: 30px;position: fixed;left:0px;top:50px;background-color: #67BA62}
	.home_nav a {display: block; width: 20%; float: left; color: #999; font-size: 18px; text-decoration: none;color:white;font-size: 15px;font-family:楷体;position: relative;left: 100px}
	.home_nav .active a {border-bottom: 2px solid green;}
</style>