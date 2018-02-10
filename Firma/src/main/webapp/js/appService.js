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
				data: {
					"nazivDobavljaca" : faktura.nazivDobavljaca,
					"adresaDobavljaca" : faktura.adresaDobavljaca,
					"pibDobavljaca" : faktura.pibDobavljaca,
					"nazivKupca" : faktura.nazivKupca,
					"adresaKupca" : faktura.adresaKupca,
					"pibKupca" : faktura.pibKupca,
					"brojRacuna" : faktura.brojRacuna,
					"datumRacuna" : faktura.datumRacuna,
					"vrednostRobe" : faktura.vrednostRobe,
					"vrednostUsluga" : faktura.vrednostUsluga,
					"ukupnoRobaIUsluge" : faktura.ukupnoRobaIUsluge,
					"ukupnoRabat" : faktura.ukupnoRabat,
					"ukupnoPorez" : faktura.ukupnoPorez,
					"oznakaValute" : faktura.oznakaValute,
					"iznosZaUplatu" : faktura.iznosZaUplatu,
					"uplataNaRacun" : faktura.uplataNaRacun,
					"datumValute" : faktura.datumValute
				}
				});	
		};
		
	this.cuvanjeStavke = function(fakturaId, stavka) {
		return $http({
			method: 'POST',
			url: 'faktura/cuvanjeStavke/' + fakturaId,
			data: {
				"redniBroj" : stavka.redniBroj,
				"naziv" : stavka.naziv,
				"kolicina" : stavka.kolicina,
				"jedinicaMere" : stavka.jedinicaMere,
				"jedinicnaCena" : stavka.jedinicnaCena,
				"vrednost" : stavka.vrednost,
				"procenatRabata" : stavka.rabat,
				"iznosRabata" : stavka.iznosRabata,
				"umanjenoZaRabat" : stavka.umanjenoZaRabat,
				"ukupanPorez" : stavka.ukupno
			}
		});
	
	};
}
]);