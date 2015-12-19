<div class="generic-container" style="width: auto">
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">Liste des Feedbacks </span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                       <th>ID FEEDBACK</th>
                        <th>Collaborateur </th>
                        <th>Remarque globale</th>
                        <th>Note globale</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
               
                    <tr ng-repeat="feedback in feedbacks">
                              <td><span ng-bind="feedback.idFeedback"></span></td>
                              <td><span ng-bind="feedback.collaborateur.matricule"></span></td>
                              <td><span ng-bind="feedback.remarqueG"></span></td>
                              <td><span ng-bind="feedback.noteGlobale"></span></td>
                           <td><button type="button" class="btn btn-info" ng-click="details(feedback)">Info</button><td>  
                        <td><a class="btn btn-success custom-width" ng-click="ctrl.prepareEdit(collaborateur)">edit</a></td>
                        <td><a class="btn btn-danger custom-width" ng-click="deleteFeedbak(feedback.idFeedback)" >delete</a></td>
                        
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="well">
            <a ng-click="pageCreation()">Ajouter Nouveau Feedbaks</a>
        </div>
    </div>
    
    
    
    