plugins {

    /**
     * You should use `apply false` in the top-level build.gradle file
     * to add a Gradle plugin as a build dependency, but not apply it to the
     * current (root) project. You should not use `apply false` in sub-projects.
     * For more information, see
     * Applying external plugins with same version to subprojects.
     */

    id("com.android.library") version "7.4.1" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
}