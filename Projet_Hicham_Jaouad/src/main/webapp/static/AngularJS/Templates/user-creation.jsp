<div class="generic-container">
    <div class="well lead">User Registration Form</div>
        <input type="hidden" path="id" id="id"/>
         
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="firstName">First Name</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.user.firstname" class="form-control input-sm"/>
                    
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Last Name</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.user.lastname" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Catégorie</label>
                <div class="col-md-7">
                       
                              <select name="repeatSelect" id="repeatSelect" ng-model="ctrl.user.categorie.id" class=" form-control input-sm">
                          <option ng-repeat="c in ctrl.cats" value="{{c.id}}">{{c.intitule}}</option>
                          </select>
                </div>
            </div>
        </div>
 
        
 
 
 
        <div class="row">
            <div class="form-actions floatRight">
             
                        <a  ng-click="ctrl.ajouter()"  class="btn btn-primary btn-sm">Ajouter</a>or 
                        <a ng-click="ctrl.cancel()">Cancel</a>
                   
            </div>
        </div>
    </div>