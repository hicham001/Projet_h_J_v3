'use strict';
 
GestionEvaluateur.controller('EvaluateurController', ['$scope', 'EvaluateurService','$location',function($scope,EvaluateurService,$location) {
          var self = this;
          self.evaluateurs = [];
          self.fetchAllEvaluateurs = function(){
        	  EvaluateurService.fetchAllEvaluateurs()
                  .then(
                               function(d) {
                                    self.evaluateurs = d;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
          self.pageCreation = function(){
        	  $location.path('/CreerEvaluateur');
        	  
          };
          self.createEvaluateur = function(evaluateur){
        	  EvaluateurService.createEvaluateur(evaluateur)
                      .then(
                      self.fetchAllEvaluateurs, 
                              function(errResponse){
                                   console.error('Error while creating User.');
                              } 
                  );
              $location.path('/GestionEvaluateur');
          };
          self.cancel = function(){
        	  self.reset();
        	  $location.path('/GestionEvaluateur');
        	  
          };
          self.ajouter = function(){
        	  console.log('User creete with id ', self.evaluateur.matricule);
        	  self.createEvaluateur(self.evaluateur);
        	  self.reset();
        	  //$location.path('/GestionEvaluateur');
        	  
          };
          
         self.updateEvaluateur = function(evaluateur){
        	 EvaluateurService.updateEvaluateur(evaluateur)
                      .then(
                              self.fetchAllEvaluateurs, 
                              function(errResponse){
                                   console.error('Error while updating User.');
                              } 
                  );
          };
 
         self.deleteEvaluateur = function(matricule){
        	 EvaluateurService.deleteEvaluateur(matricule)
                      .then(
                    		  self.fetchAllEvaluateurs, 
                              function(errResponse){
                                   console.error('Error while deleting User.');
                              } 
                  );
          };
          
          self.editer = function(){
        	  console.log('id to be edited', self.evaluateur.matricule);
        	  self.updateEvaluateur(self.evaluateur);
        	  self.reset();
        	  //$location.path('/GestionEvaluateur');
          };            
          self.prepareEdit = function(evaluateur){
        	  console.log('id to be edited', evaluateur.matricule);
              self.evaluateur = evaluateur;
              //$location.path('/modifierEvaluateur');
          };
          self.detailsEvaluateur = function(evaluateur){
        	  console.log('details de id', evaluateur.matricule);
        	  self.evaluateur = evaluateur;
          };
               
          self.remove = function(matricule){
              console.log('id to be deleted', matricule);
              self.deleteEvaluateur(matricule);
          };
 
           
          self.reset = function(){
        	  self.evaluateur = {};
          };
          self.fetchAllEvaluateurs();
          self.reset();
      }]);