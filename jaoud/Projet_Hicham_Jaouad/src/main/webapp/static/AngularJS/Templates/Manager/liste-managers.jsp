<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <div class="x_title">
            <div class="col-md-6"><h2>List des Managers RH</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3"><a ng-click="ctrl.pageCreation()" class="btn btn-primary btn-xl">
            <i class="fa fa-pencil"></i>Ajouter Nouveau Manager RH </a>
           </div>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content"><table class="table table-hover">
                <thead>
                    <tr>
                       <th>Matricule</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>E-mail</th>
                        <th>Sexe</th>
                        <th>Adresse</th>
                        <th>Téléphone</th>
                        <th>Date d'embauche</th>
                        <th>Photo</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
               
                    <tr ng-repeat="manager in ctrl.managers">
                              <td><span ng-bind="manager.matricule"></span></td>
                              <td><span ng-bind="manager.nom"></span></td>
                              <td><span ng-bind="manager.prenom"></span></td>
                              <td><span ng-bind="manager.email"></span></td>
                              <td><span ng-bind="manager.sexe"></span></td>
                              <td><span ng-bind="manager.adresse"></span></td>
                              <td><span ng-bind="manager.telephone"></span></td>
                              <td><span ng-bind="manager.dateEmbauche"></span></td>
                              <td><img src="static/AngularJS/Templates/Collaborateur/images/user.png" alt="Collaborateur" width="40px"height="30px"/></td>
                           <td><button type="button" class="btn btn-info" ng-click="ctrl.detailsManager(manager)">Info</button><td>  
                        <td><a class="btn btn-success custom-width" ng-click="ctrl.prepareEdit(manager)">edit</a></td>
                        <td><a class="btn btn-danger custom-width" ng-click="ctrl.remove(manager.matricule)" >delete</a></td>
                        
                    </tr>
                </tbody>
            </table>
      </div>
    </div></div></div>