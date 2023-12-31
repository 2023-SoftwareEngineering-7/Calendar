plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.calendar"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.calendar"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("androidx.media:media:1.3.1")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("com.google.android.gms:play-services-auth:19.0.0")
    implementation ("pub.devrel:easypermissions:3.0.0")
    implementation("com.google.api-client:google-api-client-android:1.22.0") {
        exclude (group =  "org.apache.httpcomponents")
    }
    implementation("com.google.apis:google-api-services-calendar:v3-rev235-1.22.0") {
        exclude (group = "org.apache.httpcomponents")
    }
    implementation ("com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava")
}