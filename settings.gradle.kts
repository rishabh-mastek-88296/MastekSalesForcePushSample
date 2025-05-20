pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://salesforce-marketingcloud.github.io/MarketingCloudSDK-Android/repository")
        }
    }

}

rootProject.name = "Mastek Salesforce MobilePush Kotlin"
include(":app")
