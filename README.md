         plugins {
            id "jacoco"
            id "java"
            id "application"
            id "org.sonarqube" version "2.7"
        }
        
        group 'org.nisum'
        version '1.0-SNAPSHOT'
        
        sourceCompatibility = 1.8
        
        repositories {
            jcenter()
        
        }
        
        dependencies {
            testImplementation('org.junit.jupiter:junit-jupiter-api:5.4.2')
            testImplementation('org.junit.jupiter:junit-jupiter-params:5.4.2')
            testRuntime('org.junit.jupiter:junit-jupiter-engine:5.4.2')
        }
        
        mainClassName = 'App'
        
        jacocoTestReport {  //to generate the jacocoTest
            dependsOn test
            reports {
                xml.enabled true
            }
        }
        test {
            finalizedBy jacocoTestReport //required to add this for the coverage.
            useJUnitPlatform()
        }
