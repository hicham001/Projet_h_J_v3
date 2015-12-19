
<div class="generic-container">
    <div class="well lead">Ajouter nouveau Objectif</div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Intitule</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="objectif.intitule" class="form-control input-sm"/>
                    
                </div>
            </div>
         </div>
            <div class="row">
             <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Projet</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="projet.codeprojet" ng-init="objectif.projet.codeprojet=projet.codeprojet" value ="{{objectif.projet.codeprojet}}" class="form-control input-sm" disabled/>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
             
                        <a  ng-click="addObjectif(objectif)"  class="btn btn-primary btn-sm">Ajouter</a>or 
                        <a ng-click="ctrl.cancel()">Cancel</a>
                   
            </div>
        </div>
    </div>