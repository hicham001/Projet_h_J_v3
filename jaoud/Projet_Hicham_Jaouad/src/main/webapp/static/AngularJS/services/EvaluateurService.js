'use strict';
 
GestionEvaluateur.factory('EvaluateurService', ['$http', '$q', function($http, $q){
 
    return {
         
            fetchAllEvaluateurs: function() {
                    return $http.get('Evaluateur/')
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while fetching users');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
           
            
            createEvaluateur: function(evaluateur){
                    return $http.post('Evaluateur/', evaluateur)
                            .then(
                                    function(d){
                                        return d.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while creating collaborateur');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
             
            updateEvaluateur: function(c){
                    return $http.put('Evaluateur/', c)
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while updating user');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
             
            deleteEvaluateur: function(matricule){
                    return $http['delete']('Evaluateur/'+matricule,{params: {matricule: matricule}})
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while deleting user');
                                        return $q.reject(errResponse);
                                    }
                            );
            }
         
    };
 
}]);