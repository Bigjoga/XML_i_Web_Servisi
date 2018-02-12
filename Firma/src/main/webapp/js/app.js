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
	}).state('faktureZaPlacanje',{
		url:'/faktureZaPlacanje',
		templateUrl:'views/faktureZaPlacanje.html',
		controller:'appController'
	}).state('faktureZaNaplatu',{
		url:'/faktureZaNaplatu',
		templateUrl:'views/faktureZaNaplatu.html',
		controller:'appController'
	}).state('nalog',{
		url:'/nalog',
		templateUrl:'views/nalog.html',
		controller:'appController'
	});
	$urlRouterProvider.otherwise('/');
	
	
});