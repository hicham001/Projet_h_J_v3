<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <div class="x_title">
            <div class="col-md-6"><h2>List des Feedback</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3"><a data-toggle="modal" data-target="#myModal" ng-click="pageCreation()" class="btn btn-primary btn-xl">
            <i class="fa fa-pencil"></i>Ajouter Nouveau Feedback </a>
           </div>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content">
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
     
    </div>
    
    
    
    