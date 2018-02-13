var services = angular.module('app.services',['ngResource']);

services.service('appService', ['$http', '$rootScope', 
                            	function($http, $rootScope) {
	
	this.getFirma=function(){
		return $http.get("http://localhost:"+window.location.port+"/firma/getFirma/"+window.location.port);
	};
	
	this.getOstale=function(pib){
		return $http.get("http://localhost:"+window.location.port+"/firma/getOstale/"+pib);
	};
	
	this.cuvanjeFakture = function(faktura) {
			return $http({
				method: 'POST',
				url: 'faktura/cuvanjeFakture',
				data: faktura
				});	
		};
		
	this.cuvanjeStavke = function(fakturaId, stavka) {
		return $http({
			method: 'POST',
			url: 'faktura/cuvanjeStavke/' + fakturaId,
			data: stavka
				
		});
	
	};
	
	this.preuzimiFaktureZaPlacanje=function(pib){
		return $http.get("http://localhost:"+window.location.port+"/faktura/faktureZaPlacanje/"+pib);
	};
	
	this.preuzmiFaktureZaNaplatu=function(pib){
		return $http.get("http://localhost:"+window.location.port+"/faktura/faktureZaNaplatu/"+pib);
	};
	
	this.kreirajNalogZaPlacanje=function(fakturaId,svrhaPlacanja,modelZaduzenja,pozivNaBrojZaduzenja,modelOdobrenja,pozivNaBrojOdobrenja,hitno){
		return $http.post("http://localhost:"+window.location.port+"/firma/nalog/kreirajNalogZaPlacanje/"+fakturaId+"/"+ svrhaPlacanja+"/"+modelZaduzenja +"/"+pozivNaBrojZaduzenja +"/"+modelOdobrenja +"/"+pozivNaBrojOdobrenja +"/"+hitno);
	};
}
]);