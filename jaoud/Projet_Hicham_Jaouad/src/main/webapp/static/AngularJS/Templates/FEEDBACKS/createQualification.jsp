Poductivité :  <select ng-model="productivite.valeur" ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="productivite.valeur='NA'">
       
              </select>

              <br/>
              <button ng-click="loading1=true" ng-show="!loading1">ajouter remarque</button>
              <div ng-show="loading1">
Remarque : <textarea ng-model="productivite.remarque"/>
  <button ng-click="loading1=false;productivite.remarque=''" ng-show="loading1">Supprimer remarque</button>
            </div><br/><br/>
Qualité/Fiabilité :  <select ng-model="qualite.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="qualite.valeur='NA'">
              </select>
              <br/>
              <button ng-click="loading2=true" ng-show="!loading2">ajouter remarque</button>
              <div ng-show="loading2">
Remarque : <textarea ng-model="qualite.remarque"/>
  <button ng-click="loading2=false;qualite.remarque=''" ng-show="loading2">Supprimer remarque</button>
            </div>
            <br/><br/>
            
Technicité :  <select ng-model="technicite.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="technicite.valeur='NA'">
              </select>
              <br/>
              <button ng-click="loading3=true" ng-show="!loading3">ajouter remarque</button>
              <div ng-show="loading3">
Remarque : <textarea ng-model="technicite.remarque"/>
  <button ng-click="loading3=false;technicite.remarque=''" ng-show="loading3">Supprimer remarque</button>
            </div>
            <br/><br/>           
Conception :  <select ng-model="conception.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="conception.valeur='NA'">
              </select>
              <br/>
              <button ng-click="loading4=true" ng-show="!loading4">ajouter remarque</button>
              <div ng-show="loading4">
Remarque : <textarea ng-model="conception.remarque"/>
  <button ng-click="loading4=false;conception.remarque=''" ng-show="loading4">Supprimer remarque</button>
            </div>
            <br/><br/>  
Avant-vente :  <select ng-model="avantVente.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="avantVente.valeur='NA'">
              </select>
              <br/>
              <button ng-click="loading5=true" ng-show="!loading5">ajouter remarque</button>
              <div ng-show="loading5">
Remarque : <textarea ng-model="avantVente.remarque"/>
  <button ng-click="loading5=false;avantVente.remarque=''" ng-show="loading5">Supprimer remarque</button>
            </div>
            <br/><br/>   
Gestion de projet :  <select ng-model="gestionProjet.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="gestionProjet.valeur='NA'">
              </select>
              <br/>
              <button ng-click="loading6=true" ng-show="!loading6">ajouter remarque</button>
              <div ng-show="loading6">
Remarque : <textarea ng-model="gestionProjet.remarque"/>
  <button ng-click="loading6=false;gestionProjet.remarque=''" ng-show="loading6">Supprimer remarque</button>
            </div>
            <br/><br/>    
Gestion de relation client :  <select ng-model="gestionRClient.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="gestionRClient.valeur='NA'">
              </select>
              <br/>
              <button ng-click="loading7=true" ng-show="!loading7">ajouter remarque</button>
              <div ng-show="loading7">
Remarque : <textarea ng-model="gestionRClient.remarque"/>
  <button ng-click="loading7=false;gestionRClient.remarque=''" ng-show="loading7">Supprimer remarque</button>
            </div>
            <br/><br/>       

Polyvalence :  <select ng-model="polyvalence.valeur"  ng-options="theme.cle as (theme.cle) for theme in themes" ng-init="polyvalence.valeur='NA'">
              </select>
              <br/>
              <button ng-click="loading8=true" ng-show="!loading8">ajouter remarque</button>
              <div ng-show="loading8">
Remarque : <textarea ng-model="polyvalence.remarque"/>
  <button ng-click="loading8=false;polyvalence.remarque=''" ng-show="loading8">Supprimer remarque</button>
            </div>
            <br/><br/> <br/><br/>
Remarque globale : <textarea ng-model="f.remarqueG"/>
            
                                    
            <button ng-click="addList(qualifications)">Save List</button>
            
            
            
            
            