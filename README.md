# Projet Dev. Mobile
Projet Developpement Mobile 

* Une application qui permet de remédier au syndrome de la page blanche ! Le principe est de choisir un thème et de générer une phrase et de créer a partir de ces quelques mots. 

### Auteur du projet et du README 
    * Samir Massoundi
    
### Technologies Utilisées 
    * Logiciel : Android Studio
    * Outil de versionnement : Git
    * Plateforme d'hebergement du code source : GitHub
    
# Structure du projet

# Dependances 
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
        implementation 'androidx.core:core-ktx:1.3.2'
        implementation 'androidx.appcompat:appcompat:1.2.0'
        implementation 'com.google.android.material:material:1.3.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
        testImplementation 'junit:junit:4.+'
        androidTestImplementation 'androidx.test.ext:junit:1.1.2'
        androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
        
# Images 
    Page d'accueil 
    ![Page d'accueil](imagesProjet/Screenshot1.png?raw=true "Ecran d'accueil")
    La page d'accueil reporte les thèmes tendances, on utilier une RecyclerView  et des CardView pour afficher cette liste.
