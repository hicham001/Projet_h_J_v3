'use strict';
profilCollab.factory('profilCollabService', ['$http', '$q', function($http, $q){
	
	var factory={
			
			objectifs : false,
			collaborateur : false,
			objectifsM : false,
			reponses : false,
			reponsesEdit : false,
			
			editReponseCollab : function(list){
				var deffered = $q.defer();
			 $http.put('Collaborateur/editReponseCollaborateur',list)
			 .success(function(data,status){ 
				 factory.reponsesEdit = data;
				 deffered.resolve(factory.reponsesEdit);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible d\'editer les reponses');
				 
			 })
			 return deffered.promise;
			},
			
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
			
			getReponses : function(matricule){
				var deffered = $q.defer();
			 $http.get('Collaborateur/getReponsesCollaborateur?matricule='+matricule)
			 .success(function(data,status){ 
				 factory.reponses = data;
				 deffered.resolve(data);
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les reponses de collaborateur '+matricule);
				 
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
			 editObjectifs : function(objectifs){
			    	var deffered = $q.defer();
			    	$http.put('Objectif/UpdateObjectifCollab', objectifs)
					.success(function(data,status){
						factory.objectifsM = data;
						deffered.resolve(data);
					}).error(function(data,status){
						 deffered.reject('impossible d\'édditer les objectifs ');
				})
				return deffered.promise;
			    },
			    
		    saveReponses : function(list){
				var deffered = $q.defer();
			 $http.post('Collaborateur/saveReponses',list)
			 .success(function(data,status){ 
				 factory.reponses = data;
				 deffered.resolve(factory.reponses);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible se sauvgarder les reponses des objectifs de collaborateur ');
				 
			 })
			 return deffered.promise;
			},
	    
	}
	return factory;
	
}]);
