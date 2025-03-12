# HiTechCycloComputer Technical Documentation

## Architecture
- **Presentation Layer**: Jetpack Compose for Android, SwiftUI for iOS.
- **Domain Layer**: Contains use cases and business logic.
- **Data Layer**: Handles data access, including local database and network operations.

## Modules
- **app-android**: Android-specific code.
- **app-ios**: iOS-specific code.
- **shared-core**: Common utilities.
- **shared-data**: Data access logic.
- **shared-domain**: Business logic and use cases.

## Dependencies
- **Database**: Room (Android), SQLDelight (multiplatform).
- **Network**: Retrofit with OkHttp.
- **Dependency Injection**: Koin.
- **Testing**: JUnit5 and Mockk.

## Features
- **GPS Tracking**: Optimized for battery usage.
- **Statistics**: Speed, distance, elevation gain, etc.
- **Offline Mode**: Local database with cloud synchronization.
- **Fitness Sensors**: Heart rate, cadence integration.
- **Performance Analytics**: Advanced analytics for user performance.

## CI/CD
- **GitHub Actions**: Automated builds and deployments.

## Installation and Deployment
- Follow the guide in the `docs` folder to set up and deploy the application.

## Contributing
- Contributions are welcome. Please follow the guidelines in the `CONTRIBUTING.md` file.

## License
- This project is licensed under the MIT License.
