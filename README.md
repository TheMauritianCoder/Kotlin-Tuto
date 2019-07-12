# Kotlin-Tuto

Note: Android Studio has a bug in regards to importing projects directly from Version Control (In my case GIT)
Follow this Link: https://stackoverflow.com/questions/33979322/kotlin-error-could-not-find-or-load-main-class-defaultpackage

This was a severe bug (KT-10221) in automatic generation of Launch Configuration in plugin version 0.4.0. It was fixed in 0.5.0 so the recommendend way to workaround is to update plugin.

The source of the problem was that the plugin used an old pattern for generating name of the class for main function that had been abandoned by Kotlin compiler.

It's possible to workaround it by editing launch configuration (Eclipse Menu -> Run -> Run Configurations...) by hand and changing Main class field in Java Application group. If the file is named hello.kt with no package directive, as it is described in tutorial, than corrected string should be HelloKt.

If file has name other.kt with package my.tutorial than the Main Class should contain my.tutorial.HelloKt. You can read more about it in the section Package-Level Functions of Calling Kotlin From Java page.
