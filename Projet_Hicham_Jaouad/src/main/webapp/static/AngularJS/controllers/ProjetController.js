'use strict';
 GestionProjet.controller('ProjetController', ['$scope','$rootScope', 'ProjetService','$location',function($scope,$rootScope,ProjetService,$location) {
	
	$scope.projets =[];
	$scope.objectifs =[];
	$scope.objectifscreate =[];
	$scope.evaluateurs =[];
	$scope.collaborateurs = [];
	$scope.resultatList =[];
	$scope.rplistcreates =[];
	$scope.collabo ={matricule:"",objectifs:[]};
	$scope.collabeval = {matricule:"",objectifs:[],evaluateurs :[]};
	$scope.resultatList =[];
	$scope.projetees=[];
	$scope.evaluateurss =[];
	$scope.evaluateursscreate =[];
	$scope.collaborateur = {matricule:"",objectifsCollabs :[],evaluateurCollab :[]};
	$scope.collaborateursaved = {matricule : $scope.collaborateur.matricule,evaluateurs : $scope.evaluateurss };
	
	Array.prototype.contains = function(obj) {
        var i = this.length;
        while (i--) {
            if (this[i] === obj) {
                return true;
            }
        }
        return false;
    };
	
	$scope.addCollabevaluateur = function(){
		$scope.collabeval.matricule = $rootScope.collaborateur1.matricule;
		for(var i=0;i<$scope.evaluateurss.length;i++)
		{
		  if(!($scope.collabeval.evaluateurs.contains($scope.evaluateurss[i].matricule))){
		$scope.collabeval.evaluateurs.push({
			matricule : $scope.evaluateurss[i].matricule
	              
	           
	        });
			}
		}
		
		for(var i=0;i<$rootScope.collaborateur1.objectifsCollabs.length;i++)
		{
		$scope.collabeval.objectifs.push({
			idObjectif : $rootScope.collaborateur1.objectifsCollabs[i].idObjectif
	              
	           
	        });
		}
		$scope.editCollab($scope.collabeval);
		
	}
	
	$scope.editCollab = function(collaborateur){
		ProjetService.editCollaborateur(collaborateur).then(function(collab){
			collaborateur = collab;
			console.log(collaborateur.maricule);
		},function(msg){
			alert(msg);
		});
	};
	
	$scope.getCollaborateur = function(collaborateur){
		ProjetService.getCollaborateur(collaborateur.matricule).then(function(collab){
			collaborateur = collab;
			console.log(collaborateur.sexe);
		},function(msg){
			alert(msg);
		});
	};
		
	
	$scope.affecterFinale= function(){
		for(var i=0;i<$rootScope.collaborateur1.objectifsCollabs.length;i++){
			for(var j=0;j<<$rootScope.collaborateur1.objectifsCollabs[i].projet.evaluateurs.length;j++){
				$scope.evaluateursscreate.push({
					evaluateur : $rootScope.collaborateur1.objectifsCollabs[i].projet.evaluateurs[j]
				});
			}
		}
	};
	
	$scope.affecter = function(evaluateur){
		$scope.evaluateurss.push({
			matricule : evaluateur.matricule
		})
	};
	$scope.deleteRows = function(projet,indice){
		
		for(var i=0;i<$rootScope.collaborateur1.objectifsCollabs.length;i++){
			if($rootScope.collaborateur1.objectifsCollabs[i].projet.codeprojet==projet.codeprojet)
				{
				$rootScope.collaborateur1.objectifsCollabs[i].projet.evaluateurs.splice(indice,1);
				$scope.evaluateurss.splice(indice,1);
				}
		}
		
	};
	$scope.projetFind =function(code,objectif){
		
		ProjetService.getProjetByCode(code).then(function(data){
			objectif.projet = data;
			objectif.projet.evaluateurs = data.evaluateurs;
		   console.log("====================>"+objectif.projet.evaluateurs[0].matricule);
		   
	},function(msg){
		alert(msg);
	});
    };
    
	$scope.resultatList = function(d){ ProjetService.getRPLIST(d).then(function(resultatList){
		$scope.resultatList = resultatList;
	},function(msg){
		alert(msg);
	});
    };
	
	$scope.projetEval ={codeprojet:"",evaluateurs:[]};
	$scope.all = function(){ ProjetService.getProjets().then(function(projets){
			$scope.projets = projets;
		},function(msg){
			alert(msg);
		});
	};
	
	$scope.collaborateurs = function(){ ProjetService.getCollaborateurs().then(function(collaborateurs){
		$scope.collaborateurs = collaborateurs;
	},function(msg){
		alert(msg);
	});
    };
    $scope.collaborateurs();
	$scope.evaluateurs = function(){ ProjetService.getEvaluateurs().then(function(evaluateurs){
		$scope.evaluateurs = evaluateurs;
	},function(msg){
		alert(msg);
	});
    };
    $scope.evaluateurs();
	$scope.allObjectif = function(){ ProjetService.getObjectifs().then(function(objectifs){
		$scope.objectifs = objectifs;
	},function(msg){
		alert(msg);
	});
    };
    $scope.$watch($scope.objectifs, function() {
		$scope.allObjectif();
		});
  
	$scope.$watch($scope.projets, function() {
		$scope.all();
		});
	
	$scope.deleteProjet = function(codeprojet){
		ProjetService.deleteProjet(codeprojet).then(function(projet){
			$scope.all();
		},function(msg){
			alert(msg);
		});
	};
	
	$scope.editProjet = function(Projet){
		ProjetService.editProjet(Projet).then(function(Projet){
			$scope.Projet = Projet;
		},function(msg){
			alert(msg);
		});
	};
	$scope.prepareEdit = function(projet){
		$rootScope.projet = projet;
		console.log('=======>'+$scope.projet.codeprojet)
	};
	
	$scope.addProjet = function(){
		ProjetService.addProjet($scope.projetEval).then(function(projet){
			$rootScope.projetEval = projet;
			$scope.all();
			$location.path('/CreateProjet');
		},function(msg){
			alert(msg);
		});
		
	};
	
	$scope.pagecreate = function(){
		$location.path('/CreateProjetEvaluateur');
	};
	
	$scope.reset = function(){
		$rootScope.projet={};
	};
	
	
	//ajouter des divs dynamiques
	$scope.ajouterDescription = function(objectif)
    {
        objectif.descriptions.push({
              description : "",
              mesure :"",
              responsableMesure:"",
        });
    };
    $scope.ajouterObjectif = function()
    {
        $scope.objectifscreate.push({
        	intitule : "",
        	 projet :$rootScope.projetEval,
        	descriptions :[]
        });
    };
    
    $scope.supprimerDescription = function(objectif,indice){
        
        objectif.descriptions.splice(indice,1);
    };
    
    $scope.supprimerObjectif = function(indice){
        
        $scope.objectifscreate.splice(indice,1);
    }; 
    
    $scope.addObjectifs = function(){
    	ProjetService.addObjectifs($scope.objectifscreate).then(function(objectifs){
    		$scope.objectifscreate = objectifs;
			$scope.all();
			$location.path('/AffecterObjectEval');
		},function(msg){
			alert(msg);
		});
    };
    
    //evaluateurs ------------
    
    $scope.ajouterEvaluateurp = function()
    {
        $scope.projetEval.evaluateurs.push({
           matricule : "",
        });
    };
    
    $scope.supprimerEvaluateurp = function(indice){
        
        $scope.projetEval.evaluateurs.splice(indice,1);
    };
    
    $scope.resultatList=[];
    $scope.ajouterObjectifCollab = function()
    {
        $scope.collaborateur.objectifsCollabs.push({
           projet :{codeprojet:"",categorie:"",evaluateurs:[]},
           descriptions :[]
              
           
        });
        $scope.resultatList.push({
        	resultatpoids:{}
        });
    };
    $scope.initDescriptions = function(idObjectif,objectif){
    	console.log("changement de valeur");
    	var objectifBDD = $scope.objectifs.filter(function(element){
    		return element.idObjectif==idObjectif;
    	})[0];
    	objectif.descriptions=[];
    	objectifBDD.descriptions.forEach(function(element){
    		objectif.descriptions.push({id:element.id,poids:""});
    	});

    };
    $scope.supprimerObjectifCollab = function(indice){
        
    	 $scope.collaborateur.objectifsCollabs.splice(indice,1);
    };
    
    
    $scope.addRPL = function(){
    	var result=[];
    	var sommePoids=0;
    	var distinctObjectifs =[];
    	var enregistrement = false;
    	$scope.collaborateur.objectifsCollabs.forEach(function(objectif){
    		objectif.descriptions.forEach(function(desc){
        		result.push({
        			poids:desc.poids,
        			collaborateur:{matricule:$scope.collaborateur.matricule},
        			descriptionObj:{id:desc.id}
        		});
        		sommePoids += parseInt(desc.poids);
        		
        	});
    		if(!(distinctObjectifs.contains(objectif.idObjectif)))
    			distinctObjectifs.push(objectif.idObjectif)
    		else
			{
				enregistrement = true;
			}
    	});

		if(!enregistrement && sommePoids==100)
		{
	    	ProjetService.addRPL(result).then(function(l){
	    		console.log("Donnes envoyés");
	    		$scope.rplistcreates = l;
	    		$rootScope.collaborateur1 = $scope.collaborateur;
				$location.path('/AffectationEvaluateur');
			},function(msg){
				alert(msg);
			});
	    	$scope.collabo.matricule = $scope.collaborateur.matricule;
	    	for(var i=0;i<$scope.collaborateur.objectifsCollabs.length;i++)
	    		{
	    		$scope.collabo.objectifs.push({
	    			idObjectif : $scope.collaborateur.objectifsCollabs[i].idObjectif
	    	              
	    	           
	    	        });
	    		}
	    	$scope.editCollab($scope.collabo);
		}
		else
		{
			var message ="";
			if(enregistrement) message+= "Vous avez choisi le meme objectif plusieurs fois";
			if(sommePoids!=100) message+= "\nLa somme des poids doit etre egale a 100";
			
			alert(message);
		}
    };
    
	
	
}]);