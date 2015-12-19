'use strict';
profilCollab.controller('profilCollabController', ['$scope','$rootScope', 'profilCollabService','$location',function($scope,$rootScope,profilCollabService,$location) {
	
	$scope.objectifs =[];
	$scope.collaborateur={};
	 
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
	   $scope.getcollaborateur("jaouad");
	   $scope.getObjectifs("jaouad");
	  
	  
}]);