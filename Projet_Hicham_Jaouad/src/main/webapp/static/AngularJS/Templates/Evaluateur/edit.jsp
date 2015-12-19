<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <!-- <div class="x_title">
            <div class="col-md-6">
            <h2>Editer un Evaluateur</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3"><a ng-click="ctrl.pageCreation()" class="btn btn-primary btn-xl"><i class="fa fa-pencil"></i>Ajouter Nouveau Evaluateur </a>
           </div>
            <div class="clearfix"></div>
            </div> -->
            
            <div class="x_content">
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">Matricule</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.matricule" class="form-control input-sm" disabled/>
                    
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" >Nom</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.nom" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>

 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" >Prénom</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.prenom" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">E-mail</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.email" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
 
 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Sexe</label>
                <div class="col-md-7">
                <input type="radio" ng-model="ctrl.evaluateur.sexe" value="Male"> Male
                <input type="radio" ng-model="ctrl.evaluateur.sexe" value="Female"> Female
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Téléphone</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.telephone" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Data d'embauche</label>
                <div class="col-md-7">
                    <input type="Date"  ng-model="ctrl.evaluateur.dateEmbauche" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Date de naissance</label>
                <div class="col-md-7">
                    <input type="Date"  ng-model="ctrl.evaluateur.dateDN" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Adresse</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.adresse" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Pseudo</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.psseudo" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Password</label>
                <div class="col-md-7">
                    <input type="text"  ng-model="ctrl.evaluateur.password" id="lastName" class="form-control input-sm" />
                    <div class="has-error">
                    </div>
                </div>
            </div>
        </div>
       <!--  <div class="row">
            <div class="form-actions floatRight">
                    <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-8">                                            
                                                <button ng-click="ctrl.editer()" class="btn btn-success" >Editer</button>
                                                <button  ng-click="ctrl.cancel()" class="btn btn-primary">Annuler</button>
                                            </div>
                                        </div>
            </div>
        </div> -->
    </div>
    </div></div></div>