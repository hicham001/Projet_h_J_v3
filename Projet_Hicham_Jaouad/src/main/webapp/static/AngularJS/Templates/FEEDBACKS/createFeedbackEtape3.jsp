<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
           
            <div class="x_content">
              <div id="wizard" class="form_wizard wizard_horizontal">
                                 <ul class="wizard_steps">
                                            <li>
                                                <a href="#" class="selected" >
                                                    <span class="step_no">1</span>
                                                    <span class="step_descr">
                                            Etape 1<br />
                                            <small></small>
                                        </span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#"  class="selected"  rel="2">
                                                    <span class="step_no">2</span>
                                                    <span class="step_descr">
                                            Etape 2<br />
                                            <small>Qualification</small>
                                        </span>
                                                </a>
                                            </li> 
                                            <li>
                                                <a href="#" class="selected">
                                                    <span class="step_no">3</span>
                                                    <span class="step_descr">
                                            Etape 3<br />
                                            <small>Qualification (suite)</small>
                                        </span>
                                                </a>
                                            </li>
                                   </ul>
                                    <br />
             <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
       
               
               <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Avant-vente :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm" ng-model="avantVente.valeur"  
                    ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="avantVente.valeur='NA'">
             
 </select>
                </div>
                       <div class="col-md-2">
<a  ng-click="loading5=true" ng-show="!loading5"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
            </div>
        </div>
        <div ng-show="loading5">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm"  ng-model="avantVente.remarque">
 </textarea>  <a ng-click="loading5=false;avantVente.remarque=''" ng-show="loading5"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
            </div>   
             <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Gestion de projet :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm" ng-model="gestionProjet.valeur" 
                     ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="gestionProjet.valeur='NA'">
 </select>
                </div>
                       <div class="col-md-2">
<a  ng-click="loading6=true" ng-show="!loading6"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
            </div>
        </div>
         <div ng-show="loading6">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm" ng-model="gestionProjet.remarque">
 </textarea>  <a ng-click="loading6=false;gestionProjet.remarque=''" ng-show="loading6"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
            </div> 
          
           <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Gestion de relation client :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm" ng-model="gestionRClient.valeur"  
                    ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="gestionRClient.valeur='NA'">
              </select>
                </div>
                       <div class="col-md-2">
<a  ng-click="loading7=true" ng-show="!loading7"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
            </div>
        </div>
         <div ng-show="loading7">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm" ng-model="gestionRClient.remarque">
 </textarea>  <a ng-click="loading7=false;gestionRClient.remarque=''" ng-show="loading7"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
            </div>    

<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Polyvalence :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm" ng-model="polyvalence.valeur" 
                     ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="polyvalence.valeur='NA'">
              </select>
                </div>
                       <div class="col-md-2">
<a  ng-click="loading8=true" ng-show="!loading8"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
            </div>
        </div>
          <div ng-show="loading8">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm" ng-model="polyvalence.remarque">
 </textarea>  <a ng-click="loading8=false;polyvalence.remarque=''"ng-show="loading8"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
            </div>
              <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque globale :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm" ng-model="f.remarqueG">
 </textarea>  
                </div>
            </div>
        </div> 
           <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                                                <button type="submit" class="btn btn-primary">Cancel</button>
                                                 <button type="submit" class="btn btn-success" ng-click="addList(qualifications)">Valider</button>
                                                
                                            </div>
                                        </div>
            
                                    </form></div>
                                    </div>
                                    </div></div>
            
            
            
            
            </div>