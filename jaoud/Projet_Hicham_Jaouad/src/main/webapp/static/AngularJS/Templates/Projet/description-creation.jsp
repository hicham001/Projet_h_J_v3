<div ng-show="ctrl.loading">Chargement....</div>
<div class="generic-container">
    <div class="well lead">Ajouter nouvelle decription</div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">description</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="description.description" class="form-control input-sm"/>
                    
                </div>
            </div>
            </div>
            <div class="row">
             <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Mesure</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="description.mesure"  class="form-control input-sm"/>
                    
                </div>
            </div>
            </div>
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Responsable de mesure</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="description.responsableMesure"  class="form-control input-sm"/>
                    
                </div>
            </div>
            
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Poids</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="description.poids"  class="form-control input-sm" />
                    
                </div>
            </div>
            
        </div>
        <div class="row">
             <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Objectif</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="objectif.idObjectif" 
                    ng-init="description.objectif.idObjectif=objectif.idObjectif"
                      class="form-control input-sm" value="{{objectif.idObjectif}}" disabled/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
             
                        <a  ng-click="addDescription(description)"  class="btn btn-primary btn-sm">Ajouter</a>or 
                        <a ng-click="ctrl.cancel()">Cancel</a>
                   
            </div>
        </div>
    </div>