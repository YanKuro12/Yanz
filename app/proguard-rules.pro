# This is a configuration file for ProGuard.
# http://proguard.sourceforge.net/index.html#manual/usage.html

-dontusemixedcaseclassnames
-verbose

# Preserve some boilerplate
-keep public class com.android.internal.policy.PhoneWindow1
-keep public class com.android.internal.R*
-keep public class android.view.**
-keep public class android.widget.**
