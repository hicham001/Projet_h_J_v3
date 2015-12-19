'use strict';
GestionFeedback.factory('feedbackService', ['$http', '$q', function($http, $q){
	
	var factory={
			
			feedback : false,
			feedbacks : false,
			collaborateurs : false,
			projets : false,
			qualifications :false,
			
			addListQual : function(list){
				var deffered = $q.defer();
				$http.post('Qualification/ADDLIST', list)
				.success(function(data,status){
					factory.qualifications = data;
					deffered.resolve(factory.qualifications);
				}).error(function(data,status){
					 deffered.reject('impossible de sauvgarder la liste des qualifications ');
			})
			return deffered.promise;
	       },
	       
			getProjetsByObjectifs : function(matricule){
				var deffered = $q.defer();
			 $http.get('Projet/getProjets?matricule='+matricule)
			 .success(function(data,status){ 
				 factory.projets = data;
				 deffered.resolve(factory.projets);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les projets ');
				 
			 })
			 return deffered.promise;
			},
			getcollaborateurs : function(matricule){
				var deffered = $q.defer();
			 $http.get('Evaluateur/GetCollabPourEval?matricule='+matricule)
			 .success(function(data,status){ 
				 factory.collaborateurs = data;
				 deffered.resolve(factory.collaborateurs);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les collaborateurs ');
				 
			 })
			 return deffered.promise;
			},

			getfeedbacks : function(){
				var deffered = $q.defer();
			 $http.get('FEEDBACK/')
			 .success(function(data,status){ 
				 factory.feedbacks = data;
				 deffered.resolve(factory.feedbacks);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les feedbacks ');
				 
			 })
			 return deffered.promise;
			},
			
			addFeedback : function(feedback){
				var deffered = $q.defer();
				$http.post('FEEDBACK/', feedback)
				.success(function(data,status){
					feedback = data;
					deffered.resolve(data);
				}).error(function(data,status){
					 deffered.reject('impossible de sauvgarder le feedback ');
			})
			return deffered.promise;
	       },
			deleteFeedbak : function(IdFeedback){
				
				var deffered = $q.defer();
				$http['delete']('FEEDBACK/'+IdFeedback,{params: {IdFeedback: IdFeedback}})
				.success(function(data,status){
					deffered.resolve(data);
				}).error(function(data,status){
					 deffered.reject('impossible de supprimer le feedback ');
			})
			return deffered.promise;
			},
	    editFeedbak : function(feedback){
	    	var deffered = $q.defer();
	    	$http.put('FEEDBACK/', feedback)
			.success(function(data,status){
				feedback = data;
				deffered.resolve(data);
			}).error(function(data,status){
				 deffered.reject('impossible d\'édditer le feedback ');
		})
		return deffered.promise;
	    },
	    
	    
	}
	return factory;
	
}]);
