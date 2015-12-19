'use strict';
 
GestionCollaborateur.factory('CollabService', ['$http', '$q', function($http, $q){
 
    return {
         
            fetchAllCollabs: function() {
                    return $http.get('Collaborateur/')
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
            fetchAllPostes: function() {
                return $http.get('Poste/')
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
            fetchAllManagers: function() {
                return $http.get('Manager/')
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
            createCollab: function(collaborateur){
                    return $http.post('Collaborateur/', collaborateur)
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
             
            updateCollab: function(c){
                    return $http.put('Collaborateur/', c)
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
             
            deleteCollab: function(matricule){
                    return $http['delete']('Collaborateur/'+matricule,{params: {matricule: matricule}})
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