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
                                                <a href="#" class="disabled">
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
                <label class="col-md-3 control-lable" for="matricule">Poductivité :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm"  ng-model="productivite.valeur" 
                    ng-options="theme.cle as (theme.cle) for theme in themes" 
                    ng-init="productivite.valeur='NA'">
 </select>
                </div> 
                <div class="col-md-2">
<a ng-click="loading1=true" ng-show="!loading1"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
                </div>
            </div>
       
              <div ng-show="loading1">
              <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm"  ng-model="productivite.remarque">
 </textarea>  <a  ng-click="loading1=false;productivite.remarque=''" ng-show="loading1"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
</div>

<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Qualité/Fiabilité :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm"  ng-model="qualite.valeur" ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="qualite.valeur='NA'">
 </select>
                </div>
                       <div class="col-md-2">
<a ng-click="loading2=true" ng-show="!loading2"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
            </div>
        </div>
            
              <div ng-show="loading2">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm"  ng-model="qualite.remarque">
 </textarea>  <a  ng-click="loading2=false;qualite.remarque=''" ng-show="loading2"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
            </div>
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Technicité :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm"  
                    ng-model="technicite.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="technicite.valeur='NA'">
 </select>
                </div>
                       <div class="col-md-2">
<a  ng-click="loading3=true" ng-show="!loading3"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
            </div>
        </div>
           <div ng-show="loading3">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm"  ng-model="technicite.remarque">
 </textarea>  <a ng-click="loading3=false;technicite.remarque=''" ng-show="loading3"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
            </div>     
                    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Conception:</label>
                <div class="col-md-7">
                    <select class="form-control input-sm" ng-model="conception.valeur"  
                    ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="conception.valeur='NA'">
             
 </select>
                </div>
                       <div class="col-md-2">
<a  ng-click="loading4=true" ng-show="!loading4"><i class="fa fa-plus fa-lg"></i> Ajouter remarque</a>
</div>
            </div>
        </div>
                <div ng-show="loading4">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Remarque  :</label>
                <div class="col-md-7">
                    <textarea class="form-control input-sm"  ng-model="conception.remarque">
 </textarea>  <a ng-click="loading4=false;conception.remarque=''" ng-show="loading4"><i class="fa fa-times"></i>Retirer Remarque</a>
        
                </div>
            </div>
        </div>
        
      </div>
           <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                                                <button type="submit" class="btn btn-primary">Cancel</button>
                                                 <button type="submit" class="btn btn-success" ng-click="etape3()">Valider</button>
                                                
                                            </div>
                                        </div>
            
                                    </form>
                                    </div>
                                    </div>
                                    </div></div>
            </div>