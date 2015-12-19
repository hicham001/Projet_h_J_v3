'use strict';
profilCollab.factory('profilCollabService', ['$http', '$q', function($http, $q){
	
	var factory={
			
			objectifs : false,
			collaborateur : false,
			
			getObjectifs : function(matricule){
				var deffered = $q.defer();
			 $http.get('Collaborateur/getCollabObjectifs?matricule='+matricule)
			 .success(function(data,status){ 
				 factory.objectifs = data;
				 deffered.resolve(factory.objectifs);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les objectifs de collaborateur '+matricule);
				 
			 })
			 return deffered.promise;
			},
			getcollaborateur : function(matricule){
				var deffered = $q.defer();
			 $http.get('Collaborateur/getCollab?matricule='+matricule)
			 .success(function(data,status){ 
				 factory.collaborateur = data;
				 deffered.resolve(factory.collaborateur);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer le collaborateur avec la matricule '+matricule);
				 
			 })
			 return deffered.promise;
			},
	    
	}
	return factory;
	
}]);
