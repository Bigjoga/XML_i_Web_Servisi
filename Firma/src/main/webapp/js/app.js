var app= angular.module('app',['ui.router','app.services','app.controllers']);

app.config(function($stateProvider,$urlRouterProvider) {
	$stateProvider
	.state('index', {
		url:'',
		templateUrl:'views/home.html',
		controller:'appController'
	})
	.state('slanjeFakture',{
		url:'/slanjeFakture',
		templateUrl:'views/slanjeFakture.html',
		controller:'appController'
	});
	$urlRouterProvider.otherwise('/');
	
	
});