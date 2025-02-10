package app.k9mail.feature.onboarding.migration

import app.k9mail.feature.onboarding.migration.api.OnboardingMigrationManager
import app.k9mail.feature.onboarding.migration.thunderbird.TbOnboardingMigrationManager
import org.koin.core.module.Module
import org.koin.dsl.module

val onboardingMigrationModule: Module = module {
    single<OnboardingMigrationManager> { TbOnboardingMigrationManager() }
}
