<div class="generic-container" style="width: auto">
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">Liste des collaborateurs </span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                       <th>Matricule</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>E-mail</th>
                        <th>Sexe</th>
                        <th>Adresse</th>
                        <th>Manager</th>
                        <th>Poste</th>
                        <th>Photo</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
               
                    <tr ng-repeat="collaborateur in ctrl.collaborateurs">
                              <td><span ng-bind="collaborateur.matricule"></span></td>
                              <td><span ng-bind="collaborateur.nom"></span></td>
                              <td><span ng-bind="collaborateur.prenom"></span></td>
                              <td><span ng-bind="collaborateur.email"></span></td>
                              <td><span ng-bind="collaborateur.sexe"></span></td>
                              <td><span ng-bind="collaborateur.adresse"></span></td>
                              <td><span ng-bind="collaborateur.manager.matricule"></span></td>
                              <td><span ng-bind="collaborateur.poste.intitule"></span></td>
                              <td><span ng-bind="collaborateur.photo"></span></td>
                           <td><button type="button" class="btn btn-info" ng-click="ctrl.detailsCollab(collaborateur)">Info</button><td>  
                        <td><a class="btn btn-success custom-width" ng-click="ctrl.prepareEdit(collaborateur)">edit</a></td>
                        <td><a class="btn btn-danger custom-width" ng-click="ctrl.remove(collaborateur.matricule)" >delete</a></td>
                        
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="well">
            <a ng-click="ctrl.pageCreation()">Ajouter Nouveau Collaborateur</a>
        </div>
    </div>