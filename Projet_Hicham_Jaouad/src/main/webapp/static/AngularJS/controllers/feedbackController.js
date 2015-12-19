'use strict';
GestionFeedback.controller('feedbackController', ['$scope','$rootScope', 'feedbackService','$location',function($scope,$rootScope,feedbackService,$location) {
	
	$scope.feedbacks =[];
	$scope.collaborateurs = [];
	$scope.collaborateur ={};
	$scope.projets = [];
	$scope.feedback ={};
	$scope.themes =[{cle:"Critique",valeur:"",poids:0},{cle:"A Develeopper",valeur:"",poids:1},{cle:"Selon attente",valeur:"",poids:2},{cle:"Demontre des forces",valeur:"",poids:3}];
	$scope.loading1=false;
	$scope.loading2=false;
	$scope.loading3=false;
	$scope.loading4=false;
	$scope.loading5=false;
	$scope.loading6=false;
	$scope.loading7=false;
	$scope.loading8=false;
	$rootScope.productivite={theme:"productivité",valeur :"",remarque:"",feedback :{idFeedback:null}};
	$rootScope.qualite={theme:"Qualité/Fiabilité",valeur :"",remarque:"",feedback :{idFeedback:null}};
	$rootScope.technicite = {theme:"Technicité",valeur :"",remarque:"",feedback :{idFeedback:null}};
	$rootScope.conception = {theme:"Conception",valeur :"",remarque:"",feedback :{idFeedback:null}};
	$scope.avantVente = {theme:"Avant-vente",valeur :"",remarque:"",feedback :{idFeedback:null}};
	$scope.gestionProjet = {theme:"Gestion de projet",valeur :"",remarque:"",feedback :{idFeedback:null}};
	$scope.gestionRClient = {theme:"Gestion de relation client",valeur :"",remarque:"",feedback :{idFeedback:null}};
	$scope.polyvalence = {theme:"Polyvalence",valeur :"",remarque:"",feedback :{idFeedback:null}};
	
	$scope.qualifications =[$rootScope.productivite,$rootScope.qualite,$rootScope.technicite,$rootScope.conception,$scope.avantVente,$scope.gestionProjet,$scope.gestionRClient,$scope.polyvalence];
	
	$scope.addListQual = function(qualifications){
		  feedbackService.addListQual(qualifications).then(function(d){
			  qualifications = d;
			},function(msg){
				alert(msg);
			});
			
		};
  $scope.addList = function(List){
	  for(var i =0;i<$scope.qualifications.length;i++){
		  $scope.qualifications[i].feedback.idFeedback = $rootScope.f.idFeedback;
	  }
	  $scope.addListQual($scope.qualifications);
	  $scope.calculNote();
	  $scope.editFeedback($rootScope.f);
	  $scope.allfeedback();
	  $location.path("/");
  }
  
  $scope.etape3 = function(){
	// $rootScope.feedbackeedit = feedback;
	  $location.path("/createFeedbackEtape3");
  };
	
	  $scope.allfeedback = function(){ feedbackService.getfeedbacks().then(function(feedbacks){
			$scope.feedbacks = feedbacks;
		},function(msg){
			alert(msg);
		});
	   };
	   
	  $scope.deleteFeedbak = function(IdFeedback){
		  feedbackService.deleteFeedbak(IdFeedback).then(function(data){
			  $scope.allfeedback();
			},function(msg){
				alert(msg);
			}); 
	  };
	  $scope.details = function(feedback){
		  $rootScope.feedbackeedit = feedback;
		  $location.path("/details");
	  };
	   
	   $scope.colllabCourants = function(){ feedbackService.getcollaborateurs("eval1").then(function(collaborateurs){
			$scope.collaborateurs = collaborateurs;
		},function(msg){
			alert(msg);
		});
	   };

	  $scope.$watch($scope.feedbacks, function() {
		$scope.allfeedback();
		//alert("jaouad bousbaa");
		});
	  $scope.$watch($scope.collaborateurs, function() {
			$scope.colllabCourants();
	    });
	  
	  $scope.getProjetsByObjectifs = function(matricule){ feedbackService.getProjetsByObjectifs(matricule).then(function(projets){
			$scope.projets = projets;
		},function(msg){
			alert(msg);
		});
	   };
	  
	  $scope.affecterCollaborateur = function(collaborateur){
		  
		  for(var i=0;i<$scope.collaborateurs.length;i++){
			  if($scope.collaborateurs[i].matricule==collaborateur.matricule){
				  $scope.collaborateur = $scope.collaborateurs[i];
				  break;
				 
			  }
		  }
	  };
	  $scope.addFeedback = function(feedback){
		  feedbackService.addFeedback(feedback).then(function(d){
			    feedback = d;
			    $rootScope.f = d;
			},function(msg){
				alert(msg);
			});
			
		};
		
		$scope.editFeedback = function(feedback){
			  feedbackService.editFeedbak(feedback).then(function(d){
				    feedback = d;
				},function(msg){
					alert(msg);
				});
				
			};
			
	  
	  $scope.savefeedback = function(){
			  $scope.feedback.collaborateur = $scope.collaborateur;
			  $scope.addFeedback($scope.feedback);
			  //$rootScope.f=$scope.feedback;
			  $location.path("/createQualifications");
	  };
    
	
	  $scope.pageCreation = function(){
		  $location.path("/createFeedbak");
	  };
	  
	  $scope.pageSuivante = function(){
		  $location.path("/createQualifications");
	  };
	$scope.calculNote = function(){
		var nbrthemeQual=0;
		var poidsT = 0;
		var noteolable;
		for(var i=0 ;i<$scope.qualifications.length;i++){
			if($scope.qualifications[i].valeur!="NA"){
				nbrthemeQual+=1;
				for(var j=0;j<$scope.themes.length;j++){
					if($scope.qualifications[i].valeur==$scope.themes[j].cle){
						poidsT+=$scope.themes[j].poids;
					}
				}
			}
		}
		alert('nombre de theme califies=====> '+nbrthemeQual);
		alert('poids totale ======>'+poidsT);
		if(nbrthemeQual!=0){
			noteolable=(poidsT/nbrthemeQual);
			alert('la note globale est :======>'+noteolable);
		}
		$rootScope.f.nbrThemeqal = nbrthemeQual;
		$rootScope.f.totalPoids =poidsT;
		$rootScope.f.noteGlobale = noteolable;
		
	};
}]);