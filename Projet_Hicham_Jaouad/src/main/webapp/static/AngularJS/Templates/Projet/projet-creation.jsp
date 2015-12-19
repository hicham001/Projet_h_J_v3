
<div class="generic-container">
    <div class="well lead">Ajouter nouveau Projetr</div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">code projet</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="projet.codeprojet" class="form-control input-sm"/>
                    
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Catégorie</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="projet.categorie" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
 
        <div class="row">
            <div class="form-actions floatRight">
                        <a  ng-click="addProjet()"  class="btn btn-primary btn-sm">Ajouter</a>or 
                        <a ng-click="cancel()">Cancel</a>
                   
            </div>
        </div>
    </div>