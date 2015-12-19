'use strict';
GestionProjet.factory('ProjetService', ['$http', '$q', function($http, $q){
	
	var factory={
			
			projet : false,
			objectifs : false,
			evaluateurs : false,
			collaborateurs : false,
			resultatandpoids :false,
			prj :false,
			collab : false,
			collab1 : false,
			editCollaborateur : function(collaborateur){
		    	var deffered = $q.defer();
		    	$http.put('http://localhost:8085/echallenge/Collaborateur/', collaborateur)
				.success(function(data,status){
					factory.collab = data;
					deffered.resolve(data);
				}).error(function(data,status){
					 deffered.reject('impossible d\'édditer le collaborateur ');
			})
			return deffered.promise;
		    },
		    
		    getCollaborateur : function(matricule){
		    	var deffered = $q.defer();
		    	$http.get('http://localhost:8085/echallenge/Collaborateur/getCollab?matricule='+matricule)
				.success(function(data,status){
					factory.collab1 = data;
					deffered.resolve(data);
				}).error(function(data,status){
					 deffered.reject('impossible de recuperer le collaborateur');
			})
			return deffered.promise;
		    },
			
			getProjetByCode : function(d){
				var deffered = $q.defer();
			 $http.get('Projet/getProjet?code='+d)
			 .success(function(data,status){
				 
				 factory.prj = data;
				 deffered.resolve(factory.prj);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer le projet');
				 
			 })
			 return deffered.promise;
			},
			
			
			getRPLIST : function(d){
				var deffered = $q.defer();
			 $http.get('Description/GETRP?id='+d)
			 .success(function(data,status){
				 
				 factory.resultatandpoids = data;
				 deffered.resolve(factory.collaborateurs);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les resultasandpoids ');
				 
			 })
			 return deffered.promise;
			},
			
			
			getCollaborateurs : function(matricule){
				var deffered = $q.defer();
			 $http.get('Manager/getCollaborateur?matricule='+matricule)
			 .success(function(data,status){
				 
				 factory.collaborateurs = data;
				 deffered.resolve(factory.collaborateurs);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les collaborateurs ');
				 
			 })
			 return deffered.promise;
			},
			getObjectifs : function(){
				var deffered = $q.defer();
			 $http.get('Objectif/')
			 .success(function(data,status){
				 
				 factory.objectifs = data;
				 deffered.resolve(factory.objectifs);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les donnees ');
				 
			 })
			 return deffered.promise;
			},
			getEvaluateurs : function(){
				var deffered = $q.defer();
			 $http.get('Evaluateur/')
			 .success(function(data,status){
				 
				 factory.evaluateurs = data;
				 deffered.resolve(factory.evaluateurs);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les evaluateurs ');
				 
			 })
			 return deffered.promise;
			},
			getProjets : function(){
				var deffered = $q.defer();
			 $http.get('Projet/')
			 .success(function(data,status){
				 
				 factory.postes = data;
				 deffered.resolve(factory.postes);
				 
			 }).error(function(data,status){
				 deffered.reject('impossible de recuperer les donnees ');
				 
			 })
			 return deffered.promise;
			},
			addProjet : function(projet){
				var deffered = $q.defer();
				$http.post('Projet/', projet)
				.success(function(data,status){
					projet = data;
					deffered.resolve(data);
				}).error(function(data,status){
					 deffered.reject('impossible de sauvgarder le projet ');
			})
			return deffered.promise;
	},
			deleteProjet : function(codeprojet){
				
				var deffered = $q.defer();
				$http['delete']('Projet/'+codeprojet,{params: {codeprojet: codeprojet}})
				.success(function(data,status){
					deffered.resolve(data);
				}).error(function(data,status){
					 deffered.reject('impossible de supprimer le projet ');
			})
			return deffered.promise;
			},
	    editProjet : function(projet){
	    	var deffered = $q.defer();
	    	$http.put('Projet/', projet)
			.success(function(data,status){
				projet = data;
				deffered.resolve(data);
			}).error(function(data,status){
				 deffered.reject('impossible d\'édditer le projet ');
		})
		return deffered.promise;
	    },
	    addObjectif : function(objectif){
			var deffered = $q.defer();
			$http.post('Objectif/', objectif)
			.success(function(data,status){
				objectif = data;
				deffered.resolve(data);
			}).error(function(data,status){
				 deffered.reject('impossible de sauvgarder l\'objectif ');
		})
		return deffered.promise;
        },
        
        addDescription : function(description){
			var deffered = $q.defer();
			$http.post('Description/', description)
			.success(function(data,status){
				description = data;
				deffered.resolve(data);
			}).error(function(data,status){
				 deffered.reject('impossible de sauvgarder la description ');
		})
		return deffered.promise;
     },
       addObjectifs : function(objectifs){
			var deffered = $q.defer();
			$http.post('Objectif/AjouterList', objectifs)
			.success(function(data,status){
				objectifs = data;
				deffered.resolve(data);
			}).error(function(data,status){
				 deffered.reject('impossible de sauvgarder les objectifs ');
		})
		return deffered.promise;
      },   
      addRPL : function(l){
			var deffered = $q.defer();
			$http.post('http://localhost:8085/echallenge/Description/AjouterResultat', l)
			.success(function(data,status){
				l = data;
				deffered.resolve(data);
			}).error(function(data,status){
				 deffered.reject('impossible de sauvgarder les resultaandpoids ');
		})
		return deffered.promise;
    },   

	    
	}
	return factory;
	
}]);
