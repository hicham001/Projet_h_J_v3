'use strict';
profilCollab.controller('profilCollabController', ['$scope','$rootScope', 'profilCollabService','$location',function($scope,$rootScope,profilCollabService,$location) {
	
	$scope.objectifs =[];
	$scope.reponses =[];
	$scope.reponsesCollab =[];
	$scope.collaborateur={};
	$scope.reponse={};
	$scope.loading=true;
	   
	$scope.getReponses = function(matricule){ 
		  profilCollabService.getReponses(matricule).then(function(reponses){
			$scope.reponsesCollab = reponses;
		},function(msg){
			alert(msg);
		});
	   };
	   
	$scope.editReponseCollab = function(list){
		profilCollabService.editReponseCollab(list).then(function(l){
			list = l;
		},function(msg){
			alert(msg);
		});
	};
	 $scope.getcollaborateur = function(matricule){ 
		  profilCollabService.getcollaborateur(matricule).then(function(collaborateur){
			$scope.collaborateur = collaborateur;
		},function(msg){
			alert(msg);
		});
	   };
	 $scope.getObjectifs = function(matricule){ 
		 profilCollabService.getObjectifs(matricule).then(function(objectifs){
			$scope.objectifs = objectifs;
		},function(msg){
			alert(msg);
		});
	   };
	   $scope.editObjectifs = function(objectifs){ 
			 profilCollabService.editObjectifs(objectifs).then(function(objectifs){
				$scope.objectifs = objectifs;
			},function(msg){
				alert(msg);
			});
	   };
	   
	   $scope.saveReponses = function(reponses){ 
			 profilCollabService.saveReponses(reponses).then(function(reponses){
				$scope.reponses = reponses;
			},function(msg){
				alert(msg);
			});
	   };
	   
	  $scope.initReponse = function(cola,obj){
		  $scope.reponses.push({
			  collaborateur : cola,
			  objectif : obj,
			  valeur :""
		  });
		  
	  };
	  $scope.addReponses = function(){
		  var verif = true;
		
		  for(var i=0;i<$scope.reponses.length;i++){
			  if($scope.reponses[i].valeur=="")
				  verif = false;
		  }
		  if(verif)
			  $scope.saveReponses($scope.reponses);
		  else
			  alert("vous devez donner votre reponse pour toutes les objectifs Merci!");
			  
	  };
	  
	  $scope.getcollaborateur("jaouad");
	   $scope.getObjectifs("jaouad");
	   $scope.getReponses("jaouad");
	   
	   $scope.affecter = function(){
			   for(var i=0;i<$scope.reponsesCollab.length;i++){
				   $scope.reponses[i]=$scope.reponsesCollab[i];
				   $scope.loading = false;
			   }
			   if($scope.loading)
				   alert("vous etes pas encore valider vos objectifs");
	   };
	   
		   
	  
	  
	  
}]);