var app = angular.module('app.controllers',[]);

app.controller('appController',['$http','$window','$location','$rootScope','$scope','appService',
     function($http,$window,$location,$scope,$rootScope, appService) {   
	
		$scope.init=function(){
			appService.getFirma().then(function(response){
				$scope.firma=response.data;
			});
		};
		
		$scope.getOstale=function(pib){
			appService.getOstale(pib).then(function(response){
				$scope.ostale_firme=response.data;
				$scope.lista_stavki=[];
			});
		};
		
		$scope.popuni=function(kupac){
			$scope.nazivKupca=kupac.naziv;
			$scope.adresaKupca=kupac.adresa;
			$scope.pibKupca=kupac.pib;
			$scope.brojRacuna=kupac.racun.brojRacuna;
			
		};
		
		$scope.dodajStavku=function(naziv,kolicina,jedinicaMere,jedinicnaCena,rabat){
			var stavka={
				redniBroj: $scope.lista_stavki.length+1,
			    naziv: naziv,
			    kolicina: kolicina,
			    jedinicaMere: jedinicaMere,
			    jedinicnaCena: jedinicnaCena,
			    vrednost: kolicina*jedinicnaCena,
			    rabat: rabat,
			    iznosRabata: rabat*jedinicnaCena/100,
			    umanjenoZaRabat: kolicina*jedinicnaCena*rabat/100,
			    ukupno: kolicina*jedinicnaCena-kolicina*jedinicnaCena*rabat/100
			};
			$scope.lista_stavki.push(stavka);
		};
		
		$scope.izracunajRacun=function(vrednostUsluga){
			$scope.vrednostRobe=0;
			$scope.ukupnoRobaIUsluge=0;
			$scope.ukupnoRabat=0;
			$scope.iznosZaUplatu=0;
			angular.forEach($scope.lista_stavki,function(stavka){
				$scope.vrednostRobe+=stavka.vrednost;
				if(vrednostUsluga==null || vrednostUsluga==undefined){
					$scope.ukupnoRobaIUsluge+=$scope.vrednostRobe;
				}else{
					$scope.ukupnoRobaIUsluge+=$scope.vrednostRobe;
				}
				
				$scope.ukupnoRabat+=stavka.umanjenoZaRabat;
				
				$scope.$apply;
	        });
			if(vrednostUsluga==null || vrednostUsluga==undefined){
				return
			}else{
				$scope.ukupnoRobaIUsluge+=vrednostUsluga;
			}
			$scope.iznosZaUplatu=$scope.ukupnoRobaIUsluge-$scope.ukupnoRabat;
		};
		
		$scope.posaljiFakturu=function(datumRacuna,datumValute,oznakaValute,vrednostUsluga){
			var faktura ={
					nazivDobavljaca: $scope.firma.naziv,
					adresaDobavljaca : $scope.firma.adresa,
					pibDobavljaca : $scope.firma.pib,
					nazivKupca : $scope.nazivKupca,
					adresaKupca : $scope.adresaKupca,
					pibKupca : $scope.pibKupca,
					brojRacuna : $scope.brojRacuna,
					datumRacuna : datumRacuna,
					vrednostRobe : $scope.vrednostRobe,
					vrednostUsluga : vrednostUsluga,
					ukupnoRobaIUsluge : $scope.ukupnoRobaIUsluge,
					ukupnoRabat : $scope.ukupnoRabat,
					ukupnoPorez : $scope.ukupnoRobaIUsluge*0.1,
					oznakaValute : oznakaValute,
					iznosZaUplatu : $scope.iznosZaUplatu+$scope.ukupnoRobaIUsluge*0.1,
					uplataNaRacun : $scope.firma.racun.brojRacuna,
					datumValute : datumValute		
			};
			appService.cuvanjeFakture(faktura).then(function(response){ 
				
				for (var i = 0; i < $scope.lista_stavki.length; i++) {
					appService.cuvanjeStavke(response.data.id, $scope.lista_stavki[i]).then(function(response){ 

					});
				}	
			});
				alert("Faktura je poslata!");
		};
		
		$scope.preuzimiFaktureZaPlacanje=function(){
			appService.preuzimiFaktureZaPlacanje($scope.firma.pib).then(function(response){
				$scope.faktureZaPlacanje=response.data;		
			});
		};
		
		$scope.preuzmiFaktureZaNaplatu=function(){
			appService.preuzmiFaktureZaNaplatu($scope.firma.pib).then(function(response){
				$scope.faktureZaNaplatu=response.data;		
			});
		};
		
		$scope.platiFakturu=function(faktura){
			console.log(faktura);
			$scope.faktura=faktura;
			$window.location.href = "/#/nalog";
		};
		
		$scope.kreirajNalogZaPlacanje=function(svrhaPlacanja,modelZaduzenja,pozivNaBrojZaduzenja,pozivNaBrojZaduzenja,modelOdobrenja,pozivNaBrojOdobrenja,hitno){
			if(hitno==undefined || hitno==null){
				hitno=false;
			}
			
			appService.kreirajNalogZaPlacanje($scope.faktura.id,svrhaPlacanja,modelZaduzenja,pozivNaBrojZaduzenja,modelOdobrenja,pozivNaBrojOdobrenja,hitno).then(function(response){
				
			});
			
			
		};
		
		$scope.preuzmiIzvod=function(brojRacuna,datumRacuna,brojPreseka){
			console.log(brojRacuna,datumRacuna,brojPreseka);
			
			appService.preuzmiIzvod(brojRacuna,datumRacuna,brojPreseka).then(function(response){
				
			});
		}
}
]);