<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <div class="x_title">
            <div class="col-md-6"><h2>Détails</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3"><a ng-click="ctrl.pageCreation()" class="btn btn-primary btn-xl">
            <i class="fa fa-pencil"></i>Ajouter Nouveau Manager </a>
           </div>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content">
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">Matricule :</label>
                <h4>{{ctrl.manager.matricule}}</h4>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" >Nom :</label>
                <h4>{{ctrl.manager.nom}}</h4>
            </div>
        </div>

 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" >Prénom :</label>
               <h4> {{ctrl.manager.prenom}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">E-mail :</label>
                <h4>{{ctrl.manager.email}}</h4>
            </div>
        </div>
 
 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Sexe :</label>
               <h4> {{ctrl.manager.sexe}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Téléphone :</label>
               <h4> {{ctrl.manager.telephone}}</h4>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Data d'embauche :</label>
               <h4> {{ctrl.manager.dateEmbauche}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Date de naissance :</label>
                <h4>{{ctrl.manager.dateDN}}</h4>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Adresse :</label>
               <h4>{{ctrl.manager.adresse}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Pseudo :</label>
                <h4>{{ctrl.manager.psseudo}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Password :</label>
                <h4>{{ctrl.manager.password}}</h4>
            </div>
        </div>
        
  <div class="row">
            <div class="form-actions floatRight">
                    <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-8">                                            
                                                <button ng-click="ctrl.editer()" class="btn btn-success" >Editer</button>
                                                <button  ng-click="ctrl.cancel()" class="btn btn-primary">Annuler</button>
                                            </div>
                                        </div>
            </div>
        </div>
            </div></div></div></div>
        </div>
    </div>