  <div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
          
            
            <div class="x_content">
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Matricule</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.matricule" class="form-control input-sm"/>
                    
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Nom</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.nom" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Pr�nom</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.prenom" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">E-mail</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.email" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
 
 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Sexe</label>
                <div class="col-md-7">
                <input type="radio" ng-model="ctrl.collaborateur.sexe" value="Male"> Male
                <input type="radio" ng-model="ctrl.collaborateur.sexe" value="Female"> Female
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">T�l�phone</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.telephone" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Data d'embauche</label>
                <div class="col-md-7">
                    <input type="Date"  ng-model="ctrl.collaborateur.dateEmbauche" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Date de naissance</label>
                <div class="col-md-7">
                    <input type="Date"  ng-model="ctrl.collaborateur.dateDN" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Adresse</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.adresse" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Pseudo</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.psseudo" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Password</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.collaborateur.password" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">Poste</label>
                <div class="col-md-7">
                          <select ng-model="ctrl.collaborateur.poste.idPost" class=" form-control input-sm" ng-options="p.idPost as (p.intitule) for p in ctrl.postes">
                            </select>
                             </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="Manager">Manager</label>
                <div class="col-md-7">
                       
                              <select ng-model="ctrl.collaborateur.manager.matricule" class=" form-control input-sm" ng-options="manager.matricule as (manager.nom+' '+manager.prenom+'  identifier par :'+manager.matricule) for manager in ctrl.managers">
                    
                            </select>
                </div>
            </div>
        </div>
     
    </div></div></div></div>